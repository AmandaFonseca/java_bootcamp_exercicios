package com.amanda.cursoJava.aula16;

public class Usuario {
    String nome;
    String email;
    String senha;
    String cargo;
    boolean administrador = false;
    boolean logado = false;

    public Usuario(String nome, String email, String senha, String cargo, boolean logado, boolean administrador) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.cargo = cargo;
        this.logado = logado;
        this.administrador = administrador;
    }

    public boolean realizaLogin(String user, String senha) {
        if (this.nome.equals(user) && this.senha.equals(senha)) {
            this.logado = true;
            System.out.println("Login realizado!");
        } else {
            System.out.println("Usuário ou senha incorretos.");
        }
        return this.logado;
    }

    public void realizaLogoff() {
        this.logado = false;
        System.out.println("Logoff efetuado.");
    }

    public void alterarDados(String novoNome, String novoEmail) {
        if (!logado) {
            System.out.println("Erro: Você precisa estar logado para alterar dados.");
            return;
        }

        if (novoNome != null && !novoNome.isEmpty()) {
            this.nome = novoNome;
        }
        if (novoEmail != null && !novoEmail.isEmpty()) {
            this.email = novoEmail;
        }
        System.out.println("Dados atualizados com sucesso!");
    }

    public boolean alterarSenha(String senhaAtual, String novaSenha) {
        if (!logado) {
            System.out.println("Erro: Você precisa estar logado para alterar a senha.");
            return false;
        }

        if (this.senha.equals(senhaAtual)) {
            if (novaSenha != null && novaSenha.length() >= 6) {
                this.senha = novaSenha;
                System.out.println("Senha alterada com sucesso!");
                return true;
            } else {
                System.out.println("Erro: A nova senha deve ter pelo menos 6 caracteres.");
            }
        } else {
            System.out.println("Erro: Senha atual incorreta.");
        }
        return false;
    }

    public String get_nome() {
        return nome;
    }

    public void set_nome(String nome) {
        this.nome = nome;
    }

    public String get_email() {
        return email;
    }

    public void set_email(String email) {
        this.email = email;
    }

    public String get_senha() {
        return senha;
    }

    public void set_senha(String senha) {
        this.senha = senha;
    }

    public boolean is_logado() {
        return logado;
    }

    public boolean is_administrador() {
        return administrador;
    }

    public void set_administrador(boolean administrador) {
        this.administrador = administrador;
    }

    public String toString() {
        return "Nome: " + nome + " - email: " + email + " - cargo: " + cargo + " - administrador: " + administrador;
    }

}
