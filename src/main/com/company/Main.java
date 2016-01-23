package main.com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        JsonMapper jsonMapper = new JsonMapper("values.json");
        CustomHash customHash = new CustomHash(jsonMapper);
        Scanner in = new Scanner(System.in);
        System.out.println("Please choose the mode :");
        System.out.println("1. Integer into small url. or 2. Small url to integer");
        int i = in.nextInt();

        System.out.println("Enter value:");
        if (i == 1){
            int e = in.nextInt();
            System.out.println(customHash.parseInteger(e));
        } else if (i == 2){
            String s = in.next();
            System.out.println(customHash.parseString(s));
        } else {
            System.out.println("Invalid mode: "+ i);
        }
    }
}
