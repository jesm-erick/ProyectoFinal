package igu;

import java.awt.Dimension;
import javax.swing.JInternalFrame;


public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        DesktopPaneEscritorio = new javax.swing.JDesktopPane();
        EscritorioPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        CerrarSesionMenuItem = new javax.swing.JMenuItem();
        SalirMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        AddVentaMenuItem = new javax.swing.JMenuItem();
        AddProductoMenuItem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        AddSocioMenuItem = new javax.swing.JMenuItem();
        DeleteSocioMenuItem = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        CClientesMenuItem = new javax.swing.JMenuItem();
        RClientesMenuItem = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        CVentasMenuItem = new javax.swing.JMenuItem();
        RVentasMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        CProductosMenuItem = new javax.swing.JMenuItem();
        RProductosMenuItem = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        CProveedorMenuItem = new javax.swing.JMenuItem();
        RProveedorMenuItem = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        AdminUserMenuItem = new javax.swing.JMenuItem();
        DeleteUserMenuItem = new javax.swing.JMenuItem();

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DesktopPaneEscritorio.setBackground(new java.awt.Color(153, 153, 153));
        DesktopPaneEscritorio.setForeground(new java.awt.Color(204, 204, 204));

        EscritorioPanel.setLayout(new javax.swing.BoxLayout(EscritorioPanel, javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setText("BIENVENIDOS");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel1)
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );

        EscritorioPanel.add(jPanel1);

        DesktopPaneEscritorio.setLayer(EscritorioPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DesktopPaneEscritorioLayout = new javax.swing.GroupLayout(DesktopPaneEscritorio);
        DesktopPaneEscritorio.setLayout(DesktopPaneEscritorioLayout);
        DesktopPaneEscritorioLayout.setHorizontalGroup(
            DesktopPaneEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EscritorioPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DesktopPaneEscritorioLayout.setVerticalGroup(
            DesktopPaneEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EscritorioPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setForeground(new java.awt.Color(204, 204, 204));

        jMenu1.setText("Archivo");

        CerrarSesionMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        CerrarSesionMenuItem.setText("Cerrar Sesion");
        CerrarSesionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(CerrarSesionMenuItem);

        SalirMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        SalirMenuItem.setText("Salir");
        SalirMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(SalirMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Movimiento");

        AddVentaMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        AddVentaMenuItem.setText("Agregar Nueva Venta");
        AddVentaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddVentaMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(AddVentaMenuItem);

        AddProductoMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        AddProductoMenuItem.setText("Agregar Producto");
        AddProductoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProductoMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(AddProductoMenuItem);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Proveedores");

        AddSocioMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        AddSocioMenuItem.setText("Agregar Nuevo Proveedor");
        AddSocioMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSocioMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(AddSocioMenuItem);

        DeleteSocioMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        DeleteSocioMenuItem.setText("Eliminar Proveedor");
        DeleteSocioMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteSocioMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(DeleteSocioMenuItem);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Consultas");

        jMenu7.setText("Clientes");

        CClientesMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        CClientesMenuItem.setText("Lista de Clientes");
        CClientesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CClientesMenuItemActionPerformed(evt);
            }
        });
        jMenu7.add(CClientesMenuItem);

        RClientesMenuItem.setText("Reporte de Cientes");
        RClientesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RClientesMenuItemActionPerformed(evt);
            }
        });
        jMenu7.add(RClientesMenuItem);

        jMenu4.add(jMenu7);

        jMenu8.setText("Ventas");

        CVentasMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        CVentasMenuItem.setText("Lista de ventas");
        CVentasMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CVentasMenuItemActionPerformed(evt);
            }
        });
        jMenu8.add(CVentasMenuItem);

        RVentasMenuItem.setText("Reporte de Ventas");
        RVentasMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RVentasMenuItemActionPerformed(evt);
            }
        });
        jMenu8.add(RVentasMenuItem);

        jMenuItem1.setText("Detalle de Ventas");
        jMenu8.add(jMenuItem1);

        jMenu4.add(jMenu8);

        jMenu9.setText("Productos");

        CProductosMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        CProductosMenuItem.setText("Lista de Productos");
        CProductosMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CProductosMenuItemActionPerformed(evt);
            }
        });
        jMenu9.add(CProductosMenuItem);

        RProductosMenuItem.setText("Reporte de Productos");
        RProductosMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RProductosMenuItemActionPerformed(evt);
            }
        });
        jMenu9.add(RProductosMenuItem);

        jMenu4.add(jMenu9);

        jMenu10.setText("Proveedores");

        CProveedorMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        CProveedorMenuItem.setText("Lista de Proveedor");
        CProveedorMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CProveedorMenuItemActionPerformed(evt);
            }
        });
        jMenu10.add(CProveedorMenuItem);

        RProveedorMenuItem.setText("Reporte de Proveedor");
        RProveedorMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RProveedorMenuItemActionPerformed(evt);
            }
        });
        jMenu10.add(RProveedorMenuItem);

        jMenu4.add(jMenu10);

        jMenuBar1.add(jMenu4);

        jMenu6.setText("Administración");

        AdminUserMenuItem.setText("Administración de Usuario");
        AdminUserMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminUserMenuItemActionPerformed(evt);
            }
        });
        jMenu6.add(AdminUserMenuItem);

        DeleteUserMenuItem.setText("Eliminar Usuario");
        jMenu6.add(DeleteUserMenuItem);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPaneEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPaneEscritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarSesionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionMenuItemActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_CerrarSesionMenuItemActionPerformed

    private void SalirMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirMenuItemActionPerformed
       
    }//GEN-LAST:event_SalirMenuItemActionPerformed

    private void CProveedorMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CProveedorMenuItemActionPerformed
           
    }//GEN-LAST:event_CProveedorMenuItemActionPerformed

    private void RProveedorMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RProveedorMenuItemActionPerformed
          
    }//GEN-LAST:event_RProveedorMenuItemActionPerformed

    private void AddProductoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProductoMenuItemActionPerformed
        
    }//GEN-LAST:event_AddProductoMenuItemActionPerformed

    private void CProductosMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CProductosMenuItemActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_CProductosMenuItemActionPerformed

    private void CClientesMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CClientesMenuItemActionPerformed
        
    }//GEN-LAST:event_CClientesMenuItemActionPerformed

    private void CVentasMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CVentasMenuItemActionPerformed
        
    }//GEN-LAST:event_CVentasMenuItemActionPerformed

    private void AddSocioMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSocioMenuItemActionPerformed
        
        
    }//GEN-LAST:event_AddSocioMenuItemActionPerformed

    private void AddVentaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddVentaMenuItemActionPerformed
     
    }//GEN-LAST:event_AddVentaMenuItemActionPerformed

    private void AdminUserMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminUserMenuItemActionPerformed
       
    }//GEN-LAST:event_AdminUserMenuItemActionPerformed

    private void DeleteSocioMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteSocioMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteSocioMenuItemActionPerformed

    private void RClientesMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RClientesMenuItemActionPerformed
       
    }//GEN-LAST:event_RClientesMenuItemActionPerformed

    private void RVentasMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RVentasMenuItemActionPerformed
       
    }//GEN-LAST:event_RVentasMenuItemActionPerformed

    private void RProductosMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RProductosMenuItemActionPerformed
        
    }//GEN-LAST:event_RProductosMenuItemActionPerformed

     void CentrarVentana(JInternalFrame frame){
        EscritorioPanel.add(frame);
        Dimension dimension=EscritorioPanel.getSize();
        Dimension Dframe=frame.getSize();
        frame.setLocation((dimension.width -Dframe.height)/2,(dimension.height -Dframe.width)/2);
        frame.show();
    }
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AddProductoMenuItem;
    private javax.swing.JMenuItem AddSocioMenuItem;
    private javax.swing.JMenuItem AddVentaMenuItem;
    private javax.swing.JMenuItem AdminUserMenuItem;
    private javax.swing.JMenuItem CClientesMenuItem;
    private javax.swing.JMenuItem CProductosMenuItem;
    private javax.swing.JMenuItem CProveedorMenuItem;
    private javax.swing.JMenuItem CVentasMenuItem;
    private javax.swing.JMenuItem CerrarSesionMenuItem;
    private javax.swing.JMenuItem DeleteSocioMenuItem;
    private javax.swing.JMenuItem DeleteUserMenuItem;
    private javax.swing.JDesktopPane DesktopPaneEscritorio;
    public static javax.swing.JPanel EscritorioPanel;
    private javax.swing.JMenuItem RClientesMenuItem;
    private javax.swing.JMenuItem RProductosMenuItem;
    private javax.swing.JMenuItem RProveedorMenuItem;
    private javax.swing.JMenuItem RVentasMenuItem;
    private javax.swing.JMenuItem SalirMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}