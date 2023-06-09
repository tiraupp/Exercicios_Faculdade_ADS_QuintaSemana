import javax.swing.*;

public class Senha {
    public int digitos;
    public String senha = new String();

    public Senha() {
    }


    public void sorteiaQtdadeDigitos(){
        digitos = (int) Math.round(Math.random() * 5 + 5);
    }

    public void criaSenha() {
        sorteiaQtdadeDigitos();
        senha = "";
        int i;
        for (i=0;i<digitos;i++) {
            senha = senha + (int) Math.round(Math.random() * 9);
        }
    }

    public void senhaCriada() {
        criaSenha();
        JOptionPane.showMessageDialog(null,"Senha foi gerda com "+digitos+" digitos: "+senha, "Senha", JOptionPane.INFORMATION_MESSAGE);

    }
}
