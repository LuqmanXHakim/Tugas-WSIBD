import java.util.Scanner;

public class Tugas3 {
    
    public static void main(String[]args) {
        
        int Maximum, Minimum,  Data, i, array[];
        int nilairata = 0;
        
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan Banyaknya Data Nilai : ");
        Data = s.nextInt();
        array = new int[Data];
        
        for (i = 0; i < Data; i++){
            System.out.print("Masukkan Data Nilai ke- " + (i+1) + " : ");
            array[i] = s.nextInt();
        }
        // Mencari Nilai Maximum dan Minimum
        Minimum = array[0];
        Maximum = array[0];
        
        for (i = 0; i < Data; i++){
            if (array[i] > Minimum){
                Minimum = array[i];
            } else if (array[i] < Maximum){
                Maximum = array[i];
            }
            for (i = 0; i < Data; i++){
                nilairata += array[i];
            }
            nilairata = nilairata / i;
            
            System.out.println("-----------------------------------");
            System.out.println("Nilai minimum = " + Minimum);
            System.out.println("Nilai Maximum = " + Maximum);
            System.out.println("Nilai Rata-Ratanya adalah = " + " " + nilairata);
        }
    }
}