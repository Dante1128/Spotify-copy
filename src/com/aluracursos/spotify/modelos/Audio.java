package com.aluracursos.spotify.modelos;

public class Audio {
    private String titulo;
    private  int totalDeReproducciones;
    private  int totalDeMegusta;
    private  int clasificaciones;

    public void meGusta(){
        this.totalDeMegusta++;
    }
    public void reproduce(){
        this.totalDeReproducciones++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getClasificaciones() {
        return clasificaciones;
    }

    public void setClasificaciones(int clasificaciones) {
        this.clasificaciones = clasificaciones;
    }

    public int getTotalDeMegusta() {
        return totalDeMegusta;
    }

    public void setTotalDeMegusta(int totalDeMegusta) {
        this.totalDeMegusta = totalDeMegusta;
    }

    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    public void setTotalDeReproducciones(int totalDeReproducciones) {
        this.totalDeReproducciones = totalDeReproducciones;
    }
}
