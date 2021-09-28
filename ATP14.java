/*
_ Construa um método que imprima uma mensagem para ser usada como cabeçalho da aplicação. A mensagem deve exibir a mensagem “Calculadora”.
_ Construa um método que imprima o menu de opções contendo as opções somar, subtratir, multiplicar e dividir.
_ Construa um método que solicite ao usuario que ele digite uma das opções do menu, armazene a opção em uma variável, valide o 
valor e retorne apenas quando uma opção válida for digitada.
_ Crie um método que receba a opção escolhida pelo usuário e encaminhe para o método que irá realizar a operação correta, seja de soma, subtração, multiplicação e divisão.
_ Construa os metodos de soma,  subtração, multiplicação e divisão.Todos os métodos devem receber dois parâmetros double realizar 
a operação e retornar o valor do cálculo.
_ Imprima o resultado das operações fora do metodo que realiza o cálculo.

*/


public class ATP14 {
    public static void main(String[] args) {
        cabecalho();
        menu();
    }

    static void cabecalho(){
        System.out.println("===== Caculadora =====");
    } 

    static void menu(){
        System.out.println("\t 1-Soma");
        System.out.println("\t 2-Subtração");
        System.out.println("\t 3-Multiplicação");
        System.out.println("\t 4-Divisão");
    }
}

