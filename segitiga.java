/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TOSHIBA
 */
public class segitiga {
    public static void main(String[] args){
        int[] sgt = {2, 1, 4, 1, 7, 6, 2, 1, 0, 4};
        int count = 0;
        /*int n = 10;
            for(int i=0; i<=n; i++) {
                for(int j=n; j>i; j--) {
                    System.out.print(" ");
                }
                for(int k=1; k<=i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.print("baris = " + n);*/
            /*for(int i=1; i<=4; i++) {
                for(int j=4; j>=i; j--) {
                    System.out.print(" ");    
                }
                for(int k=1; k<=i; k++) {
                    System.out.print(sgt[count]+" ");
                    count++;
                }
                System.out.println();
            }*/
 //Segitiga sama sisi array menggunakan do-while
           int i=1;
           do{
               int j=4;
               do{
                   System.out.print(" ");
                   j--;
               }while(j>=i);
               int k=1;              
               do{
                   System.out.print(sgt[count]+" ");
                   count++;
                   k++;
               }while (k<=i);
               i++;
               System.out.println();
           }while(i<=4);
           
 //Penjumlahan array menggunakan for   
            int jum = 0;
            for(int num : sgt){
                jum = num + jum;
            }
            System.out.print("Jumlah array adalah " + jum);
            /*int j = 0;
            do {
                int i = 0;
                        do{
                             System.out.print(sgt[i]);
                             i++;
                            System.out.println(" ");
                        } while(j <= i);
                        System.out.println();
            }while(j<=9);
                    System.out.println();
                
            //}
            /*for(int i = 0; i<sgt.length; i++){
                sgt[i] = 2 * i;
                System.out.print("i");
            }*/
    }

}       