package br.com.didox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        
        // === tipos primitivos mais utilizados
        // int inteiro = 5;
        // double moeda = 5.99;
        // char umCaractere = 'D';
        // boolean verdadeiroFalso = true;
        // String texto = "Hello";

        // double restoDivisao = 3.5/2;
        // System.out.println("O resto da divisão é: " + restoDivisao);

        // var hojeEstaFrio = false;
        // System.out.println("O tempo está frio?: " + hojeEstaFrio);

        // var moeda = 4.5;
        // var inteiro = 4;
        // var stringNumero = "8";

        // var valor  = moeda * inteiro;
        // var valor2 = moeda - inteiro;
        // var valor3 = moeda + inteiro + Double.parseDouble(stringNumero);

        // System.out.println("Resultado: " + valor3);

        //== concatenações
        // var rotulo = "Nome: ";
        // var nome = "Leandro";

        // var dadoCompleto = rotulo + nome;
        // System.out.println("Dado: " + dadoCompleto);

        // var dadoCompleto = rotulo.concat(nome);
        // System.out.println("Dado: " + dadoCompleto);

        // var resultado = String.format("O valor de nome é: %s e o valor de rotulo é: %s", nome, rotulo);
        // System.out.println(resultado);

        // var calculo = 4.555;
        // System.out.printf( "O resultado é %.2f", calculo); // mostrar número com 2 cadas decimais

        /*
         * João tem um armazem e precisa de um programa que solicite
         * o nome do seu cliente
         * o endereco do seu cliente
         * o nome do material de construção
         * o valor do material de contrução
         * e a quantidade que o cliente deseja
         * se a compra do cliente for maior que 100, fale que ele terá desconto na proxima
         * no final final do programa, mostre um relatório com o valor total do produto comprado
         * -----------------------------
         * Cliente: João
         * Endereço de entrega: Rua ...
         * Comprou o material: XXX no valor de R$ XXX
         * O valor total da compra deu: R$ XXX
         * Seu pedido foi maior que R$ 100 e você terá um desconto na proxima
         * -----------------------------
         */

        // == padrão americano
        // double d = 1243123.1;
        // DecimalFormat df = new DecimalFormat("###,###.00");
        // System.out.println(df.format(d));


        //== padrão Brasil
        // double d = 1243123.1;
        // Locale localeBR = new Locale( "pt", "BR" );  
        // NumberFormat dinheiroBR = NumberFormat.getCurrencyInstance(localeBR);  
        // System.out.println(dinheiroBR.format(d));


        //== comparação em java com operadores lógicos
        // int numero1 = 2;
        // int numero2 = 1;

        // operador lógico && = e
        // operador lógico || = ou
        // var resultado = numero1 <= numero2 || numero1 > numero2;
        // var resultado2 = numero1 <= numero2 && numero1 > numero2;
        // System.out.println( resultado );

        // var inicial = "01/01/20222";
        // var dataFinal = "30/01/20222";
        // var diaCorrente = "15/01/2022";
        // var diaCorrenteEntreDataInicialEFinal = diaCorrente >= inicial && diaCorrente <= dataFinal;

        // var inicial = 1;
        // var diaFinal = 30;
        // var diaCorrente = 15;
        // var diaCorrenteEntreDataInicialEFinal = diaCorrente >= inicial && diaCorrente <= diaFinal;
        // System.out.println(diaCorrenteEntreDataInicialEFinal);

        //=== conticionais
        // int valorTotal2 = 101;
        // if(valorTotal2 > 100){
        //     System.out.println("Seu pedido foi maior que R$ 100 e você terá um desconto na proxima");
        //     System.out.println("Seu pedido foi maior que R$ 100 e você terá um desconto na proxima");
        // }

        // if(valorTotal2 > 100) System.out.println("Seu pedido foi maior que R$ 100 e você terá um desconto na proxima");

        //=== ternário
        // var resultado = "Padrão";
        // resultado = valorTotal2 > 100 ? "Foiii verdade" : "";
        // System.out.println(resultado);

        System.out.println("==============[ Calculo produto/cliente ]===================");
        System.out.println("Olá João seja muito bem vindo, vamos começar?");
        
        System.out.println("Digite o nome do seu cliente: ");
        var nome = reader.readLine();

        System.out.println("Digite o endereço do seu cliente: ");
        var endereco = reader.readLine();

        System.out.println("Digite o nome do produto: ");
        var produto = reader.readLine();

        System.out.printf("Digite o valor do produto (%s): ", produto);
        var valor = Double.parseDouble(reader.readLine());

        System.out.printf("Digite a quantidade do produto (%s): ", produto);
        var quantidade = Integer.parseInt(reader.readLine());
         
        var valorTotal = valor * quantidade;

        System.out.println("-----------------------------");
        System.out.printf("Cliente: %s \n", nome);
        System.out.printf("Endereço de entrega: %s \n", endereco);
        System.out.printf("Comprou o material: %s no valor de R$ %s \n", produto, valor);
        System.out.printf("O valor total da compra deu: R$ %.2f \n", valorTotal);

        if(valorTotal > 100){
            System.out.println("Seu pedido foi maior que R$ 100 e você terá um desconto na proxima");
        }

        System.out.println("-----------------------------");


        // System.out.printf("Digite um valor \n");
        // var valorString = reader.readLine();
        // valorString = valorString.replace(".", "");
        // valorString = valorString.replace(",", ".");
        // var valor = Double.parseDouble(valorString);

        // Locale localeBR = new Locale( "pt", "BR" );  
        // NumberFormat dinheiroBR = NumberFormat.getCurrencyInstance(localeBR);  
        // System.out.printf("O valor total da compra deu: R$ %s \n", dinheiroBR.format(valor));

        // System.out.printf("Teste %s %n", 4.5);
        // System.out.println("Segunda Linha");

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
        // int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X"));
        // int y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de Y"));
        // int resultado = (x * + y) - x + y /100;
        // JOptionPane.showMessageDialog(null, resultado);

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
