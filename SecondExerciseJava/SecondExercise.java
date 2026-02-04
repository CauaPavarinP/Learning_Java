//importa a biblioteca do scanner que recebe o valor digitado
import java.util.Scanner;

public class SecondExercise {
    public static void main(String[] args) {
        //declaro a variavel scanner
        Scanner scanner = new Scanner (System.in);

        //Aqui imprime no terminal e salva o valor digitado 
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println(nome + ", você é maior de idade.");
        }else{
            System.out.println(nome + ", você é menor de idade.");
        }

        scanner.close();
    }
}