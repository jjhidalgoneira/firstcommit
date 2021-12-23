import java.util.ArrayList;

//agregar la foto uno.jpg en la carpeta del programa

public class Main {
    public static void main(String[] args) {
        String nombre = "uno";
        ArrayList<String> etiquetas = new ArrayList<>();
        etiquetas.add ("Java básico");
        etiquetas.add ("Java Avanzado");
        etiquetas.add ("HTML+CSS");
        etiquetas.add ("Introducción a BIG Data");

        App.writePDF(nombre,etiquetas);
    }
}
