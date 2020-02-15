/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TD02;

/**
 *
 * @author g55315
 */
public class MainMoment {
    public static void main(String[] args) {
        Moment moment1 = new Moment(8,15,0);
        Moment moment2 = new Moment(8,15,0);
        Moment moment3 = moment1;
        Moment moment4 = new Moment(10,15,0);
        Moment moment5 = new Moment();
        System.out.println(moment1 + "==" + moment2 + ": " + moment1.equals(moment2));
        System.out.println(moment1 + "==" + moment2 + ": " + moment1.equals(moment4));
        System.out.println(moment5.toString());
        System.out.println(moment1.compareTo(moment4));
    }
}
