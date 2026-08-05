package cadastro;

import java.util.Scanner;

public class cadastro {
		public static void main(String[]args) {
			
	        Scanner entrada = new Scanner(System.in);

	        System.out.println("Qual o seu nome?");
	        String nome = entrada.nextLine();
	        
	        System.out.println("Qual a sua idade?");
	        int idade = entrada.nextInt();
	        
	        System.out.println("Em que ano você nasceu?");
	        int ano = entrada.nextInt();
	        
	        if (ano >= 2009) {
	            System.out.println("Não pode fazer Cadastro!");
	        } else {
	            System.out.println("Pode fazer o cadastro!");
	        }
		}
}
