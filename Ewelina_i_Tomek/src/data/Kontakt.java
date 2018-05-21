/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Tomek i Ewelina
 */
public class Kontakt {
    
    
    private String Email;
    private String notatki;
   

   

    public Kontakt() {
    }

    public Kontakt(String Email, String notatki) {
        this.Email = Email;
        this.notatki = notatki;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNotatki() {
        return notatki;
    }

    public void setNotatki(String notatki) {
        this.notatki = notatki;
    }

    @Override
    public String toString() {
        return  "Email=" + Email + ", notatki=" + notatki ;
    }

    
   
    
}
