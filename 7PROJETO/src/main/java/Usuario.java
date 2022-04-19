import javax.swing.*;

public class Usuario {

    public static void main(String[] args) {
        double quantidade;

        Conta conta1 = new Conta();
        conta1.setSaldo(100);

        conta1.titular = JOptionPane.showInputDialog(null, "informe o nome do titular");
        conta1.numero = Integer.parseInt(JOptionPane.showInputDialog(null, "informe o numero da conta"));

        quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "informe o valor do saque"));

        boolean consegui = conta1.saque(quantidade);
        if (consegui) {
            JOptionPane.showMessageDialog(null, conta1.titular + " consegui efetuar o saque , saldo da conta agora é de " + conta1.getSaldo());
        } else {
            JOptionPane.showMessageDialog(null, conta1.titular + " não consegui efetuar o saque, saldo da conta agora é de " + conta1.getSaldo());
        }

        Conta conta2 = new Conta();
        conta2.setSaldo(200);
        conta2.titular = JOptionPane.showInputDialog(null, "informe o nome do titular");
        conta2.numero = Integer.parseInt(JOptionPane.showInputDialog(null, "informe o numero da conta"));

        quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "informe o valor do saque"));

        boolean consegui2 = conta2.saque(quantidade);
        if (consegui) {
            JOptionPane.showMessageDialog(null, conta2.titular + " consegui efetuar o saque , saldo da conta agora é de " + conta2.getSaldo());
        } else {
            JOptionPane.showMessageDialog(null, conta2.titular + "não consegui efetuar o saque, saldo da conta agora é de " + conta2.getSaldo());
        }

    }

}
