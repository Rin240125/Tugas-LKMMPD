/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipedata;

/**
 *
 * @author ADVAN
 */
public class LuasLingkaran {
    public static void main(String[] args) {
        double PI = 3.141592;
        double r = 11.78;
        double pecahan = PI*r*r;
        int bulat = (int) (PI*r*r);
                
        System.out.println("Luas Lingkaran:");
        System.out.println("dalam pecahan:"+pecahan);
        System.out.println("dalam bilangan bulat:"+bulat);
        System.out.println("dalam pembulatan:"+Math.round(pecahan));
    }
}
