package br.com.didox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 
        /*
        * Exercicio 1
        * João é um professor de matemática e precisa de um programa
        * que faça o calculo da seguinte expressão:
        * (x * 8 + y) - x + y / 100
        * faça um programa que resolva o problema da expressão que o João 
        * precisa.
        * 
        * LEMBRE-SE: pense na usabilidade !!!
        */

        // tupiniken (Elmadã - Elmadan)
        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de Y"));
        int resultado = (x * + y) - x + y /100;
        JOptionPane.showMessageDialog(null, resultado);

        /* 
        // Luiz
        System.out.println("Digite um numero X");
        int numeroX = Integer.parseInt(reader.readLine());
        System.out.println("Digite um numero Y");
        int numeroY = Integer.parseInt(reader.readLine());

        var resultado =  (numeroX * 8 + numeroY) - numeroX + numeroY / 100;

        System.out.println("o resutado da expressão é: " + resultado);
        */

        /* 
        // Denis
        Scanner scanner = new Scanner(System.in);
		
		System.out.println("Vamos resolver o calculo (x * 8 + y) - x + y / 100");
		System.out.println("Mas antes me passe os valores de x e y");
		System.out.println("Qual o x?");
		int x = scanner.nextInt();
		
		System.out.println("Qual o y?");
		int y = scanner.nextInt();
		
		int resposta = (x * 8 + y) - x + y / 100; 
		
		System.out.println("Lá vai a resposta então: " + resposta);

		scanner.close();
        */
        
        /* 
        // VLC (Vinicius)
        Scanner sc = new Scanner(System.in);
		
        System.out.println("Vamos resolver o calculo (x * 8 + y) - x + y / 100");
		System.out.printf("Leia X: ");
		int x = sc.nextInt();
		System.out.printf("Leia Y: ");
		int y = sc.nextInt();
		
		int result = (x * 8 + y) - x + y / 100;
		
		System.out.println("Resultado: " + result);
        */
        
        /* 
        // Gil
        Scanner teclado = new Scanner(System.in);
    	System.out.println("Informe o valor de X ");
    	int x = teclado.nextInt();
    	System.out.println("Informe o valor de Y ");
    	int y = teclado.nextInt();
    	
    	int resultado;
    	
    	resultado = (x * 8 + y) - x + y / 100;
    	 
    	System.out.println("O resultado é: " + resultado);
        */


        /* 
        // professor
        System.out.println("==============================");
        System.out.println("Olá João, seja muito bem vindo");
        System.out.println("==============================");
        System.out.println("João percebi que você quer resolver esta operação:");
        System.out.println("(x * 8 + y) - x + y / 100");
        System.out.println("Para isso preciso que o senhor digite o valor de x e de y, então:");
        System.out.println("Digite o valor de x");
        int x =  Integer.parseInt(reader.readLine());
        System.out.println("Digite o valor de y");
        int y =  Integer.parseInt(reader.readLine());
        var operacao = (x * 8 + y) - x + y / 100;

        System.out.println("João já fiz o calculo e o resultado da operação: ");
        System.out.println("(" + x + " * 8 + " + y + ") - " + x + " + " + y + " / 100");
        System.out.println("Foi: " + operacao);
        */




        /*
        System.out.println("Digite um número");
        int numero =  Integer.parseInt(reader.readLine());
        var resultado = numero + 1000;
        System.out.println("O resultado de (" + numero + ") + 1000 é de : " + resultado);
        */



        /* 
        // mostre()
        System.out.println("Digite o seu nome");

        // leia()
        var nome = reader.readLine();

        // mostre() mostrando dados concatenando variável nome capturada
        System.out.println("O nome digitado foi: " + nome);
        */


        /*
        String name = reader.readLine();
        
        int numero1 = 3;
        var numero2 = 5;

        int soma = numero1 + numero2;

        // mostre() # mostra informação na tela
        System.out.println( "O resultado da operação é " + soma );
        */
    }
}
