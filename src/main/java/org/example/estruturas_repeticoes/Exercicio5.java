package org.example.estruturas_repeticoes;

public class Exercicio5 {
    public static void main(String[] args) {
        double nota1 = 5.3;
        double nota2 = 7.8;
        double nota3 = 4.5;
        double media = (nota1 + nota2 + nota3) / 3;

        if(media >= 7){
            System.out.println("Aprovado");
        }else if(media == 5 && media == 6.9)
        {
            System.out.println("Recuperação");
        } else
            {
            System.out.println("Reprovado");
            }
        System.out.printf("Sua média é:%.2f\n", media);
    }
}
