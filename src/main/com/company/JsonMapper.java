package main.com.company;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Map;

import com.google.gson.*;

/**
 * Created by sbelkin on 1/23/2016.
 */
public class JsonMapper {

    JsonObject valueMapperNumber;
    JsonObject valueMapperLetter;
    Integer size;

    public JsonMapper(String fileLocation) {
        File file = new File(fileLocation);
        size = 0;
        valueMapperNumber = MapValues(file);
        valueMapperLetter = ReverseMapValues(valueMapperNumber);

    }

    public JsonObject MapValues(File file) {
        try {
            String content = new String(Files.readAllBytes(file.toPath()));
            JsonParser parser = new JsonParser();
            JsonObject valueMapper = parser.parse(content).getAsJsonObject();
            return valueMapper;
        } catch (IOException e){
            e.printStackTrace();
        }
        return new JsonObject();
    }

    public JsonObject ReverseMapValues(JsonObject jsonObject) {
        JsonObject returnObject = new JsonObject();
        for(Map.Entry<String,JsonElement> entry : jsonObject.entrySet()){
            JsonElement jsonElement = new JsonParser().parse(entry.getKey());
            returnObject.add(entry.getValue().getAsString(),jsonElement);
            size++;
        }
        return returnObject;
    }

    public String getLetter(Integer number) throws Exception{
        String numberString = String.valueOf(number);
        if (valueMapperNumber.has(numberString)){
            return valueMapperNumber.get(numberString).getAsString();
        } else {
            throw new Exception("Error value fails.");
        }
    }

    public Integer getNumber(String letter) throws Exception{
        if (valueMapperLetter.has(letter)){
            return Integer.valueOf(valueMapperLetter.get(letter).getAsString());
        } else {
            throw new Exception("Error value fails.");
        }
    }

    public Integer getSize(){
        return size;
    }

}
