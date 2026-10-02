package org.example.estruturas_repeticoes;

public class Exercicio2 {
    public static void main(String[] args) {
        double saldo = 500.00;
        double valorCompra = 320.00;

        if(saldo > valorCompra){
            System.out.println("Compra Aprovada!");
        } else if(saldo < valorCompra){
            System.out.println("Saldo Insuficiente!");
        }
    }
}
