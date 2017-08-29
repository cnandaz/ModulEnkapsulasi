/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author SuperJeje
 */
public class UjiBus3 {
    public static void main(String[] abc){
        Bus3 Bus3 = new Bus3(5);
            Bus3.getpenumpang(17);
            Bus3.getpenumpang(24);
            Bus3.cetakpenumpang();
            //penambahan penumpang
            Bus3.addpenumpang(2); //tambah 2 penumpang
            Bus3.cetakpenumpang();
            //penambahan penumpang
            Bus3.addpenumpang(1); //tambah 1 penumpang
            Bus3.cetakpenumpang();
            //penambahan penumpang
            Bus3.addpenumpang(2); //tambah 2 penumpang
            Bus3.cetakpenumpang();
            //penambahan penumpang Bus.addpenumpang(2); //tambah 2 penumpang
            Bus3.cetakpenumpang();
    }
}
