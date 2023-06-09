import javax.swing.*;
import java.util.Scanner;

import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        String escolha;

        Dado dado = new Dado();
        Farmacia farmacia = new Farmacia();
        Senha senha = new Senha();
        FraseInvertida fraseInvertida = new FraseInvertida();
        FraseLiberada fraseLiberada = new FraseLiberada();
        FraseSemUltimoCaracter fraseSemUltimoCaracter = new FraseSemUltimoCaracter();
        ElevarPotencia elevarPotencia = new ElevarPotencia();
        RadianosEmGrau radianosEmGrau = new RadianosEmGrau();

        String [] opcoes = {"1 - Dados", "2 - Farmacia", "3 - Senha", "4 - Frase Invertida", "5 - Verifica Conteúdo da Frase", "6 - Frase sem último caracter", "7 - Número elevado a potência", "8 - Conversão de radianos em grau", "Sair"};

        do {
            escolha = (String) JOptionPane.showInputDialog( null , "Escolha o exercicio: " , "Exercicios" , JOptionPane.QUESTION_MESSAGE , null , opcoes, "1 - Dados");

            switch (escolha) {
                case "Sair":
                    escolha = "";
                    JOptionPane.showMessageDialog(null,"Saindo da aplicação", "Sair", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "1 - Dados":
                    dado.mostrarJogada();
                    break;
                case "2 - Farmacia":
                    farmacia.atualizaValor();
                    break;
                case "3 - Senha":
                    senha.senhaCriada();
                    break;
                case "4 - Frase Invertida":
                    fraseInvertida.fraseReversa();
                    break;
                case "5 - Verifica Conteúdo da Frase":
                    fraseLiberada.verificaConteudo();
                    break;
                case "6 - Frase sem último caracter":
                    fraseSemUltimoCaracter.removeUltimoCaracter();
                    break;
                case "7 - Número elevado a potência":
                    elevarPotencia.calcularPotencia();
                    break;
                case "8 - Conversão de radianos em grau":
                    radianosEmGrau.conversaoRadianosEmGrau();
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Exercício não existe: ");
            }
        } while (escolha != "");
    }


    public static void desconto(){
        Scanner sc = new Scanner(System.in);
        float valorProduto, percentualDesconto, desconto;

        System.out.println("Informe o valor do produto: ");
        valorProduto = sc.nextFloat();
        System.out.println("Informe o percentual de desconto: ");
        percentualDesconto = sc.nextFloat();
        desconto = (valorProduto * percentualDesconto) / 100;
        System.out.println(" ");
        System.out.println("O valor de desconto é: R$" + desconto);
        System.out.println("O valor do produto com desconto: R$" + (valorProduto - desconto));
    }



    public static void itbi(){
        float valorVenal, valorTransacao, maiorValor, percentualImposto, imposto;
        valorVenal = parseFloat(JOptionPane.showInputDialog("Informe o valor venal do bem "));
        valorTransacao = parseFloat(JOptionPane.showInputDialog("Informe o valor negociado "));
        percentualImposto = parseFloat(JOptionPane.showInputDialog("Informe o percentual de imposto "));
        if(valorVenal > valorTransacao) {
            maiorValor = valorVenal;
        } else {
            maiorValor = valorTransacao;
        }
        imposto = maiorValor * percentualImposto / 100;
        JOptionPane.showMessageDialog(null,"O valor do ITBI a ser recolhido é de : R$" + imposto);
    }

    public static void mediaNotas(){
        float notaProva1, notaProva2, notaTrabalho, media;

        notaProva1 = parseFloat(JOptionPane.showInputDialog("Informe a nota da primeira prova"));
        notaProva2 = parseFloat(JOptionPane.showInputDialog("Informe a nota da segunda prova"));
        notaTrabalho = parseFloat(JOptionPane.showInputDialog("Informe a nota do trabalho"));
        media = (notaProva1+notaProva2+notaTrabalho)/3;
        if(media > 6) {
            JOptionPane.showMessageDialog(null,"O aluno foi Aprovado com média " + media);
        } else {
            JOptionPane.showMessageDialog(null,"O aluno foi Reprovado com média " + media);
        }

    }

    public static void aposentadoria() {
        int idade, tempoContribuicao, sexo, tempoRestante, idadeRestante;

        idade = parseInt(JOptionPane.showInputDialog("Informe a idade"));
        tempoContribuicao = parseInt(JOptionPane.showInputDialog("Informe o tempo de contribuição previdenciaria"));
        do {
            sexo = parseInt(JOptionPane.showInputDialog("Informe o sexo: 1 - Masculino / 2 - Feminino"));
            switch (sexo) {
                case 1:
                    if (tempoContribuicao < 35) {
                        if (idade < 65) {
                            tempoRestante = 35 - tempoContribuicao;
                            idadeRestante = 65 - idade;
                            if (tempoRestante < idadeRestante) {
                                JOptionPane.showMessageDialog(null, "Restam " + tempoRestante + " anos de contribuição para se aposentar, você estará com " + (tempoRestante + idade) + " anos de idade!");
                            } else {
                                JOptionPane.showMessageDialog(null, "Restam " + idadeRestante + " anos para se aposentar por idade, com 65 anos!");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Você já tem o direito a aposentadoria por idade.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Você já tem o direito a aposentadoria por tempo de contribuição.");
                    }
                    sexo = 0;
                    break;
                case 2:
                    if (tempoContribuicao < 30) {
                        if (idade < 60) {
                            tempoRestante = 30 - tempoContribuicao;
                            idadeRestante = 60 - idade;
                            if (tempoRestante < idadeRestante) {
                                JOptionPane.showMessageDialog(null, "Restam " + tempoRestante + " anos de contribuição para se aposentar, você estará com " + (tempoRestante + idade) + " anos de idade!");
                            } else {
                                JOptionPane.showMessageDialog(null, "Restam " + idadeRestante + " anos para se aposentar por idade, com 65 anos!");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Você já tem o direito a aposentadoria por idade.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Você já tem o direito a aposentadoria por tempo de contribuição.");
                    }
                    sexo = 0;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Sexo informado inválido, tente novamente!");
                    break;
            }

        } while (sexo != 0);
    }

    public static void resistencia(){
        float [] resistecias = new float[4];
        float maiorResistecia = 0, menorResistencia = 1000000, total = 0;
        int i;

        for(i=0;i<resistecias.length;i++){
            resistecias[i] = parseFloat(JOptionPane.showInputDialog("Informe o valor da resistência "+(i+1)));
        }
        for (i=0;i<resistecias.length;i++) {
            total = total + resistecias[i];
            if (resistecias[i] > maiorResistecia) {
                maiorResistecia = resistecias[i];
            }
            if (resistecias[i] < menorResistencia) {
                menorResistencia = resistecias[i];
            }
        }
        JOptionPane.showMessageDialog(null,"A soma da resistência em séria é: " + total + "\na menor resistência: " + menorResistencia + "\na maior resistência: " + maiorResistecia );
    }

    public static void login(){
        String loginOriginal = "java8", senhaOriginal = "java8";
        String loginDigitado, senhaDigitada;
        int tentativas = 3;
        do {
            loginDigitado = JOptionPane.showInputDialog("Informe o login");
            senhaDigitada = JOptionPane.showInputDialog("digite sua senha");
            if (loginDigitado.equals(loginOriginal) && senhaDigitada.equals(senhaOriginal)) {
                JOptionPane.showMessageDialog(null,"Login efetuado com sucesso!");
                break;
            } else {
                tentativas --;
                JOptionPane.showMessageDialog(null,"Login ou senha digitados estão incorretos! Você possui mais " + tentativas + " tentativas. ");
            }
        } while (tentativas > 0);
    }

    public static void tabuada() {
        int valor, i;
        String tabuadaPronta = "";
        valor = parseInt(JOptionPane.showInputDialog("Informe qual número deseja a tabuada: "));
        tabuadaPronta = ("Tabuada do número " + valor + "\n");
        for (i = 1; i <= 10; i++) {
            tabuadaPronta = tabuadaPronta + (valor + " X " + i + " = " + (valor * i) + "\n");
        }
        JOptionPane.showMessageDialog(null, tabuadaPronta);
    }

}
