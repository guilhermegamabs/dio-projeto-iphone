package com.gama.iphone.aparelho;

public class Iphone implements Celular{

    @Override
    public String ligar() {
        return "Ligando do Iphone 11";
    }

    @Override
    public String atender() {
        return "Atentendendo do Iphone 11";
    }

    @Override
    public String iniciarCorreioVoz() {
        return "Iniciando Correio de Voz pelo Iphone 11";
    }
}
