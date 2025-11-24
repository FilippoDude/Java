package com.json_manager.utils;

import java.io.FileOutputStream;
import java.io.OutputStream;

import jakarta.json.Json;
import jakarta.json.JsonObjectBuilder;
import jakarta.json.JsonWriter;

public class JSONWriter {
    private static final String JSON_FILE = "test.json";
    
    public static void writeToFile() throws Exception{
        JsonObjectBuilder root = Json.createObjectBuilder();
        root.add("test", "ciao");
        OutputStream output = new FileOutputStream(JSON_FILE);
        JsonWriter writer = Json.createWriter(output);
        writer.writeObject(root.build());
    }
}
