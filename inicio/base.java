package cadastro;

import java.util.Scanner;

public class Cadastro {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos clientes deseja cadastrar?");
        	int clientes = entrada.nextInt();

        entrada.nextLine();

        for (int i = 1; i <= clientes; i++) {

            System.out.println("\n===== Cadastro do Cliente " + i + " =====");

            System.out.println("Nome:");
            String nome = entrada.nextLine();

            System.out.println("Idade:");
            int idade = entrada.nextInt();

            entrada.nextLine();

            if (idade >= 18) {
                System.out.println(nome + " foi cadastrado com sucesso!");
            } else {
                System.out.println(nome + " não pode ser cadastrado.");
            }
        }
        entrada.close();
    }
}