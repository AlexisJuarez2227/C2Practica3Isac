package com.upchiapas.c2Practica3Isac;

import com.upchiapas.c2Practica3Isac.models.Impresion;
import com.upchiapas.c2Practica3Isac.models.LecturaDato;

import java.util.Scanner;

public class Persona {
    public static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Escriba el numero de su cumpleaños: ");
        int dia = entrada.nextInt();
        System.out.println("Escriba el numero de su mes de nacimiento: ");
        int mes = entrada.nextInt();
        System.out.println("Escriba su año de nacimiento: ");
        int year = entrada.nextInt();
        LecturaDato imprimir = new LecturaDato(dia, mes, year);
    }
}
