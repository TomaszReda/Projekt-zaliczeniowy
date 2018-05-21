/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import data.Kontakt;
import data.OsobaKonktakt;
import java.util.List;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tomek
 */
public class ListaKontaktówIT {
    
   
    
    @Test
    public void testAdd() {
        System.out.println("add");
        Kontakt kontakt = new OsobaKonktakt("tomek","reda","email","asdsasda");
        ListaKontaktów instance = new ListaKontaktów();
        instance.add(kontakt);
        Assert.assertNotNull(instance.getListaKontaktów());
    }
    
       @Test
    public void testfailAdd() {
        
        Kontakt kontakt = null;
        ListaKontaktów instance = new ListaKontaktów();
        instance.add(kontakt);
        Assert.assertEquals(0,instance.getListaKontaktów().size());
    }

    /**
     * Test of getOne method, of class ListaKontaktów.
     */
    @Test
    public void testGetOne() {
        System.out.println("getOne");
        int index = 0;
        ListaKontaktów instance = new ListaKontaktów();
        Kontakt kontakt =  new OsobaKonktakt("tomek","reda","email","asdsasda");
        instance.add(kontakt);
        Kontakt expResult = kontakt;
        Kontakt result = instance.getOne(index);
        assertEquals(expResult, result);
        
        
        index=3;
        try
        {
            instance.getOne(index);
            fail("cos");
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            ex.printStackTrace();
        }
      
    }

    /**
     * Test of usun method, of class ListaKontaktów.
     */
    @Test
    public void testUsun() {
       
        int index = 0;
        Kontakt kontakt = new OsobaKonktakt("tomek","reda","email","asdsasda");
        ListaKontaktów instance = new ListaKontaktów();
        instance.add(kontakt);
        instance.usun(index);
        Assert.assertEquals(0,instance.getListaKontaktów().size());
    }
    
}
