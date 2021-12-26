package es.xadrez;

import java.util.ArrayList;

public class Etiqueta {
      //Atributos
      ArrayList<String> etiquetas=new ArrayList<String>();

      public void nuevaEtiqueta(String etiqueta){
            etiquetas.add(etiqueta);
      }

      //Constructores
      public Etiqueta() {
      }

      public Etiqueta(ArrayList<String> etiquetas) {
            this.etiquetas = etiquetas;
      }

      //Getter y setter
      public ArrayList<String> getEtiquetas() {
            return etiquetas;
      }

      public void setEtiquetas(ArrayList<String> etiquetas) {
            this.etiquetas = etiquetas;
      }

      //To string
      @Override
      public String toString() {
            return "Etiqueta{" +
                    "etiquetas=" + etiquetas +
                    '}';
      }
}