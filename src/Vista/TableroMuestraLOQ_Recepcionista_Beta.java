/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.conectar;
import Modelo.usuario;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.*;
import Vista.Login_Beta;

/**
 *
 * @author ESTACION6
 */
public class TableroMuestraLOQ_Recepcionista_Beta extends javax.swing.JFrame {
    usuario mod;
     static int nregistro =0;
     static int idMuestras;
     static int fk_idcliente;
     static String matriz;
     static int nsota;
     static java.util.Date fechaingresolaboratorio;
     static String laboratorioejecutante;
     int fila;
    /**
     * Creates new form TableroMuestraLOQ_Recepcionista_Beta
     */
    public TableroMuestraLOQ_Recepcionista_Beta() throws SQLException {
        initComponents();
         llamarMuestra();
         generarNombre();
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lb_usuario_recepcionista = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = tblDatos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        btn_agregar = new javax.swing.JButton();
        btn_ver = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Untitled-3_03.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Untitled-3_07.png"))); // NOI18N

        lb_usuario_recepcionista.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lb_usuario_recepcionista.setText("CECILIA");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/hamburguer_bt_01.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lb_usuario_recepcionista)
                                .addGap(31, 31, 31)))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addComponent(lb_usuario_recepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(243, 243, 243));

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblDatosMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblDatosMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblDatos);

        btn_agregar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_ver.setText("VER");
        btn_ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verActionPerformed(evt);
            }
        });

        btn_modificar.setText("MODIFICAR");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(747, 747, 747)
                        .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_modificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_eliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_ver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_ver)
                        .addGap(18, 18, 18)
                        .addComponent(btn_modificar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_eliminar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
                 if(Ventanamuestra==false){
                     try {
                         Loq_Insertar LoqNuevo = new Loq_Insertar(); //termina if
                         LoqNuevo.setVisible(true);
                         Ventanamuestra=true;
                     } catch (SQLException ex) {
                         Logger.getLogger(TableroMuestraLOQ_Recepcionista_Beta.class.getName()).log(Level.SEVERE, null, ex);
                     }
           }
           else{
              JOptionPane.showMessageDialog(null,"La ventana ya esta abierta");
           }
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        if( validacionSeleccionarfila()){
            JOptionPane.showMessageDialog(this, "Selecciona una fila");
 
        }
        
        else{
            
            obtenerDatosEditar();    
            Loq_Editar jFrame;
            try {
                jFrame = new Loq_Editar();
                jFrame.setVisible(true); 
            } catch (SQLException ex) {
                Logger.getLogger(TableroMuestraLOQ_Recepcionista_Beta.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void tblDatosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatosMouseEntered
                       try {
            llamarMuestra();
      
        } catch (SQLException ex) {
            Logger.getLogger(TableroMuestraLOQ_Recepcionista_Beta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tblDatosMouseEntered

    private void tblDatosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatosMouseReleased
        obtenerDatosEditar();
    }//GEN-LAST:event_tblDatosMouseReleased

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
       
        if(validacionSeleccionarfila()){
            JOptionPane.showMessageDialog(this, "Selecciona una fila");
              
        }
         else {
            
       int msj = JOptionPane.showConfirmDialog(null, "¿Desea eliminar fila seleccionada?", "SÍ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);   
        if(msj==JOptionPane.YES_OPTION){
        conectar cc= new conectar();
        Connection cn= cc.conexion();
               
       // String query = ("DELETE FROM muestras WHERE nregistro = '"+fila+"'AND fk_matrices = '"+idMatriz+"'");

       
            String query =  "DELETE FROM analisis WHERE fk_idmuestras = '"+idMuestras+"'";
       try {
                 PreparedStatement pst = cn.prepareStatement(query);
                    int n= pst.executeUpdate();
               //     pst.close();
               try { 
                 query =  "DELETE FROM muestras WHERE idMuestras = '"+idMuestras+"'";
     
                 PreparedStatement pst2 = cn.prepareStatement(query);
                    int n2= pst2.executeUpdate();
               //     pst.close();
                    } catch (Exception e) {
                Logger.getLogger(TableroMuestraLOQ_Recepcionista_Beta.class.getName()).log(Level.SEVERE, null, e);
        }
               
                System.out.println("tabla eliminada");
                                llamarMuestra();
            } catch (Exception e) {
                Logger.getLogger(TableroMuestraLOQ_Recepcionista_Beta.class.getName()).log(Level.SEVERE, null, e);
        }
    }if(msj == JOptionPane.NO_OPTION){
            System.out.println("No borrado");
    }
        }// TODO add your handling code here:
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verActionPerformed
  if(validacionSeleccionarfila()){
            JOptionPane.showMessageDialog(this, "Selecciona una fila");
        }
         else { 
      try {
                  DefaultTableModel modelo = (DefaultTableModel)tblDatos.getModel();
        int selectRowIndex = tblDatos.getSelectedRow();
        idMuestras = (int) modelo.getValueAt(selectRowIndex, 0);
        nregistro = (int) modelo.getValueAt(selectRowIndex,1);  
        
        
          System.out.println(nregistro);
          codigobarras codigobarras = new codigobarras();
      codigobarras.setVisible(true);
      } catch (Exception e) {
      }


  }
    }//GEN-LAST:event_btn_verActionPerformed

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
            java.util.logging.Logger.getLogger(TableroMuestraLOQ_Recepcionista_Beta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableroMuestraLOQ_Recepcionista_Beta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableroMuestraLOQ_Recepcionista_Beta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableroMuestraLOQ_Recepcionista_Beta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TableroMuestraLOQ_Recepcionista_Beta().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TableroMuestraLOQ_Recepcionista_Beta.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
     
  public void llamarMuestra() throws SQLException{
                    conectar cc= new conectar();
                    Connection cn= cc.conexion();
                DefaultTableModel modelo  = new DefaultTableModel();
                JTable tabla = new JTable(modelo);
                JButton btnMod = new JButton("Modificar");
                JButton btnElim = new JButton("Eliminar");
                JButton btnVer = new JButton("Ver");
            btnMod.addActionListener((ActionEvent event) -> {
//                String   Codigo = text1.getText();
//                String   Nombre = text2.getText();
                    });
                
                String query = ("SELECT * FROM muestras ");
                PreparedStatement pst = cn.prepareStatement(query);
                ResultSet ResultSet = pst.executeQuery();
                modelo.setColumnIdentifiers(new Object[]{"Idmuestra", "Numero Registro","Cliente", "Matriz", "Analisis" , "Ingreso Laboratorio","Laboratorio Ejecutante","Estado"});
                System.out.println("INGRESO");
                try {
                    while(ResultSet.next()){
                            int a = ResultSet.getInt("idMuestras");
                            
                        
                            
                        modelo.addRow(new Object[]{ResultSet.getInt("idMuestras"),ResultSet.getInt("nregistro"), ResultSet.getInt("fk_idcliente"), ResultSet.getString("matriz"), ResultSet.getInt("idMuestras"),
                            ResultSet.getDate("fechaingresolaboratorio"),ResultSet.getString("laboratorioejecutante"),ResultSet.getString("estado")});
                       }
                        tblDatos.setModel(modelo );
                tblDatos.getColumnModel().getColumn(0).setMaxWidth(0);
                tblDatos.getColumnModel().getColumn(0).setMinWidth(0);
                tblDatos.getColumnModel().getColumn(0).setPreferredWidth(0);        
                                               
                
                
                       
                    } catch (SQLException e) {
                    System.out.println("error con tabla");
                    }
     }   

  
  
  public TableroMuestraLOQ_Recepcionista_Beta(usuario mod){
      initComponents();
      setLocationRelativeTo(null);
      this.mod = mod;
      
      lb_usuario_recepcionista.setText(mod.getNombre());
      
      if(mod.getId_tipo()==1)
      {
          
          
      } else if(mod.getId_tipo()==2)
      {
          btn_agregar.setVisible(false);
      }
  }
  
  
  
      void generarNombre() {
      conectar cc = new conectar();
        String sql = "Select CONCAT(nombre_usuario, ' ', apellido_usuario) As Nombre From usuarios WHERE nombre_usuario LIKE '"+Login_Beta.N+"' AND apellido_usuario LIKE '"+Login_Beta.A+"'";
        
        //    Connection cn = (Connection) cc.conexion();
        try {
            java.sql.Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                //Aca le digo que muestre el valor en un JtextFiel

                lb_usuario_recepcionista.setText(rs.getString("Nombre"));
                lb_usuario_recepcionista.repaint();

            }

        } catch (SQLException e) {
            // NOTA: So hubo error muestra el error
            JOptionPane.showMessageDialog(null, e);
        }
    }
      
      
           boolean validacionSeleccionarfila(){
         
         if(nregistro<=0){
             
              return true; 
         }else{

            return false;
        }

     }
           
 public void obtenerDatosEditar(){

     DefaultTableModel modelo = (DefaultTableModel)tblDatos.getModel();
     int selectRowIndex = tblDatos.getSelectedRow();
        idMuestras = (int) modelo.getValueAt(selectRowIndex, 0);
        nregistro = (int) modelo.getValueAt(selectRowIndex,1);
        fk_idcliente = (int) modelo.getValueAt(selectRowIndex, 2);
        matriz = (String) modelo.getValueAt(selectRowIndex, 3);
        nsota = (int) modelo.getValueAt(selectRowIndex, 4);
        fechaingresolaboratorio = (Date) modelo.getValueAt(selectRowIndex, 5);
        laboratorioejecutante = (String) modelo.getValueAt(selectRowIndex, 6);
 
        System.out.println("catch");

 }
   public  void obtenerFila(){
        
         DefaultTableModel modelo = (DefaultTableModel)tblDatos.getModel();
            fila = tblDatos.getSelectedRow();
            fila = (int) modelo.getValueAt(fila,0);
            System.out.println(fila);
    }
   
   
        boolean ventanaEditarAbierta() throws SQLException{

            if (Ventanamuestra == false) {
                Loq_Editar VentNvoPres = new Loq_Editar(); //termina if
                VentNvoPres.setVisible(true);
                Ventanamuestra = true;
    
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "La ventana MUESTRAS ya esta abierta");
            return false;
        }
    }

   public static boolean Ventanamuestra=false;
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_ver;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_usuario_recepcionista;
    private javax.swing.JTable tblDatos;
    // End of variables declaration//GEN-END:variables
         conectar cc= new conectar();
         Connection cn= cc.conexion();

  

}
