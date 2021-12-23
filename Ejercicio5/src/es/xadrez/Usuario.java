package es.xadrez;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Usuario {
    ArrayList<AlumnoCandidato> alumnoCandidato;
    ArrayList<Etiqueta> etiqueta;
    String email;
    String contraseña;
    ArrayList<String> correo = new ArrayList<String>();
    ArrayList<String> clave = new ArrayList<String>();

public void registrar()
{
    String lectura;
    String passLeido;
    System.out.println("Introduce usuario nuevo:");
    Scanner scanner = new Scanner(System.in);
    correo.add(scanner.nextLine());
    System.out.println("Introduce password deseado:");
    clave.add(scanner.nextLine());
}

public boolean login(String email, String password)
    {
    String usuarioleido;
    String passLeido;

    System.out.println("Introduce usuario:");
    Scanner scanner = new Scanner(System.in);
    usuarioleido= scanner.nextLine();
    System.out.println("Introduce password:");
    passLeido=scanner.nextLine();

    boolean login=false;
    for (int i=0; i<correo.size();i++){
        if (Objects.equals(correo.get(i), usuarioleido) && Objects.equals(clave.get(i), passLeido)){
            login=true;
            }
        }
    return login;
    }
}
