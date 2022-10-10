package br.com.didox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        /* 
        Agora que você já sabe trabalhar com loop e já fez o primeiro programa da 
        tabuada, do número do 1 ao 10
        faça um programa para calcular a tabuada, onde o usuário digita a quantidade de
        numeros multiplicados
        usabilidade:
        Digite o numero da tabuada.
        1

        Digite a quantidade de vezes será multiplicada.
        3

        Resultado
        1 x 1 = 1
        1 x 2 = 2
        1 x 3 = 3
        */


        // === Elmadã =========
        /* 
        Scanner reader2 = new Scanner(System.in);
        System.out.println("Digite o número que você quer ver a tabuada: ");
        int numero = reader2.nextInt();
        System.out.println("Digite o número até onde quer multiplicar: ");
        int fator = reader2.nextInt();
        
        for ( int i = 0; i <= fator ; i++){
            int mult = numero * i;
            System.out.println(numero + " x " + i + " = " + mult);
        }
        */


        // ==== Luiz =====
        System.out.println("*".repeat(60));
        System.out.println("*".repeat(18) + " TABUADA MULTIPLICAÇÃO  " + "*".repeat(18));
        System.out.println("*".repeat(60));
        System.out.println();

        System.out.print("Digite o numero da tabuada: ".toUpperCase());
        int calcularNumeroN = Integer.parseInt(reader.readLine());

        System.out.print("Digite a quantidade de vezes que será multiplicada: ".toUpperCase());
        int calcularNumeroVezes = Integer.parseInt(reader.readLine());
        System.out.println();

        for (int i = 1; i <= calcularNumeroVezes; i++) {
            System.out.printf("%d x %d = %d%n", calcularNumeroN, i, (calcularNumeroN * i));
        }


        /* 
        Agora que você já sabe trabalhar com loop
        faça um programa para calcular a tabuada.
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
        System.out.println( "Digite um número da tabuada");
        int num = Integer.parseInt(reader.readLine()) ;
        
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " x " + num + " = " + (num *i));
        }
        */


        // ===== Elmadã =====
        /*
        Scanner readerScan = new Scanner(System.in);
        System.out.println("Digite o número que você quer ver a tabuada: ");
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
        /*
        System.out.println("*".repeat(60));
        System.out.println("*".repeat(18) + " TABUADA MULTIPLICAÇÃO  " + "*".repeat(18));
        System.out.println("*".repeat(60));
        System.out.println();

        System.out.print("Informe o numero que deseja calcular a multiplicação: ".toUpperCase());

        int calcularNumeroN = Integer.parseInt(reader.readLine());
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", calcularNumeroN, i, (calcularNumeroN * i));
        }
        */


        /*
         * 
         * Denilson é um bombeiro e que precisa apagar as chamas de um prédio
         * crie um programa utilizando os conceitos de loop para
         * que o prédio em chama possa ser molhado com a magueira do bombeiro Denilson
         * até que as chamas estejam apagadas.
         * 
         * variável chama será capturada pelo usuário do programa. Ex:
         * digite o tamanho em metros da chama: 200
         * 
         * Digite os litros total do caminhão de bombeiros: 50
         * 
         * para cada 5 litros de agua eu apago 1 metro de chama.
         * 
         * Faça um programa mostrando o histórico deste atendimento.
         * 
         * Exemplo de histórico:
         * 
         * 100 metros de chama
         * eu coloquei 50 litros de agua
         * 
         * quantidade_de_agua_por_metro = 100 / 5
         * quantidade_de_litros_que_tenho = 50 / 5
         * 
         * se a capacidade de agua for menor, Denilson não vai conseguir apagar o foco e
         * terá que chamar reforços
         * senão, mostrar o histórico assim:
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
        /*
        System.out.println("===== [ Programa do bombeiro denilson ] ======");
        System.out.println("Digite a quantidade de metros em chama:");
        int metrosChama = Integer.parseInt(reader.readLine());

        int fase = 1;
        do{
            System.out.println("Digite a quantidade de litros do caminhão:");
            int litros = Integer.parseInt(reader.readLine());

            double capacidadeDeMetrosPorLitroCinco = litros / 5;

            if(metrosChama > capacidadeDeMetrosPorLitroCinco){
                System.out.println("=======[ Fase " + fase + " ]=========");
                System.out.println("Não irei conseguir apagar o fogo porque:");
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
        */

        /*
        * Autor: Walter Paulo
        * Date: 09/10/2022
        * Exercise: Loops do dia 7 - Desafio 21 dias em Java
        * 
    
    String MSG_TITULO = "Sistema de Incêndio\n";
    String MENU_PRINCIPAL = "\n\nEscolhe uma opção:\n"
            + "( 1 ) Digite a quantidade de litros do caminhão\n"
            + "( 2 ) Histórico\n"
            + "(sair) Sair\n";
    
    String PERGUNTA_TAMANHO_METRO_FOGO = "\nDigite o tamanho em metro do fogo";
    String PERGUNTA_QUANTIDADE_LITRO = "\nDigite a quantidade de litros do caminhão";
    String MENSAGEM = "";
    String HISTORICO = "\n Histórico\n";
    
    
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
                MENSAGEM += "Litro(s) não adicionado, fogo apagado!";
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
                MENSAGEM += "Litro(s) não adicionado, fogo apagado!";
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


        // == Loop syntaxe
        /*
         * System.out.println("Digite 1 para entrar no loop");
         * String valorDigitado = reader.readLine();
         * while (valorDigitado.equals("1")) {
         * System.out.println("entrei");
         * System.out.println("Digite algo diferente de 1 para sair do loop");
         * valorDigitado = reader.readLine();
         * }
         * 
         * while (true) { // enquanto
         * System.out.println("entrei");
         * System.out.println("Digite algo diferente de 1 para sair do loop");
         * String sair = reader.readLine();
         * if(!sair.equals("1")) break;
         * }
         * 
         * while (true) { // enquanto
         * System.out.println("Digite algo ou se quiser sair do loop digite 'sair' ");
         * String opcao = reader.readLine();
         * 
         * if(opcao.equals("pular")) continue;
         * 
         * System.out.println("============ [ " + opcao + " ] ============");
         * 
         * if(opcao.equals("sair")) break;
         * }
         * 
         * String opcao = "sair";
         * do{
         * System.out.println("Digite algo ou se quiser sair do loop digite 'sair' ");
         * opcao = reader.readLine();
         * System.out.println("============ [ " + opcao + " ] ============");
         * }while(!opcao.equals("sair"));
         * 
         */

        // == for sintaxe
        // for (int i = 0; i < 5; i++) { // para i iniciando com 0 até menor que 5
        // System.out.println("o numero é: ");
        // System.out.println(i);
        // }

        /*
         * /*
         * O Governo so Brasil está precisando construir uma ponte
         * que vai possibilitar a passagem de caminhões de um estado a outro.
         * Está ponte, vai ajudar no transporte de alimento, ajudando na
         * alimentação de diversos brasileiros.
         * 
         * Faça um programa que ajude a calcular o valor total desta ponte.
         * Para isso vc irá precisar, perguntar alguns itens:
         * - Valor por metro quadrado (do serviço)
         * - Total de metros da ponte
         * - Mostrar as opções de ferro da fundação da ponte, para que o engenheiro
         * possa escolher, exemplo: (Ferro fundido, Ferro com aço, Ferro Normal)
         * - O valor do ferro varia de acordo com a opção escolhida
         * - no final do relatório mostre o valor total contruido
         * - deste valor total contruído, mostrar também que 30% foi adquirido
         * com o valor de imposto arrecadado sobre a população local.
         * 
         * Objetivo do exercio:
         * - utilizar if
         * - utilizar switch
         */

        // ==== Exercício Walter
        /*
         * Autor: Walter Paulo
         * Date: 08/10/2022
         * Exercise: 2 do dia 6 - Desafio 21 dias em Java
         */

        /*
        Scanner ler = new Scanner(System.in);

        double taxaFerroFundido = 1.2;
        double taxaFerroAcao = 1.3;
        double taxaFerroNormal = 0.0;
        double taxaImposto = 30.0;

        double valorTotal = 0.0;

        String msgInicial = "[ Infraestrutua - Governo Federal ]\n\n";
        String menu = msgInicial;

        menu += "Escolha uma opção:\n ( 1 ) = Orçamento de Ponte;\n ( 0 ) = Sair;\n\n";
        var menuTipoFerro = "[ Ponte - Governo Federal ]\n\nEscolha uma opção:\n"
                + "( 1 ) = Ferro normal (" + taxaFerroNormal + "%);\n"
                + "( 2 ) = Ferro com Aço (" + taxaFerroAcao + "%);\n"
                + "( 3 ) = Ferro Fundido (" + taxaFerroFundido + "%);\n\n";
        var msgSair = "Um Governo mais forte para todos!";

        var opcao = JOptionPane.showInputDialog(null, menu);

        if (Integer.parseInt(opcao) == 1) {
            String relatorio = msgInicial;
            relatorio += "________________| Relatório |________________\n";

            var opcaoTipoFerro = JOptionPane.showInputDialog(menuTipoFerro);

            var valorValorM2 = JOptionPane.showInputDialog("Digite o valor do metro quadrado:");
            var comprimentoPonte = JOptionPane.showInputDialog("Digite a metragem da ponte:");

            double m2valor = Double.parseDouble(valorValorM2);
            double comprimento = Double.parseDouble(comprimentoPonte);
            DecimalFormat moedaBr = new DecimalFormat("#,###,###,##0.00");

            relatorio += "\nDescrição Técnica\n"
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
                    tipoDePonte = "Ferro com Aço";
                    valorTotal = (m2valor * comprimento) * (taxaFerroAcao > 0 ? taxaFerroAcao : 1.0);
                    break;
                default:
                    valorTotal = (m2valor * comprimento) * (taxaFerroFundido > 0 ? taxaFerroFundido : 1.0);
            }

            relatorio += "Tipo: " + tipoDePonte + "\n"
                    + "Imposto da população em porcentagem: " + taxaImposto + "%\n"
                    + "Imposto da população em moeda: R$ " + moedaBr.format((valorTotal * taxaImposto) / 100)
                    + "\nValor Total: R$ " + moedaBr.format(valorTotal);

            JOptionPane.showMessageDialog(null, "Valor:" + relatorio);

        } else {
            JOptionPane.showMessageDialog(null, msgSair);
        }
        */

        /*
         * Paula tem uma petshop, ela está precisando de um sistema
         * para controlar seus serviços. neste sistema, precisa cadastrar
         * o cliente (Dados básicos) os dados do Pet e o peso do pet,
         * depois o sistema deverá calcular o valor do banho, pelo peso
         * 
         * qual será este calculo:
         * - Para macho:
         * (pesoDoPet * valorPorPeso) + (pesoDoPet * valorPorPeso) * 15 / 100
         * - Para femêa
         * (pesoDoPet * valorPorPeso) + (pesoDoPet * valorPorPeso) * 30 / 100
         * 
         * Feito o calculo o sistema deverá mostrar um relatório com os dados do
         * pedido e o valor total a pagar.
         * 
         * Coloque uma usabilidade agradável
         */

        // == algoritimo do professor
        /*
         * var mensagem = "[ Petshop da Paula ]\nVamos começar?";
         * JOptionPane.showMessageDialog(null, mensagem);
         * 
         * String nome = JOptionPane.showInputDialog("Digite o nome do cliente");
         * String telefone = JOptionPane.showInputDialog("Digite o telefone do(s) " +
         * nome);
         * String nomeDoPet = JOptionPane.showInputDialog("Digite o nome do Pet");
         * double pesoDoPet =
         * Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do(a) " +
         * nomeDoPet));
         * int sexoPet = Integer.parseInt(JOptionPane.showInputDialog("O(a) " +
         * nomeDoPet + " é macho ou fêmea ?\n1 - Macho\n2 - Fêmea"));
         * double valorPorPeso =
         * Double.parseDouble(JOptionPane.showInputDialog("Digite o R$ valor por peso"))
         * ;
         * 
         * // String nome = "Fabiana";
         * // String telefone = "(11) 99999-9999";
         * // String nomeDoPet = "Maikey";
         * // double pesoDoPet = 20.5;
         * // int sexoPet = 1;
         * // double valorPorPeso = 2.6;
         * 
         * double resultado = 0;
         * if(sexoPet == 2){
         * resultado = (pesoDoPet * valorPorPeso) + (pesoDoPet * valorPorPeso) * 30 /
         * 100;
         * }
         * else{
         * resultado = (pesoDoPet * valorPorPeso) + (pesoDoPet * valorPorPeso) * 15 /
         * 100;
         * }
         * 
         * String relatorio = "Nome do cliente: " + nome + "\n";
         * relatorio += "Telefone do(a) " + nome + ": " + telefone + "\n";
         * relatorio += "Pet do(a) " + nome + ": " + nomeDoPet + "\n";
         * relatorio += "Peso do(a) " + nomeDoPet + ": " + pesoDoPet + "\n";
         * 
         * Locale localeBR = new Locale( "pt", "BR" );
         * NumberFormat dinheiroBR = NumberFormat.getCurrencyInstance(localeBR);
         * String valorFormatado = dinheiroBR.format(resultado);
         * 
         * relatorio += "Valor total do serviço: " + valorFormatado;
         * 
         * //System.out.println(relatorio);
         * JOptionPane.showMessageDialog(null, relatorio);
         */

        // Walter
        //Scanner ler = new Scanner(System.in);
        /*
         * Autor: Walter Paulo
         * Date: 08/10/2022
         * Exercise: 1 do dia 6 - Desafio 21 dias em Java
         */
        /*
         * System.out.println("===============[ PetAni ]===============");
         * System.out.println("Olá Paula, bom dia");
         * System.out.println("===============[ Cadastro Cliente ]===============");
         * System.err.println("Digite o nome");
         * var nomeDoCliente = ler.next();
         * System.out.println("Digite o telefone");
         * var telefoneCliente = ler.next();
         * System.out.println("===============[ Cadastro do Pet ]===============");
         * System.err.println("Digite o nome");
         * var nomeDoPet = ler.next();
         * System.err.println("Digite o sexo: M => macho / F => Fêmea");
         * var sexoDoPet = ler.next();
         * System.err.println("Digite o peso:");
         * var pesoDoPet = ler.nextDouble();
         * 
         * System.out.println("===============[ Cadastro do Preço ]===============");
         * System.err.println("Digite o valor por peso");
         * var valorPorPeso = ler.nextDouble();
         * var valorTotal = 0.0;
         * if(sexoDoPet.equals("M")) {
         * valorTotal = (valorPorPeso * valorPorPeso) + (pesoDoPet * valorPorPeso) * 15
         * / 100;
         * }
         * else {
         * valorTotal = (valorPorPeso * valorPorPeso) + (pesoDoPet * valorPorPeso) * 30
         * / 100;
         * }
         * 
         * DecimalFormat moedaBr = new DecimalFormat( "#,###,###,##0.00" );
         * 
         * System.out.println("============[ Relatório ]=======================");
         * System.out.println("Nome do cliente: "+ nomeDoCliente);
         * System.out.println("Telefone: "+ telefoneCliente);
         * System.out.println("\n-----[ Pet ]--------");
         * System.out.println("Nome do Pet: "+nomeDoPet);
         * System.out.println("Sexo: "+sexoDoPet);
         * System.out.println("Peso: "+pesoDoPet);
         * System.out.println("\n---------[ Pagamento ]--------");
         * System.err.println("Valor Total R$ "+ moedaBr.format(valorTotal) );
         */

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

        // var valor = moeda * inteiro;
        // var valor2 = moeda - inteiro;
        // var valor3 = moeda + inteiro + Double.parseDouble(stringNumero);

        // System.out.println("Resultado: " + valor3);

        // == concatenações
        // var rotulo = "Nome: ";
        // var nome = "Leandro";

        // var dadoCompleto = rotulo + nome;
        // System.out.println("Dado: " + dadoCompleto);

        // var dadoCompleto = rotulo.concat(nome);
        // System.out.println("Dado: " + dadoCompleto);

        // var resultado = String.format("O valor de nome é: %s e o valor de rotulo é:
        // %s", nome, rotulo);
        // System.out.println(resultado);

        // var calculo = 4.555;
        // System.out.printf( "O resultado é %.2f", calculo); // mostrar número com 2
        // cadas decimais

        /*
         * João tem um armazem e precisa de um programa que solicite
         * o nome do seu cliente
         * o endereco do seu cliente
         * o nome do material de construção
         * o valor do material de contrução
         * e a quantidade que o cliente deseja
         * se a compra do cliente for maior que 100, fale que ele terá desconto na
         * proxima
         * no final final do programa, mostre um relatório com o valor total do produto
         * comprado
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

        // == padrão Brasil
        // double d = 1243123.1;
        // Locale localeBR = new Locale( "pt", "BR" );
        // NumberFormat dinheiroBR = NumberFormat.getCurrencyInstance(localeBR);
        // System.out.println(dinheiroBR.format(d));

        // == comparação em java com operadores lógicos
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
        // var diaCorrenteEntreDataInicialEFinal = diaCorrente >= inicial && diaCorrente
        // <= dataFinal;

        // var inicial = 1;
        // var diaFinal = 30;
        // var diaCorrente = 15;
        // var diaCorrenteEntreDataInicialEFinal = diaCorrente >= inicial && diaCorrente
        // <= diaFinal;
        // System.out.println(diaCorrenteEntreDataInicialEFinal);

        // === conticionais
        // int valorTotal2 = 101;
        // if(valorTotal2 > 100){
        // System.out.println("Seu pedido foi maior que R$ 100 e você terá um desconto
        // na proxima");
        // System.out.println("Seu pedido foi maior que R$ 100 e você terá um desconto
        // na proxima");
        // }

        // if(valorTotal2 > 100) System.out.println("Seu pedido foi maior que R$ 100 e
        // você terá um desconto na proxima");

        // === ternário
        // var resultado = "Padrão";
        // resultado = valorTotal2 > 100 ? "Foiii verdade" : "";
        // System.out.println(resultado);

        // System.out.println("==============[ Calculo produto/cliente
        // ]===================");
        // System.out.println("Olá João seja muito bem vindo, vamos começar?");

        // System.out.println("Digite o nome do seu cliente: ");
        // var nome = reader.readLine();

        // System.out.println("Digite o endereço do seu cliente: ");
        // var endereco = reader.readLine();

        // System.out.println("Digite o nome do produto: ");
        // var produto = reader.readLine();

        // System.out.printf("Digite o valor do produto (%s): ", produto);
        // var valor = Double.parseDouble(reader.readLine());

        // System.out.printf("Digite a quantidade do produto (%s): ", produto);
        // var quantidade = Integer.parseInt(reader.readLine());

        // var valorTotal = valor * quantidade;

        // System.out.println("-----------------------------");
        // System.out.printf("Cliente: %s \n", nome);
        // System.out.printf("Endereço de entrega: %s \n", endereco);
        // System.out.printf("Comprou o material: %s no valor de R$ %s \n", produto,
        // valor);
        // System.out.printf("O valor total da compra deu: R$ %.2f \n", valorTotal);

        // if(valorTotal > 100){
        // System.out.println("Seu pedido foi maior que R$ 100 e você terá um desconto
        // na proxima");
        // }

        // System.out.println("-----------------------------");

        // System.out.printf("Digite um valor \n");
        // var valorString = reader.readLine();
        // valorString = valorString.replace(".", "");
        // valorString = valorString.replace(",", ".");
        // var valor = Double.parseDouble(valorString);

        // Locale localeBR = new Locale( "pt", "BR" );
        // NumberFormat dinheiroBR = NumberFormat.getCurrencyInstance(localeBR);
        // System.out.printf("O valor total da compra deu: R$ %s \n",
        // dinheiroBR.format(valor));

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
         * // Luiz
         * System.out.println("Digite um numero X");
         * int numeroX = Integer.parseInt(reader.readLine());
         * System.out.println("Digite um numero Y");
         * int numeroY = Integer.parseInt(reader.readLine());
         * 
         * var resultado = (numeroX * 8 + numeroY) - numeroX + numeroY / 100;
         * 
         * System.out.println("o resutado da expressão é: " + resultado);
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
         * System.out.println("Lá vai a resposta então: " + resposta);
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
         * System.out.println("O resultado é: " + resultado);
         */

        /*
         * // professor
         * System.out.println("==============================");
         * System.out.println("Olá João, seja muito bem vindo");
         * System.out.println("==============================");
         * System.out.println("João percebi que você quer resolver esta operação:");
         * System.out.println("(x * 8 + y) - x + y / 100");
         * System.out.
         * println("Para isso preciso que o senhor digite o valor de x e de y, então:");
         * System.out.println("Digite o valor de x");
         * int x = Integer.parseInt(reader.readLine());
         * System.out.println("Digite o valor de y");
         * int y = Integer.parseInt(reader.readLine());
         * var operacao = (x * 8 + y) - x + y / 100;
         * 
         * System.out.println("João já fiz o calculo e o resultado da operação: ");
         * System.out.println("(" + x + " * 8 + " + y + ") - " + x + " + " + y +
         * " / 100");
         * System.out.println("Foi: " + operacao);
         */

        /*
         * System.out.println("Digite um número");
         * int numero = Integer.parseInt(reader.readLine());
         * var resultado = numero + 1000;
         * System.out.println("O resultado de (" + numero + ") + 1000 é de : " +
         * resultado);
         */

        /*
         * // mostre()
         * System.out.println("Digite o seu nome");
         * 
         * // leia()
         * var nome = reader.readLine();
         * 
         * // mostre() mostrando dados concatenando variável nome capturada
         * System.out.println("O nome digitado foi: " + nome);
         */

        /*
         * String name = reader.readLine();
         * 
         * int numero1 = 3;
         * var numero2 = 5;
         * 
         * int soma = numero1 + numero2;
         * 
         * // mostre() # mostra informação na tela
         * System.out.println( "O resultado da operação é " + soma );
         */
    }
}
