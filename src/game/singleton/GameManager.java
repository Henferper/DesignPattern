package game.singleton;

import game.entities.Heroi;
import game.entities.Monstro;
import game.factory.EntityFactory;

import java.util.Scanner;

public class GameManager {
    private static GameManager instance;

    private GameManager() {}

    public static GameManager getInstance() {
        if (instance == null) {
            instance = new GameManager();
        }
        return instance;
    }

    public void startGame() {
        Scanner in = new Scanner(System.in);

        Heroi heroi = EntityFactory.createHero();
        Monstro monstro = EntityFactory.createMonster();

        heroi.getStatus();
        monstro.getStatus();
        System.out.println("A distancia entre Você e o monstro é de " + Math.abs(heroi.getPosicao() - monstro.getPosicao()));
        System.out.println("Vida do HEROI: " + heroi.getVida() + "hp e MONSTRO: " + monstro.getVida() + "hp\n");

        while (true) {
            Heroi.mostrarDado();
            if (Math.abs(monstro.getPosicao() - heroi.getPosicao()) >= 4) {
                monstro.setInvestida();
                monstro.terminalInvestida();
            } else {
                monstro.setDano();
                heroi.setSofrerDano(monstro.setDano());
                monstro.terminalDano();
            }
            System.out.println("A distancia entre Você e o monstro é de " + Math.abs(heroi.getPosicao() - monstro.getPosicao()));
            System.out.println("Vida do HEROI: " + heroi.getVida() + "hp e MONSTRO: " + monstro.getVida() + "hp\n");

            if (heroi.getVida() <= 0 || monstro.getVida() <= 0) {
                break;
            }
            System.out.println("SUA AÇÃO:\n1. Causar Dano\n2. Afastar com Salto");
            int entrada = in.nextInt();
            switch (entrada) {
                case 1:
                    Heroi.mostrarDado();
                    Heroi.setDano();
                    monstro.setVidaAtual(Heroi.setDano());
                    heroi.terminalDano();
                    System.out.println(" ");
                    break;
                case 2:
                    Heroi.mostrarDado();
                    Heroi.setPosicao();
                    heroi.terminalSalto();
                    System.out.println(" ");
                    break;
                default:
                    System.out.println("Ação inválida. Tente novamente.");
            }
            if (heroi.getVida() <= 0 || monstro.getVida() <= 0) {
                break;
            }
            System.out.println("================================");
        }
        if (heroi.getVida() <= 0)
            System.out.println("HEROI MORREU");
        else if (monstro.getVida() <= 0)
            System.out.println("MONSTRO MORREU");
    }
}
