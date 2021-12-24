package com.example;

import com.sparkpost.Client;
import org.apache.logging.log4j.message.Message;
import com.sparkpost.exception.SparkPostException;

public class App {
    public static void main(String[] args) throws SparkPostException {
        String API_KEY="Aquí Mi API Key";
        Client client = new Client(API_KEY);

        client.sendMessage(
                "ames@mailsp.xadrez.eu",
                "xxhidalgoneira@gmail.com",
                "Prueba de SparkPost Mail",
                "Texto","The HTML part</b>");

    }
}
