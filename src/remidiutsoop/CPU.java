/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remidiutsoop;

/**
 *
 * @author acer
 */
public class CPU {
      protected String nama;
    protected int kecepatan;
    
    CPU(String nama,int kecepatan){
        this.nama = nama;
        this.kecepatan = kecepatan;
    }
    
    public String getCPUData(){
        return (this.nama + " " + this.kecepatan + " GHZ");
    }
}
