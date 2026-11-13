/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.dijsktramapa.view;

import com.mycompany.dijsktramapa.service.Grafo;
import com.mycompany.dijsktramapa.service.Lugar;
import com.mycompany.dijsktramapa.service.MapPanel;
import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.util.*;
import javax.imageio.ImageIO;
import javax.swing.*;


/**
 *
 * @author alexis
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName());
    private Grafo grafo = new Grafo();
    private MapPanel mp;
    private Map.Entry<List<Lugar>, Double> p;
    
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        
        initComponents();
        distanciaTxt.setText("");
        grafo = crearGrafo();
        try {
            java.net.URL url = getClass().getResource("/Mapa.jpeg");
            System.out.println("Ruta buscada: " + url);   // si imprime "null", la ruta está mal
            BufferedImage mapa = ImageIO.read(getClass().getResource("/Mapa.jpeg"));
            mp = new MapPanel(mapa, grafo.nodos);
            
        }
        catch(Exception e) {
            System.out.println("error al mostrar el mapa " + e.getMessage());
        }

        panelCentral.setLayout(new BorderLayout());
        panelCentral.add(new JScrollPane(mp), BorderLayout.CENTER);
        
        pack();
        setLocationRelativeTo(null);
        
        
    }
    // aqui se hardcodea el grafo
    private Grafo crearGrafo() {
        
        Grafo g = new Grafo();

        Lugar entrada = new Lugar("Entrada", 520, 144);
        Lugar biblioteca = new Lugar("Biblioteca", 400, 213);
        Lugar casetaEstacionamiento  = new Lugar("Caseta de Vigilancia del Estacionamiento", 733, 201);
        Lugar estacionamiento =  new Lugar("Estacionamiento", 924, 309);
        Lugar auditorioVinculacion = new  Lugar("Auditorio de vinculación", 166, 289);
        Lugar direccion = new Lugar("Dirección", 201, 304);
        Lugar vinculacion = new Lugar("Edificio de Vinculación", 206, 334);
        Lugar palapas = new Lugar("Palapas", 383, 337);
        Lugar cocinasGastronomia =  new Lugar("Cocinas de Gastronomía", 169, 379);
        Lugar edificioA =  new Lugar("Edificio A", 457, 431);
        Lugar edificioB =  new Lugar("Edificio B", 656, 483);
        Lugar cabaniaGastro = new Lugar("Cabaña de Gastronomía", 167, 454);
        Lugar canchaFutbol = new Lugar("Cancha de Futbol", 879, 631);
        Lugar edificioE = new Lugar("Edificio E", 376, 616);
        Lugar edificioTics = new Lugar("Edificio de TICS", 581, 644);
        Lugar auditorioAbandonado = new Lugar("Auditorio Abandonado", 190, 640);
        Lugar canchaBasquet =  new Lugar("Canchas de basketball", 249, 703);
        Lugar cafeteria =  new Lugar("Cafetería", 444, 717);
        
        g.addNode(entrada);
        g.addNode(biblioteca);
        g.addNode(casetaEstacionamiento);
        g.addNode(estacionamiento);
        g.addNode(auditorioVinculacion);
        g.addNode(direccion);
        g.addNode(vinculacion);
        g.addNode(palapas);
        g.addNode(cocinasGastronomia);
        g.addNode(edificioA);
        g.addNode(edificioB);
        g.addNode(cabaniaGastro);
        g.addNode(canchaFutbol);
        g.addNode(edificioE);
        g.addNode(edificioTics);
        g.addNode(auditorioAbandonado);
        g.addNode(canchaBasquet);
        g.addNode(cafeteria);

        g.addAristaNoDirigida(entrada, biblioteca, 35.6);
        g.addAristaNoDirigida(entrada, edificioA, 93.2);
        g.addAristaNoDirigida(entrada, edificioB, 113.0);
        g.addAristaNoDirigida(entrada, casetaEstacionamiento, 70.3);
        g.addAristaNoDirigida(biblioteca, auditorioVinculacion, 91.2);
        g.addAristaNoDirigida(biblioteca, palapas, 43.4);
        g.addAristaNoDirigida(casetaEstacionamiento, edificioB, 91.7);
        g.addAristaNoDirigida(casetaEstacionamiento, estacionamiento, 53.0);
        g.addAristaNoDirigida(estacionamiento, edificioB, 92.2);
        g.addAristaNoDirigida(estacionamiento, canchaFutbol, 108.0);
        g.addAristaNoDirigida(auditorioVinculacion, vinculacion, 20.0);
        g.addAristaNoDirigida(direccion, vinculacion, 5.89);
        g.addAristaNoDirigida(vinculacion, palapas, 59.7);
        g.addAristaNoDirigida(vinculacion, cocinasGastronomia, 21.2);
        g.addAristaNoDirigida(palapas, edificioA, 38.7);
        g.addAristaNoDirigida(cocinasGastronomia, cabaniaGastro, 26.0);
        g.addAristaNoDirigida(edificioA, cabaniaGastro, 94.8);
        g.addAristaNoDirigida(edificioA, auditorioAbandonado, 108.0);
        g.addAristaNoDirigida(edificioA, edificioE, 64.8);
        g.addAristaNoDirigida(edificioA, edificioB, 62.4);
        g.addAristaNoDirigida(edificioB, edificioE, 95.0);
        g.addAristaNoDirigida(edificioB, edificioTics, 59.5);
        g.addAristaNoDirigida(edificioB, canchaFutbol, 95.5);
        g.addAristaNoDirigida(cabaniaGastro, auditorioAbandonado, 60.5);
        g.addAristaNoDirigida(canchaFutbol, edificioTics, 99.7);
        g.addAristaNoDirigida(edificioE, edificioTics, 69.1);
        g.addAristaNoDirigida(edificioE, cafeteria, 41.2);
        g.addAristaNoDirigida(edificioE, canchaBasquet, 50.8);
        g.addAristaNoDirigida(edificioE, auditorioAbandonado, 60.7);
        g.addAristaNoDirigida(edificioTics, cafeteria, 51.4);
        g.addAristaNoDirigida(auditorioAbandonado, canchaBasquet, 26.8);
        g.addAristaNoDirigida(auditorioAbandonado, palapas, 115.08);
        
        return g;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botonCalcularRuta = new javax.swing.JButton();
        desplegableA = new javax.swing.JComboBox<>();
        desplegableB = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelCentral = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        distanciaTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 153));
        setName("Ventana"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel2.setText("Sistema de Rutas Inteligentes dentro del ITSUR");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 27)); // NOI18N
        jLabel3.setText("Seleccione el origen y destino");

        botonCalcularRuta.setBackground(new java.awt.Color(0, 153, 0));
        botonCalcularRuta.setFont(new java.awt.Font("Liberation Sans", 1, 33)); // NOI18N
        botonCalcularRuta.setForeground(new java.awt.Color(0, 0, 0));
        botonCalcularRuta.setText("Calcular Ruta");
        botonCalcularRuta.setBorderPainted(false);
        botonCalcularRuta.setName("botonCalcularRuta"); // NOI18N
        botonCalcularRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularRutaActionPerformed(evt);
            }
        });

        desplegableA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Biblioteca", "Cafetería", "Dirección", "Edificio A", "Edificio B", "Edificio E", "Edificio de Vinculación", "Palapas", "Edificio de TICS", "Cancha de Futbol", "Canchas de basketball", "Estacionamiento", "Auditorio de vinculación", "Auditorio principal", "Caseta de vigilancia del estacionamiento", "Entrada", "Cocinas de Gastronomía", "Cabaña de Gastronomía" }));

        desplegableB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Biblioteca", "Cafetería", "Dirección", "Edificio A", "Edificio B", "Edificio E", "Edificio de Vinculación", "Palapas", "Edificio de TICS", "Cancha de Futbol", "Canchas de basketball", "Estacionamiento", "Auditorio de vinculación", "Auditorio principal", "Caseta de vigilancia del estacionamiento", "Entrada", "Cocinas de Gastronomía", "Cabaña de Gastronomía" }));

        jLabel4.setText("Punto de partida");

        jLabel5.setText("Destino");

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 677, Short.MAX_VALUE)
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 369, Short.MAX_VALUE)
        );

        distanciaTxt.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        distanciaTxt.setText("jLabel6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(470, 470, 470))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(310, 310, 310))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(panelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(botonCalcularRuta)
                                .addGap(94, 94, 94))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(desplegableB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(desplegableA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(distanciaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(22, 22, 22)
                        .addComponent(desplegableA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(desplegableB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonCalcularRuta))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(panelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 473, Short.MAX_VALUE)
                .addComponent(distanciaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213))
        );

        desplegableA.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCalcularRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularRutaActionPerformed
        // TODO add your handling code here:
        
        String aNombre = (String) desplegableA.getSelectedItem();
        String bNombre = (String) desplegableB.getSelectedItem();
        
      
        // Map.Entry que devuelve el dijktstra, tiene la ruta  y la distancia
        p = grafo.dijkstra(aNombre, bNombre);
        
        mp.setRuta(p.getKey());
        String dis = String.format("%.2f", p.getValue());
        distanciaTxt.setText("La distancia más corta entre " + aNombre + " y " + bNombre + " es de " + dis + "m");
    }//GEN-LAST:event_botonCalcularRutaActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new VentanaPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCalcularRuta;
    private javax.swing.JComboBox<String> desplegableA;
    private javax.swing.JComboBox<String> desplegableB;
    private javax.swing.JLabel distanciaTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel panelCentral;
    // End of variables declaration//GEN-END:variables
}
