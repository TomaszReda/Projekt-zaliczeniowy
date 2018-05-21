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
public class OsobaKonktakt extends Kontakt{
    private String imie;
    private String nazwisko;

    public OsobaKonktakt(String imie, String nazwisko, String Email, String notatki) {
        super(Email, notatki);
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

   

    public OsobaKonktakt() {
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "imie=" + imie + ", nazwisko=" + nazwisko+" "+super.toString();
    }
    
    
    
    
    
}
