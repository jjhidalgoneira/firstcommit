package es.xadrez;


import java.util.ArrayList;
import java.util.Objects;

public class Sistema {

    static ArrayList<String> correo = new ArrayList<>();
    static ArrayList<String> clave = new ArrayList<>();


    public Sistema() {
    }

    public static boolean register(String email, String password)
    {
        //Datos de prueba
        correo.add("a@a.com");
        clave.add("a");
        correo.add("b@b.com");
        clave.add("b");

        String hashedpassword;

        boolean valido=true;
        for (String correoLeido : correo){
            if (Objects.equals(correoLeido, email)){
                valido=false;
                System.err.println(email);
            }
        }
        if(valido){
            correo.add(email);
            System.out.println(correo);
            hashedpassword=Encripta.encripta(password);
            clave.add(hashedpassword);
            System.out.println(hashedpassword);
        }
        return valido;
    }
    public static int login(String email, String password)
    {
        //CORREO EXISTE
        boolean valido=false;
        for (String correoLeido : correo){
            if (Objects.equals(correoLeido, email))
            {valido=true;}
        }
        if (!valido) return -1;

        //CORREO:PASSWORD
        String claveAlmacenda;
        String hash;
        valido=false;
        for (int i = 0; i < correo.size();i++){
            if (Objects.equals(correo.get(i), email)){
                claveAlmacenda=clave.get(i);
                if (Encripta.verifica(password, claveAlmacenda)){
                                    return 1;
                }
            }
        }
        return -2;
    }


}
