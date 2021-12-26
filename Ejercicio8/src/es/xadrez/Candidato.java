package es.xadrez;

import java.util.ArrayList;

public class Candidato {
    String nombreyApellidos;
    String numTelefono;
    String pais;
    String ciudad;
    String email;
    boolean traslado;
    boolean presencialidad;
    String Ficheropdf;
    String Ficherofoto;
    Etiqueta etiquetas;

    // Constructores
    public Candidato() {
    }

    public Candidato(String nombreyApellidos, String numTelefono, String pais, String ciudad,
                     String email, boolean traslado, boolean presencialidad, String ficheropdf,
                     String ficherofoto, Etiqueta etiquetas) {
        this.nombreyApellidos = nombreyApellidos;
        this.numTelefono = numTelefono;
        this.pais = pais;
        this.ciudad = ciudad;
        this.email = email;
        this.traslado = traslado;
        this.presencialidad = presencialidad;
        Ficheropdf = ficheropdf;
        Ficherofoto = ficherofoto;
        this.etiquetas = etiquetas;
    }

    // getter y setter
    public String getNombreyApellidos() {
        return nombreyApellidos;
    }

    public void setNombreyApellidos(String nombreyApellidos) {
        this.nombreyApellidos = nombreyApellidos;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isTraslado() {
        return traslado;
    }

    public void setTraslado(boolean traslado) {
        this.traslado = traslado;
    }

    public boolean isPresencialidad() {
        return presencialidad;
    }

    public void setPresencialidad(boolean presencialidad) {
        this.presencialidad = presencialidad;
    }

    public String getFicheropdf() {
        return Ficheropdf;
    }

    public void setFicheropdf(String ficheropdf) {
        Ficheropdf = ficheropdf;
    }

    public String getFicherofoto() {
        return Ficherofoto;
    }

    public void setFicherofoto(String ficherofoto) {
        Ficherofoto = ficherofoto;
    }

    public Etiqueta getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(Etiqueta etiquetas) {
        this.etiquetas = etiquetas;
    }

    // To String
    @Override
    public String toString() {
        return "Candidato{" +
                "nombreyApellidos='" + nombreyApellidos + '\'' +
                ", numTelefono='" + numTelefono + '\'' +
                ", pais='" + pais + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", email='" + email + '\'' +
                ", traslado=" + traslado +
                ", presencialidad=" + presencialidad +
                ", Ficheropdf='" + Ficheropdf + '\'' +
                ", Ficherofoto='" + Ficherofoto + '\'' +
                ", etiquetas=" + etiquetas +
                '}';
    }
}
