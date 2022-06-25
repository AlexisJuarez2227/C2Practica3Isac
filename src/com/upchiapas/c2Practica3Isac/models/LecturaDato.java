package com.upchiapas.c2Practica3Isac.models;

public class LecturaDato {
    private int dia;
    private int mes;
    private int year;
    Impresion impresion = new Impresion();

    public LecturaDato (int dia, int mes, int year){
        this.dia=dia;
        this.mes=mes;
        this.year=year;
        impresion.impresion(dia, mes, year);
    }
}
