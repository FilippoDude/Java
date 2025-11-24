package com.json_manager;

import com.json_manager.utils.JSONWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            JSONWriter.writeToFile();
        } finally {
            System.out.println("Cry");
        }
    }
}       