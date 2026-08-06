package cadastro;

import java.util.Scanner;

public class cadastro {
		public static void main(String[]args) {
			
	        Scanner entrada = new Scanner(System.in);
	        String Continuar  = "s";
	        
	        while (Continuar.equalsIgnoreCase("s")) {
	        	
	        	System.out.println("Qual o seu nome?");
	        		String nome = entrada.nextLine();
	        		
	        	System.out.println("Quantos anos você tem?");
	        		int idade = entrada.nextInt();
	        	
	        	System.out.println("Ano de nascimento?");
	        		int ano = entrada.nextInt();
	        		
	        			entrada.nextLine();
	        			
	        			
	        	if (idade >= 18) {
	        		System.out.println("Cliente Cadastrado!");
	        	}else {
	        		System.out.println("Cliente não cadastrado!");
	        	}
	        	
	        			System.out.println("Deseja cadastrar outro cliente? (S/N)");
	        				Continuar = entrada.nextLine();
	        				
	        }
	        		System.out.println("Cadastro Encerrado!");
	        		entrada.close();
	       }
}