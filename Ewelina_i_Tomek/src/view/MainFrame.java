/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import config.Config;
import controller.ListaKontaktów;
import controller.ListaWiadomosci;
import data.FirmaKontakt;
import data.Kontakt;
import data.OsobaKonktakt;
import data.Skrzynka;
import data.Wiadomosc;
import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Tomek i Ewelina
 */
public class MainFrame extends javax.swing.JFrame {

    private ListaWiadomosci listaWysłanychWiadomosci;
    private ListaWiadomosci listaOdebranychWiadomosci;
    private ListaKontaktów listaKontaktów;
    
    /**
     * Creates new form MainFrame
     */
    public MainFrame() throws Exception {
        initComponents();
        
        Skrzynka skrzynka=new Skrzynka("Ewelina","Pałka","ewelinapalka1234@gmail.com","GHJbnm123");
        jZalogowany.setText(skrzynka.getLogin());
        
     
        Config config=new Config();
        config.SMTP(skrzynka);
         config.Pop3(skrzynka);
        /**
         * Zeby Pop3 zadziałało musimy zalogować się na naszą poczte nastepnie 
         * https://myaccount.google.com/lesssecureapps?pli=1 Zezwalaj na mniej bezpieczne aplikacje włączyć oraz
         * https://accounts.google.com/b/0/DisplayUnlockCaptcha Zezwolic na dostep do swojego konta
         */
        
         
        jPanel3.setVisible(false);
        jPanel2.setVisible(false);
        jPanel6.setVisible(false);  
        listaWysłanychWiadomosci=new ListaWiadomosci();
        listaOdebranychWiadomosci=new ListaWiadomosci();
        listaKontaktów=new ListaKontaktów();
     
        Wiadomosc wiadomoscWysłana1=new Wiadomosc("ewelinapałka16@op.pl","Zapłata za drzewo","22-05-2018","data.txt","Testowanie testowanie Testowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanie");
        Wiadomosc wiadomoscWysłana2=new Wiadomosc("ewelinapałka16@op.pl","Zapłata za drzewo","22-05-2018","daata.txt","Testowanie testowanie Testowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanie");
        Wiadomosc wiadomoscWysłana3=new Wiadomosc("ewelinapałka16@op.pl","Zapłata za drzewo","21-05-2014","dataas.txt","Testowanie testowanie Testowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanie");
        Wiadomosc wiadomoscWysłana4=new Wiadomosc("ewelinapałka16@op.pl","Opłaca rekturacyjna","22-03-2018","datfa.txt","Testowanie testowanie Testowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanie");
        listaWysłanychWiadomosci.add(wiadomoscWysłana1);
        listaWysłanychWiadomosci.add(wiadomoscWysłana2);
        listaWysłanychWiadomosci.add(wiadomoscWysłana3);
        listaWysłanychWiadomosci.add(wiadomoscWysłana4);
        
        
        Wiadomosc wiadomoscOdebrana1=new Wiadomosc("ewelinapałka16@op.pl","Zapłata za drzewo","22-05-2018","data.txt","Testowanie testowanie Testowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanie");
        Wiadomosc wiadomoscOdebrana2=new Wiadomosc("tomekreda@op.pl","Zapłata za drzewo","22-05-2018","daata.txt","Testowanie testowanie Testowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanie");
        Wiadomosc wiadomoscOdebrana3=new Wiadomosc("ktostam@op.pl","Zapłata za drzewo","21-05-2014","dataas.txt","Testowanie testowanie Testowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanie");
        Wiadomosc wiadomoscOdebrana4=new Wiadomosc("costam@op.pl","Opłaca rekturacyjna","22-03-2018","datfa.txt","Testowanie testowanie Testowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanieTestowanie testowanie");
        listaOdebranychWiadomosci.add(wiadomoscOdebrana1);
        listaOdebranychWiadomosci.add(wiadomoscOdebrana2);
        listaOdebranychWiadomosci.add(wiadomoscOdebrana3);
        listaOdebranychWiadomosci.add(wiadomoscOdebrana4);
        
        
        OsobaKonktakt kontakty =new OsobaKonktakt("Tomek", "Red","ewelin@op.pl","Test test");
        FirmaKontakt kontakty2 =new FirmaKontakt ( "Firma", "tomekreda@op.pl","Test test");
        OsobaKonktakt kontakty3 =new OsobaKonktakt("Ewelina", "Pałka","evelyna.123@op.pl","Test test");
        FirmaKontakt  kontakty4 =new FirmaKontakt ( "Firma", "tomekreda@op.pl","Test test");
        listaKontaktów.add(kontakty);
        listaKontaktów.add(kontakty2);
        listaKontaktów.add(kontakty3);
        listaKontaktów.add(kontakty4);
        
    }

