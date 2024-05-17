
package practica.pkg4;
import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.util.Random;


public class Tablero extends JFrame implements ActionListener{
    
    JLabel label[] = new JLabel[64];
    Color casillas, fondo, jugador, casilla2, jugador2, jugador3, jugador4;
    JButton movimiento;
    //JButton Volver;
    private int dadito;
    private int[] posiciones;
    private List<Color> coloresJugadores;
    private int numJugadores=2;
    FondoPanel pantalla = new FondoPanel();
   
    
    public Tablero() {
        super("Escaleras y Serpientes");
        this.setContentPane(pantalla);
        this.setSize(600, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane();
        int jugadores = seleccionarJugadores();
        numJugadores = jugadores;
        objetos();
        this.getContentPane().setBackground(fondo);
        this.setVisible(true);
    }
     private int seleccionarJugadores() {
        Object[] options = {"2 Jugadores", "3 Jugadores", "4 Jugadores"};
        int n = JOptionPane.showOptionDialog(this, "Seleccione el número de jugadores", "Selección de Jugadores",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (n == JOptionPane.CLOSED_OPTION) {
            System.exit(0); // Si elige cerrar la ventana, salimos del programa
        }
        return n + 2; // Devolvemos 2, 3 o 4 según la selección
    }
    
    class FondoPanel extends JPanel{
        private Image imagen;
        
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/pictures/Fondojuego.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            
            setOpaque(false);
            super.paint(g);
                    
        }
    }
    
    ///pictures/Fondojuego.jpg
    
    public void objetos(){
       casillas = new Color(255, 255, 0);
        casilla2 = new Color(255, 0, 0);
        fondo = new Color(0, 255, 255);
        jugador = new Color(0, 255, 0);
        jugador2 = new Color(0, 0, 255);
        
       
        for (int i = 0; i < label.length; i++) {
            label[i] = new JLabel("      "+(i+1)+"   ");
        }
        
        movimiento = new JButton("Dado");
       // Volver = new JButton("Volver");
        
        this.setLayout(null);
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                label[i * 8 + j].setBounds(10 + j * 50, 10 + i * 50, 50, 50);
            }
        }
        
        movimiento.setBounds(480, 350, 80, 30);
        
        tab();
        label[0].setBackground(jugador);
        
        for (int i = 0; i < label.length; i++) {
            this.add(label[i]);
        }

        this.add(movimiento);
        movimiento.addActionListener(this);
    }
    
    public void tab() {
        for (int i = 0; i < label.length; i++) {
            label[i].setOpaque(true);
        }
        
        // Alternar colores de las casillas
        for (int i = 0; i < 64; i++) {
            if ((i / 8) % 2 == 0) {
                label[i].setBackground(i % 2 == 0 ? casillas : casilla2);
            } else {
                label[i].setBackground(i % 2 == 0 ? casilla2 : casillas);
            }
        }
    }
    
    private int posj1 = 0;
    private int posj2 = 0;
    private int posj3 = 0;  // Posición del jugador 3
    private int posj4 = 0;  // Posición del jugador 4
    private int turno = 0;
    
    public void actionPerformed(ActionEvent ae) {
        int[] posiciones = {posj1, posj2, posj3, posj4};
        Color[] colores = {jugador, jugador2, jugador3, jugador4};
        String[] nombresJugadores = {"Jugador 1", "Jugador 2", "Jugador 3", "Jugador 4"};
        
        int jugadorActual = turno % 4;
        int espacios = (int)(((Math.random()) * 60) / 10) + 1;
        
        posiciones[jugadorActual] += espacios;
        int postablero = posiciones[jugadorActual] + 1;
        JOptionPane.showMessageDialog(null, nombresJugadores[jugadorActual] + " has sacado un '" + espacios + "' te mueves a la posición '" + postablero + "' ");
        
        if (posiciones[jugadorActual] == 4) {
            JOptionPane.showMessageDialog(null, "Pisaste una escalera, avanza hasta la casilla 10");
            posiciones[jugadorActual] = 9;
        }
        if (posiciones[jugadorActual] == 9) {
            JOptionPane.showMessageDialog(null, "Pisaste una escalera, avanza 4 espacios");
            posiciones[jugadorActual] = 13;
        }
        if (posiciones[jugadorActual] == 30) {
            JOptionPane.showMessageDialog(null, "Pisaste una serpiente, retrocede 10 espacios");
            posiciones[jugadorActual] = 20;
        }
        if (posiciones[jugadorActual] == 54) {
            JOptionPane.showMessageDialog(null, "Acabas de perder un turno");
            posiciones[jugadorActual] = 53;
        }
        if (posiciones[jugadorActual] == 60) {
            JOptionPane.showMessageDialog(null, "Pisaste una serpiente, retrocede 8 espacios");
            posiciones[jugadorActual] = 52;
        }
        
        tab();
        for (int i = 0; i < posiciones.length; i++) {
            if (posiciones[i] < 64) {
                label[posiciones[i]].setBackground(colores[i]);
            }
        }
        
        if (posiciones[jugadorActual] >= 63) {
            JOptionPane.showMessageDialog(null, nombresJugadores[jugadorActual] + " es el Ganador");
            return;
        }
        
        turno++;
    }

    
    //Lo de Swing   
    //Lo se Swing
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Volver3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Volver3.setText("Volver");
        Volver3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volver3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(528, Short.MAX_VALUE)
                .addComponent(Volver3)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(448, Short.MAX_VALUE)
                .addComponent(Volver3)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Volver3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volver3ActionPerformed
        this.setVisible(false);
        new Menu().setVisible(true);
    }//GEN-LAST:event_Volver3ActionPerformed

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
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Volver3;
    // End of variables declaration//GEN-END:variables
}
