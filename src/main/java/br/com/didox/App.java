package br.com.didox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import br.com.didox.drivers.Csv;
import br.com.didox.drivers.Json;
import br.com.didox.drivers.Txt;
import br.com.didox.drivers.Xlsx;
import br.com.didox.drivers.Xml;
import br.com.didox.enums.Tipo;
import br.com.didox.models.Aluno;
import br.com.didox.models.Cliente;
import br.com.didox.models.Fornecedor;

public class App {
   private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
   
   static List<Cliente> clientes = new ArrayList<Cliente>();
   static List<Produto> produtos = new ArrayList<Produto>();

    public static void main(String[] args) throws IOException, NumberFormatException, InterruptedException {
        orientacaoAObijetos();
        
        // testandoAgregacaoDeMetodos();
        // funcaoRecursiva();
        // menuInicialRenato();
        // exercicioEcommerce();
        // exercicioAlunosEscolaOrientacaoAObjetos();
        // exemploSwingForm();
        // passandoParametrosDoConsole(args);
        // arraySyntaxe();
        // exercicioSomaArray();
        // exercicioListaArray();
        // utilizandoArray();
		// utilizandoMatrix();
        // exercicioAlunosEscola();
        // exercicioTabuadaMultiplicador();
        // exercicioTabuada();
        // exercicioBombeiro();
        // whileDoWhileSyntaxe();
        // loopFor();
        // exercicioGovernoPonte();
        // exercicioPaulaPetshop();
        // somaTiposPrimitivos();
        // formatacaoContatenacao();
        // formatarPadraoAmericano();
        // formatarMoedaBr();
        // operadoresLogicos();
        // compareDates("2017-01-13 00:00:00", "2017-01-14 00:00:00");
        // exemploCondicionaisTernario();
        // exercicioJoaoCondicional();
        // formatarMoeda();
        // exercicioJoaoOperacao();
        // capturaCalculaNumero();
        // capturaNome();
        // soma();
    }

    private static void orientacaoAObijetos() {
        var cliente = new Cliente();
        cliente.setId(1);
        cliente.setNome("Leandro");
        
        var aluno = new Aluno();
        aluno.setId(1);
        aluno.setNome("Macio");

        var fornecedor = new Fornecedor();
        fornecedor.setId(1);
        fornecedor.setNome("Placar");

        cliente.SalvarSemStratagy(Tipo.CSV);
        cliente.SalvarSemStratagy(Tipo.XML);
        cliente.SalvarSemStratagy(Tipo.JSON);

        cliente.Salvar(new Xlsx());
        cliente.Salvar(new Xml());
        cliente.Salvar(new Json());
        cliente.Salvar(new Csv());
        cliente.Salvar(new Txt());

        // var apresentarAluno = PessoaServico.Apresentar(aluno);
        // var apresentarCliente = PessoaServico.Apresentar(cliente);
        // var apresentarFornecedor = PessoaServico.Apresentar(fornecedor);

        // mostrar(apresentarAluno);
        // mostrar(apresentarCliente);
        // mostrar(apresentarFornecedor);
    }

    private static void testandoAgregacaoDeMetodos() {
        var aluno = new Aluno();
        aluno.setId(1);
        aluno.setNome("Danilo");
        aluno.setSobrenome("Santos");
        aluno.getNotas().add(4.0);
        aluno.getNotas().add(9.0);

        clearScreen();
        var notasFormatada = aluno.notasFormatada("As notas s??o");
        mostrar(notasFormatada);

        mostrar("Nome completo: " + aluno.nomeCompleto());
    }

    private static void mostrar(String mensagem) {
        System.out.println(mensagem);
    }

    private static void funcaoRecursiva() throws NumberFormatException, IOException, InterruptedException {
        menuInicialRecursivo();
    }

    private static void menuInicialRecursivo() throws NumberFormatException, IOException, InterruptedException {
        clearScreen();

        System.out.println("=".repeat(10) + "[ SEJA BEM VINDO ]" + "=".repeat(10));
        System.out.println("Digite uma das op????es abaixo:");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Cadastrar cliente");
        System.out.println("3 - Cadastrar cliente");
        System.out.println("4 - Sair");

        int opcao = Integer.parseInt(reader.readLine());

        if(opcao == 4) return;

        esperaComMensagem(5, "Voc?? selecionou a op????o: " + opcao);

        menuInicialRecursivo();
    }

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    public static void esperaComMensagem(int segundos, String mensagem) throws InterruptedException {  
        clearScreen();
        System.out.println(mensagem);
        TimeUnit.SECONDS.sleep(segundos);
    }

    private static void menuInicialRenato() throws NumberFormatException, IOException {
        System.out.println("========== SEJA BEM VINDO!========");
        
        int opcao = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        do {
           
            System.out.println(
                    "Escolha as op????es: \n (1) Cadastrar Produto \n (2) Cadastrar Cliente \n (3) Cadastrar Pedido \n (0) Sair");
            opcao = Integer.parseInt(reader.readLine());

        } while ( opcao > 3);
        cadastrar(opcao);

    }