    /**
     * Wczytanie wysłanych wiadomosci po kliknieciu w wysłane
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLOdebrane = new javax.swing.JLabel();
        jLWysłane = new javax.swing.JLabel();
        jKonktakty = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        Temat2 = new javax.swing.JLabel();
        jDo = new javax.swing.JTextField();
        jTemat = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTresc = new javax.swing.JTextArea();
        jZalaczni = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jWiadomosc = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JWiadomosci = new javax.swing.JList<>();
        label1 = new java.awt.Label();
        jBUsun = new javax.swing.JButton();
        jBDodaj = new javax.swing.JButton();
        jTSzczegoły = new java.awt.TextArea();
        jBZapisz = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Imie = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jBDodajOsobe = new javax.swing.JButton();
        jbDodajFirme = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jZalogowany = new javax.swing.JLabel();

        setResizable(false);
        setSize(new java.awt.Dimension(300, 300));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Wiadomosci");

        jLOdebrane.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLOdebrane.setText("Odebrane");
        jLOdebrane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLOdebraneMouseClicked(evt);
            }
        });

        jLWysłane.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLWysłane.setText("Wysłane");
        jLWysłane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLWysłaneMouseClicked(evt);
            }
        });

        jKonktakty.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jKonktakty.setText("Kontakty");
        jKonktakty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jKonktaktyMouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("Wyslij");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jKonktakty)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLWysłane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLOdebrane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(280, 280, 280))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLOdebrane, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLWysłane, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jKonktakty)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addContainerGap(453, Short.MAX_VALUE))
        );

        jPanel2.setAlignmentX(1231);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Do");

        Temat2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Temat2.setText("Temat");

        jDo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTemat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTresc.setColumns(20);
        jTresc.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTresc.setRows(5);
        jTresc.setText("Tresc\n");
        jScrollPane4.setViewportView(jTresc);

        jZalaczni.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton3.setText("Wyslij");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Zalacznik");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDo))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(Temat2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTemat, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jZalaczni))
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Temat2)
                    .addComponent(jTemat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jZalaczni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jWiadomosc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jWiadomosc.setText("Wiadomosci");

        JWiadomosci.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JWiadomosciMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JWiadomosci);

        label1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label1.setText("Szczegoły");

        jBUsun.setText("Usun");
        jBUsun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBUsunMouseClicked(evt);
            }
        });

        jBDodaj.setText("Dodaj");
        jBDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDodajActionPerformed(evt);
            }
        });

        jBZapisz.setText("Zapisz wiadomosc do pliku");
        jBZapisz.setEnabled(false);
        jBZapisz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBZapiszActionPerformed(evt);
            }
        });

        Imie.setText("Imie");

        jLabel3.setText("Nazwisko");

        jLabel4.setText("Email");

        jLabel6.setText("Notatki");

        jLabel7.setText("Firma");

        jLabel8.setText("Email");

        jLabel9.setText("Notatki");

        jBDodajOsobe.setText("Dodaj Osobe");
        jBDodajOsobe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDodajOsobeActionPerformed(evt);
            }
        });

        jbDodajFirme.setText("Dodaj Firme");
        jbDodajFirme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDodajFirmeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(Imie))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel8))
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jBDodajOsobe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbDodajFirme)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                        .addComponent(jTextField5)))
                .addGap(61, 61, 61))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Imie)
                    .addComponent(jLabel7)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBDodajOsobe)
                    .addComponent(jbDodajFirme)))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(jWiadomosc))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(jBUsun)
                                .addGap(19, 19, 19)
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBDodaj))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTSzczegoły, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(jBZapisz)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBDodaj)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jWiadomosc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBUsun))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTSzczegoły, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBZapisz, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 255));
        jLabel10.setText("Zalogowany użytkownik");

        jZalogowany.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jZalogowany.setForeground(new java.awt.Color(255, 0, 255));
        jZalogowany.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jZalogowany, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(27, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jZalogowany)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jLWysłaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLWysłaneMouseClicked
          jWiadomosc.setText("Wiadomosci wysłane");
          jBZapisz.setEnabled(false);
          label1.setVisible(true);
          jTSzczegoły.setVisible(true);
          jBZapisz.setVisible(true);
          jPanel2.setVisible(true);
          jBUsun.setVisible(false);
          jBDodaj.setVisible(false);
           jPanel3.setVisible(false);
           jPanel6.setVisible(false);
          jTSzczegoły.setText("");
          jPanel7.setVisible(true);
           
          
           DefaultListModel<String> lm = new DefaultListModel<>();      
          for(int i=0;i<listaWysłanychWiadomosci.getWiadomosci().size();i++)
          {
              lm.addElement(listaWysłanychWiadomosci.wyswietlanieWiadomosc(i));
           
          }
          JWiadomosci.setModel(lm);
         
    }//GEN-LAST:event_jLWysłaneMouseClicked

    /*
    *Wczytanie odebranych wiadomosci po kliknieciu w odebrane
    */
    private void jLOdebraneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLOdebraneMouseClicked
          jWiadomosc.setText("Wiadomosci odebrane");
          jPanel2.setVisible(true);
          jBZapisz.setEnabled(false);
          jTSzczegoły.setText("");
          label1.setVisible(true);
          jTSzczegoły.setVisible(true);
          jBZapisz.setVisible(true);
          jBDodaj.setVisible(false);
          jBUsun.setVisible(false);
          jPanel3.setVisible(false);
          jPanel6.setVisible(false);
          jPanel7.setVisible(true);
           
          
          
