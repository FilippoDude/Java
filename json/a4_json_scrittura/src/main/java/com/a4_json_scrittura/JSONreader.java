package com.a4_json_scrittura;

import java.io.*;

import jakarta.json.Json;
import jakarta.json.JsonArray;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;
import jakarta.json.JsonValue;


public class JSONreader {

	public static final String JSON_FILE = "libri.json";
	
	public static void main(String[] args) throws IOException {
		Libro libri[];
        InputStream input = new FileInputStream(JSON_FILE);
		
		var jsonReader = Json.createReader(input);
        
		JsonObject jsonObject = jsonReader.readObject();
		
		jsonReader.close();
		input.close();
		
        JsonObject innerJsonObject = jsonObject.getJsonObject("libri");
                
		
		JsonArray jsonArray = innerJsonObject.getJsonArray("libro");
        libri = new Libro[jsonArray.size()];
                
        int index = 0;
		for(JsonValue element : jsonArray){
            Libro libro = new Libro();
		    libro.setGenere( element.asJsonObject().getString("genere"));
            libro.setTitolo( element.asJsonObject().getString("titolo"));
            libro.setAutore( element.asJsonObject().getString("autore"));
            libro.setPrezzo( (float)(element.asJsonObject().getJsonNumber("prezzo").doubleValue()));
		    libri[index++] = libro;
		}                
                
		for (index= 0; index<libri.length; index++)
           System.out.println(libri[index]);
	}
}
