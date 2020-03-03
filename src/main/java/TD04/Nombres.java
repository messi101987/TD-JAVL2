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
public class Nombres {
    public List<Integer> nombres= new ArrayList();
    
     void add(int val){
         nombres.add(val);
     }
     
     void remove(int val){
         nombres.remove(val);
     }
     
     int sum() {
         return TdListes.sommeElements(nombres);
     }
     
     void concatenation (List<Integer> liste){
         TdListes.concatanation(nombres, liste);
     }
     
     void supprimerExtr(){
         TdListes.supprimerExtremum(nombres);
     }
    
}
