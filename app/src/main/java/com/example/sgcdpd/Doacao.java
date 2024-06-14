package com.example.sgcdpd;

public class Doacao {
    private int doacao_id;
    private int tipo_doacao_id;
    private String item;
    private int quantidade;
    private String descricao;
    private String status;


    public Doacao(int doacao_id, int tipo_doacao_id, String item, int quantidade, String descricao, String status){
        this.doacao_id = doacao_id;
        this.tipo_doacao_id = tipo_doacao_id;
        this.item = item;
        this.quantidade = quantidade;
        this.descricao = descricao;
        this.status = status;
    }

    public int getDoacaoId() {
        return doacao_id;
    }

    public int getTipoDoacaoId() {
        return tipo_doacao_id;
    }

    public String getItem() {
        return item;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getStatus() {
        return status;
    }
}
