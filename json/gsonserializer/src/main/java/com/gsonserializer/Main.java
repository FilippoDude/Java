package com.gsonserializer;

public class Main {
    public static void main(String[] args) {
        try {
            GsonWriter.main(args);
            GsonReader.main(args);   
        } catch (Exception e) {
            System.out.print("ERRORE");
        }
    }
}