package es.xadrez;

import java.util.ArrayList;
import java.util.Objects;

public class CandidatosList {

    ArrayList<Candidato> candidatos = new ArrayList<Candidato>();

    public CandidatosList() {
    }

    public CandidatosList(ArrayList<Candidato> candidatos) {
        this.candidatos = candidatos;
    }

    public ArrayList<Candidato> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(ArrayList<Candidato> candidatos) {
        this.candidatos = candidatos;
    }

    @Override
    public String toString() {
        return "CandidatosList{" +
                "candidatos=" + candidatos +
                '}';
    }

    //Nuevo Candidato
    public void nuevoCandidato(Candidato candidato) {
        candidatos.add(candidato);
    }

    //Borrar Candidato
    public void borraCandidato(Candidato candidato) {
        for (int i = 0; i < candidatos.size(); i++) {
            if (candidatos.get(i) == candidato) {
                candidatos.remove(i);
            }
        }
    }

    //Filtrar por ciudad
    public ArrayList<Candidato> verCiudad(String ciudad) {
        ArrayList<Candidato> salida = new ArrayList<Candidato>();
        for (int i = 0; i < candidatos.size(); i++) {
            if (ciudad.equals(candidatos.get(i).getCiudad())) {
                salida.add(candidatos.get(i));
            }
        }
        return salida;
    }

    //Filtrar por presencialidad
    public ArrayList<Candidato> verPresencial(boolean presencialidad) {
        ArrayList<Candidato> salida = new ArrayList<Candidato>();
        for (int i = 0; i < candidatos.size(); i++) {
            if (presencialidad == (candidatos.get(i).isPresencialidad())) {
                salida.add(candidatos.get(i));
            }
        }
        return salida;
    }

    //Filtrar por Traslado
    public ArrayList<Candidato> verTraslado(boolean traslado) {
        ArrayList<Candidato> salida = new ArrayList<Candidato>();
        for (int i = 0; i < candidatos.size(); i++) {
            if (traslado == (candidatos.get(i).isTraslado())) {
                salida.add(candidatos.get(i));
            }
        }
        return salida;
    }

    public ArrayList<Candidato> verTres(String ciudad, boolean presencialidad, boolean traslado) {
        ArrayList<Candidato> salida = new ArrayList<Candidato>();
        for (int i = 0; i < candidatos.size(); i++) {
            if (traslado == (candidatos.get(i).isTraslado()) && (presencialidad == (candidatos.get(i).isPresencialidad()))) {
                if (Objects.equals(ciudad, candidatos.get(i).getCiudad())) {
                    salida.add(candidatos.get(i));
                }
            }
        }
        return salida;
    }

    public ArrayList<Candidato> buscarEmail(String email) {
        ArrayList<Candidato> salida = new ArrayList<Candidato>();
        for (int i=0; i< candidatos.size(); i++) {
            if (email.equals(candidatos.get(i).getEmail())) {
                salida.add(candidatos.get(i));
            }
        }
        return salida;
    }

    public ArrayList<Candidato> buscarTel(String telBuscado) {
        ArrayList<Candidato> salida = new ArrayList<Candidato>();
        for (int i=0; i< candidatos.size(); i++) {
            if (telBuscado.equals(candidatos.get(i).getNumTelefono())) {
                salida.add(candidatos.get(i));
            }
        }
        return salida;
    }
}
