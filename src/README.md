# Java Básico

![Java](https://img.shields.io/static/v1?label=Java&message=25&color=ED8B00&logo=openjdk&logoColor=white)
![Maven](https://img.shields.io/static/v1?label=Build&message=Maven&color=C71A36&logo=apachemaven&logoColor=white)
![Bootcamp](https://img.shields.io/static/v1?label=Bootcamp&message=ElasTech&color=8A2BE2)
![Parceria](https://img.shields.io/static/v1?label=Parceria&message=Soulcode%20%2B%20PagBank&color=00A859)
![Exercicios](https://img.shields.io/static/v1?label=Exercicios&message=16&color=informational)
![Status](https://img.shields.io/static/v1?label=Status&message=Em%20andamento&color=yellow)

Repositório de exercícios em Java desenvolvido durante o bootcamp **ElasTech**, uma parceria entre a **Soulcode** e o **PagBank** voltada à formação de mulheres na área de tecnologia. Aqui eu pratico os fundamentos da linguagem: operações aritméticas, concatenação de textos, estruturas de repetição e operadores relacionais.

## O que você encontra aqui

São 16 exercícios organizados em quatro pacotes, um para cada tema:

### Aritmética (`aritmetico`) · 7 exercícios
Soma, subtração, multiplicação, divisão e resto da divisão, usando variáveis de tipos numéricos como `int` e `double`.

### Concatenação (`concatenacao`) · 3 exercícios
Junção de textos e valores com o operador `+`, montando mensagens e saídas formatadas no console.

### Estruturas de repetição (`estruturas_repeticoes`) · 5 exercícios
Uso de `for`, `while` e `do while`, além de condicionais com `if`, `else if` e `else`.

### Operadores relacionais (`operadores_relacionais`) · 1 exercício
Comparações com `==`, `!=`, `>`, `<`, `>=` e `<=`, que resultam em valores booleanos.

## Tecnologias utilizadas

* Java 25
* Maven para gerenciar o projeto e a compilação
* Git e GitHub para versionamento
* IDE de sua preferência (IntelliJ IDEA, Eclipse ou VS Code)

## Requisitos

* JDK 25 instalado
* Maven instalado (ou uma IDE que já traga suporte a Maven)

## Estrutura do projeto

```
pom.xml
src
└── main
    └── java
        └── org.example
            ├── aritmetico
            │   ├── Exercicio1
            │   ├── Exercicio2
            │   ├── Exercicio3
            │   ├── Exercicio4
            │   ├── Exercicio5
            │   ├── Exercicio6
            │   └── Exercicio7
            ├── concatenacao
            │   ├── Exercicio1
            │   ├── Exercicio2
            │   └── Exercicio3
            ├── estruturas_repeticoes
            │   ├── Exercicio1
            │   ├── Exercicio2
            │   ├── Exercicio3
            │   ├── Exercicio4
            │   └── Exercicio5
            ├── operadores_relacionais
            │   └── Exercicio1
            └── Main
```

## Como executar

1. Clone o repositório:

```bash
git clone https://github.com/Milly56/java-basico.git
```

2. Acesse a pasta do projeto:

```bash
cd java-basico
```

3. Compile com o Maven:

```bash
mvn compile
```

4. Entre na pasta das classes compiladas:

```bash
cd target/classes
```

5. Execute a classe principal ou o exercício que quiser, informando o pacote:

```bash
java org.example.Main
java org.example.aritmetico.Exercicio1
java org.example.concatenacao.Exercicio2
java org.example.estruturas_repeticoes.Exercicio3
java org.example.operadores_relacionais.Exercicio1
```

Se preferir, abra o projeto na sua IDE e execute a classe direto pelo botão de run.

## Exemplo

Exercício que classifica uma pessoa pela faixa de idade:

```java
package org.example.estruturas_repeticoes;

public class Exercicio1 {
    public static void main(String[] args) {
        int idade = 59;

        if (idade < 13) {
            System.out.println("Criança");
        } else if (idade >= 13 && idade < 18) {
            System.out.println("Adolescente");
        } else if (idade >= 18 && idade < 59) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
    }
}
```

Saída para `idade = 59`:

```
Idoso
```

## O que eu aprendi

* Declarar variáveis e trabalhar com tipos numéricos
* Realizar cálculos com operadores aritméticos
* Juntar textos e valores com concatenação
* Repetir blocos de código com `for`, `while` e `do while`
* Comparar valores com operadores relacionais e combinar condições com `&&`
* Tomar decisões no código com `if`, `else if` e `else`
* Configurar um projeto Maven e organizar o código em pacotes

## Próximos passos

* Estrutura `switch`
* Vetores e métodos
* Orientação a objetos

## Autora

**Jamily Alves Rodrigues**

[![GitHub](https://img.shields.io/static/v1?label=GitHub&message=Milly56&color=181717&logo=github)](https://github.com/Milly56)