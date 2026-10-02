package org.example.aritmetico;

public class Exercicio1 {
    public static void main(String[] args) {
        System.out.println("2 + 2 = " + 2 + 2);
        System.out.println("2 + 2 = " + (2 + 2));

        // devido a ordem de precidência, ele está no 1 concatenando( juntando os numeros porque o primeiro é o string, ai todos viraram string),
        // o segundo é porque estão em paratênses ai fez a soma porque está isolado.
    }
}
