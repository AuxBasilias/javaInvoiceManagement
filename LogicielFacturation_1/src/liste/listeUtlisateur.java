/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package liste;

import Connection.connection;
import java.awt.Color;
import java.awt.ScrollPane;
import java.awt.print.PrinterException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Acer i7
 */
public class listeUtlisateur extends javax.swing.JFrame {
    connection conn = new connection();
    int idf;
    String ancien;
    /**
     * Creates new form TemplateListe
     */
    public listeUtlisateur() {
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        textSearch = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        Acp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        idff = new javax.swing.JLabel();
        Nvp = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 510, 10));

        jLabel1.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 24)); // NOI18N
        jLabel1.setText("UTILISATEUR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 180, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jTable1.setBackground(new Color(255,255,255));
        jTable1.setGridColor(new java.awt.Color(153, 0, 0));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTable1ComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 210));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 500, 10));

        jButton1.setText("Imprimer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 87, -1));

        jButton2.setText("Fermer");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 370, 110, 80));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icon/icons8_edit_property_35px_1.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, 70, 40));

        jButton4.setText("Supprimer");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Nouveau mot de passe :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 12, 380));

        jPanel1.setOpaque(false);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icon/icons8_search_35px_1.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        textSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7)
                    .addComponent(textSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 220, 50));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icon/bouton-actualiser.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, -1, -1));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icon/icons8_synchronize_35px.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 240, 70, 40));

        Acp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcpActionPerformed(evt);
            }
        });
        getContentPane().add(Acp, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 130, 130, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Ancien mot de passe :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, -1, -1));

        idff.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        idff.setText("Identifiant");
        getContentPane().add(idff, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 110, -1));

        Nvp.setText("jPasswordField1");
        getContentPane().add(Nvp, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 170, 130, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fBlanc.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            if(jTable1.getSelectedRow()!=-1){
               
            
            String a, n;
             int i=jTable1.getSelectedRow();
            int id = (int) jTable1.getValueAt(i,0);
            String identifiant = (String) jTable1.getValueAt(i, 1);
           idff.setText(identifiant);
            a= Acp.getText();
            n= Nvp.getText();
                try {
                    Statement st = conn.etablirconnection().createStatement();
                    ResultSet rs = st.executeQuery("select mot_de_passe from utilisateur where id="+id+" ");
                    if(rs.next()){
                         ancien=rs.getString("mot_de_passe");
                    }
                } catch (Exception e) {
                    System.err.println(e);
                    
                }
            if(a.equals(ancien)){
                JOptionPane.showMessageDialog(null, "Ancien mot de pasee: incorect !!!!! ");
            }else{     
            String query="update utilisateur"
                    + " set mot_de_passe ='"+n+"' where id ='"+id+"' ";
                try {
                    Statement st = conn.etablirconnection().createStatement();
                     st.executeUpdate(query);
                     jButton8ActionPerformed(evt);
                     
                     JOptionPane.showMessageDialog(null, "Information mis à jour avec succès");
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                        } }
                
                
            }else{JOptionPane.showMessageDialog(null, "Aucune ligne sélectionnée");}
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        try{
          
           Statement st = conn.etablirconnection().createStatement();
           ResultSet rt = st.executeQuery("select * from utIlisateur");
           jTable1.setModel(DbUtils.resultSetToTableModel(rt));
        }catch(Exception e){
            JOptionPane.showMessageDialog(jTable1, e);
        }
        
    }//GEN-LAST:event_formComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("Liste des utilisateurs");
        try {
            // TODO add your handling code here:
            jTable1.print(JTable.PrintMode.NORMAL,header,null);
                    } catch (PrinterException ex) {
            Logger.getLogger(listeUtlisateur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        boolean first = true;
        DefaultTableModel md = new DefaultTableModel(); 
        String s = textSearch.getText();
        connection conn= new connection();
        md.setColumnIdentifiers(new String []{"id","identifiant"}); 
        try{
        Statement st = conn.etablirconnection().createStatement();
        ResultSet rs = st.executeQuery("SELECT * id, n_user FROM utlisateur WHERE nom ='"+s+"' ");
        if(rs.next()){
           
                first=false;
                md.addRow(new Object[]{rs.getObject("id"),rs.getObject("n_user") });}
        if(first){
            JOptionPane.showMessageDialog(null, "Aucun résultat trouvé");
        }
        jTable1.setModel(md); 
       
        
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Chef Il y'a problème");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void textSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSearchActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int i = jTable1.getSelectedRow();
        
        if(i>-1){
        int r = jTable1.getSelectedRow();
        int id=(int) jTable1.getValueAt(r, 0);
        try{
           connection conn= new connection();
           Statement st = conn.etablirconnection().createStatement();
           st.executeUpdate("delete from utilisateur where id="+id+"");
           JOptionPane.showMessageDialog(null, "Ligne Supprimé avec succès");
            jButton8ActionPerformed(evt);
           
           //DbUtils.resultSetToTableModel(rt).removeRow(id);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        
        }
        }else{JOptionPane.showMessageDialog(null, "Aucune ligne sélectionnée"); }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int r = jTable1.getSelectedRow();
        String id=jTable1.getValueAt(r, 0).toString();
        String identifiant= jTable1.getValueAt(r, 1).toString();
        
        idff.setText(identifiant);

        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTable1ComponentShown
        // TODO add your handling code here:
    
    }//GEN-LAST:event_jTable1ComponentShown

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        try{
           
           Statement st = conn.etablirconnection().createStatement();
           ResultSet rt = st.executeQuery("select * from utilisateur");
           jTable1.setModel(DbUtils.resultSetToTableModel(rt));
        }catch(Exception e){
        
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        Acp.setText("");
        Nvp.setText("");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void AcpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AcpActionPerformed

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
            java.util.logging.Logger.getLogger(listeUtlisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listeUtlisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listeUtlisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listeUtlisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listeUtlisateur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Acp;
    private javax.swing.JPasswordField Nvp;
    private javax.swing.JLabel idff;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField textSearch;
    // End of variables declaration//GEN-END:variables
}
