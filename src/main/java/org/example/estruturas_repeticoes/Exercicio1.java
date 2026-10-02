package org.example.estruturas_repeticoes;

public class Exercicio1 {
    public static void main(String[] args) {
        int idade = 59;

        if(idade < 13){
            System.out.println("Criança");
        }
        else if(idade >= 13 && idade < 17) {
            System.out.println("Adolescente");
        }
        else if(idade >= 18 && idade < 59){
            System.out.println("Adulto");
        }
        else if(idade >= 59){
            System.out.println("Idoso");
        }

    }
}
