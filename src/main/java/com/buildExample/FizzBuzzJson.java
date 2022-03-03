package com.buildExample;
import  org.json.simple.JSONObject;
import java.io.FileWriter;
import java.io.IOException;

public class FizzBuzzJson {

    public static void fizzBuzzJson(int a, int b){
        //Creating a JSONObject object
        JSONObject jsonObject = new JSONObject();

        int fizzCount = 0, buzzCount = 0, fizzBuzzCount = 0;
        int smaller = Math.min(a, b);
        int bigger = Math.max(a, b);

        while ( smaller < bigger){
            if(smaller % 3 == 0 && smaller % 5 == 0){
                fizzBuzzCount++;
            }
            else if (smaller % 3 == 0) {
                fizzCount++;
            }
            else if(smaller % 5 == 0){
                buzzCount++;
            }
            smaller++;
        }
        // Putting key pairs into Json file
        jsonObject.put("Fizz", fizzCount);
        jsonObject.put("Buzz", buzzCount);
        jsonObject.put("FizzBuzz", fizzBuzzCount);

        try {
            FileWriter file = new FileWriter("Java-Fundamentals\\outputJson.json");
            file.write(jsonObject.toJSONString());
            file.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("JSON file created: "+jsonObject);
    }

}
