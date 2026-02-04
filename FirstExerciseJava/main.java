//biblioteca para receber valor
import java.util.Scanner;
//biblioteca para puxar o ano atual
import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        //Aqui declara a variavel do scanner(não é necessário declarar mais de uma vez)
        Scanner scanner = new Scanner(System.in);

        //Dá um print no terminal pergurtando o nome e o scanner guarda na variavel nome
        System.out.println("Digite o seu nome:");
        String nome = scanner.nextLine();

        //Novamente dá um print no terminal mas perguntando o ano de nascimento e o scanner guarda na variavel anoNasci
        System.out.println("Digite o seu ano de nascimento:");
        int anoNasci = scanner.nextInt();

        //guarda o ano atual na variavel
        int anoAtual = LocalDate.now().getYear();

        //Faz a subtração do ano atual com ano de nascimento para saber a idade
        int idade = anoAtual - anoNasci;

        //Dá um print no terminal com o nome e idade da pessoa
        System.out.println("olá " + nome + ", você tem " + idade + " anos.");

        scanner.close(); 
    }
}

/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();
        System.out.println("idade" + idade);
        scanner.close(); 
*/