          DefaultListModel<String> lm = new DefaultListModel<>();      
          for(int i=0;i<4;i++)
          {
              lm.addElement(listaOdebranychWiadomosci.wyswietlanieWiadomosc(i));
           
          }
          JWiadomosci.setModel(lm);
         
    }//GEN-LAST:event_jLOdebraneMouseClicked

    /*
    * Po kliknieciu w wiadomosc pojawiają sie jej szczegóły i mozliwosc zapisu do pliku
    */
    private void JWiadomosciMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JWiadomosciMouseClicked
        jBZapisz.setEnabled(true);
        jBUsun.setEnabled(true);
        if(jWiadomosc.getText().equals("Wiadomosci odebrane"))
        {
            
            jTSzczegoły.setText(listaOdebranychWiadomosci.getOne(JWiadomosci.getSelectedIndex())+"");
        }
        else
        {
            jTSzczegoły.setText(listaWysłanychWiadomosci.getOne(JWiadomosci.getSelectedIndex())+"");
        }
    }//GEN-LAST:event_JWiadomosciMouseClicked

    /*
    * Zapisz wiadomosci do pliku
    */
    private void jBZapiszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBZapiszActionPerformed
        
       JFileChooser jfc = new JFileChooser(".");
        if(jfc.showSaveDialog(this)== JFileChooser.APPROVE_OPTION){
            File f= jfc.getSelectedFile();
            
             if(jWiadomosc.getText().equals("Wiadomosci odebrane"))
             {
                 listaOdebranychWiadomosci.zapiszDoPliku(f,JWiadomosci.getSelectedIndex());
             }
             else
            {
                 listaWysłanychWiadomosci.zapiszDoPliku(f,JWiadomosci.getSelectedIndex());
            }
        }
    }//GEN-LAST:event_jBZapiszActionPerformed

    /*
    * Po kliknieciu w kontakty wyswietlaja sie kontaktu :)
    */
    private void jKonktaktyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jKonktaktyMouseClicked
       
        jBDodaj.setVisible(true);
        jPanel2.setVisible(true);
        label1.setVisible(false);
        jTSzczegoły.setVisible(false);
        jBZapisz.setVisible(false);
        jBUsun.setVisible(true);
        jBUsun.setEnabled(false);
        jPanel3.setVisible(false);
        jPanel6.setVisible(false);
        jPanel7.setVisible(true);
        jWiadomosc.setText("Kontakty");
        DefaultListModel<String> lm = new DefaultListModel<>();      
        for(int i=0;i<listaKontaktów.getListaKontaktów().size();i++)
        {
        lm.addElement(listaKontaktów.getOne(i).toString());
        }
        JWiadomosci.setModel(lm);
        
        
    }//GEN-LAST:event_jKonktaktyMouseClicked

    /**
     * Usuniecie kontaktu 
     * @param evt 
     */
    private void jBUsunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBUsunMouseClicked
        int index=JWiadomosci.getSelectedIndex();
        listaKontaktów.usun(index);
         DefaultListModel<String> lm = new DefaultListModel<>();      
        for(int i=0;i<listaKontaktów.getListaKontaktów().size();i++)
        {
        lm.addElement(listaKontaktów.getOne(i).toString());
        }
        JWiadomosci.setModel(lm);
    }//GEN-LAST:event_jBUsunMouseClicked

    /**
     * Dodanie do konktaktu osoby
     * @param evt 
     */
    private void jBDodajOsobeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDodajOsobeActionPerformed

           String tmp=jDo.getText();
        OsobaKonktakt kontakt=new OsobaKonktakt(jTextField1.getText(),jTextField2.getText(),jTextField3.getText(),jTextField4.getText());
        listaKontaktów.add(kontakt);
         DefaultListModel<String> lm = new DefaultListModel<>();      
        for(int i=0;i<listaKontaktów.getListaKontaktów().size();i++)
        {
        lm.addElement(listaKontaktów.getOne(i).toString());
        }
        JWiadomosci.setModel(lm);
        
    }//GEN-LAST:event_jBDodajOsobeActionPerformed

    /**
     * Dodanie do konktaktu firmy
     * @param evt 
     */
    private void jbDodajFirmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDodajFirmeActionPerformed
        FirmaKontakt kontakt=new FirmaKontakt(jTextField5.getText(),jTextField6.getText(),jTextField7.getText());
        listaKontaktów.add(kontakt);        // TODO add your handling code here:
        
         DefaultListModel<String> lm = new DefaultListModel<>();      
        for(int i=0;i<listaKontaktów.getListaKontaktów().size();i++)
        {
        lm.addElement(listaKontaktów.getOne(i).toString());
        }
        JWiadomosci.setModel(lm);
    }//GEN-LAST:event_jbDodajFirmeActionPerformed

    private void jBDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDodajActionPerformed
        jPanel3.setVisible(true);  
        // TODO add your handling code here:
    }//GEN-LAST:event_jBDodajActionPerformed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        jPanel6.setVisible(true);
        jPanel7.setVisible(false);
       
        
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
     
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         Wiadomosc wiadomosc=new Wiadomosc(jDo.getText(),jTemat.getText(),"2018-05-08",jZalaczni.getText(),jTresc.getText());
         listaWysłanychWiadomosci.add(wiadomosc);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainFrame().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imie;
    private javax.swing.JList<String> JWiadomosci;
    private javax.swing.JLabel Temat;
    private javax.swing.JLabel Temat1;
    private javax.swing.JLabel Temat2;
    private javax.swing.JButton jBDodaj;
    private javax.swing.JButton jBDodajOsobe;
    private javax.swing.JButton jBUsun;
    private javax.swing.JButton jBZapisz;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JTextField jDo;
    private javax.swing.JLabel jKonktakty;
    private javax.swing.JLabel jLOdebrane;
    private javax.swing.JLabel jLWysłane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private java.awt.TextArea jTSzczegoły;
    private javax.swing.JTextField jTemat;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextArea jTresc;
    private javax.swing.JLabel jWiadomosc;
    private javax.swing.JTextField jZalaczni;
    private javax.swing.JLabel jZalogowany;
    private javax.swing.JButton jbDodajFirme;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
