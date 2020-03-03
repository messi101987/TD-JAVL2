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
 * @author oscartison
 */
public class TdListes {
        public List<Integer> list = new ArrayList();
    
    
    public void TdListes(){
        list.add(42);
        list.add(54);
        System.out.println(list);
        list.set(1,44);
        list.add(1,43);
        list.remove(list.size() -1 );
        list.remove(42);
        list.removeAll(list);
    }
    
    public static int sommeElements(List<Integer> liste){
        int somme = 0;
        for(int elt: liste){
            somme+=elt;
        }
        return somme;
    }
    
    public static void concatanation (List<Integer> liste1, List<Integer> liste2) {
        for(int elt:liste2) {
            liste1.add(elt);
        }
    }
    
}
