/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Tugas2 {
    
    public static void main(String[]args){
        
        int number = 1;
        
        System.out.println("            Do While");
        System.out.println("Bilangan Kelipatan 2 (1-100)");
        System.out.println("============================");
        int i = 1;
        
        do {
            number *=2;
            if (number > 100) {
                break;
            }
            System.out.print(   number + " ");
        }while  (number < 100);
        System.out.println(" ");
    }   
}
