package com.example;

import com.sparkpost.Client;
import org.apache.logging.log4j.message.Message;
import com.sparkpost.exception.SparkPostException;

public class App {
    public static void main(String[] args) throws SparkPostException {
        String API_KEY="98d8336861c64d RestoApiKey oculto por seguridad";
        Client client = new Client(API_KEY);

        client.sendMessage(
                "ames@mailsp.xadrez.eu",
                "xxhidalgoneira@gmail.com",
                "Bienvenido/a al sistema",
                "Sistemas","<b>Open Bootcamp</b>");

    }
}
