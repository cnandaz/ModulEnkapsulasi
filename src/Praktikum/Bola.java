/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author Superjeje
 */
import java.lang.Math;
public class Bola {
    private double jarijari;
    public Bola (double jarijari){
    
    }
    public void setjarijari(double jarijari){
    this.jarijari=jarijari;
    }
    public void showjarijari(){
        System.out.println("Jari-jari Bola          :"+jarijari);

    }
    public void showdiameter(){
        System.out.println("Diameter Bola           :"+2*jarijari);

    }
    public void showluaspermukaan(){
        System.out.println("Luas permukaan bola     :"+(4/3*Math.PI*Math.pow(jarijari,3)));
    }
    
    public void showvolume(){
        System.out.println("Volume bola             :"+(4*Math.PI*Math.pow(jarijari,2)));
    }
}
