
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Random;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno.lab
 */
public class FrmRacee extends javax.swing.JFrame {

    /**
     * Creates new form FrmRacee
     */
    public FrmRacee() {
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

        jFrame1 = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnstart = new javax.swing.JButton();
        lblChegada = new javax.swing.JLabel();
        pnlCars = new javax.swing.JPanel();
        lblCarro = new javax.swing.JLabel();
        lblMoto = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 36)); // NOI18N
        jLabel3.setText("ACELERA AI");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(457, 457, 457)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnstart.setBackground(new java.awt.Color(102, 255, 0));
        btnstart.setForeground(new java.awt.Color(255, 0, 0));
        btnstart.setText("COME??AR");
        btnstart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstartActionPerformed(evt);
            }
        });

        lblChegada.setFont(new java.awt.Font("Tahoma", 0, 56)); // NOI18N
        lblChegada.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblChegada.setText("<html>\nC<br>H<br>E<br>G<br>A<br>D<br>A\n\n</html>");
        lblChegada.setToolTipText("");

        pnlCars.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCarro.setIcon(new javax.swing.ImageIcon("C:\\Users\\aluno.lab\\Documents\\NetBeansProjects\\FrmRace\\imagens\\carro.png")); // NOI18N

        lblMoto.setIcon(new javax.swing.ImageIcon("C:\\Users\\aluno.lab\\Documents\\NetBeansProjects\\FrmRace\\imagens\\moto.png")); // NOI18N

        javax.swing.GroupLayout pnlCarsLayout = new javax.swing.GroupLayout(pnlCars);
        pnlCars.setLayout(pnlCarsLayout);
        pnlCarsLayout.setHorizontalGroup(
            pnlCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCarsLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(pnlCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMoto)
                    .addComponent(lblCarro))
                .addContainerGap(907, Short.MAX_VALUE))
        );

        pnlCarsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblCarro, lblMoto});

        pnlCarsLayout.setVerticalGroup(
            pnlCarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCarsLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(lblCarro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 253, Short.MAX_VALUE)
                .addComponent(lblMoto)
                .addGap(203, 203, 203))
        );

        pnlCarsLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblCarro, lblMoto});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCars, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblChegada, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(btnstart, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblChegada, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlCars, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnstart, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnstartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstartActionPerformed
        (new Movimento()).start();
    }//GEN-LAST:event_btnstartActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRacee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRacee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRacee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRacee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRacee().setVisible(true);
            }
        });
    }
    
    public class Movimento extends Thread{
    
    public void run (){
    
    Random random = new Random();
    int screenSize=  pnlCars.getSize().width - lblCarro.getSize().width;
    int vm = random.nextInt(14)+1;
    int vc = random.nextInt(14)+1;
    while((lblMoto.getX() < screenSize) && (lblCarro.getX() < screenSize)){
    
    
    try {
        Thread.sleep(18);

    
    }catch (InterruptedException ie){
        ie.printStackTrace();
    }
    
        lblMoto.setBounds(lblMoto.getX()+vm,lblMoto.getY(),lblMoto.getWidth(),lblMoto.getHeight());
        
     lblCarro.setBounds(lblCarro.getX()+vc,lblCarro.getY(),lblCarro.getWidth(),lblCarro.getHeight());
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnstart;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCarro;
    private javax.swing.JLabel lblChegada;
    private javax.swing.JLabel lblMoto;
    private javax.swing.JPanel pnlCars;
    // End of variables declaration//GEN-END:variables
}
