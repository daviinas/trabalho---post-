package com.exemplo.produtoapi.Models;

public class Movie {

    private String titulo;
    private String genero;
    private double avaliacao;

    public Movie() {}

    public Movie(String titulo, String genero, double avaliacao) {
        this.titulo = titulo;
        this.genero = genero;
        this.avaliacao = avaliacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }
}