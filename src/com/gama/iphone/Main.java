package com.gama.iphone;

import com.gama.iphone.aparelho.Iphone;
import com.gama.iphone.som.ReprodutorMusical;
import com.gama.iphone.web.Navegador;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        ReprodutorMusical rp = new ReprodutorMusical();
        Navegador navegador = new Navegador();

        System.out.println(iphone.atender());
        rp.selecionarMusica("Saudade");
        System.out.println(rp.tocar());
        System.out.println(navegador.adicionarNovaAba());
    }
}
