/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119023.latihan33.userlogin;

/**
 *
 * @author Muhammad Farhan R <farhan.10119023@mahasiswa.unikom.ac.id>
 */
public class User {
    private final String username = "Farhan";
    private final String password = "191919";
    private boolean statusAkun = false;
    
    private boolean cekAkun(String parUserName, String parPassword){
        if (parUserName.equalsIgnoreCase(username) && parPassword.equals(password)){
            statusAkun = true;
        }else {
            statusAkun = false;
        }
        return statusAkun;
    }
    
    private void hasilLogin(boolean status, String pasUserName){
        if(status){
            System.out.println("******HALLO ".concat(pasUserName.toUpperCase())
            .concat(" ******"));
        }else {
            System.out.println("Oooops, Username atau Password anda salah");
        }
    }
    
    public void pengecekkanLogin(String parUserName, String parPassword){
        cekAkun(parUserName,parPassword);
        hasilLogin(statusAkun,parUserName);
    }
}
