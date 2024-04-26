package br.com;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;

    }

    public void calcularBonificacao() {
        var valorBonificacao = switch (tipoBonificacao(salario)) {
            case BonificacaoEnum.ESTAGIARIO -> calculoBonificacao(BonificacaoEnum.ESTAGIARIO, salario);
            case BonificacaoEnum.CLT -> calculoBonificacao(BonificacaoEnum.CLT, salario);
            case BonificacaoEnum.SOBRINHO -> calculoBonificacao(BonificacaoEnum.SOBRINHO, salario);
            default -> calculoBonificacao(BonificacaoEnum.CHEFE, salario);
        };

        System.out.println("Salario atual: " + salario);
        System.out.printf("Porcentagem do bonus: %d%%\n", tipoBonificacao(salario).getInstance());
        System.out.printf("Valor bonificado: %.2f\n", valorBonificacao);
        System.out.printf("Valor ajustado: %.2f\n", (valorBonificacao + salario));
        System.out.println("*".repeat(80));
    }


    public String getNome() {
        return nome;
    }

    public static double calculoBonificacao(BonificacaoEnum bonificacao, double salario) {
        return salario * (bonificacao.getInstance() / 100.0);
    }

    public static BonificacaoEnum tipoBonificacao(double salario) {

        if (salario <= 280.00) {
            return BonificacaoEnum.ESTAGIARIO;
        }
        if (salario < 700) {
            return BonificacaoEnum.CLT;
        }
        if (salario < 1200) {
            return BonificacaoEnum.SOBRINHO;
        }

        return BonificacaoEnum.CHEFE;
    }
}
