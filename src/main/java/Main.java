package src.main.java;

import javax.swing.JOptionPane;

import src.main.java.calculadora.Calculadora;

public class Main {
    public static void main(String[] args) {
        String opcao = "";
        Calculadora calc = new Calculadora();

        while (!opcao.equals("9")) {
            opcao = JOptionPane.showInputDialog("1 - Leitura \\n 2 - Adição \\n 3 - Subtração \\n 4 - Multiplicação \\n 5 - Divisão \\n 9 - Sair");

            switch (Integer.parseInt(opcao)) {
                case 1: {
                    calc.setValorA(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor A: ")));
                    calc.setValorB(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor B: ")));
                    break;
                }
                case 2: {
                    JOptionPane.showMessageDialog(null, "Soma: " + calc.getSoma());
                    break;
                }
                case 3: {
                    JOptionPane.showMessageDialog(null, "Diferença: " + calc.getDiferenca());
                    break;
                }
                case 4: {
                    JOptionPane.showMessageDialog(null, "Produto: " + calc.getProduto());
                    break;
                }
                case 5: {
                    JOptionPane.showMessageDialog(null, "Quociente: " + calc.getQuociente());
                    break;
                }
            }
        }
    }
}