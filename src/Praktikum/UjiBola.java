/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import Praktikum.Bola;

/**
 *
 * @author SuperJeje
 */
public class UjiBola {
    public static void main(String[]args){
        Bola objekbola = new Bola(7);
        objekbola.setjarijari(7);
        objekbola.showjarijari();
        objekbola.showdiameter();
        objekbola.showluaspermukaan();
        objekbola.showvolume();
        System.out.println("\n\n");
        objekbola.setjarijari(14);
        objekbola.showjarijari();
        objekbola.showdiameter();
        objekbola.showluaspermukaan();
        objekbola.showvolume();
    }
}
