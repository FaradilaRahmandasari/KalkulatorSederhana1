
package kalkulatorsederhana1;

import java.io.PrintStream;
import java.util.Scanner;
public class KalkulatorSederhana1 {

    private static double enchance;

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       double x, y, z = 0.0;
      
       System.out.print("Masukkan Angka Pertama : ");
       x = in.nextDouble();
       System.out.print("Masukkan Angka Kedua  : ");
       y = in.nextDouble();
        System.out.print(" ~Pilih Salah Satu Operasi~ " +
                "\n1.Penambahan" +
                "\n2.Pengurangan" +
                "\n3.Perkalian " +
                "\n4.Pembagian " +
                "Tolong masukkan pilihan operasi anda \n"); 
              
       double somethin = in.nextDouble();
       double Penambahan = 1;
       double Pengurangan = 2;
       double Perkalian = 3;
       double Pembagian = 4;
       
       if(somethin == Penambahan) {
           z = x + y;
           System.out.println(x + " + " + y + " = " + z); }
       else if (somethin == Pengurangan) {
           z = x - y;
           System.out.println(x + " - " + y + " = " + z); }
       else if (somethin == Perkalian) {
           z = x * y;
           System.out.println(x + " * " + y + " = " + z); }
       else if (somethin == Pembagian) {
           z = x / y;
           System.out.println(x + " / " + y + " = " + z); }
       
            
            }
       }
          
    

