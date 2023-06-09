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

        String[] opcoes = {"1 - Dado", "2 - Farmacia", "3 - Senha", "4 - Frase Invertida", "5 - Verifica Conteúdo da Frase", "6 - Frase sem último caracter", "7 - Número elevado a potência", "8 - Conversão de radianos em grau", "Sair"};

        do {
            escolha = (String) JOptionPane.showInputDialog(null, "Escolha o exercício: ", "Exercícios", JOptionPane.QUESTION_MESSAGE, null, opcoes, "1 - Dado");

            switch (escolha) {
                case "Sair":
                    escolha = "";
                    JOptionPane.showMessageDialog(null, "Saindo da aplicação", "Sair", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "1 - Dado":
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
                    JOptionPane.showMessageDialog(null, "Exercício não existe: ");
            }
        } while (escolha != "");
    }


}