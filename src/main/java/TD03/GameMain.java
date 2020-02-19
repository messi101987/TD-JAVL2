/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TD03;

/**
 *
 * @author g55315
 */
public class GameMain {
    public static void main(String[] args) {
        Card carte1 = new Card(5);
        Card carte2 = new Card(5);
        System.out.println(carte1.equals(carte2));
        System.out.println(carte1.getValue());
    }
}