    private static void cadastrar(int opcao) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        switch (opcao) {
            case 1:
                System.out.println("========== CADASTRAR PRODUTO ========");
                do {
                    Produto produto = new Produto();
                    System.out.println("Insira o nome do produto:");
                    produto.setNome(reader.readLine());
                    System.out.println("Insira a descri????o do produto:");
                    produto.setDescricao(reader.readLine());
                    System.out.println("Insira o Valor do produto:");
                    produto.setPreco(Double.parseDouble(reader.readLine()));
                    produto.setId(produtos.size() + 1);
                    produtos.add(produto);
                    System.out.println("Deseja adicionar outro produto?: \n (1) Sim \n (2) Retornar Menu");
                    int escolha = Integer.parseInt(reader.readLine());
                    if (escolha == 2)
                        break;

                } while (true);
                menuInicialRenato();
                break;

            case 2:
                System.out.println("========== CADASTRAR CLIENTE ========");
                do {
                    Cliente cliente = new Cliente();
                    System.out.println("Insira o nome do cliente:");
                    cliente.setNome(reader.readLine());
                    System.out.println("Insira o telefone do cliente:");
                    cliente.setTelefone(reader.readLine());
                    System.out.println("Insira endere??o do cliente:");
                    cliente.setEndereco(reader.readLine());
                    cliente.setId(clientes.size() + 1);
                    clientes.add(cliente);
                    System.out.println("Deseja adicionar outro cliente?: \n (1) Sim \n (2) Voltar ao menu");
                    int escolha = Integer.parseInt(reader.readLine());
                    if (escolha == 2)
                        break;

                } while (true);

                menuInicialRenato();
                break;

            case 3:
                System.out.println("========== CADASTRAR PEDIDOS ========");
                // do {
                Pedido pedido = new Pedido();
                if(clientes.size()==0){
                    System.out.println("====Nenhum cliente cadastrado====\n Cadastre um cliente antes! Voce ser?? redirecionado ao menu. ");
                    menuInicialRenato();
                break;
                }

               
                System.out.println("Selecione o cliente pelo seu ??ndice: ");
                for (int i = 0; i < clientes.size(); i++) {
                    System.out.println("(" + i + "): " + clientes.get(i).getNome());
                }
                int indiceCliente = Integer.parseInt(reader.readLine());
                String nomeCliente = clientes.get(indiceCliente).getNome();
                pedido.setCliente(nomeCliente);
                if(produtos.size()==0){
                    System.out.println("====Nenhum produto cadastrado====\n Cadastre um produto antes! Voce ser?? redirecionado ao menu. ");
                    menuInicialRenato();
                break;
                }

                do {
                    System.out.println("Selecione o produto pelo seu ??ndice: ");
                    for (int i = 0; i < produtos.size(); i++) {

                        System.out.println("(" + i + ")=> " + "Produto:" + produtos.get(i).getNome() + " === Valor: "
                                + produtos.get(i).getPreco());

                    }
                    int indiceProduto = Integer.parseInt(reader.readLine());
                    String produtoSelecionado = produtos.get(indiceProduto).getNome();
                    double valorProdutoSelecionado = produtos.get(indiceProduto).getPreco();

                    pedido.getProdutos().add(produtoSelecionado);
                    pedido.setValorTotal(valorProdutoSelecionado);

                    System.out.println("Deseja adicionar outro produto? \n (1) Sim \n (2) N??o ");
                    int escolha = Integer.parseInt(reader.readLine());
                    if (escolha == 2) {

                        System.out.println(" ====== RELAT??RIO PEDIDO =======");
                        System.out.println("N??mero pedido: 1\nNome Cliente: " + pedido.getCliente() + "\nProdutos:"+ pedido.getProdutos() + "\nTotal do Pedido: R$ " + pedido.getValorTotal());
                        break;

                    }

                } while (true);
                

            default:
                System.out.println("======= SESS??O ENCERRADA =====");
                break;
        }

    }

    private static void exercicioEcommerce() {
        /*
        Carla precisa de um ecommerce, este ecommerce vai ter as seguintes
        fun????es:

        - Cadastro de produtos
        - Cadastro de clientes
        - Cadastro de pedidos
        - Relat??rio de pedidos de clientes
        - Sair

        Produto: (id, nome, descricao, preco)
        Cliente: (id, nome, telefone, endereco)
        Pedido: (id, cliente, produtos[], valorTotal())

        ///// Pense na usabilidade /////
        */
        // === Renato ===




        // === Walter ====
        /*
        List<Pedido> pedidos = new ArrayList<>();
		Scanner ler = new Scanner(System.in);
		System.out.println("\n"+"-".repeat(10)+"[ Pedidos - Online ]"+"-".repeat(10));

		do {

			Pedido pedido = new Pedido();
			pedido.setId(pedidos.size()+1);

			Cliente cliente = new Cliente();
			System.out.println("Digite o nome do Cliente:");
			cliente.setNome(ler.next());

			System.out.println("Digite o telefone:");
			cliente.setTelefone(ler.next());

			System.out.println("Digite o endere??o:");
			cliente.setEndereco(ler.next());

			pedido.setCliente(cliente);
			System.out.println("\n"+"-".repeat(10) + "[ Produto ]" + "-".repeat(10));

            do {

                Produto produto = new Produto();
                produto.setId(pedido.getProdutos().size() + 1);
                System.out.println("Digite o nome do produto:");
                produto.setNome(ler.next());
                System.out.println("Digite a descri????o:");
                produto.setDescricao(ler.next());
                System.out.println("Digite o pre??o:");
                produto.setPreco(ler.nextDouble());

                pedido.getProdutos().add(produto);
                System.out.println("\n"+"-".repeat(10)+"[ Pedidos ]"+"-".repeat(10));
                System.out.println("Adicionar outro produto?\n0 - para continuar\n1 - para fechar o carrinho");
                int opcao = ler.nextInt();
                if(opcao == 1)
                    break;
            } while (true);
				
			pedidos.add(pedido);
			System.out.println("\n"+"-".repeat(10)+"[ Pedidos ]"+"-".repeat(10));
			System.out.println("Adicionar outro pedido?\n0 - para continuar)\n1 - para sair");
			int opcao = ler.nextInt();
			if (opcao == 0)
				continue;
			if (opcao == 1){
				break;
			}
		} while (true);

		System.out.println("\n"+"-".repeat(10)+"[ Pedidos - Relat??rios ]"+"-".repeat(10));
		for(Pedido pedido : pedidos){
			pedido.imprimirPedido();
		}
		System.out.println("-".repeat(10)+"[ fim ]"+"-".repeat(10));
        */
    }

    private static void passandoParametrosDoConsole(String[] parametros) {
        // ==== passando parametros no app console
        if(parametros.length > 0){
            for (String parametro : parametros) {
                System.out.println("Parametro: " + parametro);
            }
        }
        else{
            System.out.println("Nenhum parametro passado");
        }
    }

    private static void arraySyntaxe() throws IOException {
        // === ArrayList n??o tem limites para adicionar
        List<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        // === Array na sua cria????o ?? o obrigat??rio passar o tamanho
        System.out.println("Digite o nome1");
        String nome1 = reader.readLine();

        System.out.println("Digite o nome2");
        String nome2 = reader.readLine();

        String[] nomes = {nome1, nome2};
        System.out.println(nomes[0]);
    }

    private static void exercicioSomaArray() throws IOException {
        /*
        fa??a um programa para armazenar valores (double) em uma array
        no final do programa mostre o resultado da multiplica????o dos valores
        e o resultado da soma dos valores
        */

        List<Double> numeros = new ArrayList<Double>();
    	Scanner ler = new Scanner(System.in);
    		
	    /*
        System.out.println("Digite o nome 1");
	    var numero1 = ler.nextDouble();
	    numeros.add(numero1);
	    
	    System.out.println("Digite o n??mero 2");
	    var numero2 = ler.nextDouble();
	    numeros.add(numero2);
	    
	    double somar = numeros.get(0) + numeros.get(1);
	    double multiplicar = numeros.get(0) * numeros.get(1);

		System.err.println("multiplicar: "+ multiplicar);
		System.err.println("Somar: "+ somar);
        */

        
        List<Double> lista = new ArrayList<>();
        while(true){
            System.out.println("Digite um n??mero");
            lista.add(ler.nextDouble());

            System.out.println("Digite 0 para sair ou qualquer coisa para continuar");
            var sair = reader.readLine();
            if(sair.equals("0")) break;
        }

        double soma = 0.0;
        double multiplicados = 1.0;

        for (Double item : lista) {
            soma += item;
            multiplicados *= item;
        }

		System.err.println("multiplicar: " + multiplicados);
		System.err.println("Somar: " + soma);
        
    }

    private static void exercicioListaArray() {
        /*
        Fa??a um exercicio para armazenar (array ou lista) o nome de 5 pessoas
        e mostrar o resultado dos nomes formatados, ex:
        Nome 1: "Teste"
        Nome 2: "Leandro"
        ...
        */

        // === Walter ===
        
        Scanner ler = new Scanner(System.in);
    	List<String> nomes = new ArrayList<String>();
    	for (int i = 1; i <= 5; i++) {
    		System.out.println("Digite o nome "+i+": ");
    		nomes.add(ler.next());
		}

    	System.out.println("#".repeat(10)+"[ Resultado ]"+"#".repeat(10)+"\n");
    	for(String nome: nomes) {
    		System.out.println("Nome: "+nome);
    	}
        
        // === Elmad?? ===
        /*
        ArrayList<String> nomes = new ArrayList<>();
        Scanner reader2 = new Scanner(System.in);
        
        for(int i = 0; i < 5; i++){
            System.out.println("Digite o nome");
            nomes.add(reader2.nextLine());
        }
        for(int i = 0; i < 5; i++){
            System.out.println("Nome " + (i+1) + " " + nomes.get(i));
        }
        */
    }

    private static void utilizandoArray() {
        // === Matriz com array ===
        String[][] alunos = new String[3][4];
        String[] nomeNota = {"Danilo", "4"};
        alunos[0] = nomeNota;

        String[] nomeNota2 = {"Danilo", "6"};
        alunos[1] = nomeNota2;

        System.out.println("Nome " + alunos[0][0]);
        System.out.println("Nota " + alunos[0][1]);
        System.out.println("Nome " + alunos[1][0]);
        System.out.println("Nota " + alunos[1][1]);
    }

    private static void utilizandoMatrix() {
        // === Matriz com List ===
        
        List<List<String>> alunos = new ArrayList<>();
        var aluno1 = new ArrayList<String>();
        aluno1.add("Danilo");
        aluno1.add("7");
        alunos.add(aluno1);

        var aluno2 = new ArrayList<String>();
        aluno2.add("Fabio");
        aluno2.add("7");

        alunos.add(aluno2);

        System.out.println("Nome " + alunos.get(0).get(0));
        System.out.println("Nota " + alunos.get(0).get(1));
        System.out.println("Nome " + alunos.get(1).get(0));
        System.out.println("Nota " + alunos.get(1).get(1));
    }

    private static void exercicioAlunosEscolaOrientacaoAObjetos() {
        /*
        Danilo ?? dono da escola de programa????o chamada
        "Torne-se um programador"
        O mesmo est?? precisando de um sistema para cadastrar os seus alunos
        alem dos alunos, danilo quer cadastrar pelo menos 4 notas dos alunos.
        Fa??a um programa que:
        1 - armazene os nomes dos alunos
        2 - as 4 notas para cada aluno
        3 - mostre um relat??rio, da seguinte forma
        
        ---------------
        Nome: NOME DO ALUNO
        Notas: X,F,T
        M??dia: XXX
        Situa????o: (Aprovado || Recupera????o || Reprovado)

        Regra para situa????o: 
        Se media >= 7 = Aprovado
        Se media entre 5 e 6 = Recupera????o
        Se media < que 5 = Reprovado
        */

        Scanner ler = new Scanner(System.in);
    	List<Aluno> alunos = new ArrayList<Aluno>();
    	
    	do {
            Aluno aluno = new Aluno();

            System.out.println("Digite o nome do aluno");
            aluno.setNome(ler.next());

            for(int i = 1; i <= 4; i++) {
                System.out.println("Digite a nota "+i+": ");
                aluno.getNotas().add(ler.nextDouble());
            }
            
            alunos.add(aluno);
            
            System.out.println("Adicionar novo usu??rio: \nSim ou N??o");
            String opcao = ler.next();
            if(opcao.toLowerCase().equals("n??o")) break;
            
    	}while(true);
    	
    	System.out.println("#".repeat(10)+"[ Relat??rio ]"+"#".repeat(10));
    	for(Aluno aluno: alunos) {
    		System.out.println("Nome: " + aluno.getNome() + "\n"
    				+ "Notas: " + aluno.notasFormatada() + "\n"
    				+ "M??dia: " + aluno.media() + "\n"
    				+ "Situa????o: " + aluno.situacao() + "\n");
    	}
    	System.out.println("#".repeat(33)+"\n");
    }

    private static void exercicioAlunosEscola() {
        /*
        Danilo ?? dono da escola de programa????o chamada
        "Torne-se um programador"
        O mesmo est?? precisando de um sistema para cadastrar os seus alunos
        alem dos alunos, danilo quer cadastrar pelo menos 4 notas dos alunos.
        Fa??a um programa que:
        1 - armazene os nomes dos alunos
        2 - as 4 notas para cada aluno
        3 - mostre um relat??rio, da seguinte forma
        
        ---------------
        Nome: NOME DO ALUNO
        Notas: X,F,T
        M??dia: XXX
        Situa????o: (Aprovado || Recupera????o || Reprovado)

        Regra para situa????o: 
        Se media >= 7 = Aprovado
        Se media entre 5 e 6 = Recupera????o
        Se media < que 5 = Reprovado
        */


        /*
    	 * Autor: Walter Paulo
    	 * Date: 11/10/2022
    	 * Exercise: 3 Array List do dia 9 - Desafio 21 dias em Java
    	 *
    	 * 
    	 */
    	
        Scanner ler = new Scanner(System.in);
    	List<String[]> alunos = new ArrayList<String[]>();
    	
    	do {
            //		Coleta
            String[] dados = new String[7];
            double soma = 0.0;
            double media = 0.0;
            System.out.println("Digite o nome do aluno");
            dados[0] = ler.next();
            for(int i = 1; i <= 4; i++) {
                System.out.println("Digite a nota "+i+": ");
                dados[i] = ler.next();
                soma += Double.parseDouble(dados[i]);
            }
            
            //    	L??gica
            media = soma / 4 ;
            dados[6] = String.valueOf(media);
            if(media >= 7)dados[5] = "Aprovado";
            else if(media >= 5 && media < 7)dados[5] = "Recupera????o";
            else dados[5] = "Reprovado";
            
            //    	Armazenamento
            alunos.add(dados);
            
            //    	adi????o?
            System.out.println("Adicionar novo usu??rio: \nSim ou N??o");
            String opcao = ler.next();
            if(opcao.toLowerCase().equals("n??o")) break;
            
    	}while(true);
    	
        //    	Visualiza????o
    	System.out.println("#".repeat(10)+"[ Relat??rio ]"+"#".repeat(10));
    	for(String[] aluno: alunos) {
    		System.out.println("Nome: "+ aluno[0]+"\n"
    				+ "Notas: "+ aluno[1]+", "+aluno[2]+", "+aluno[3]+", "+aluno[4]+"\n"
    				+ "M??dia: "+aluno[6]+"\n"
    				+ "Situa????o: "+aluno[5]+"\n");
    	}
    	System.out.println("#".repeat(33)+"\n");
        

        // ===== Ana =========
        /*
        int opcao = 1;
        Scanner teclado = new Scanner(System.in);
		List<List<String>> alunos = new ArrayList<>();	
		
		System.out.println("...Sistema de Cadastro da Escola Torne-se Um Programador...");
		System.out.println(".....................Seja bem vindo........................");
		System.out.println("...........................................................");
		
        do{
            List<String> aluno = new ArrayList<>();
            System.out.print("Digite o nome do aluno: ");
            aluno.add(teclado.next());
            System.out.print("Digite a 1a.Nota: ");
            Double nota1 = teclado.nextDouble();
            System.out.print("Digite a 2a.Nota: ");
            Double nota2 = teclado.nextDouble();
            System.out.print("Digite a 3a.Nota: ");
            Double nota3 = teclado.nextDouble();
            System.out.print("Digite a 4a.Nota: ");
            Double nota4 = teclado.nextDouble();
            Double media;
        
            media =((nota1 + nota2 + nota3 + nota4)/4);

            aluno.add(nota1.toString());
            aluno.add(nota2.toString());
            aluno.add(nota3.toString());
            aluno.add(nota4.toString());
            aluno.add(media.toString());

            String situacao = "Reprovado";
            if(media >= 7) {
                situacao = "Aprovado";
            }else if(media >= 5 && media < 7){
                situacao = "Recupera????o";
            }
            aluno.add(situacao);

            alunos.add(aluno);

            System.out.println("Deseja adicionar mais um aluno?");
            System.out.println("0 - sair");
            System.out.println("1 - adicionar");

            opcao = teclado.nextInt();
        }
        while(opcao != 0);


        for (List<String> aluno : alunos) {
            System.out.println("-".repeat(20));
            System.out.println("Nome = " + aluno.get(0));
            System.out.println("Nota1 = "+aluno.get(1));
            System.out.println("Nota2 = "+aluno.get(2));
            System.out.println("Nota3 = "+aluno.get(3));
            System.out.println("Nota4 = "+aluno.get(4));

            System.out.println("M??dia = "+aluno.get(5));
            System.out.println("Situa????o = "+aluno.get(6));
        }
        */
    }

    private static void exercicioTabuadaMultiplicador() throws NumberFormatException, IOException {
        /* 
        Agora que voc?? j?? sabe trabalhar com loop e j?? fez o primeiro programa da 
        tabuada, do n??mero do 1 ao 10
        fa??a um programa para calcular a tabuada, onde o usu??rio digita a quantidade de
        numeros multiplicados
        usabilidade:
        Digite o numero da tabuada.
        1

        Digite a quantidade de vezes ser?? multiplicada.
        3

        Resultado
        1 x 1 = 1
        1 x 2 = 2
        1 x 3 = 3
        */


        // === Elmad?? =========
        /* 
        Scanner reader2 = new Scanner(System.in);
        System.out.println("Digite o n??mero que voc?? quer ver a tabuada: ");
        int numero = reader2.nextInt();
        System.out.println("Digite o n??mero at?? onde quer multiplicar: ");
        int fator = reader2.nextInt();
        
        for ( int i = 0; i <= fator ; i++){
            int mult = numero * i;
            System.out.println(numero + " x " + i + " = " + mult);
        }
        */


        // ==== Luiz =====
        
        System.out.println("*".repeat(60));
        System.out.println("*".repeat(18) + " TABUADA MULTIPLICA????O  " + "*".repeat(18));
        System.out.println("*".repeat(60));
        System.out.println();

        System.out.print("Digite o numero da tabuada: ".toUpperCase());
        int calcularNumeroN = Integer.parseInt(reader.readLine());

        System.out.print("Digite a quantidade de vezes que ser?? multiplicada: ".toUpperCase());
        int calcularNumeroVezes = Integer.parseInt(reader.readLine());
        System.out.println();

        for (int i = 1; i <= calcularNumeroVezes; i++) {
            System.out.printf("%d x %d = %d%n", calcularNumeroN, i, (calcularNumeroN * i));
        }
    }

    private static void exercicioTabuada() throws NumberFormatException, IOException {
        /* 
        Agora que voc?? j?? sabe trabalhar com loop
        fa??a um programa para calcular a tabuada.
        usabilidade:
        Digite o numero da tabuada.
        1

        Mostra o calculo
        1 x 1 = 1
        1 x 2 = 2
        ...
        */

        // === Renato ===
        /*
        System.out.println( "=========[TABUADA]=========");
        System.out.println( "Digite um n??mero da tabuada");
        int num = Integer.parseInt(reader.readLine()) ;
        
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " x " + num + " = " + (num *i));
        }
        */


        // ===== Elmad?? =====
        /*
        Scanner readerScan = new Scanner(System.in);
        System.out.println("Digite o n??mero que voc?? quer ver a tabuada: ");
        int numero = readerScan.nextInt();
        int i = 1;
        while ( i <= 10){
            int mult = numero * i;
            System.out.println(numero + " x " + i + " = " + mult);
            i = i + 1; // escrito por completo, a soma
            //i += 1; // forma reduzida 1 para soma
            //i++; // forma reduzida 2 para soma
        }
        */


        // === Luiz ====
        
        System.out.println("*".repeat(60));
        System.out.println("*".repeat(18) + " TABUADA MULTIPLICA????O  " + "*".repeat(18));
        System.out.println("*".repeat(60));
        System.out.println();

        System.out.print("Informe o numero que deseja calcular a multiplica????o: ".toUpperCase());

        int calcularNumeroN = Integer.parseInt(reader.readLine());
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", calcularNumeroN, i, (calcularNumeroN * i));
        }
    }

    private static void exercicioBombeiro() throws NumberFormatException, IOException {
        /*
         * 
         * Denilson ?? um bombeiro e que precisa apagar as chamas de um pr??dio
         * crie um programa utilizando os conceitos de loop para
         * que o pr??dio em chama possa ser molhado com a magueira do bombeiro Denilson
         * at?? que as chamas estejam apagadas.
         * 
         * vari??vel chama ser?? capturada pelo usu??rio do programa. Ex:
         * digite o tamanho em metros da chama: 200
         * 
         * Digite os litros total do caminh??o de bombeiros: 50
         * 
         * para cada 5 litros de agua eu apago 1 metro de chama.
         * 
         * Fa??a um programa mostrando o hist??rico deste atendimento.
         * 
         * Exemplo de hist??rico:
         * 
         * 100 metros de chama
         * eu coloquei 50 litros de agua
         * 
         * quantidade_de_agua_por_metro = 100 / 5
         * quantidade_de_litros_que_tenho = 50 / 5
         * 
         * se a capacidade de agua for menor, Denilson n??o vai conseguir apagar o foco e
         * ter?? que chamar refor??os
         * sen??o, mostrar o hist??rico assim:
         * ===========
         * Apagando 5 metros de fogo fase 1
         * Apagando 5 metros de fogo fase 2
         * Apagando 5 metros de fogo fase 3
         * Apagando 5 metros de fogo fase 4
         * 
         * Fogo apagado com sucesso.
         * Sobraram X litros de agua
         */

        // ==== Professor ===
        
        System.out.println("===== [ Programa do bombeiro denilson ] ======");
        System.out.println("Digite a quantidade de metros em chama:");
        int metrosChama = Integer.parseInt(reader.readLine());

        int fase = 1;
        do{
            System.out.println("Digite a quantidade de litros do caminh??o:");
            int litros = Integer.parseInt(reader.readLine());

            double capacidadeDeMetrosPorLitroCinco = litros / 5;

            if(metrosChama > capacidadeDeMetrosPorLitroCinco){
                System.out.println("=======[ Fase " + fase + " ]=========");
                System.out.println("N??o irei conseguir apagar o fogo porque:");
                System.out.println("Quantidade de metros fogo: " + metrosChama);
                System.out.println("Quantidade de metros por agua: " + capacidadeDeMetrosPorLitroCinco);
                metrosChama -= capacidadeDeMetrosPorLitroCinco;
                System.out.println("Ainda temos " + metrosChama + " de chama para apagar");
            }
            else{
                System.out.println("=======[ Fase " + fase + " ]=========");
                System.out.println("Fogo apagado com sucesso");
                double sobra = capacidadeDeMetrosPorLitroCinco - metrosChama;
                System.out.println("Quantidade de metros por agua que sobrou: " + sobra);
                System.out.println("Quantidade de litros de agua que sobrou: " + sobra * 5);
                break;
            }

            fase++;
        }
        while(true);
        

        /*
        * Autor: Walter Paulo
        * Date: 09/10/2022
        * Exercise: Loops do dia 7 - Desafio 21 dias em Java
        * 
    
        String MSG_TITULO = "Sistema de Inc??ndio\n";
        String MENU_PRINCIPAL = "\n\nEscolhe uma op????o:\n"
                + "( 1 ) Digite a quantidade de litros do caminh??o\n"
                + "( 2 ) Hist??rico\n"
                + "(sair) Sair\n";
        
        String PERGUNTA_TAMANHO_METRO_FOGO = "\nDigite o tamanho em metro do fogo";
        String PERGUNTA_QUANTIDADE_LITRO = "\nDigite a quantidade de litros do caminh??o";
        String MENSAGEM = "";
        String HISTORICO = "\n Hist??rico\n";
        
        
        boolean ocorrencia = true;
        boolean abastecer = true;
        boolean calculo = false;
        
        String menu = "";
        
        double tamanhoMetroFogo = 0.0;
        double quantidadeLitro = 0.0;
        double quantidadeAguaApaparFogo = 0.0;
        double quantidadeAguaCaminhao = 0.0;
        int count = 0;
        do {
            
            if(ocorrencia) {
                MENSAGEM =  MSG_TITULO;
                MENSAGEM += PERGUNTA_TAMANHO_METRO_FOGO;
                String txttamanhoMetroFogo = JOptionPane.showInputDialog(MENSAGEM);
                tamanhoMetroFogo = Double.parseDouble(txttamanhoMetroFogo);
                calculo = true;
                
            }
            if(abastecer) {
                MENSAGEM = MSG_TITULO; 
                MENSAGEM += PERGUNTA_QUANTIDADE_LITRO;
                if(quantidadeAguaApaparFogo <= quantidadeAguaCaminhao && quantidadeAguaCaminhao > 0.0) {
                    MENSAGEM = MSG_TITULO;
                    MENSAGEM += "Litro(s) n??o adicionado, fogo apagado!";
                    JOptionPane.showMessageDialog(null, MENSAGEM );
                    calculo = false;
                    abastecer = false;
                    quantidadeAguaCaminhao = 0.0;
                    continue;
                }else if(quantidadeAguaApaparFogo > quantidadeAguaCaminhao && quantidadeAguaCaminhao > 0.0){
                    String quantidaDeListro = JOptionPane.showInputDialog(MENSAGEM);
                    quantidadeLitro = Double.parseDouble(quantidaDeListro);
                    ocorrencia = false;
                    calculo = true;
                }
                else if(quantidadeAguaApaparFogo == quantidadeAguaCaminhao && quantidadeAguaCaminhao == 0.0){
                    String quantidaDeListro = JOptionPane.showInputDialog(MENSAGEM);
                    quantidadeLitro = Double.parseDouble(quantidaDeListro);
                    if(ocorrencia)
                        quantidadeAguaApaparFogo = tamanhoMetroFogo / 5;
                    ocorrencia = false;
                    calculo = true;
                }else {
                    MENSAGEM = MSG_TITULO;
                    MENSAGEM += "Litro(s) n??o adicionado, fogo apagado!";
                    JOptionPane.showMessageDialog(null, MENSAGEM );
                }
            }
            
            if(calculo) {
                quantidadeAguaCaminhao += quantidadeLitro / 5;
                quantidadeLitro = 0.0;
                count += 1;
                if( quantidadeAguaApaparFogo > quantidadeAguaCaminhao) {
                    HISTORICO += "\nFogo: ACESSO   Apagado: "+( quantidadeAguaCaminhao * 5 )+" metro(s)  Falta: "
                            +((quantidadeAguaApaparFogo - quantidadeAguaCaminhao) * 5)+" litro(s), fase "+count;
                    JOptionPane.showMessageDialog(null, HISTORICO);
                    calculo = false;
                    abastecer = true;
                }
                else if(quantidadeAguaApaparFogo == quantidadeAguaCaminhao) {
                    HISTORICO += "\nFogo: APAGADO Apagado: "+( quantidadeAguaCaminhao * 5 )+" metro(s)  Falta: "
                            +((quantidadeAguaApaparFogo - quantidadeAguaCaminhao) * 5)+" litro(s), fase "+count ;
                    JOptionPane.showMessageDialog(null, HISTORICO);
                    calculo = false;
                }else {
                    calculo = false;
                    abastecer = false;
                    HISTORICO += "\nFogo: APAGADO Apagado: "+(quantidadeAguaApaparFogo)*5+" metro(s)  Falta: "
                            +((quantidadeAguaApaparFogo - quantidadeAguaCaminhao) * 5)+" litro(s), fase "+count ;
                }
            }
            
            menu = MSG_TITULO;
            menu += MENU_PRINCIPAL;
            String opcao = JOptionPane.showInputDialog(menu);
            
            if(Integer.parseInt(opcao) == 1)
                abastecer = true;
            
            if(Integer.parseInt(opcao) == 2) {
                JOptionPane.showMessageDialog(null, HISTORICO);
                abastecer = false;
            }
            
            if(opcao.toLowerCase().equals("sair")) {
                break;
            }
            
        } while(true);
        */
    }

    private static void whileDoWhileSyntax() throws IOException {
        // == Loop syntaxe
        System.out.println("Digite 1 para entrar no loop");
        String valorDigitado = reader.readLine();

        while (valorDigitado.equals("1")) {
            System.out.println("entrei");
            System.out.println("Digite algo diferente de 1 para sair do loop");
            valorDigitado = reader.readLine();
        }
        
        while (true) { // enquanto
            System.out.println("entrei");
            System.out.println("Digite algo diferente de 1 para sair do loop");
            String sair = reader.readLine();
            if(!sair.equals("1")) break;
        }
        
        while (true) { // enquanto
            System.out.println("Digite algo ou se quiser sair do loop digite 'sair' ");
            String opcao = reader.readLine();
            
            if(opcao.equals("pular")) continue;
            
            System.out.println("============ [ " + opcao + " ] ============");
            
            if(opcao.equals("sair")) break;
        }
        
        String opcao = "sair";
        do{
            System.out.println("Digite algo ou se quiser sair do loop digite 'sair' ");
            opcao = reader.readLine();
            System.out.println("============ [ " + opcao + " ] ============");
        }
        while(!opcao.equals("sair"));
        
        
    }

    private static void loopFor() {
        // == for sintaxe
        for (int i = 0; i < 5; i++) { // para i iniciando com 0 at?? menor que 5
            System.out.println("o numero ??: ");
            System.out.println(i);
        }
    }

    private static void exercicioGovernoPonte() {
        /*
         * /*
         * O Governo so Brasil est?? precisando construir uma ponte
         * que vai possibilitar a passagem de caminh??es de um estado a outro.
         * Est?? ponte, vai ajudar no transporte de alimento, ajudando na
         * alimenta????o de diversos brasileiros.
         * 
         * Fa??a um programa que ajude a calcular o valor total desta ponte.
         * Para isso vc ir?? precisar, perguntar alguns itens:
         * - Valor por metro quadrado (do servi??o)
         * - Total de metros da ponte
         * - Mostrar as op????es de ferro da funda????o da ponte, para que o engenheiro
         * possa escolher, exemplo: (Ferro fundido, Ferro com a??o, Ferro Normal)
         * - O valor do ferro varia de acordo com a op????o escolhida
         * - no final do relat??rio mostre o valor total contruido
         * - deste valor total contru??do, mostrar tamb??m que 30% foi adquirido
         * com o valor de imposto arrecadado sobre a popula????o local.
         * 
         * Objetivo do exercio:
         * - utilizar if
         * - utilizar switch
         */

        // ==== Exerc??cio Walter
        /*
         * Autor: Walter Paulo
         * Date: 08/10/2022
         * Exercise: 2 do dia 6 - Desafio 21 dias em Java
         */
        
        Scanner ler = new Scanner(System.in);

        double taxaFerroFundido = 1.2;
        double taxaFerroAcao = 1.3;
        double taxaFerroNormal = 0.0;
        double taxaImposto = 30.0;

        double valorTotal = 0.0;

        String msgInicial = "[ Infraestrutua - Governo Federal ]\n\n";
        String menu = msgInicial;

        menu += "Escolha uma op????o:\n ( 1 ) = Or??amento de Ponte;\n ( 0 ) = Sair;\n\n";
        var menuTipoFerro = "[ Ponte - Governo Federal ]\n\nEscolha uma op????o:\n"
                + "( 1 ) = Ferro normal (" + taxaFerroNormal + "%);\n"
                + "( 2 ) = Ferro com A??o (" + taxaFerroAcao + "%);\n"
                + "( 3 ) = Ferro Fundido (" + taxaFerroFundido + "%);\n\n";
        var msgSair = "Um Governo mais forte para todos!";

        var opcao = JOptionPane.showInputDialog(null, menu);

        if (Integer.parseInt(opcao) == 1) {
            String relatorio = msgInicial;
            relatorio += "________________| Relat??rio |________________\n";

            var opcaoTipoFerro = JOptionPane.showInputDialog(menuTipoFerro);

            var valorValorM2 = JOptionPane.showInputDialog("Digite o valor do metro quadrado:");
            var comprimentoPonte = JOptionPane.showInputDialog("Digite a metragem da ponte:");

            double m2valor = Double.parseDouble(valorValorM2);
            double comprimento = Double.parseDouble(comprimentoPonte);
            DecimalFormat moedaBr = new DecimalFormat("#,###,###,##0.00");

            relatorio += "\nDescri????o T??cnica\n"
                    + "Departamento: Infraestrutura\n"
                    + "Obra: Ponte\n"
                    + "Metragem: " + comprimentoPonte + " metro(s)\n"
                    + "Valor por metro: R$ " + moedaBr.format(m2valor) + "\n";

            String tipoDePonte = "Ferro Fundido";

            switch (opcaoTipoFerro) {
                case "1":
                    tipoDePonte = "Normal";
                    valorTotal = (m2valor * comprimento) * (taxaFerroNormal > 0 ? taxaFerroNormal : 1.0);
                    break;
                case "2":
                    tipoDePonte = "Ferro com A??o";
                    valorTotal = (m2valor * comprimento) * (taxaFerroAcao > 0 ? taxaFerroAcao : 1.0);
                    break;
                default:
                    valorTotal = (m2valor * comprimento) * (taxaFerroFundido > 0 ? taxaFerroFundido : 1.0);
            }

            relatorio += "Tipo: " + tipoDePonte + "\n"
                    + "Imposto da popula????o em porcentagem: " + taxaImposto + "%\n"
                    + "Imposto da popula????o em moeda: R$ " + moedaBr.format((valorTotal * taxaImposto) / 100)
                    + "\nValor Total: R$ " + moedaBr.format(valorTotal);

            JOptionPane.showMessageDialog(null, "Valor:" + relatorio);

        } else {
            JOptionPane.showMessageDialog(null, msgSair);
        }
        
    }

    private static void exercicioPaulaPetshop() {
        /*
         * Paula tem uma petshop, ela est?? precisando de um sistema
         * para controlar seus servi??os. neste sistema, precisa cadastrar
         * o cliente (Dados b??sicos) os dados do Pet e o peso do pet,
         * depois o sistema dever?? calcular o valor do banho, pelo peso
         * 
         * qual ser?? este calculo:
         * - Para macho:
         * (pesoDoPet * valorPorPeso) + (pesoDoPet * valorPorPeso) * 15 / 100
         * - Para fem??a
         * (pesoDoPet * valorPorPeso) + (pesoDoPet * valorPorPeso) * 30 / 100
         * 
         * Feito o calculo o sistema dever?? mostrar um relat??rio com os dados do
         * pedido e o valor total a pagar.
         * 
         * Coloque uma usabilidade agrad??vel
         */

        // == algoritimo do professor
        var mensagem = "[ Petshop da Paula ]\nVamos come??ar?";
        JOptionPane.showMessageDialog(null, mensagem);
        
        String nome = JOptionPane.showInputDialog("Digite o nome do cliente");
        String telefone = JOptionPane.showInputDialog("Digite o telefone do(s) " + nome);
        String nomeDoPet = JOptionPane.showInputDialog("Digite o nome do Pet");
        double pesoDoPet = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do(a) " + nomeDoPet));
        int sexoPet = Integer.parseInt(JOptionPane.showInputDialog("O(a) " + nomeDoPet + " ?? macho ou f??mea ?\n1 - Macho\n2 - F??mea"));
        double valorPorPeso = Double.parseDouble(JOptionPane.showInputDialog("Digite o R$ valor por peso"));
        
        // String nome = "Fabiana";
        // String telefone = "(11) 99999-9999";
        // String nomeDoPet = "Maikey";
        // double pesoDoPet = 20.5;
        // int sexoPet = 1;
        // double valorPorPeso = 2.6;
         
         double resultado = 0;
         if(sexoPet == 2){
            resultado = (pesoDoPet * valorPorPeso) + (pesoDoPet * valorPorPeso) * 30 / 100;
         }
         else{
            resultado = (pesoDoPet * valorPorPeso) + (pesoDoPet * valorPorPeso) * 15 / 100;
         }
         
         String relatorio = "Nome do cliente: " + nome + "\n";
         relatorio += "Telefone do(a) " + nome + ": " + telefone + "\n";
         relatorio += "Pet do(a) " + nome + ": " + nomeDoPet + "\n";
         relatorio += "Peso do(a) " + nomeDoPet + ": " + pesoDoPet + "\n";
         
         Locale localeBR = new Locale( "pt", "BR" );
         NumberFormat dinheiroBR = NumberFormat.getCurrencyInstance(localeBR);
         String valorFormatado = dinheiroBR.format(resultado);
         
         relatorio += "Valor total do servi??o: " + valorFormatado;
         
         //System.out.println(relatorio);
         JOptionPane.showMessageDialog(null, relatorio);
         

        // Walter
        //Scanner ler = new Scanner(System.in);
        /*
         * Autor: Walter Paulo
         * Date: 08/10/2022
         * Exercise: 1 do dia 6 - Desafio 21 dias em Java
         */
        /*
        System.out.println("===============[ PetAni ]===============");
        System.out.println("Ol?? Paula, bom dia");
        System.out.println("===============[ Cadastro Cliente ]===============");
        System.err.println("Digite o nome");
        var nomeDoCliente = ler.next();
        System.out.println("Digite o telefone");
        var telefoneCliente = ler.next();
        System.out.println("===============[ Cadastro do Pet ]===============");
        System.err.println("Digite o nome");
        var nomeDoPet = ler.next();
        System.err.println("Digite o sexo: M => macho / F => F??mea");
        var sexoDoPet = ler.next();
        System.err.println("Digite o peso:");
        var pesoDoPet = ler.nextDouble();
        
        System.out.println("===============[ Cadastro do Pre??o ]===============");
        System.err.println("Digite o valor por peso");
        var valorPorPeso = ler.nextDouble();
        var valorTotal = 0.0;
        if(sexoDoPet.equals("M")) {
            valorTotal = (valorPorPeso * valorPorPeso) + (pesoDoPet * valorPorPeso) * 15 / 100;
        }
        else {
            valorTotal = (valorPorPeso * valorPorPeso) + (pesoDoPet * valorPorPeso) * 30 / 100;
        }
        
        DecimalFormat moedaBr = new DecimalFormat( "#,###,###,##0.00" );
        
        System.out.println("============[ Relat??rio ]=======================");
        System.out.println("Nome do cliente: "+ nomeDoCliente);
        System.out.println("Telefone: "+ telefoneCliente);
        System.out.println("\n-----[ Pet ]--------");
        System.out.println("Nome do Pet: "+nomeDoPet);
        System.out.println("Sexo: "+sexoDoPet);
        System.out.println("Peso: "+pesoDoPet);
        System.out.println("\n---------[ Pagamento ]--------");
        System.err.println("Valor Total R$ "+ moedaBr.format(valorTotal) );
        */
    }

    private static void somaTiposPrimitivos() {
        // === tipos primitivos mais utilizados
        int inteiro = 5;
        double moeda = 5.99;
        char umCaractere = 'D';
        boolean verdadeiroFalso = true;
        String texto = "Hello";

        double restoDivisao = 3.5/2;
        System.out.println("O resto da divis??o ??: " + restoDivisao);

        var hojeEstaFrio = false;
        System.out.println("O tempo est?? frio?: " + hojeEstaFrio);

        var moeda2 = 4.5;
        var inteiro2 = 4;
        var stringNumero = "8";

        var valor = moeda * inteiro;
        var valor2 = moeda - inteiro;
        var valor3 = moeda + inteiro + Double.parseDouble(stringNumero);

        System.out.println("Resultado: " + valor3);
    }

    private static void formatacaoContatenacao() {
        // == concatena????es
        var rotulo = "Nome: ";
        var nome = "Leandro";

        var dadoCompleto = rotulo + nome;
        System.out.println("Dado: " + dadoCompleto);

        var dadoCompleto2 = rotulo.concat(nome);
        System.out.println("Dado: " + dadoCompleto2);

        var resultado = String.format("O valor de nome ??: %s e o valor de rotulo ??: %s", nome, rotulo);
        System.out.println(resultado);

        var calculo = 4.555;
        System.out.printf( "O resultado ?? %.2f", calculo); // mostrar n??mero com 2 cadas decimais
    }

    private static void formatarPadraoAmericano() {
        // == padr??o americano
        double d = 1243123.1;
        DecimalFormat df = new DecimalFormat("###,###.00");
        System.out.println(df.format(d));
    }

    private static void formatarMoedaBr() {
        // == padr??o Brasil
        double d = 1243123.1;
        Locale localeBR = new Locale( "pt", "BR" );
        NumberFormat dinheiroBR = NumberFormat.getCurrencyInstance(localeBR);
        System.out.println(dinheiroBR.format(d));
    }

    public static void compareDates(String d1,String d2)
    {
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            var date1 = sdf.parse(d1);
            var date2 = sdf.parse(d2);

            System.out.println("Date1"+sdf.format(date1));
            System.out.println("Date2"+sdf.format(date2));System.out.println();

            if(date1.after(date2)){
                System.out.println("Date1 (" + date1 + ") ?? maior Date2 (" + date2 + ")");
            }
            if(date1.before(date2)){
                System.out.println("Date1 (" + date1 + ") ?? menor Date2 (" + date2 + ")");
            }

            if(date1.equals(date2)){
                System.out.println("Date1 is equal Date2");
            }

            System.out.println();
        }
        catch(ParseException ex){
            ex.printStackTrace();
        }
    }

    private static void operadoresLogicos() {
        // == compara????o em java com operadores l??gicos
        int numero1 = 2;
        int numero2 = 1;

        // operador l??gico && = e
        // operador l??gico || = ou
        var resultado = numero1 <= numero2 || numero1 > numero2;
        var resultado2 = numero1 <= numero2 && numero1 > numero2;
        System.out.println( resultado );
        System.out.println( resultado2 );

        var dataInicial = LocalDateTime.parse("2022-01-01T00:00:00"); // padr??o UTC data
        var dataFinal = LocalDateTime.parse("2022-01-30T02:00:00");
        var dataCorrente = LocalDateTime.parse("2022-01-15T10:30:35");
        var resultadoDataOpracao = dataFinal.isAfter(dataInicial) && dataCorrente.isBefore(dataFinal);
        System.out.println("Resultado data: " + resultadoDataOpracao);

        var diaInicial = 1;
        var diaFinal = 30;
        var diaCorrente = 15;
        var resultadoDiaOperacao = diaCorrente >= diaInicial && diaCorrente <= diaFinal;
        System.out.println("Resultado dia: " + resultadoDiaOperacao);
    }

    private static void exemploCondicionaisTernario() {
        // === conticionais
        int valorTotal2 = 101;
        if(valorTotal2 > 100){
            System.out.println("Seu pedido foi maior que R$ 100 e voc?? ter?? um desconto na proxima");
            System.out.println("Seu pedido foi maior que R$ 100 e voc?? ter?? um desconto na proxima");
        }

        if(valorTotal2 > 100) System.out.println("Seu pedido foi maior que R$ 100 e voc?? ter?? um desconto na proxima");

        // === tern??rio
        var resultado = "Padr??o";
        resultado = valorTotal2 > 100 ? "Foiii verdade" : "";
        System.out.println(resultado);
    }

    private static void exercicioJoaoCondicional() throws NumberFormatException, IOException {
        /*
         * Jo??o tem um armazem e precisa de um programa que solicite
         * o nome do seu cliente
         * o endereco do seu cliente
         * o nome do material de constru????o
         * o valor do material de contru????o
         * e a quantidade que o cliente deseja
         * se a compra do cliente for maior que 100, fale que ele ter?? desconto na
         * proxima
         * no final final do programa, mostre um relat??rio com o valor total do produto
         * comprado
         * -----------------------------
         * Cliente: Jo??o
         * Endere??o de entrega: Rua ...
         * Comprou o material: XXX no valor de R$ XXX
         * O valor total da compra deu: R$ XXX
         * Seu pedido foi maior que R$ 100 e voc?? ter?? um desconto na proxima
         * -----------------------------
         */

        System.out.println("==============[ Calculo produto/cliente ]===================");
        System.out.println("Ol?? Jo??o seja muito bem vindo, vamos come??ar?");

        System.out.println("Digite o nome do seu cliente: ");
        var nome = reader.readLine();

        System.out.println("Digite o endere??o do seu cliente: ");
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
        System.out.printf("Endere??o de entrega: %s \n", endereco);
        System.out.printf("Comprou o material: %s no valor de R$ %s \n", produto, valor);
        System.out.printf("O valor total da compra deu: R$ %.2f \n", valorTotal);

        if(valorTotal > 100){
            System.out.println("Seu pedido foi maior que R$ 100 e voc?? ter?? um desconto na proxima");
        }
    }

    private static void formatarMoeda() throws IOException {
        System.out.println("-----------------------------");

        System.out.printf("Digite um valor \n");
        var valorString = reader.readLine();
        valorString = valorString.replace(".", "");
        valorString = valorString.replace(",", ".");
        var valor = Double.parseDouble(valorString);

        Locale localeBR = new Locale( "pt", "BR" );
        NumberFormat dinheiroBR = NumberFormat.getCurrencyInstance(localeBR);
        System.out.printf("O valor total da compra deu: R$ %s \n",
        dinheiroBR.format(valor));

        System.out.printf("Teste %s %n", 4.5);
        System.out.println("Segunda Linha");
    }

    private static void exercicioJoaoOperacao() throws NumberFormatException, IOException {
        // professor
        System.out.println("==============================");
        System.out.println("Ol?? Jo??o, seja muito bem vindo");
        System.out.println("==============================");
        System.out.println("Jo??o percebi que voc?? quer resolver esta opera????o:");
        System.out.println("(x * 8 + y) - x + y / 100");
        System.out.
        println("Para isso preciso que o senhor digite o valor de x e de y, ent??o:");
        System.out.println("Digite o valor de x");
        int x = Integer.parseInt(reader.readLine());
        System.out.println("Digite o valor de y");
        int y = Integer.parseInt(reader.readLine());
        var operacao = (x * 8 + y) - x + y / 100;
        
        System.out.println("Jo??o j?? fiz o calculo e o resultado da opera????o: ");
        System.out.println("(" + x + " * 8 + " + y + ") - " + x + " + " + y + " / 100");
        System.out.println("Foi: " + operacao);


        /*
         * Exercicio 1
         * Jo??o ?? um professor de matem??tica e precisa de um programa
         * que fa??a o calculo da seguinte express??o:
         * (x * 8 + y) - x + y / 100
         * fa??a um programa que resolva o problema da express??o que o Jo??o
         * precisa.
         * 
         * LEMBRE-SE: pense na usabilidade !!!
         */

        // tupiniken (Elmad?? - Elmadan)
        // int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X"));
        // int y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de Y"));
        // int resultado = (x * + y) - x + y /100;
        // JOptionPane.showMessageDialog(null, resultado);

        /*
         * // Luiz
         * System.out.println("Digite um numero X");
         * int numeroX = Integer.parseInt(reader.readLine());
         * System.out.println("Digite um numero Y");
         * int numeroY = Integer.parseInt(reader.readLine());
         * 
         * var resultado = (numeroX * 8 + numeroY) - numeroX + numeroY / 100;
         * 
         * System.out.println("o resutado da express??o ??: " + resultado);
         */

        /*
         * // Denis
         * Scanner scanner = new Scanner(System.in);
         * 
         * System.out.println("Vamos resolver o calculo (x * 8 + y) - x + y / 100");
         * System.out.println("Mas antes me passe os valores de x e y");
         * System.out.println("Qual o x?");
         * int x = scanner.nextInt();
         * 
         * System.out.println("Qual o y?");
         * int y = scanner.nextInt();
         * 
         * int resposta = (x * 8 + y) - x + y / 100;
         * 
         * System.out.println("L?? vai a resposta ent??o: " + resposta);
         * 
         * scanner.close();
         */

        /*
         * // VLC (Vinicius)
         * Scanner sc = new Scanner(System.in);
         * 
         * System.out.println("Vamos resolver o calculo (x * 8 + y) - x + y / 100");
         * System.out.printf("Leia X: ");
         * int x = sc.nextInt();
         * System.out.printf("Leia Y: ");
         * int y = sc.nextInt();
         * 
         * int result = (x * 8 + y) - x + y / 100;
         * 
         * System.out.println("Resultado: " + result);
         */

        /*
         * // Gil
         * Scanner teclado = new Scanner(System.in);
         * System.out.println("Informe o valor de X ");
         * int x = teclado.nextInt();
         * System.out.println("Informe o valor de Y ");
         * int y = teclado.nextInt();
         * 
         * int resultado;
         * 
         * resultado = (x * 8 + y) - x + y / 100;
         * 
         * System.out.println("O resultado ??: " + resultado);
         */
    }

    private static void capturaCalculaNumero() throws NumberFormatException, IOException {
        
        System.out.println("Digite um n??mero");
        int numero = Integer.parseInt(reader.readLine());
        var resultado = numero + 1000;
        System.out.println("O resultado de (" + numero + ") + 1000 ?? de : " +
        resultado);
        
    }

    private static void capturaNome() throws IOException {
        // mostre()
        System.out.println("Digite o seu nome");
        
        // leia()
        var nome = reader.readLine();
        
        // mostre() mostrando dados concatenando vari??vel nome capturada
        System.out.println("O nome digitado foi: " + nome);
    }

    private static void soma() {
        int numero1 = 3;
        var numero2 = 5;
        
        int soma = numero1 + numero2;
        
        // mostre() # mostra informa????o na tela
        System.out.println( "O resultado da opera????o ?? " + soma );
    }

    
    private static JFrame frame;
    private static JTextField textField_1;
    private static JTextField textField_2;
    
    public static void exemploSwingForm(){
        frame = new JFrame();
        frame.setBounds(100, 100, 730, 489);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblPhone = new JLabel("Phone #");
        lblPhone.setBounds(65, 68, 46, 14);
        frame.getContentPane().add(lblPhone);
         
        textField_1 = new JTextField();
        textField_1.setBounds(128, 65, 86, 20);
        frame.getContentPane().add(textField_1);
        textField_1.setColumns(10);
         
        JLabel lblEmailId = new JLabel("Email Id");
        lblEmailId.setBounds(65, 115, 46, 14);
        frame.getContentPane().add(lblEmailId);
         
        textField_2 = new JTextField();
        textField_2.setBounds(128, 112, 247, 17);
        frame.getContentPane().add(textField_2);
        textField_2.setColumns(10);
         
        JLabel lblAddress = new JLabel("Address");
        lblAddress.setBounds(65, 162, 46, 14);
        frame.getContentPane().add(lblAddress);
                 
        JTextArea textArea_1 = new JTextArea();
        textArea_1.setBounds(126, 157, 212, 40);
        frame.getContentPane().add(textArea_1);
         
        JButton btnClear = new JButton("Clear");
         
        btnClear.setBounds(312, 387, 89, 23);
        frame.getContentPane().add(btnClear);
         
        JLabel lblSex = new JLabel("Sex");
        lblSex.setBounds(65, 228, 46, 14);
        frame.getContentPane().add(lblSex);
         
        JLabel lblMale = new JLabel("Male");
        lblMale.setBounds(128, 228, 46, 14);
        frame.getContentPane().add(lblMale);
         
        JLabel lblFemale = new JLabel("Female");
        lblFemale.setBounds(292, 228, 46, 14);
        frame.getContentPane().add(lblFemale);
         
        JRadioButton radioButton = new JRadioButton("");
        radioButton.setBounds(337, 224, 109, 23);
        frame.getContentPane().add(radioButton);
         
        JRadioButton radioButton_1 = new JRadioButton("");
        radioButton_1.setBounds(162, 224, 109, 23);
        frame.getContentPane().add(radioButton_1);
         
        JLabel lblOccupation = new JLabel("Occupation");
        lblOccupation.setBounds(65, 288, 67, 14);
        frame.getContentPane().add(lblOccupation);
         
        JButton btnSubmit = new JButton("submit");
         
        btnSubmit.setBounds(65, 387, 89, 23);
        frame.getContentPane().add(btnSubmit);

        App window = new App();
        window.frame.setVisible(true);
    }
    
}
