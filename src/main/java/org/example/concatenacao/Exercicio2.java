package org.example.concatenacao;

public class Exercicio2 {
    static void main(){
//    Crie variáveis para o nome de um produto ("Caneca"), o preço (12.50) e a quantidade (4). Mostre: "Comprei 4 unidades de Caneca por R$ 12.5 cada. Total: R$ 50.0

    String produto = "Caneca";
    double preco = 12.50;
    int quantidade = 4;

    double calculo = preco * quantidade ;

    System.out.println("Comprei " + quantidade + " unidades de " + produto + " por " + preco + " cada. Total: R$ " + calculo);

}
}
