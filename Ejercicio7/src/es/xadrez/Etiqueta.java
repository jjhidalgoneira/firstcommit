package es.xadrez;

import java.util.ArrayList;

public class Etiqueta {

    ArrayList<String> etiquetas=new ArrayList<String>();

    public void nuevaEtiqueta(String etiqueta){
        etiquetas.add(etiqueta);
    }


    public Etiqueta() {
    }

    public Etiqueta(ArrayList<String> etiquetas) {
        this.etiquetas = etiquetas;
    }

    public ArrayList<String> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(ArrayList<String> etiquetas) {
        this.etiquetas = etiquetas;
    }

    @Override
    public String toString() {
        return "Etiqueta{" +
                "etiquetas=" + etiquetas +
                '}';
    }
}