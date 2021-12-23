package es.xadrez;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        long numLineaLeida = 0;
        long numErrores = 0;
        long lineasOk = 0;
        String testemail;
        String emailTest;
        boolean emailValido;
        boolean lineaValida;

        ArrayList<String> email = new ArrayList<String>();
        ArrayList<String> name = new ArrayList<String>();
        ArrayList<String> user = new ArrayList<String>();

        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca el nombre de archivo CSV-> c:/data/fichero.csv ");
        String nombreFichero = s.nextLine();
        if (Objects.equals(nombreFichero, "")) {
            nombreFichero = "c:/data/fichero.csv";
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader(nombreFichero));
            String linea = "";

            while (linea != null) {
                linea = reader.readLine();
                numLineaLeida++;
                emailValido=true;
                lineaValida=true;

                int arroba=0;
                int punto=0;

                if (linea !=null) {
                    String[] verificaEmail = linea.split(",");
                    emailTest = verificaEmail[0];
                    for (int i = 0; i < emailTest.length(); i++) {
                        if (emailTest.charAt(i) == '@') {
                            arroba++;
                        }
                        if (emailTest.charAt(i) == '.') {
                            punto++;
                        }
                    }
                    if (arroba != 1 && punto != 1) {
                        emailValido = false;
                        System.err.println(numLineaLeida + ") " + linea + "LINEA MAL FORMADA:");
                        numErrores++;
                    }
                    if (emailValido) {
                        testemail = (verificaEmail[0]).toLowerCase(Locale.ROOT);
                        for (String emailLeido : email) {
                            if (testemail.equals(emailLeido.toLowerCase(Locale.ROOT))) {
                                emailValido = false;
                                System.err.println(numLineaLeida + ") " + linea + "CORREO DUPLICADO:" + testemail);
                                numErrores++;
                            }
                        }
                    }

                    String[] lineaOk = linea.split(",");
                    if (!lineaValida) {
                        lineaValida = false;
                        System.err.println(numLineaLeida + ") " + linea + "LINEA MAL FORMADA");
                        numErrores++;
                    }
                }
                if (emailValido&&lineaValida) {

                    if (linea != null) {
                        String[] parte = linea.split(",");
                        email.add(parte[0]);
                        name.add(parte[1]);
                        user.add(parte[2]);
                        System.out.println(numLineaLeida + ") " + parte[0] + " || " + parte[1] + " || " + parte[2] + " || ");
                        lineasOk = lineasOk + 1;
                    }
                }
            }
                System.out.println("Número de lineas procesadas correctamente: " + lineasOk);
                System.out.println("Número de errores " + numErrores);
                reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("ERROR: No se encuentra -> fichero.csv");
        } catch (IOException e) {
            System.out.println("ERROR: No se puede leer -> fichero.csv");
        }
    }
}
