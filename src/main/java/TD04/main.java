/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TD04;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author g55315
 */
public class main {
    public static void main(String[] args) {
        TdListes list = new TdListes();
        List<Integer> liste1 = new ArrayList<>(List.of(1, 5, 8, 10));
        List<Integer> liste2 = new ArrayList<>(List.of(1, 4, 9, 12 , 55, 66));
        System.out.println(list.list);
        Nombres instance = new Nombres();
        instance.add(4);
        instance.add(5);
        System.out.println(instance.nombres);
        List<Integer> listeAjout= new ArrayList();
        listeAjout.add(5);
        listeAjout.add(33);
        listeAjout.add(33);
        listeAjout.add(33);
        instance.concatenation(listeAjout);
        System.out.println(instance.nombres);
        System.out.println(TdListes.fusionTrié(liste1, liste2));
    }
}
