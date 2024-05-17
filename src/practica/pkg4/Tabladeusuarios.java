
package practica.pkg4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Tabladeusuarios extends javax.swing.JFrame {
    
    private ArrayList<Usuarios> Lis;
    public Tabladeusuarios() {
        super("Escaleras y Serpientes");
        Lis = new ArrayList<Usuarios>();
        initComponents();
        //cargar();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        Nombre = new javax.swing.JTextField();
        Apellidos = new javax.swing.JTextField();
        Insertar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Cambiar = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tablajugadores = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 130, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ID");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Apellidos");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        ID.setBackground(new java.awt.Color(255, 255, 255));
        ID.setForeground(new java.awt.Color(0, 0, 0));
        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        jPanel2.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 80, 30));

        Nombre.setBackground(new java.awt.Color(255, 255, 255));
        Nombre.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 190, 30));

        Apellidos.setBackground(new java.awt.Color(255, 255, 255));
        Apellidos.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 170, 30));

        Insertar.setBackground(new java.awt.Color(255, 255, 255));
        Insertar.setForeground(new java.awt.Color(0, 0, 0));
        Insertar.setText("Insertar");
        Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarActionPerformed(evt);
            }
        });
        jPanel2.add(Insertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));

        Eliminar.setBackground(new java.awt.Color(255, 255, 255));
        Eliminar.setForeground(new java.awt.Color(0, 0, 0));
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPanel2.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, -1, -1));

        Cambiar.setBackground(new java.awt.Color(255, 255, 255));
        Cambiar.setForeground(new java.awt.Color(0, 0, 0));
        Cambiar.setText("Cambiar");
        Cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambiarActionPerformed(evt);
            }
        });
        jPanel2.add(Cambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, -1, -1));

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        jPanel2.add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        Tablajugadores.setBackground(new java.awt.Color(255, 255, 255));
        Tablajugadores.setForeground(new java.awt.Color(0, 0, 0));
        Tablajugadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(Tablajugadores);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, 130));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fondousuario.jpg"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 380));

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
    }// </editor-fold>//GEN-END:initComponents
    
    private void limpiar(){
        Nombre.setText("");
        Apellidos.setText("");
        ID.setText("");
    }
                
    private void guardar(){
        File file = new File("Usuarios.txt");
        PrintWriter Escribe;
        if(!file.exists()){
            try{
                file.createNewFile();
            
            }catch(Exception e){
            
            }
        }   
        try{
            Usuarios aux;
            Escribe = new PrintWriter(file, "utf-8");
            for(int i =0; i<Lis.size(); i++){
                aux = Lis.get(i);
                aux.guardar(Escribe);        
            }
            Escribe.close();
        }catch(Exception e){     
        }
    }
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        String botones[] = {"Si", "No"};
        int n = JOptionPane.showOptionDialog(null, "Desea guardar la Informacion","Titulo", 0,0,null,botones,null);
        if(n==0){
            guardar();
        }
    }//GEN-LAST:event_formWindowClosing

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        this.setVisible(false);
        new Menu().setVisible(true);
    }//GEN-LAST:event_VolverActionPerformed

    private void CambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambiarActionPerformed
        int c, id;
        Usuarios aux;
        try{
            c = Tablajugadores.getSelectedRow();
            aux = Lis.get(c);
            id = Integer.parseInt(JOptionPane.showInputDialog("Nuevo Id"));
            aux.setId(id);

        } catch(Exception e ){
            JOptionPane.showMessageDialog(null, "Escoge una fila");

        }
        verDatos();
    }//GEN-LAST:event_CambiarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        int c;
        try{
            c = Tablajugadores.getSelectedRow();
            Lis.remove(c);

        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Escoge una fila");

        }
        verDatos();
    }//GEN-LAST:event_EliminarActionPerformed

    private void InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarActionPerformed
        String nombre, apellidos;
        int id;
        try{
            nombre = Nombre.getText();
            apellidos = Apellidos.getText();
            id = Integer.parseInt(ID.getText());
            Lis.add(new Usuarios(nombre, apellidos, id));

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ingresar los datos");

        }
        limpiar();
        verDatos();
    }//GEN-LAST:event_InsertarActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed
    
    private void verDatos(){
        String Mat[][] = new String[Lis.size()][3];
        
        Usuarios aux;
        for(int i = 0; i< Lis.size(); i++){
            aux = Lis.get(i);
            Mat[i][0] = Integer.toString(aux.getId());
            Mat[i][1] = aux.getNombre();
            Mat[i][2] = aux.getApellido();
            
        }
        Tablajugadores.setModel(new javax.swing.table.DefaultTableModel(
            Mat,
            new String [] {
                "ID", "Nombre", "Apellidos", "Partidas Ganadas", "Partidas Perdidas"
            }
        ));
    }
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
            java.util.logging.Logger.getLogger(Tabladeusuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabladeusuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabladeusuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabladeusuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabladeusuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellidos;
    private javax.swing.JButton Cambiar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTextField ID;
    private javax.swing.JButton Insertar;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTable Tablajugadores;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
