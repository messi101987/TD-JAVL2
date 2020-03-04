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

    public void TdListes() {
        list.add(42);
        list.add(54);
        System.out.println(list);
        list.set(1, 44);
        list.add(1, 43);
        list.remove(list.size() - 1);
        list.remove(42);
        list.removeAll(list);
    }

    public static int sommeElements(List<Integer> liste) {
        int somme = 0;
        for (int elt : liste) {
            somme += elt;
        }
        return somme;
    }

    public static void concatanation(List<Integer> liste1, List<Integer> liste2) {
        for (int elt : liste2) {
            liste1.add(elt);
        }
    }

    public static void supprimerExtremumObject(List<Integer> liste) {
        Integer min = liste.get(0);
        Integer max = liste.get(0);
        for (int elt : liste) {
            if (elt < min) {
                min = elt;
            }
            if (elt > max) {
                max = elt;
            }
        }

        liste.remove(min);
        liste.remove(max);
    }

    public static void supprimerExtremum(List<Integer> liste) {
        Integer min = liste.get(0);
        Integer max = liste.get(0);
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < liste.size(); i++) {
            int elt = liste.get(i);
            if (elt < min) {
                min = elt;
                maxIndex = i;
            }
            if (elt > max) {
                max = elt;
                minIndex = i;
            }
        }

        if (minIndex > maxIndex) {
            liste.remove(minIndex);
            liste.remove(maxIndex);

        } else {
            liste.remove(maxIndex);
            liste.remove(minIndex);

        }

    }
    
    public static void eliminerDoublons(List<Integer> liste) {
        for(int i = 0; i < liste.size() - 1; i++) {
            while ( i < liste.size() - 1 && liste.get(i).equals(liste.get(i + 1))){
                liste.remove(i + 1);
            }
        }
    }
    
    
    public static List<Integer> eliminerDoublons2(List<Integer> liste) {
        ArrayList<Integer> result = new ArrayList();
        
        for (Integer elm:liste){
            if (!result.contains(elm)){
                result.add(elm);
            }
        }
        return result;
    }
    
    public static List<Integer> fusionTrié(List<Integer> liste1,List<Integer> liste2){
        List<Integer> result = new ArrayList();
        int i = 0;
        int j = 0;
        while(i < liste1.size() && j < liste2.size()){
            if (liste1.get(i)<liste2.get(j)){
                result.add(liste1.get(i));
                i++;
            }
            else {
                result.add(liste2.get(j));
                j++;
            }
        }
        
        while (i< liste1.size()){
            result.add(liste1.get(i));
                i++;
        }
        while (j< liste2.size()){
            result.add(liste2.get(j));
            j++;
        }
        return result;
    }
}
