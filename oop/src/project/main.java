/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Dell
 */
public class main {
    public static void main(String[] args) {
        //membuat objek
        mahasiswa mhs = new mahasiswa();

        //memberi nilai atau value
        mhs.NAMA = "Moh. Ichsan Maulana";
        mhs.KELAS = "4B";
        mhs.NIM = "18090115";

        //memanggil data
        System.out.println("Nama : "+mhs.NAMA);
        System.out.println("Kelas: "+mhs.KELAS);
        System.out.println("NIM: "+mhs.NIM);
        
        
        
    }
}
