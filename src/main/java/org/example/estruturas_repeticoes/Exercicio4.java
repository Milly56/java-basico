package org.example.estruturas_repeticoes;

public class Exercicio4 {
    public static void main(String[] args) {
        int idade = 17;
        boolean temAutorizacao = true;

        if(idade >= 18 || temAutorizacao == true){
            System.out.println("Pode entrar");
        } else if(idade >= 18 && temAutorizacao == true){
            System.out.println("Pode entrar");
        }
    }
}
