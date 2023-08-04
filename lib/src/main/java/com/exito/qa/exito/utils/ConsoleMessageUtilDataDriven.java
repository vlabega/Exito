package com.exito.qa.exito.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ConsoleMessageUtilDataDriven {
    private static Map<String, String> messages = new HashMap<>();

    static {
        loadMessagesFromFile("Messages.txt");
    }

    private static void loadMessagesFromFile(String fileName) {
        try (InputStream inputStream = ConsoleMessageUtilDataDriven.class.getResourceAsStream(fileName);
             BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    String key = parts[0];
                    String value = parts[1];
                    messages.put(key, value);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al cargar los mensajes desde el archivo: " + fileName);
        }
    }

    public static void printMessage(String key) {
        String message = messages.get(key);
        if (message != null) {
            System.out.println(message);
        } else {
            System.out.println("Mensaje no encontrado para la clave: " + key);
        }
    }
}