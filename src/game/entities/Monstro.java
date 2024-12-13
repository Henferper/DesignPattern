package game.entities;

import game.observer.Subject;

public class Monstro extends Subject {
    private String nome = "Hydra";
    private int vida = 90;
    private int dano = 12;
    private int investida = 3;
    private int alcance = 4;
    private int posicao = 10;

    public void getStatus() {
        System.out.println("\nNome: " + nome);
        System.out.println("Vida: " + vida + " hp");
        System.out.println("Dano: " + dano);
        System.out.println("Alcance: " + alcance);
        System.out.println("Investida: " + investida + "\n");
    }

    public int getPosicao() {
        return posicao;
    }

    public int setInvestida() {
        this.posicao -= getInvestida();
        return posicao;
    }

    public int getInvestida() {
        return Heroi.dado >= 15 ? 6 : 3;
    }

    public int setDano() {
        return Heroi.dado >= 15 ? 15 : 12;
    }

    public void terminalDano() {
        System.out.println("O monstro causou dano de " + setDano());
    }

    public void terminalInvestida() {
        System.out.println("O monstro deu uma Investida de " + getInvestida());
    }

    public int getVida() {
        return vida;
    }

    public int setVidaAtual(int danoHeroi) {
        vida -= danoHeroi;
        notifyObservers("Monstro sofreu dano de " + danoHeroi);
        return vida;    }
}

