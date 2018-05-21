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
public class FirmaKontakt extends Kontakt{
    private String nazwa;

    public FirmaKontakt(String nazwa, String Email, String notatki) {
        super(Email, notatki);
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public FirmaKontakt() {
    }

    @Override
    public String toString() {
        return  "nazwa=" + nazwa +" "+super.toString();
    }
    
    
    
}
