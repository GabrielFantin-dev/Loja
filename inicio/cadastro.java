package cadastro;

import java.util.Scanner;

public class cadastro {

    // 
   public static String retornaNome(String nome) {
        
  //       String nome = "Gabriel";
        return  nome;
        
    }
   public static Boolean maiorDeDezoito(int idade,String nome) {
	   if (idade >= 18) {
		   return true;
	   }else {
		   return false;
	   }
   }
    
    public static void main(String[] args) {

//     System.out.println(nome);
    	String nomeNovo = retornaNome("Gabriel");
    	int sobrenome = 1;
    	System.out.println(nomeNovo);
    	if (maiorDeDezoito(17, "Pedro")) {
    		System.out.println("É maior de idade");
    	}else{
    		System.out.println("Não é maior de idade");
    	}
    	
        Scanner entrada = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("Quantos clientes deseja cadastrar?");
        System.out.println("===================================");

        int clientes = entrada.nextInt();
        entrada.nextLine();
            
        for (int i = 1; i <= clientes; i++) {

            System.out.println("\n===== Cadastro do Cliente " + i + " =====");

            System.out.println("Nome:");
            String nome = entrada.nextLine();

            System.out.println("Idade:");
            int idade = entrada.nextInt();
            entrada.nextLine();

            System.out.println("CPF:");
            String cpf = entrada.nextLine();

            System.out.println("Telefone:");
            String telefone = entrada.nextLine();

            System.out.println("Cidade:");
            String local = entrada.nextLine();

            System.out.println("E-MAIL:");
            String email = entrada.nextLine();

            if (idade >= 18) {
                System.out.println(nome + " foi cadastrado com sucesso!");
            } else {
                System.out.println(nome + " não pode ser cadastrado.");
            }

            System.out.println("============================");
            System.out.println("Total de clientes: " + clientes);
            System.out.println("============================");
            System.out.println("Nome: " + nome);
            System.out.println("============================");
            System.out.println("Idade: " + idade);
            System.out.println("============================");
            System.out.println("CPF: " + cpf);
            System.out.println("============================");
            System.out.println("Telefone: " + telefone);
            System.out.println("============================");
            System.out.println("Cidade: " + local);
            System.out.println("============================");
            System.out.println("Email: " + email);
            System.out.println("============================");
        }

        entrada.close();
    }
}