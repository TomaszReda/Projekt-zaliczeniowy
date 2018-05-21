/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import data.Kontakt;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Tomek i Ewelina
 */
public class ListaKontaktów {
    private List<Kontakt> listaKontaktów;

    public ListaKontaktów() {
    listaKontaktów=new LinkedList<>();
    }

    public List<Kontakt> getListaKontaktów() {
        return listaKontaktów;
    }

    public void setListaKontaktów(List<Kontakt> listaKontaktów) {
        this.listaKontaktów = listaKontaktów;
    }
    
    /**
     * Dodanie nowego kontaktu
     * @param kontakt 
     */
    public void add(Kontakt kontakt)
    {
        if(kontakt!=null)
        listaKontaktów.add(kontakt);
    }
    
    /**
     * Pobranie 1 konktaktu
     * @param index
     * @return 
     */
    public Kontakt getOne(int index)
    {
        if(index>listaKontaktów.size())
        {
            throw new ArrayIndexOutOfBoundsException("Wyszedłs poza indeksy");
        }
        return listaKontaktów.get(index);
    }
    
    /**
     * Usuniecie kontaktu
     * @param index 
     */
    public void usun(int index)
    {
        listaKontaktów.remove(index);
    }
    
    
}
