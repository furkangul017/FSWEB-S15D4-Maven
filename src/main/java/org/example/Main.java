package org.example;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class Main {
    public static boolean checkForPalindrome(String string) {
        System.out.println("Orijinal metin: [" + string + "]");
        String cleaned = string.toLowerCase(Locale.ROOT)
                .replaceAll("[^a-z0-9]", "");
        System.out.println("Temizlenmiş metin: [" + cleaned + "]");
        for(int i = 0; i < cleaned.length()/2; i++) {
           if(cleaned.charAt(i) != cleaned.charAt(cleaned.length()-i-1)){
               return false;
           }
        }
        return true;
    }

    public static String convertDecimalToBinary(int number){
        ArrayList<Integer> remainders = new ArrayList<>();
        if(number == 0) return "0";
        while(number > 0){
            remainders.add(number%2);
            number /=2;
        }
        Collections.reverse(remainders);
        String result = "";
        for(int i =0 ; i<remainders.size() ; i++){
            result += remainders.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

}