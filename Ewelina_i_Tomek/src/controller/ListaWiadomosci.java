/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import data.Wiadomosc;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Tomek i Ewelina
 */
public class ListaWiadomosci {
    private List<Wiadomosc> wiadomosci;

    public ListaWiadomosci() {
        wiadomosci=new LinkedList<>();
    }

    public List<Wiadomosc> getWiadomosci() {
        return wiadomosci;
    }

    public void setWiadomosci(List<Wiadomosc> wiadomosci) {
        this.wiadomosci= wiadomosci;
    }
    
    
    /**
     * Dodanie nowej wiadomosci
     * @param wiadomosc 
     */
    public void add(Wiadomosc wiadomosc){
        if(wiadomosc!=null)
        wiadomosci.add(wiadomosc);
      
    }
    /**
     * Pobranie 1 wiadomosci o konkretnym indexie
     * @param index
     * @return 
     */
    public Wiadomosc getOne(int index){
        if(index>=wiadomosci.size())
        {
            throw new ArrayIndexOutOfBoundsException("Zakres");
        }
        return wiadomosci.get(index);
    }
    
    /**
     * Wyswietlenie wiadomosci w postaci adres temat  data
     * @param index
     * @return 
     */
    public String wyswietlanieWiadomosc(int index) {
        Wiadomosc wiadomosc=wiadomosci.get(index);
        String tmp="Adres:"+wiadomosc.getAdres()+"     Temat"+wiadomosc.getTemat()+"    Data "+wiadomosc.getData();
        return tmp;
    }

    /**
     * Zapisz do pliku Wiadomosci
     * @param file
     * @param index 
     */
    public void zapiszDoPliku(File file,int index){
        try{
        BufferedWriter writer =new BufferedWriter(new FileWriter(file));
        writer.append(wiadomosci.get(index).toString());
        writer.flush();
        }
        catch(IOException ex)
        {
            
        }
    }
}
