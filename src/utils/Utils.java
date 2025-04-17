package utils;

import main.Controle;
import models.Empregado;
import models.EmpregadoComissionado;
import models.EmpregadoHorista;

import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

import java.util.Scanner;

public class Utils {
    private Controle controle = new Controle();

    public void menu() {
        Scanner sc = new Scanner(System.in);

        String aux = "1. Cadastrar\n2. Pesquisar\n3. Listar\n 4. Finalizar";
        int opcao;
        do {
            System.out.println(aux);
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    pesquisar();
                    break;
                case 3:
                    listar();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Valor inválido!");
            }
        } while (opcao != 4);

    }

    private void listar() {
        showMessageDialog(null, controle.listar());
    }

    private void pesquisar() {
        int matricula = parseInt(showInputDialog("Qual a matricula"));
        Empregado e = controle.pesquisar(matricula);
        if (e == null) {
            showMessageDialog(null, "Empregado não encontrado");
        } else {
            showMessageDialog(null, e);
        }
    }

    private void cadastrar() {
        int matricula;
        String nome;
        int totalDeHorasTrabalhadas, valorDaHoraTrabalhada;
        double totalDeVendas, comissao;
        String aux = "1. Empregado horista\n2. Empregado comissionado\n3. Sair.";
        int opcao;

        while (true) {
            opcao = parseInt(showInputDialog(aux));
            if (opcao == 3) return;

            if (opcao == 1 || opcao == 2) {
                nome = showInputDialog("Digite o nome: ");
                matricula = parseInt(showInputDialog("Digite a matricula: "));
                if (opcao == 1) {
                    totalDeHorasTrabalhadas = parseInt(showInputDialog("Quantas horas trabalhadas: "));
                    valorDaHoraTrabalhada = parseInt(showInputDialog("Digite o valor da hora: "));
                    controle.inserir(new EmpregadoHorista(nome,
                            matricula,
                            totalDeHorasTrabalhadas,
                            valorDaHoraTrabalhada));
                } else {
                    totalDeVendas = parseDouble(showInputDialog("Total de vendas: "));
                    comissao = parseDouble(showInputDialog("´% de comissão: "));

                    controle.inserir(new EmpregadoComissionado(nome,
                            matricula,
                            totalDeVendas,
                            comissao));
                }

            }
        }

    }
}
