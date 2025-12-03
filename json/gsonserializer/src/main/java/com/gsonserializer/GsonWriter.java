package com.gsonserializer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class GsonWriter {
    
    private static void writeStringToFile(String filepath, String content) throws IOException {
        Files.write(Paths.get(filepath), content.getBytes());
    }
    
    public static void main (String args[]) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Libro[] libri = new Libro[2];
        libri[0] = new Libro("Lo Hobbit", "J. R. R. Tolkien", 9.99F);
        libri[1] = new Libro("Il signore degli anelli", "J. R. R. Tolkien", 30.0F);
        String json = gson.toJson(libri);
        writeStringToFile("libri.json", json);
    }
}
