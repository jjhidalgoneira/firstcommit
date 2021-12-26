package es.xadrez;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Etiqueta etiqueta = new Etiqueta();
        etiqueta.nuevaEtiqueta("HTML+CSS");
        etiqueta.nuevaEtiqueta("Java Básico");
        etiqueta.nuevaEtiqueta("Spring");
        etiqueta.nuevaEtiqueta("Hibernate");


        Candidato candidato = new Candidato("Juan José Hidalgo Neira", "661 78 25 24",
                "España", "Milladoiro", "ames@xadrez.eu", true, true,
                "fichero1.pdf", "foto1.jpg", etiqueta);
        Candidato candidato2 = new Candidato("Pepe López López", "632 31 34 73",
                "Grecia", "Murcia", "aaaa@xaaa.com", true, true,
                "fichero2.pdf", "foto2.jpg", etiqueta);
        Candidato candidato3 = new Candidato("Obdulio Pérez Sánchez", "111 11 11 11",
                "Grecia", "Malaga", "ames@xadrez.eu", false, true,
                "fichero3.pdf", "foto3.jpg", etiqueta);
        Candidato candidato4 = new Candidato("Saul Cravioto López", "222 22 22 22",
                "Marruecos", "Merida", "aaaa@xaaa.com", true, true,
                "fichero4.pdf", "foto4.jpg", etiqueta);
        Candidato candidato5 = new Candidato("Anakin Skywalker De La Casa", "333 33 33 33",
                "España", "Morientes", "kkkk@kkk.com", false, true,
                "fichero5.pdf", "foto5.jpg", etiqueta);
        Candidato candidato6 = new Candidato("Obi One Kenobi", "444 44 44 44",
                "España", "Mallorca", "lll@lll.com", false, true,
                "fichero6.pdf", "foto6.jpg", etiqueta);
        Candidato candidato7 = new Candidato("Pepito lópez Sánchez", "555 55 55 55",
                "España", "Mieres", "xxx@xxxx.com", false, true,
                "fichero7.pdf", "foto7.jpg", etiqueta);
        Candidato candidato8 = new Candidato("Iván Salgado López", "666 66 66 66",
                "España", "Milladoiro", "zzz@zzz.com", true, false,
                "fichero8.pdf", "foto8.jpg", etiqueta);

        //1. Añadir nuevoCandidato
        CandidatosList lista = new CandidatosList();
        lista.nuevoCandidato(candidato);
        lista.nuevoCandidato(candidato2);
        lista.nuevoCandidato(candidato3);
        lista.nuevoCandidato(candidato4);
        lista.nuevoCandidato(candidato5);
        lista.nuevoCandidato(candidato6);
        lista.nuevoCandidato(candidato7);
        lista.nuevoCandidato(candidato8);

        // TO DO!!! CiudadesTop
        lista.imprimeCiudadesTop();



        //To  DO!!! PaisesTop
        lista.imprimePaisesTop();

        //Contar remotos
        boolean presencial=false;
        int contarRemoto=0;
        contarRemoto = lista.contarRemoto(presencial);


        //Contar dispuestos a trasladarse
        boolean traslado=true;
        int contarTraslado=0;
        contarTraslado= lista.contarTraslado(traslado);

        //Contar No dispuestos a trasladarse Si presencial
        boolean traslad=false;
        boolean presenc=true;
        int contaTraslado=0;
        contaTraslado= lista.contarNoTrasladSiPresenc(traslad,presenc);

    }
}