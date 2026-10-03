package org.example.lista_revisao;

import java.util.Scanner;

public class Exercicio1 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("qual o lanche:");
        String nome = sc.nextLine();

        System.out.print("valor do lanche:");
        double valor = sc.nextDouble();


        if(valor > 30){

            double descontoAplicar = valor * 0.95;

            System.out.println("desconto aplicado, valor total:" + descontoAplicar);
        }


    }

}
