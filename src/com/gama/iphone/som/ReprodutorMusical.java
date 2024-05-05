package com.gama.iphone.som;

public class ReprodutorMusical implements Musica{
    private String musica;

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    @Override
    public String tocar() {
        return "Tocar: " + getMusica();
    }

    @Override
    public String pausar() {
        return "Pausar: " + getMusica();
    }

    @Override
    public void selecionarMusica(String musica) {
        this.setMusica(musica);
    }
}
