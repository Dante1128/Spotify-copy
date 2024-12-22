package com.aluracursos.spotify.modelos;

public class Podcast extends Audio
{
    private String Titulo;

    private String presentador;
    private String descripcion;


    @Override
    public int getClasificaciones() {
        if (getTotalDeReproducciones() >= 2000) {
            return 9;
            
        }else {
            return 2;
        }
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getPresentador() {
        return presentador;
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
