package main.com.company;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by sbelkin on 1/23/2016.
 */
public class CustomHash {

    JsonMapper jsonMapper;

    public CustomHash(JsonMapper jsonMapperSet){
        jsonMapper = jsonMapperSet;
    }

    public Integer parseString(String parse) throws Exception{
        Integer total = 0;
        String[] array = parse.split("");
        Integer power = array.length;
        for (int i=0;i<array.length;i++){
            int temp = jsonMapper.getNumber(array[i]);
            int temp2 = temp * (int) Math.pow(jsonMapper.getSize(), power-i-1);
            total += temp2;
        }
        return total;
    }

    public String parseInteger(Integer value) throws Exception{
        String url = "";
        List<Integer> list = integerToList(value);
        for (int i=0;i<list.size();i++){
            url += jsonMapper.getLetter(list.get(i));
        }
        return url;
    }

    public List<Integer> integerToList(Integer value) {
        List<Integer> list = new LinkedList<Integer>();
        Integer power = highestPower(value);
        double total = (double) value;
        while (power != -1) {
            double temp = Math.pow(jsonMapper.getSize(), power);
            int quotient = (int) (total / temp);
            total = total % temp;
            list.add(quotient);
            power--;
        }
        return list;
    }

    public Integer highestPower(Integer value){
        int x = 0;
        while (value > 1){
            value /= jsonMapper.getSize();
            x+=1;
        }
        return x;
    }

}
