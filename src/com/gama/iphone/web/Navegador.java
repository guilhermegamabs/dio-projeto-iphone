package com.gama.iphone.web;

public class Navegador implements Internet{
    @Override
    public String exibirPagina() {
        return "Exibir Página no Navegador";
    }

    @Override
    public String adicionarNovaAba() {
        return "Adicionar Nova Aba no Navegador";
    }

    @Override
    public String atualizarPagina() {
        return "Atualizar Página";
    }
}
