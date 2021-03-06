package br.darlianemendes.heranca;

public class Jogo {

    public static void main (String [] args){

        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 10;

        Heroi heroi = new Heroi();
        monstro.x = 10;
        monstro.y = 11;

        System.out.println(" Montro tem => " + monstro.vida);
        System.out.println(" Heroi tem => " + heroi.vida);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.andar(Direcao.NORTE);
        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println(" Montro tem => " + monstro.vida);
        System.out.println(" Heroi tem => " + heroi.vida);

    }
}
