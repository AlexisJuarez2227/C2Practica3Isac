package com.upchiapas.c2Practica3Isac.models;

public class Operacion {
    public int num1;
    public int operacion(int d, int m, int y){
        num1=d+m+y;
        String aux=Integer.toString(num1);
        Integer [] dijitos=new Integer[aux.length()];
        Integer[] resustados=new Integer[aux.length()];
        resustados[0]=num1/10;
        dijitos[0]=num1%10;
        for (int i=1;i<aux.length(); i++){
            resustados[i]=resustados[i-1]/10;
            dijitos[i]=resustados[i-1]%10;
        }
        num1=0;
        for (int i=0; i<aux.length(); i++){
            num1+=dijitos[i];
        }return num1;
    }
}
