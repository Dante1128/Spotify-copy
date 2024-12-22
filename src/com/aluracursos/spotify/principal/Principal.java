package com.aluracursos.spotify.principal;

import com.aluracursos.spotify.modelos.Cancion;
import com.aluracursos.spotify.modelos.MisFavoritos;
import com.aluracursos.spotify.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kiss");

        Podcast miPodcast =  new Podcast();
        miPodcast.setPresentador("Jhon salchichon");
        miPodcast.setDescripcion("Es un podcast el cual nos ensena sobre programacion orientado a objetos");
        miPodcast.setTitulo("Cafe.tech");

        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 2000; i++) {
            miCancion.reproduce();
        }

        for (int i = 0; i < 100; i++) {
            miPodcast.meGusta();
        }
        for (int i = 0; i < 8000; i++) {
            miPodcast.reproduce();
        }
        System.out.println("Total de reproducciones " + miCancion.getTotalDeReproducciones());
        System.out.println("Total de me gusta " + miCancion.getTotalDeMegusta());

        MisFavoritos favoritos = new MisFavoritos();


        favoritos.adiciona(miPodcast);
        favoritos.adiciona(miCancion);
    }
}
