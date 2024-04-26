package br.com;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Joao", 290.00);
        Funcionario funcionario2 = new Funcionario("Ana", 1500.0);
        Funcionario funcionario3 = new Funcionario("Joao", 699.0);
        Funcionario funcionario4 = new Funcionario("Joao", 1200);


        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);
        funcionarios.add(funcionario3);
        funcionarios.add(funcionario4);

        for(Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome());

            funcionario.calcularBonificacao();

        }

    }


}

