/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Indah Retno Iriani
 */
import java.io.FileNotFoundException;
import java.util.Formatter;
public class segitiga {
    public static void main(String[] args){
                 try (Formatter file = new Formatter("C:\\Users\\TOSHIBA\\Documents\\NetBeansProjects\\mavenproject4\\src\\main\\java\\sgt.txt")) {
        int[] sgt = {2, 1, 4, 1, 7, 6, 2, 1, 0, 4};
        int count = 0;
 //Segitiga sama sisi array menggunakan do-while
           int i=1;
           do{
               int j=4;
               do{
                   System.out.print(" ");
                   file.format("%s", " ");
                   j--;
               }while(j>=i);
               int k=1;              
               do{
                   System.out.print(sgt[count]+" ");
                   file.format("%s", sgt[count] +" ");
                   count++;
                   k++;
               }while (k<=i);
               i++;
               System.out.println();
               file.format("%s %n","");
           }while(i<=4);
           
 //Penjumlahan array menggunakan for   
            int jum = 0;
            for(int num : sgt){
                jum = num + jum;
            }
            System.out.print("Jumlah array adalah " + jum);
            file.format("%s", "Jumlah array adalah " + jum);
            
            }catch(FileNotFoundException ex){
            //Menampilkan pesan jika file tidak ditemukan
            System.out.println("File Tidak Ditemukan"); 
        }
    }
}       