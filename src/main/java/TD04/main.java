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
        System.out.println(list.list);
        Nombres instance = new Nombres();
        instance.add(4);
        instance.add(5);
        System.out.println(instance.nombres);
        List<Integer> listeAjout= new ArrayList();
        listeAjout.add(5);
        listeAjout.add(33);
        instance.concatenation(listeAjout);
        System.out.println(instance.nombres);
        instance.supprimerExtr();
        System.out.println(instance.nombres);
    }
}
