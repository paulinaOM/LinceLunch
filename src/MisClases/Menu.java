/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

/**
 *
 * @author TeamPN
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        itemRegistro = new javax.swing.JMenu();
        itemConsultaPedido = new javax.swing.JMenu();
        itemAltapedido = new javax.swing.JMenuItem();
        itemConsultapedido = new javax.swing.JMenuItem();
        itemproductos = new javax.swing.JMenu();
        btnSalir = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MisClases/iconos/logos.png"))); // NOI18N

        jMenuBar1.setBackground(new java.awt.Color(51, 204, 255));
        jMenuBar1.setForeground(new java.awt.Color(102, 204, 255));

        itemRegistro.setBackground(new java.awt.Color(204, 204, 255));
        itemRegistro.setForeground(new java.awt.Color(0, 153, 153));
        itemRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MisClases/user.png"))); // NOI18N
        itemRegistro.setText("Registro");
        itemRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemRegistroMouseClicked(evt);
            }
        });
        itemRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRegistroActionPerformed(evt);
            }
        });
        jMenuBar1.add(itemRegistro);

        itemConsultaPedido.setForeground(new java.awt.Color(0, 153, 153));
        itemConsultaPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MisClases/icono-registrar.png"))); // NOI18N
        itemConsultaPedido.setText("Pedidos");
        itemConsultaPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemConsultaPedidoMouseClicked(evt);
            }
        });
        itemConsultaPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultaPedidoActionPerformed(evt);
            }
        });

        itemAltapedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MisClases/iconos/add-iloveimg-resized.png"))); // NOI18N
        itemAltapedido.setText("Alta Pedido");
        itemAltapedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemAltapedidoMouseClicked(evt);
            }
        });
        itemAltapedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAltapedidoActionPerformed(evt);
            }
        });
        itemConsultaPedido.add(itemAltapedido);

        itemConsultapedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MisClases/iconos/consulta-iloveimg-resized.png"))); // NOI18N
        itemConsultapedido.setText("Consulta pedido");
        itemConsultapedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemConsultapedidoMouseClicked(evt);
            }
        });
        itemConsultapedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultapedidoActionPerformed(evt);
            }
        });
        itemConsultaPedido.add(itemConsultapedido);

        jMenuBar1.add(itemConsultaPedido);

        itemproductos.setForeground(new java.awt.Color(0, 153, 153));
        itemproductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MisClases/Fast-Food-icon_30334.png"))); // NOI18N
        itemproductos.setText("Productos");
        itemproductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemproductosMouseClicked(evt);
            }
        });
        jMenuBar1.add(itemproductos);

        btnSalir.setForeground(new java.awt.Color(0, 153, 153));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MisClases/iconos/salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemAltapedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAltapedidoActionPerformed
        // TODO add your handling code here:
        AltaPedido x= new AltaPedido();
        x.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_itemAltapedidoActionPerformed

    private void itemRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegistroActionPerformed
        // TODO add your handling code here:
        Registro x= new Registro();
        x.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itemRegistroActionPerformed

    private void itemRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemRegistroMouseClicked
        // TODO add your handling code here:
        Registro x= new Registro();
        x.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itemRegistroMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void itemAltapedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemAltapedidoMouseClicked
        // TODO add your handling code here:
        AltaPedido x= new AltaPedido();
        x.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itemAltapedidoMouseClicked

    private void itemproductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemproductosMouseClicked
        // TODO add your handling code here:
        Productos x= new Productos();
        x.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itemproductosMouseClicked

    private void itemConsultaPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultaPedidoActionPerformed
        // TODO add your handling code here:
  
        
    }//GEN-LAST:event_itemConsultaPedidoActionPerformed

    private void itemConsultaPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemConsultaPedidoMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_itemConsultaPedidoMouseClicked

    private void itemConsultapedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemConsultapedidoMouseClicked
        // TODO add your handling code here:
        ConsultaPedido x=new ConsultaPedido();
        x.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itemConsultapedidoMouseClicked

    private void itemConsultapedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultapedidoActionPerformed
        // TODO add your handling code here:
         ConsultaPedido x=new ConsultaPedido();
        x.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itemConsultapedidoActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnSalir;
    private javax.swing.JMenuItem itemAltapedido;
    private javax.swing.JMenu itemConsultaPedido;
    private javax.swing.JMenuItem itemConsultapedido;
    private javax.swing.JMenu itemRegistro;
    private javax.swing.JMenu itemproductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    // End of variables declaration//GEN-END:variables
}
