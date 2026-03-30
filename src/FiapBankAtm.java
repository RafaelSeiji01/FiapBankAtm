import java.util.Scanner;

public class FiapBankAtm {

    public static void main (String[] args) {

        String nomeCopleto;
        int escolhaInicial;
        int escolhaMenuPrincipal;
        int contadorDeErro = 3;
        String primeiroNome;
        String nomeUser;
        String senhaUsuario;
        String regex ="^(?=.*[0-9])(?=.*[A-Z])(?=.*[!@#$%^&*()\\\\-_+=?><]).{8,}$";
        String confimarSenha;
        double depositar = 0;
        double sacar = 0;
        double saldo = 0;
        //Z7#pQ2!x

        String nomeSalvo = "";
        String senhaSalvo = "";

        Scanner input = new Scanner(System.in);

        //logica para repetir o menu inicial
        while (true) {

            System.out.println("\n---------------------------------------------");
            System.out.println("          [ Bem vindo ao FiapBankAtm! ]");
            System.out.println();
            System.out.println(" [ 1 ]   Cadastrar nova conta");
            System.out.println(" [ 2 ]   Logar conta ja existente");
            System.out.println(" [ 3 ]   Sair");
            System.out.println("\n---------------------------------------------");
            System.out.print("  >> Digite sua opção: ");
            escolhaInicial = input.nextInt();
            input.nextLine();

            //Switch para tomada de decisão
            switch (escolhaInicial) {
                case 1 :
                    System.out.println("\n---------------------------------------------");
                    System.out.println("Para começar uma conta preencha as seguintes informações");

                    System.out.print("Digite aqui o seu nome completo:");
                    nomeCopleto = input.nextLine();

                    //Metodo para limpar espaços em brancos antes e depois do nome
                    String NomeCompletoLimpo = "'" + nomeCopleto.trim() + "'";

                    //Metodo para obter o primeiro nome do usurio
                    primeiroNome = nomeCopleto.trim().split(" ")[0];

                    nomeUser = primeiroNome;

                    System.out.println();
                    System.out.println("*----------------------------------------------*");
                    System.out.println("         [ Bem vindo " + primeiroNome + " ao FiapBankAtm ! ]");
                    System.out.println("*----------------------------------------------*");
                    System.out.println("Crie um senha forte para a sua conta!");

                    //Repetição para criação de senha forte
                    while ( true) {

                        System.out.println("---------------------------------------------");
                        System.out.println("A senha deve conter : \n" +
                                "+ No mínimo 8 caracteres. \n" +
                                "+ Ao menos um número. \n" +
                                "+ Ao menos uma letra maiúscula. \n" +
                                "+ Ao menos um caracter especial");
                        System.out.println("\n---------------------------------------------");
                        System.out.print("Sua senha aqui: ");
                        senhaUsuario = input.nextLine();

                        //verifica as regras de senha
                        if (senhaUsuario.matches(regex)) {

                            //logica de repetiçao para confirmação de senha
                            while (true) {

                                System.out.print("Confirme a sua senha: ");
                                confimarSenha = input.nextLine();

                                if (senhaUsuario.equals(confimarSenha)) {

                                    System.out.println("\n---------------------------------------------");
                                    System.out.println("           conta criada com sucesso!");
                                    nomeSalvo = nomeCopleto;
                                    senhaSalvo = senhaUsuario;
                                    break;
                                } else {
                                    System.out.println("Senha incorreta");
                                }

                            }
                            break;

                        } else {
                            System.out.println("Erro ao criar senha");
                        }


                    }
                    break;

                case 2:

                    while (contadorDeErro > 0) {

                        System.out.print("Digite o nome registrado: ");
                        String nomeLogin = input.nextLine();

                        System.out.print("Digite sua senha: ");
                        String senhaLogin = input.nextLine();

                        if (nomeLogin.equals(nomeSalvo) && senhaLogin.equals(senhaSalvo)) {
                            System.out.println("Login realizado com sucesso!");

                            //Repetição para o menu principal
                            while (true) {

                                System.out.println("\n---------------------------------------------");
                                System.out.printf("\n Olá,%s !", nomeSalvo);
                                System.out.println(" O que você deseja fazer hoje?");
                                System.out.println();

                                System.out.println("  [ 1 ]  CONSULTAR SALDO");
                                System.out.println("  [ 2 ]  REALIZAR DEPÓSITO");
                                System.out.println("  [ 3 ]  REALIZAR SAQUE");
                                System.out.println("  [ 4 ]  SAIR DO SISTEMA");

                                System.out.println("\n---------------------------------------------");
                                System.out.print(" >> Digite sua opção: ");
                                escolhaMenuPrincipal = input.nextInt();

                                //Switch para o menu principal da aplicação
                                switch (escolhaMenuPrincipal) {
                                    case 1 :

                                        System.out.println("\n=============================================");
                                        System.out.println("           EXTRATO DE CONTA CORRENTE         ");
                                        System.out.println("=============================================");
                                        System.out.println(" CLIENTE: " + nomeLogin.toUpperCase());
                                        System.out.println(" STATUS DA CONTA: [ ATIVA ]");
                                        System.out.println("---------------------------------------------");
                                        System.out.println("");
                                        System.out.println("  SALDO DISPONÍVEL: ");
                                        System.out.printf("  R$ %,.2f%n", saldo);
                                        System.out.println("");
                                        System.out.println("Pressione qualquer tecla para voltar...");
                                        input.nextLine();
                                        input.nextLine();
                                        break;
                                    case 2 :

                                        while (true) {
                                            System.out.println("\n=============================================");
                                            System.out.println("           Depositar na conta                ");
                                            System.out.println("=============================================");
                                            System.out.println(" CLIENTE: " + nomeLogin.toUpperCase());
                                            System.out.println(" STATUS DA CONTA: [ ATIVA ]");
                                            System.out.println("---------------------------------------------");
                                            System.out.println("");
                                            System.out.print("  Valor a depositar na conta: R$ ");
                                            depositar = input.nextDouble();

                                            if (depositar <= 0) {
                                                System.out.println("Valor igual ou menor que zero, impossivel fazer o deposito");

                                            } else {
                                                System.out.println("Deposito realizado!");
                                                saldo += depositar;
                                                break;
                                            }

                                        }
                                        break;

                                    case 3 :

                                        while (true) {

                                            System.out.println("\n=============================================");
                                            System.out.println("           EXTRATO DE CONTA CORRENTE         ");
                                            System.out.println("=============================================");
                                            System.out.println(" CLIENTE: " + nomeLogin.toUpperCase());
                                            System.out.println(" STATUS DA CONTA: [ ATIVA ]");
                                            System.out.println("---------------------------------------------");
                                            System.out.println("");
                                            System.out.print("  Valor a sacar : R$");
                                            sacar = input.nextDouble();

                                            //verificador se o valor a sacar é zero ou menor
                                            if (sacar > 0) {

                                                //verifica se há dinheiro a ser sacado na conta
                                                if (saldo < sacar) {
                                                    System.out.println("Sem saldo disponivel para sacar");

                                                } else {
                                                    System.out.printf("Valor de R$%.2f sacado com Sucesso!",sacar);
                                                    saldo -= sacar;
                                                    break;
                                                }

                                            } else if (sacar == 0) {
                                                System.out.println("Saindo...");
                                                break;

                                            } else {
                                                System.out.println("Valor igual ou menor que zero, impossivel fazer o deposito");
                                            }

                                        }
                                        break;

                                    case 4 :
                                        System.out.println("O FIAP Bank agradece sua preferência!");
                                        return;
                                    default:
                                        System.out.println("Erro ao digitar opção");
                                        break;
                                }

                            }

                        } else {

                            contadorDeErro--;

                            System.out.println("Nome ou senha incorretos!");

                            if (contadorDeErro > 0) {
                                System.out.printf("Tentativas restantes: %d\n", contadorDeErro);
                            } else {
                                System.out.println("ACESSO BLOQUEADO");
                            }
                        }

                    }


                case 3 :
                    System.out.println("O FIAP Bank agradece sua preferência!");
                    return;
                default:

                    System.out.println("Escolha não identificada");
                    break;
            }

        }


    }
}
