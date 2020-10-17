package br.senac.rn.helloworld;

public class HelloWorld {

    public static void main(String[] args) {

        //Tipo inteiro
        //int valor1 = 2; //Variavel do tipo númerico inteiro
        //long idade = 32L; //Variavel do tipo númerico inteiro
        //short valor2 = 33; //Variavel do tipo númerico inteiro

        //Tipo decimal
        //float nota1 = 8.5f; //Variavel do tipo númerico decimal
        //double nota2 = 10.2f;, //Variavel do tipo númerico decimal

        //Valor lógico
        //boolean ehPrimo = true; //Variavel do tipo lógico

        //Tipo caractere
        //char letra = 'd'; //Variavel do tipo literal (caractere)

        /*
        String - armazena o texto, como "Hello". Valores de string são cercados por aspas duplas
        int - armazena inteiros (números inteiros), sem decimais, como 123 ou -123
        float - armazena números de ponto flutuante, com decimais, como 19,99 ou -19,99
        char - armazena caracteres únicos, como 'a' ou 'B'. Valores Char são cercados por aspas simples
        boolean - armazena valores com dois estados: verdadeiro ou falso
        */


        Integer valor1 = 2;
        Long valor2 = 2L;

        Float nota1 = 8.5f;
        Double nota2 = 7.5;

        Boolean ehPrimo = true;

        Character letra = 'd';

        String frase = "Oi mundo";  //Tipo literal (texto)

        System.out.println("Bem vindo ao mundo JAVA!!!");

        System.out.println();

        /*

public: é a visibilidade, podendo ser public, private, protected ou default.

static: é opcional, significa que o método pode ser chamado sem que a classe seja instanciada em um objeto,
é muito útil para a classe principal (main) já que é a primeira a ser executada.

void: é o tipo de dado do retorno do método, void é usado quando o método não retorna nada.

main(): nome do método, se tem os parênteses então é um método.

String[] args: args é o nome da variável local do método e String[] o tipo de dado, este tipo é um vetor de caracteres.
String é um vetor (ou array) de caracteres, String[] é um array de String

         */

    }

}
