package org.example.lista_revisao;

import java.util.Scanner;

public class Exercicio3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("1 - ver camisas");
            System.out.println("2 - calças");
            System.out.println("3 - sair");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("vendo camisas");
                    break;
                case 2:
                    System.out.println("ver calças");
                    break;
                case 3:
                    System.out.println("saindo...");
                    break;
                default:
                    System.out.println("opção invalida");

            }
        } while (opcao!=0);
        sc.close();
    }
}
