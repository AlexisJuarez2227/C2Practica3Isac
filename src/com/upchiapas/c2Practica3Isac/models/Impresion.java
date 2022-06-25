package com.upchiapas.c2Practica3Isac.models;

public class Impresion {
    Operacion opera = new Operacion();
    public void impresion (int d, int m, int y){
        System.out.println("Este es tu numero de la suerte: ");
        System.out.println(opera.operacion(d, m, y));
    }
}
