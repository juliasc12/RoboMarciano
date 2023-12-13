package com.example.marciano;

public class MarcianoPremium extends MarcianoAvancado {
    private final MarcianoInterface acao;

    public MarcianoPremium(MarcianoInterface acao) {
        this.acao = acao;
    }

    @Override
    public String responda(String comando) {
        if ("agir".equalsIgnoreCase(comando)) {
            return "É pra já!\n" + acao.agir();
        } else {
            return super.responda(comando).toString();
        }
    }
}
