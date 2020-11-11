/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan48kalkulator;

/**
 *
 * @author
 * NAMA     : Andreas Suryadi
 * KELAS    : IF-10K
 * NIM      : 10119918
 * Deskripsi Program : Menampilkan hasil perhitungan matematika dengan prinsip
 * kalkulator
 *
 */

public class PBO10K10119918Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        
        kalkulator.setValue1(7.0);
        kalkulator.setValue2(5.0);
        
        double value1 = kalkulator.getValue1();
        double value2 = kalkulator.getValue2();
        
        System.out.println("VALUE 1 = " + value1);
        System.out.println("VALUE 2 = " + value2);
        
        kalkulator.setNameProject();
        kalkulator.setNoteProject("This project shown you how to manage method in java");
        
        System.out.println("Result Add is = " + kalkulator.add(value1, value2));
        System.out.println("Result Minus is = " + kalkulator.minus(value1, value2));
        System.out.println("Result Multiple is = " + kalkulator.multiplication(value1, value2));
        System.out.println("Result Division is = " + kalkulator.division(value1, value2));
    }
    
}
