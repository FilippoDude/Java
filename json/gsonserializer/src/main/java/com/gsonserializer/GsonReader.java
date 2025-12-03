package com.gsonserializer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;


public class GsonReader {
    
    private static String readStringFromFile(String filepath) throws IOException {
        byte[] content = Files.readAllBytes(Paths.get(filepath));
        return new String(content);
    }

    public static void main (String args[]) throws IOException {
        Gson gson = new Gson();
        String json = readStringFromFile("libri.json");
        Libro[] libri = gson.fromJson(json, Libro[].class);
        for (Libro libro : libri)
           System.out.println(libro);
    }
}
