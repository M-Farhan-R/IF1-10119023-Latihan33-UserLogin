/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package if1.pkg10119023.latihan33.userlogin;

/**
 *
 * @author 
 * NAMA              : Muhammad Farhan R 
 * KELAS             : IF1
 * NIM               : 10119023
 * Deskripsi Program :
 *
 */
import java.util.Scanner;
public class IF110119023Latihan33UserLogin {

    /**
     * @param args the command line arguments
     */
    private static String usName;
    private static String passWord;
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        User u = new User();
        System.out.print("Masukkan Username : ");
        usName = scan.next();
        System.out.print("Masukkan Password : ");
        passWord = scan1.next();
        System.out.println();
        
        u.pengecekkanLogin(usName,passWord);
    }

}
