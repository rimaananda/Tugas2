/* Rima Ananda
* 13020210238
* B1
* Kamis,23 Maret
*/

/* contoh pemakaian IF satu kasus */
/* membaca nilai integer, menuliskan nilainya jika positif */

package if1;
import java.util.Scanner;

   public class If1 {
   /**
    * @param args
    */
       public static void main(String[] args) { 
            // TODO Auto-generated method stub
            /* Kamus */
            Scanner masukan=new Scanner(System.in); 
            int a;
            /* Program */
            System.out.print ("Contoh IF satu kasus \n"); System.out.print ("Ketikkan suatu nilai integer : "); a = masukan.nextInt();
            if (a >= 0)
            System.out.print ("\nNilai a positif "+ a);
            
       }
   }