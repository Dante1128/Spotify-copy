package com.aluracursos.spotify.modelos;

public class MisFavoritos {
    public void adiciona(Audio audio){
        if (audio.getClasificaciones() >= 8){
            System.out.println(audio.getTitulo() + "Es uno de los favoritos del momento");
        }else {
            System.out.println(audio.getTitulo()+ "Tambien es uno de los favoritos ");

        }
    }
}
