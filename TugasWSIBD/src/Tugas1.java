/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
///Luqman Hakim E41202411
public class Tugas1 {
    
    public static void main(String[] args) {
     
            
        Scanner input=new Scanner(System.in);
        
        int awal , akhir;
        
        System.out.println("MENAMPILKAN BILANGAN GENAP");
        System.out.println("----------------------------------");
        System.out.print("Masukkan Batas Awal : ");
        awal=input.nextInt();
        System.out.print("Masukkan Batas Akhir : ");
        akhir=input.nextInt();
        System.out.println("----------------------------------");
        
        System.out.println("Urutan Bilangan Genap");
        
        for (int i=awal; i<=akhir; i++){
            if (i%4==0)
                System.out.print(i+ " ");           
        }
    }
    
}
