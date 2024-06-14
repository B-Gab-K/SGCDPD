package com.example.sgcdpd;

public class user {
    private int user_id;
    private int tipo_user_id;
    private String nome;
    private String email;
    private String senha;


    public user(int user_id, int tipo_user_id,String nome, String email, String senha){
        this.user_id = user_id;
        this.tipo_user_id = tipo_user_id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public int getUser_id() {
        return user_id;
    }

    public int getTipo_user_id() {
        return tipo_user_id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
}
