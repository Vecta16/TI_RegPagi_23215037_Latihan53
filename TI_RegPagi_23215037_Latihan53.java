/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117048.latihan53.rabbit;

/**
 *
 * @author 
 * Nama : Arrijal Tanzil Maulana
 * NIM : 23215037
 * Kelas : TI
 * Deskripsi Program : Program ini berisi tentang deskripsi tentang kelinci. 
 *                     
 */
public class TI_RegPagi_23215037_Latihan53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rabbit tank = new Rabbit("Peter", false, "Grass", 4, "grey");
        System.out.println("Hello, his name is " + tank.getName());
        System.out.println(tank.getName() + " is Vegetarian? " + tank.isVegetarian());
        System.out.println(tank.getName() + " eats " + tank.getEats());
        System.out.println(tank.getName() + " has " + tank.getNoOfLegs() + " legs");
        System.out.println(tank.getName() + " color is " + tank.getColor());
    }

    }
