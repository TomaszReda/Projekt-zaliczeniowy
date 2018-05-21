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
public class Skrzynka {
    private String imieWłasciciela;
    private String nazwiskoWłasciciela;
    private String login;
    private String hasło;

    public Skrzynka(String imieWłasciciela, String nazwiskoWłasciciela, String login, String hasło) {
        this.imieWłasciciela = imieWłasciciela;
        this.nazwiskoWłasciciela = nazwiskoWłasciciela;
        this.login = login;
        this.hasło = hasło;
    }

    public Skrzynka() {
    }
    

    
    public String getImieWłasciciela() {
        return imieWłasciciela;
    }

    public void setImieWłasciciela(String imieWłasciciela) {
        this.imieWłasciciela = imieWłasciciela;
    }

    public String getNazwiskoWłasciciela() {
        return nazwiskoWłasciciela;
    }

    public void setNazwiskoWłasciciela(String nazwiskoWłasciciela) {
        this.nazwiskoWłasciciela = nazwiskoWłasciciela;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHasło() {
        return hasło;
    }

    public void setHasło(String hasło) {
        this.hasło = hasło;
    }
    
    
    
}
