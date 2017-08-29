/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author SuperJeje
 */
public class TestSiswa {
    public static void main(String argas[]){
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Jeje");
        siswa.setAbsen(10);
        siswa.setAddress("Malang");
        
        System.out.print("Name : "+ siswa.getName()
        + " Absen : " + siswa.getAbsen()
        + " Address : " + siswa.getAddress());
    }
    
}
