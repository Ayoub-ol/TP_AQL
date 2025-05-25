package TP02.ex04;

public interface InterfaceJeu {
    void jouer(Joueur joueur, De de1, De de2) throws JeuFermeException, DebitImpossibleException;
    void fermer();
    boolean estOuvert();
}