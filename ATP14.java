import java.util.Scanner;

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
        int opcao;       
        opcao = ler("Digite um número: ");
        selecionarMenu(opcao);
        
        while(opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4){
            System.out.println("Opção inválida. Digite novamente. \n");
            opcao = ler("Digite uma opção do menu");
        };
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

    static int ler (String mensagem){
        Scanner sc = new Scanner(System.in);
        System.out.println(mensagem);
        int numero = Integer.parseInt(sc.nextLine());
        return numero;
    }

    static void selecionarMenu(int opcao){
        double n1 = ler("Primeiro número: ");
        double n2 = ler("Segundo número: ");

        switch(opcao){
            case 1:
            System.out.println(somar(n1, n2));
            menu_validacao();
            break;
            case 2:
            System.out.println(subtrair(n1, n2));
            menu_validacao();
            break;
            case 3:
            System.out.println(multiplicar(n1, n2));
            menu_validacao();
            break;
            case 4:
            System.out.println(dividir(n1, n2));
            menu_validacao();
            break;
        }
    }

    static void menu_validacao(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Voltar ao menu ou sair (v/s): ");
        char vs = sc.nextLine().toLowerCase().charAt(0);
        
        if(vs == 'v'){
            menu();
            selecionarMenu(ler("Escolha: "));
        }
        else{
            System.out.println("Obrigada. Volte sempre (◠‿・)—☆");
        }

    }

    static double somar (double n1, double n2){
        double soma = n1 + n2;
        return soma;

    } 

    static double subtrair (double n1, double n2){
        double subtracao = n1 - n2;
        return subtracao;
    } 

     static double multiplicar (double n1, double n2){
        double multiplicacao = n1 * n2;
        return multiplicacao;
    } 

    static double dividir (double n1, double n2){
        double divisao = n1 / n2;
        return divisao;
    } 

}

