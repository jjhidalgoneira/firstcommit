package es.xadrez;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;

public class Encripta{

    static Argon2 argon2 = Argon2Factory.create();

    static String encripta(String password){

        char[] pass=password.toCharArray();
        String hash = argon2.hash(10,1024,1,pass);
        return hash;
    }
    static boolean verifica(String password, String hash){

        boolean success = argon2.verify(hash,password);
        System.out.println("comparación: "+success);
        return success;
    }
}
