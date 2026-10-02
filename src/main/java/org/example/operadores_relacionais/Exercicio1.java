package org.example.operadores_relacionais;

public class Exercicio1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
    if(a <= b){
        System.out.println("b menor que a");
    }
    else if(a != b){
        System.out.println("a é diferente de b");
    }
    else{
        System.out.println("valores iguais");
    }

    int c = 3;
    int d = 10;

    if(c <= d){
        System.out.println("c menor que d");
    } else if (d >= c) {
        System.out.println("d maior que c");
    } else{
        System.out.println("valores iguais");
    }

    int e = 5;
    int f = 5;

    if(e < f){
        System.out.println("f menor que e");
    }
    else if(e > f){
        System.out.println("valores iguais");
    }
    else {
        System.out.println("valores iguais");
    }

    boolean chovendo = true;

    if(!chovendo){
        System.out.println("está ensolarado");
    }
    else if(chovendo == true){
        System.out.println("está chovendo");
    }
    }
}
