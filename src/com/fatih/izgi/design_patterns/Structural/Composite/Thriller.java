package com.fatih.izgi.design_patterns.Structural.Composite;

class Thriller implements Movie{
    private int id;
    private String name;
    private String releaseDate;
    private double imdb;

    public Thriller(int id, String name, String releaseDate, double imdb) {
        this.id = id;
        this.name = name;
        this.imdb = imdb;
        this.releaseDate = releaseDate;
    }

    @Override
    public void showMovieInfo() {
        System.out.println("Film adı : "+name);
        System.out.println("Yayın tarihi : "+releaseDate);
        System.out.println("İmdb : "+imdb);
        System.out.println("--");
    }
}