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
public class Wiadomosc {
    
    private String adres;
    private String temat;
    private String data;
    private String załacznik;
    private String tresc;

    public Wiadomosc(String adres, String temat, String data, String załacznik, String tresc) {
        this.adres = adres;
        this.temat = temat;
        this.data = data;
        this.załacznik = załacznik;
        this.tresc = tresc;
    }

    public Wiadomosc() {
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTemat() {
        return temat;
    }

    public void setTemat(String temat) {
        this.temat = temat;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getZałacznik() {
        return załacznik;
    }

    public void setZałacznik(String załacznik) {
        this.załacznik = załacznik;
    }

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }

    @Override
    public String toString() {
        return  "adres=" + adres + "\ntemat=" + temat + "\ndata=" + data + "\nza\u0142acznik=" + załacznik + "\ntresc=" + tresc ;
    }
    
}
