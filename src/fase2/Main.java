/*
 * Copyright (C) 2013 Javier García Escobedo <javiergarbedo.es>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package fase2;

import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier García Escobedo (javiergarbedo.es)
 */
public class Main extends javax.swing.JFrame {
    
    String secuenciaJuego = "";
    String secuenciaBotonesMostrados = "";
    String secuenciaPulsada = "";
    int numImagenesAcertar = 4;

    /** Creates new form Main */
    public Main() {
        initComponents();

        jToggleButton1.setEnabled(false);
        jToggleButton2.setEnabled(false);
        jToggleButton3.setEnabled(false);
        jToggleButton4.setEnabled(false);
        jToggleButton5.setEnabled(false);
        jToggleButton6.setEnabled(false);
        jToggleButton7.setEnabled(false);
        jToggleButton8.setEnabled(false);
        jToggleButton9.setEnabled(false);
        jToggleButton10.setEnabled(false);
        jToggleButton11.setEnabled(false);
        jToggleButton12.setEnabled(false);
        jToggleButton13.setEnabled(false);
        jToggleButton14.setEnabled(false);
        jToggleButton15.setEnabled(false);
        jToggleButton16.setEnabled(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        jToggleButton10 = new javax.swing.JToggleButton();
        jToggleButton11 = new javax.swing.JToggleButton();
        jToggleButton12 = new javax.swing.JToggleButton();
        jToggleButton13 = new javax.swing.JToggleButton();
        jToggleButton14 = new javax.swing.JToggleButton();
        jToggleButton15 = new javax.swing.JToggleButton();
        jToggleButton16 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jButtonRecordar = new javax.swing.JButton();
        jButtonEmpezar = new javax.swing.JButton();
        jButtonComprobar = new javax.swing.JButton();
        jLabelTextoAciertos = new javax.swing.JLabel();
        jLabelAciertos = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jToggleButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jToggleButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jToggleButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jToggleButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jToggleButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jToggleButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jToggleButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jToggleButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jToggleButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jToggleButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jToggleButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jToggleButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jToggleButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToggleButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToggleButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToggleButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToggleButton13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton16)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jToggleButton4)
                    .addComponent(jToggleButton3)
                    .addComponent(jToggleButton2)
                    .addComponent(jToggleButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jToggleButton8)
                    .addComponent(jToggleButton7)
                    .addComponent(jToggleButton6)
                    .addComponent(jToggleButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jToggleButton12)
                    .addComponent(jToggleButton11)
                    .addComponent(jToggleButton10)
                    .addComponent(jToggleButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jToggleButton16)
                    .addComponent(jToggleButton15)
                    .addComponent(jToggleButton14)
                    .addComponent(jToggleButton13))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonRecordar.setText("Recordar");
        jButtonRecordar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRecordarActionPerformed(evt);
            }
        });

        jButtonEmpezar.setText("Empezar");
        jButtonEmpezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmpezarActionPerformed(evt);
            }
        });

        jButtonComprobar.setText("Comprobar");
        jButtonComprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComprobarActionPerformed(evt);
            }
        });

        jLabelTextoAciertos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTextoAciertos.setText("Aciertos");

        jLabelAciertos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelAciertos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonRecordar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEmpezar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonComprobar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTextoAciertos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelAciertos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonEmpezar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRecordar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonComprobar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTextoAciertos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAciertos, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRecordarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRecordarActionPerformed
        Random generadorNum = new Random();
        secuenciaBotonesMostrados = "";
        for(int i=0; i<16; i++) {
            char letra = (char)(generadorNum.nextInt(16) + 'A');;
            secuenciaBotonesMostrados += letra;
        }
        
        secuenciaPulsada = "";

        jToggleButton1.setEnabled(true);
        jToggleButton2.setEnabled(true);
        jToggleButton3.setEnabled(true);
        jToggleButton4.setEnabled(true);
        jToggleButton5.setEnabled(true);
        jToggleButton6.setEnabled(true);
        jToggleButton7.setEnabled(true);
        jToggleButton8.setEnabled(true);
        jToggleButton9.setEnabled(true);
        jToggleButton10.setEnabled(true);
        jToggleButton11.setEnabled(true);
        jToggleButton12.setEnabled(true);
        jToggleButton13.setEnabled(true);
        jToggleButton14.setEnabled(true);
        jToggleButton15.setEnabled(true);
        jToggleButton16.setEnabled(true);

        try {
            jToggleButton1.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+secuenciaBotonesMostrados.charAt(0) +".png"))));            
            jToggleButton2.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+secuenciaBotonesMostrados.charAt(1) +".png"))));            
            jToggleButton3.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+secuenciaBotonesMostrados.charAt(2) +".png"))));            
            jToggleButton4.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+secuenciaBotonesMostrados.charAt(3) +".png"))));            
            jToggleButton5.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+secuenciaBotonesMostrados.charAt(4) +".png"))));            
            jToggleButton6.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+secuenciaBotonesMostrados.charAt(5) +".png"))));            
            jToggleButton7.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+secuenciaBotonesMostrados.charAt(6) +".png"))));            
            jToggleButton8.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+secuenciaBotonesMostrados.charAt(7) +".png"))));            
            jToggleButton9.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+secuenciaBotonesMostrados.charAt(8) +".png"))));            
            jToggleButton10.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+secuenciaBotonesMostrados.charAt(9) +".png"))));            
            jToggleButton11.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+secuenciaBotonesMostrados.charAt(10) +".png"))));            
            jToggleButton12.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+secuenciaBotonesMostrados.charAt(11) +".png"))));            
            jToggleButton13.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+secuenciaBotonesMostrados.charAt(12) +".png"))));            
            jToggleButton14.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+secuenciaBotonesMostrados.charAt(13) +".png"))));            
            jToggleButton15.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+secuenciaBotonesMostrados.charAt(14) +".png"))));            
            jToggleButton16.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+secuenciaBotonesMostrados.charAt(15) +".png"))));            

            jLabel1.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/Z.png"))));            
            jLabel2.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/Z.png"))));            
            jLabel3.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/Z.png"))));            
            jLabel4.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/Z.png"))));            
            jLabel5.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/Z.png"))));            
            jLabel6.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/Z.png"))));            
            jLabel7.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/Z.png"))));            
        } catch(IOException e) {
            JOptionPane.showMessageDialog(this, "Se ha producido un error inesperado\n"+e.getMessage());
            System.exit(0);
        }
    }//GEN-LAST:event_jButtonRecordarActionPerformed

    private void jButtonEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmpezarActionPerformed
        Random generadorNum = new Random();
        secuenciaJuego = "";
        for(int i=0; i<numImagenesAcertar; i++) {
            char letra = (char)(generadorNum.nextInt(16) + 'A');
            secuenciaJuego += letra;
        }
        
        jToggleButton1.setEnabled(false);
        jToggleButton2.setEnabled(false);
        jToggleButton3.setEnabled(false);
        jToggleButton4.setEnabled(false);
        jToggleButton5.setEnabled(false);
        jToggleButton6.setEnabled(false);
        jToggleButton7.setEnabled(false);
        jToggleButton8.setEnabled(false);
        jToggleButton9.setEnabled(false);
        jToggleButton10.setEnabled(false);
        jToggleButton11.setEnabled(false);
        jToggleButton12.setEnabled(false);
        jToggleButton13.setEnabled(false);
        jToggleButton14.setEnabled(false);
        jToggleButton15.setEnabled(false);
        jToggleButton16.setEnabled(false);

        jToggleButton1.setSelected(false);
        jToggleButton2.setSelected(false);
        jToggleButton3.setSelected(false);
        jToggleButton4.setSelected(false);
        jToggleButton5.setSelected(false);
        jToggleButton6.setSelected(false);
        jToggleButton7.setSelected(false);
        jToggleButton8.setSelected(false);
        jToggleButton9.setSelected(false);
        jToggleButton10.setSelected(false);
        jToggleButton11.setSelected(false);
        jToggleButton12.setSelected(false);
        jToggleButton13.setSelected(false);
        jToggleButton14.setSelected(false);
        jToggleButton15.setSelected(false);
        jToggleButton16.setSelected(false);
        
        try {
            switch(numImagenesAcertar) {
                case 7:
                    jLabel7.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+secuenciaJuego.charAt(6) +".png"))));            
                case 6:
                    jLabel6.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+secuenciaJuego.charAt(5) +".png"))));            
                case 5:
                    jLabel5.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+secuenciaJuego.charAt(4) +".png"))));            
                case 4:
                    jLabel1.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+secuenciaJuego.charAt(0) +".png"))));            
                    jLabel2.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+secuenciaJuego.charAt(1) +".png"))));            
                    jLabel3.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+secuenciaJuego.charAt(2) +".png"))));            
                    jLabel4.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+secuenciaJuego.charAt(3) +".png"))));            
                    break;
            }

            jToggleButton1.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/Z.png"))));            
            jToggleButton2.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/Z.png"))));            
            jToggleButton3.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/Z.png"))));            
            jToggleButton4.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/Z.png"))));            
            jToggleButton5.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/Z.png"))));            
            jToggleButton6.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/Z.png"))));            
            jToggleButton7.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/Z.png"))));            
            jToggleButton8.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/Z.png"))));            
            jToggleButton9.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/Z.png"))));            
            jToggleButton10.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/Z.png"))));            
            jToggleButton11.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/Z.png"))));            
            jToggleButton12.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/Z.png"))));            
            jToggleButton13.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/Z.png"))));            
            jToggleButton14.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/Z.png"))));            
            jToggleButton15.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/Z.png"))));            
            jToggleButton16.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/Z.png"))));            
        } catch(IOException e) {
            JOptionPane.showMessageDialog(this, "Se ha producido un error inesperado\n"+e.getMessage());
            System.exit(0);
        }                        
    }//GEN-LAST:event_jButtonEmpezarActionPerformed

    private void jButtonComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComprobarActionPerformed
        int contadorAciertos = 0;
        
        if(jToggleButton1.isSelected() && secuenciaJuego.indexOf(secuenciaBotonesMostrados.charAt(0))!=-1) {
            contadorAciertos++;
        } else {
            jToggleButton1.setEnabled(false);
        }
                
        if(jToggleButton2.isSelected() && secuenciaJuego.indexOf(secuenciaBotonesMostrados.charAt(1))!=-1) {
            contadorAciertos++;
        } else {
            jToggleButton2.setEnabled(false);
        }

        if(jToggleButton3.isSelected() && secuenciaJuego.indexOf(secuenciaBotonesMostrados.charAt(2))!=-1) {
            contadorAciertos++;
        } else {
            jToggleButton3.setEnabled(false);
        }

        if(jToggleButton4.isSelected() && secuenciaJuego.indexOf(secuenciaBotonesMostrados.charAt(3))!=-1) {
            contadorAciertos++;
        } else {
            jToggleButton4.setEnabled(false);
        }

        if(jToggleButton5.isSelected() && secuenciaJuego.indexOf(secuenciaBotonesMostrados.charAt(4))!=-1) {
            contadorAciertos++;
        } else {
            jToggleButton5.setEnabled(false);
        }

        if(jToggleButton6.isSelected() && secuenciaJuego.indexOf(secuenciaBotonesMostrados.charAt(5))!=-1) {
            contadorAciertos++;
        } else {
            jToggleButton6.setEnabled(false);
        }

        if(jToggleButton7.isSelected() && secuenciaJuego.indexOf(secuenciaBotonesMostrados.charAt(6))!=-1) {
            contadorAciertos++;
        } else {
            jToggleButton7.setEnabled(false);
        }

        if(jToggleButton8.isSelected() && secuenciaJuego.indexOf(secuenciaBotonesMostrados.charAt(7))!=-1) {
            contadorAciertos++;
        } else {
            jToggleButton8.setEnabled(false);
        }

        if(jToggleButton9.isSelected() && secuenciaJuego.indexOf(secuenciaBotonesMostrados.charAt(8))!=-1) {
            contadorAciertos++;
        } else {
            jToggleButton9.setEnabled(false);
        }

        if(jToggleButton10.isSelected() && secuenciaJuego.indexOf(secuenciaBotonesMostrados.charAt(9))!=-1) {
            contadorAciertos++;
        } else {
            jToggleButton10.setEnabled(false);
        }

        if(jToggleButton11.isSelected() && secuenciaJuego.indexOf(secuenciaBotonesMostrados.charAt(10))!=-1) {
            contadorAciertos++;
        } else {
            jToggleButton11.setEnabled(false);
        }

        if(jToggleButton12.isSelected() && secuenciaJuego.indexOf(secuenciaBotonesMostrados.charAt(11))!=-1) {
            contadorAciertos++;
        } else {
            jToggleButton12.setEnabled(false);
        }

        if(jToggleButton13.isSelected() && secuenciaJuego.indexOf(secuenciaBotonesMostrados.charAt(12))!=-1) {
            contadorAciertos++;
        } else {
            jToggleButton13.setEnabled(false);
        }

        if(jToggleButton14.isSelected() && secuenciaJuego.indexOf(secuenciaBotonesMostrados.charAt(13))!=-1) {
            contadorAciertos++;
        } else {
            jToggleButton14.setEnabled(false);
        }

        if(jToggleButton15.isSelected() && secuenciaJuego.indexOf(secuenciaBotonesMostrados.charAt(14))!=-1) {
            contadorAciertos++;
        } else {
            jToggleButton15.setEnabled(false);
        }

        if(jToggleButton16.isSelected() && secuenciaJuego.indexOf(secuenciaBotonesMostrados.charAt(15))!=-1) {
            contadorAciertos++;
        } else {
            jToggleButton16.setEnabled(false);
        }

        jLabelAciertos.setText(String.valueOf(contadorAciertos));
        
        if(contadorAciertos == numImagenesAcertar && numImagenesAcertar<7) {
            numImagenesAcertar++;
        }
    }//GEN-LAST:event_jButtonComprobarActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonComprobar;
    private javax.swing.JButton jButtonEmpezar;
    private javax.swing.JButton jButtonRecordar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelAciertos;
    private javax.swing.JLabel jLabelTextoAciertos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton11;
    private javax.swing.JToggleButton jToggleButton12;
    private javax.swing.JToggleButton jToggleButton13;
    private javax.swing.JToggleButton jToggleButton14;
    private javax.swing.JToggleButton jToggleButton15;
    private javax.swing.JToggleButton jToggleButton16;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    // End of variables declaration//GEN-END:variables

}
