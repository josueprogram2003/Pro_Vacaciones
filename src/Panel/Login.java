/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panel;

/**
 *
 * @author Josue Dominguez
 */
public class Login extends javax.swing.JPanel {

   
    public Login() {
        initComponents();
    }
    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_ingresar = new javax.swing.JButton();
        tft_usuario = new javax.swing.JTextField();
        tft_pass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        lb_pass = new javax.swing.JLabel();
        lb_usuario = new javax.swing.JLabel();

        setName(""); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_ingresar.setBackground(new java.awt.Color(0, 102, 204));
        btn_ingresar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_ingresar.setForeground(new java.awt.Color(255, 255, 255));
        btn_ingresar.setText("Ingresar");
        add(btn_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 370, -1));

        tft_usuario.setBackground(new java.awt.Color(255, 255, 255));
        tft_usuario.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tft_usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(tft_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 370, -1));

        tft_pass.setBackground(new java.awt.Color(255, 255, 255));
        tft_pass.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tft_pass.setForeground(new java.awt.Color(0, 0, 0));
        tft_pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(tft_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 370, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Inicio de Seción ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 510, -1));

        lb_pass.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lb_pass.setForeground(new java.awt.Color(204, 153, 0));
        lb_pass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_pass.setText("Contraseña");
        add(lb_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 370, -1));

        lb_usuario.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lb_usuario.setForeground(new java.awt.Color(255, 153, 0));
        lb_usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_usuario.setText("Usuario");
        add(lb_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 370, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb_pass;
    private javax.swing.JLabel lb_usuario;
    private javax.swing.JPasswordField tft_pass;
    private javax.swing.JTextField tft_usuario;
    // End of variables declaration//GEN-END:variables
}
