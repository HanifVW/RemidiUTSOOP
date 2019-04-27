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
public class Komputer {
     private CPU CPU;
    
    public Komputer (CPU CPU){
        this.CPU = CPU;
    }
    
    public Komputer() {
    }
    public void memasang (CPU CPU){
        System.out.println("CPU: "+ CPU.getCPUData()+ " dipasang");
    }
    
    public void melepas (CPU CPU){
        System.out.println("CPU: "+ CPU.getCPUData()+ " dilepas");
    }
    
    public void cetakInfo (CPU CPU){
        System.out.println("Spesifikasi: CPU : "+ CPU.getCPUData());
    }
}
