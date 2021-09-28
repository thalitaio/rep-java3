
/*
_ Construa um método que imprima uma mensagem para ser usada como cabeçalho da aplicação. A mensagem 
deve exibir a mensagem “Cálculo de média”.
_ Construa um método que receba dois parâmetros inteiros realize a soma dos dois valores armaze em 
uma variável e retorne o valor da variável ao final da execução.
_ Construa um método que receba quatro parâmetros inteiros e realize o cálculo da média entre eles, 
armaze em uma variável double e retorne o valor da média ao final da execução.
_ No método main, realize a chamada do método que imprime a mensagem do cabeçalho.
_ No método main, realize a chamada do método soma por quatro vezes, passando valores diferentes 
a cada nova chamada,  armazene o retorno de cada chamada em uma variável diferente.
_ No método main, realize a chamada do método do cálculo da média, envie como argumento os quatro 
valores armazenados durante as chamadas do método de soma, armazene o retorno do cálculo da média em
 uma nova variável.
_ Ao final da execução do método main, exiba uma mensagem informando qual o valor da média calculada .

*/

/**
 * ATP13
 */

import java.util.Scanner;

public class ATP13 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        cabecalho();
        
        double s1 = soma(recebe(), recebe());
        double s2 = soma(recebe(), recebe());
        double s3 = soma(recebe(), recebe());
        double s4 = soma(recebe(), recebe());
        double mediaFinal = media(s1, s2, s3, s4);
        System.out.printf("A soma dos valores é: %.2f", (s1 + s2 + s3 + s4));
        System.out.printf("\nA média final é: %.2f ", mediaFinal);
    }

    static void cabecalho(){
        System.out.println("===== Cálculo de média =====");
    } 

    static double soma(double n1, double n2){
        double resultado = n1 + n2;
        return resultado;
    }    

    static double media(double n1, double n2, double n3, double n4){
        double valoresMedia = (n1 + n2 + n3 + n4)/4;
        return valoresMedia;
    }

    static double recebe(){
        System.out.println("Digite um número: ");
        double entrada = Double.parseDouble(sc.nextLine());
        return entrada;
    }

}