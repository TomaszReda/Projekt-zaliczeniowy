/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import data.Wiadomosc;
import java.io.File;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ewelina
 */
public class ListaWiadomosciIT {
    
     private  Wiadomosc wiadomosc;
     
    public ListaWiadomosciIT() {
    }
    
    @Before
    public void setUp() {
        wiadomosc=new Wiadomosc("ewelinapałka16@op.pl","Zapłata za drzewo","22-05-2018","data.txt","Testowanie testowanie");
    }

    @Test
    public void testAdd() {
         
        ListaWiadomosci instance = new ListaWiadomosci();
        instance.add(wiadomosc);
        assertEquals(1,instance.getWiadomosci().size());
        wiadomosc=null;
        assertEquals(1,instance.getWiadomosci().size());
    }

    /**
     * Test of getOne method, of class ListaWiadomosci.
     */
    @Test
    public void testGetOne() {
          int index = 0;
        ListaWiadomosci instance = new ListaWiadomosci();
        instance.add(wiadomosc);
        Wiadomosc expResult = wiadomosc;
        Wiadomosc result = instance.getOne(index);
        assertEquals(expResult, result);
        try{
            instance.getOne(4);
            fail("Poza zakres");
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            ex.printStackTrace();
        }
    }

    
    
}
