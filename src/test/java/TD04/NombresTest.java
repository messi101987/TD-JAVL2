/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TD04;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author oscartison
 */
public class NombresTest {
    
    public NombresTest() {
    }

    @Test
    public void testSum_tousStrictementPositifs() {
        Nombres instance = new Nombres(); 
        instance.add(4);
        instance.add(12);
        instance.add(52);
        Integer expResult = 68;
        Integer result = instance.sum(); 
        assertEquals(expResult, result);
}
    
    @Test
    public void testSupprimerMinEtMax() {
        List<Integer> liste = new ArrayList<>(List.of(1, 4, 2, 0));
        List<Integer> expected = List.of(1, 2);
        TdListes.supprimerExtremum(liste);
        assertEquals(liste, expected);
    }

    
}
