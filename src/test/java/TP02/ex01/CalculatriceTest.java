package TP02.ex01;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class CalculatriceTest {

    @Mock
    private Calculatrice calculatrice;

    @Test
    public void testAdditionner() {
        // Définition du comportement de la méthode "additionner"
        when(calculatrice.additionner(2, 3)).thenReturn(5);

        // TODO : Appel de la méthode à tester
        int resultat = calculatrice.additionner(2, 3);

        // TODO : Vérification du résultat
        assertEquals(5, resultat);

        // TODO : Vérification que la méthode "additionner" a été appelée avec les arguments 2 et 3
        verify(calculatrice).additionner(2, 3);

        // TODO : Vérification qu'aucune autre méthode n'a été appelée sur l'objet après
        verifyNoMoreInteractions(calculatrice);

        // TODO : Vérification de l'état de l'objet après l'appel de la méthode "additionner"
        // Ici, ce test ne fonctionne pas avec un mock car l'état n’est pas réellement modifié.
        // Il faut un test d’état avec une vraie instance.
        // Pour cela, on écrit un test distinct :

        // Test d’état avec une vraie instance (hors Mockito)
        Calculatrice calcReelle = new Calculatrice();
        calcReelle.additionner(2, 3);
        assertEquals(5, calcReelle.getResult());
    }
}
