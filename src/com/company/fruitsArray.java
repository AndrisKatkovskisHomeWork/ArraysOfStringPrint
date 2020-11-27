package com.company;

public class fruitsArray {
    public static void fruitsArray(String[] args) {

        String[] fruitsArray = new String[5];

        fruitsArray[0] = "apple";
        fruitsArray[1] = "banana";
        fruitsArray[2] = "pineapple";
        fruitsArray[3] = "citrus";
        fruitsArray[4] = "cherie";

//        for (int i = 0; i < fruitsArray.length; i++){
//            System.out.println(fruitsArray[i]);
//        }

        for (String fruit : fruitsArray) {
            System.out.println("fruit: " + fruit);
        }

    }
}
