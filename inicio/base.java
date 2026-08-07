package cadastro;

import java.util.Scanner;

public class cadastro {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("===================================");
        System.out.println("Quantos clientes deseja cadastrar?");
        System.out.println("==================================");
        	int clientes = entrada.nextInt();

        entrada.nextLine();

        for (int i = 1; i <= clientes; i++) {

            System.out.println("\n===== Cadastro do Cliente " + i + " =====");

            System.out.println("Nome:");
            String nome = entrada.nextLine();
            
            System.out.println("Idade:");
            int idade = entrada.nextInt();
            
            System.out.println("CPF:");
            String CPF = entrada.nextLine();
            
            entrada.nextLine();
            
            System.out.println("Telefone:");
            String telefone = entrada.nextLine();

            System.out.println("Cidade:");
            String local = entrada.nextLine();
            
            System.out.println("E-MAIL:");
            String email = entrada.nextLine();

            entrada.nextLine();

            if (idade >= 18) {
                System.out.println(nome + " foi cadastrado com sucesso!");
            } else {
                System.out.println(nome + " não pode ser cadastrado.");
            }
            System.out.println("Total de clientes:" + clientes);
            System.out.println("Nome: " + nome);
            System.out.println("Idade:"+ idade);
            System.out.println("CPF:" + CPF);
            System.out.println("Telefone:" + telefone);
            System.out.println("Cidade: " + local);
            System.out.println("Email: " + email);
            
            
            
        }
        
        entrada.close();
        
        
    }
}