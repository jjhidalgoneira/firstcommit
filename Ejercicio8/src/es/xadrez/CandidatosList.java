package es.xadrez;

import java.util.*;
import java.util.stream.Collectors;

public class CandidatosList {
    //Atributos
    ArrayList<Candidato> candidatos = new ArrayList<Candidato>();

    //Constructores
    public CandidatosList() {
    }

    public CandidatosList(ArrayList<Candidato> candidatos) {
        this.candidatos = candidatos;
    }

    //Getter y setter
    public ArrayList<Candidato> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(ArrayList<Candidato> candidatos) {
        this.candidatos = candidatos;
    }

    //To String
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

    //Filtrar por Ciudad, presencialidad y traslado
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

    //Filtrar por email
    public ArrayList<Candidato> buscarEmail(String email) {
        ArrayList<Candidato> salida = new ArrayList<Candidato>();
        for (int i=0; i< candidatos.size(); i++) {
            if (email.equals(candidatos.get(i).getEmail())) {
                salida.add(candidatos.get(i));
            }
        }
        return salida;
    }

    //Filtrar por teléfono
    public ArrayList<Candidato> buscarTel(String telBuscado) {
        ArrayList<Candidato> salida = new ArrayList<Candidato>();
        for (int i=0; i< candidatos.size(); i++) {
            if (telBuscado.equals(candidatos.get(i).getNumTelefono())) {
                salida.add(candidatos.get(i));
            }
        }
        return salida;
    }
    // Ciudades Top
    public void imprimeCiudadesTop() {
        String ciudadaBuscar = candidatos.get(0).getCiudad();
        String ciudadRepetida;
        Boolean repetida = false;
        HashMap<String, Integer> mapa = new HashMap<String, Integer>();
        mapa.put(ciudadaBuscar, 1);
        for (int j = 2; j < candidatos.size(); j++) {
            ciudadaBuscar=candidatos.get(j).ciudad;
            for (int i = 1; i < candidatos.size(); i++) {
                ciudadRepetida = candidatos.get(i).ciudad;
                if (Objects.equals(ciudadRepetida, ciudadaBuscar)) {
                    if (mapa.get(ciudadRepetida)!=null){mapa.put(ciudadaBuscar, mapa.get(ciudadaBuscar) + 1);}
                    else {mapa.put(ciudadaBuscar,1);}
                    repetida = true;
                }
            }
        }
        Map<String,Integer> sortedByCount = mapa.entrySet()
                .stream()
                .sorted((Map.Entry.<String, Integer>comparingByValue().reversed()))
                .collect(Collectors.toMap (Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(sortedByCount);
    }

    // Paises Top
    public void imprimePaisesTop() {
        String paisaBuscar = candidatos.get(0).getPais();
        String paisRepetido;
        Boolean repetido = false;
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put(paisaBuscar, 1);
            for (int i = 1; i < candidatos.size(); i++) {
                paisRepetido = candidatos.get(i).getPais();

                if (mapa.get(paisRepetido) != null) {
                    mapa.put(paisRepetido, mapa.get(paisRepetido) + 1);
                } else {
                    mapa.put(paisRepetido, 1);
                }
                repetido = true;
        }

        Map<String,Integer> sortedByCount = mapa.entrySet()
                .stream()
                .sorted((Map.Entry.<String, Integer>comparingByValue().reversed()))
                .collect(Collectors.toMap (Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(sortedByCount);

    }

    // Contar remotos
    public int contarRemoto(boolean remoto) {
        ArrayList<Candidato> salida = new ArrayList<Candidato>();
        for (int i = 0; i < candidatos.size(); i++) {
            if (remoto == (candidatos.get(i).isPresencialidad())) {
                salida.add(candidatos.get(i));
            }
        }
        int cuentaRemoto=salida.size();
        return cuentaRemoto;
    }

    //Contar traslado
        public int contarTraslado(boolean traslado) {
        ArrayList<Candidato> salida = new ArrayList<Candidato>();
        for (int i = 0; i < candidatos.size(); i++) {
            if (traslado == (candidatos.get(i).isTraslado())) {
                salida.add(candidatos.get(i));
            }
        }
        int cuentaTraslado=salida.size();
        return cuentaTraslado;
    }

    //Contar Presencial sin traslado
    public int contarNoTrasladSiPresenc(boolean traslad, boolean presenc) {
        ArrayList<Candidato> salida = new ArrayList<Candidato>();
        for (int i = 0; i < candidatos.size(); i++) {
            if (traslad == (candidatos.get(i).isTraslado()) && presenc == (candidatos.get(i).isPresencialidad())) {
                salida.add(candidatos.get(i));
            }
        }
        int cuentaTrasladoSiPresencial=salida.size();
        return cuentaTrasladoSiPresencial;
    }

}