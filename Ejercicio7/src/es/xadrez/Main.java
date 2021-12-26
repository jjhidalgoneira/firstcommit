package es.xadrez;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Etiqueta etiqueta=new Etiqueta();
        etiqueta.nuevaEtiqueta("HTML+CSS");
        etiqueta.nuevaEtiqueta("Java Básico");
        etiqueta.nuevaEtiqueta("Spring");
        etiqueta.nuevaEtiqueta("Hibernate");



        Candidato candidato = new Candidato("Juan José Hidalgo Neira", "661 78 25 24",
                "España", "Milladoiro","ames@xadrez.eu",true,true,
                "fichero1.pdf","foto1.jpg",etiqueta);
        Candidato candidato2 = new Candidato("Pepe López López", "632 31 34 73",
                "España", "Murcia","aaaa@xaaa.com",true,false,
                "fichero2.pdf","foto2.jpg",etiqueta);
        Candidato candidato3 = new Candidato("Obdulio Pérez Sánchez", "111 11 11 11",
                "España", "Malaga","ames@xadrez.eu",false,false,
                "fichero3.pdf","foto3.jpg",etiqueta);
        Candidato candidato4 = new Candidato("Saul Cravioto López", "222 22 22 22",
                "España", "Merida","aaaa@xaaa.com",true,false,
                "fichero4.pdf","foto4.jpg",etiqueta);
        Candidato candidato5 = new Candidato("Anakin Skywalker De La Casa", "333 33 33 33",
                "España", "Morientes","kkkk@kkk.com",false,true,
                "fichero5.pdf","foto5.jpg",etiqueta);
        Candidato candidato6 = new Candidato("Obi One Kenobi", "444 44 44 44",
                "España", "Mallorca","lll@lll.com",false,false,
                "fichero6.pdf","foto6.jpg",etiqueta);
        Candidato candidato7 = new Candidato("Pepito lópez Sánchez", "555 55 55 55",
                "España", "Mieres","xxx@xxxx.com",false,true,
                "fichero7.pdf","foto7.jpg",etiqueta);
        Candidato candidato8 = new Candidato("Iván Salgado López", "666 66 66 66",
                "España", "Marcona","zzz@zzz.com",true,false,
                "fichero8.pdf","foto8.jpg",etiqueta);

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
        System.out.println(lista);

        // 2. Borramos un candidato
        lista.borraCandidato(candidato2);
        System.out.println(lista);

        // 3. Filtrar candidatos
        String Ciudad="Milladoiro";
        ArrayList encontraCiudad = lista.verCiudad(Ciudad);
        System.out.println(encontraCiudad);

        boolean presencial=true;
        ArrayList encontraPresencial = lista.verPresencial(presencial);
        System.out.println(encontraPresencial);

        boolean traslado=true;
        ArrayList encontraTraslado = lista.verTraslado(traslado);
        System.out.println(encontraTraslado);

        String ciu="Milladoiro";
        boolean trasla=true;
        boolean presen=true;
        ArrayList encontraTres = lista.verTres(ciu,trasla,presen);
        System.out.println(encontraTres);

        String emailBuscado="ames@xadrez.eu";
        ArrayList buscarEmail = lista.buscarEmail(emailBuscado);
        System.out.println(buscarEmail);

        String telBuscado="661 78 25 24";
        ArrayList buscarTel = lista.buscarTel(telBuscado);
        System.out.println(buscarTel);
    }
}
