/*NIM   : 13020210247
Nama    : Marhamah BL
Hari/Tgl: Sabtu, 11 Maret 2023
Waktu   : 22:24 PM*/
package tugas15;

/* Operator terner */
public class Oper4 {

    /**
    * @param args
    */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* KAMUS */

        int i = 0;      /* perhatikan int i,j=0 bukan seperti ini */
        int j = 0;

        char c = 8; char d = 10;
        int e = (((int)c > (int)d) ? c: d);
        int k = ((i>j) ? i: j);
        /* ALGORITMA */

        System.out.print ("Nilai e = "+ e);
        System.out.print ("\nNilai k = "+ k);
        i = 2;
        j = 3;

        k = ((i++>j++) ? i: j) ;

        System.out.print ("\nNilai k = "+ k);
        
    }
    
}