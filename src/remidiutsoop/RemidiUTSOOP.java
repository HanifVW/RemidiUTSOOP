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
public class RemidiUTSOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Komputer komputer1 = new Komputer();
        AMD amd1 = new AMD(0);
        Intel intel1 = new Intel(0);

        komputer1.cetakInfo(intel1);
        komputer1.melepas(intel1);
        komputer1.memasang(amd1);
        komputer1.cetakInfo(amd1);
    }
    }
    

