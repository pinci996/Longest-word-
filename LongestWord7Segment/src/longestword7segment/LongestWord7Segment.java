/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longestword7segment;

import java.util.Scanner;
import java.io.*;


/**
 *
 * @author pinci
 */

public class LongestWord7Segment {
     public static void main(String [ ] args) throws FileNotFoundException {
     new LongestWord7Segment().getLongestWords();
 }

public String getLongestWords() throws FileNotFoundException {

    String longestWord = "";
    String current;
    Scanner scan = new Scanner(new File("C:/Users/pinci/Downloads/rjecnik.txt")); // Ucitavanje filea sa korisnikovog računala


    while (scan.hasNext()) {
        current = scan.next(); // Trazenje rijeci u fileu sve dok postoji rijec
        
        
        if ((current.length() > longestWord.length()) && (!current.contains("o") && !current.contains("i") && !current.contains("z") && !current.contains("g") && !current.contains("m") && !current.contains("v")
                && !current.contains("č") && !current.contains("ć") && !current.contains("š") && !current.contains("đ") && !current.contains("dž") && !current.contains("k") && !current.contains("ž") && 
                !current.contains("O") && !current.contains("I") && !current.contains("Z") && !current.contains("G") && !current.contains("M") && !current.contains("V")
                && !current.contains("Č") && !current.contains("Ć") && !current.contains("Š") && !current.contains("Đ") && !current.contains("DŽ") && !current.contains("K") && !current.contains("Ž")
                )) // Usporedivanje rijeci i iskljucivanje rijeci koje sadrzavaju slova koja se ne mogu prikazati u 7-segmentnom displayu
                 {
            longestWord = current;  // Ako je u slucaju rijec koja se trazi duza od prosle pronadjene rijeci, ta rijec se zamjenjuje
        }
    }
    
        System.out.println(longestWord);
        return longestWord; // Ispis najduze rijeci u fileu
    }
}
        


