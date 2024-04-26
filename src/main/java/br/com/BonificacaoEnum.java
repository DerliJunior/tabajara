package br.com;

public enum BonificacaoEnum {
    ESTAGIARIO(5),
    CLT(10),
    SOBRINHO(15),
    CHEFE(20);

    private final int bonificacao;

    BonificacaoEnum(int valor) {
        this.bonificacao = valor;
    }

    public int getInstance() {
        return bonificacao;
    }



}
