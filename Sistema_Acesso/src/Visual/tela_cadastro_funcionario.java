/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;

import Classes.Funcionario;
import Classes.Pessoa;
import java.util.Date;
import javax.swing.JOptionPane;
import Classes.ServicoFuncionario;



public class tela_cadastro_funcionario extends javax.swing.JFrame {

    private boolean modoEdicao = false;

    //Indica o cliente em edição
    private Funcionario novoFuncionario = null;
    
    
    
    /**
     * Creates new form tela_cadastro
     */
    public tela_cadastro_funcionario() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        campoTextoDigitado = new javax.swing.JTextField();
        campoRgDigitado = new javax.swing.JTextField();
        campoCpfDigitado = new javax.swing.JTextField();
        campoNascimentoDigitado = new javax.swing.JTextField();
        campoEmailDigitado = new javax.swing.JTextField();
        campoCargoDigitado = new javax.swing.JTextField();
        campoEmpresaDigitado = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome do funcionário:");

        jLabel2.setText("RG:");

        jLabel3.setText("CPF:");

        jLabel4.setText("Data de nascimento:");

        jLabel5.setText("E-mail: ");

        jLabel6.setText("Cargo:");

        jLabel7.setText("Empresa:");

        campoTextoDigitado.setText("jTextField1");
        campoTextoDigitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoDigitadoActionPerformed(evt);
            }
        });

        campoRgDigitado.setText("jTextField2");

        campoCpfDigitado.setText("jTextField3");

        campoNascimentoDigitado.setText("jTextField4");

        campoEmailDigitado.setText("jTextField5");

        campoCargoDigitado.setText("jTextField6");

        campoEmpresaDigitado.setText("jTextField7");

        jButton1.setText("CADASTRAR FUNCIONÁRIO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoNascimentoDigitado, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(campoTextoDigitado)
                    .addComponent(campoRgDigitado)
                    .addComponent(campoCpfDigitado)
                    .addComponent(campoEmailDigitado)
                    .addComponent(campoCargoDigitado)
                    .addComponent(campoEmpresaDigitado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(campoTextoDigitado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoRgDigitado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(campoCpfDigitado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(campoNascimentoDigitado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButton1)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoEmailDigitado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campoCargoDigitado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoEmpresaDigitado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Botão salvar produto
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
       if (!modoEdicao) {

            novoFuncionario = new Funcionario();

        } else if (novoFuncionario == null) {

            JOptionPane.showMessageDialog(rootPane,
                    "Não foi pré-selecionado um funcionário para salvar suas"
                    + " alterações",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;

        }
        
        novoFuncionario.setNome(campoTextoDigitado.getText());
        novoFuncionario.setNumerorg(campoRgDigitado.getText());
        novoFuncionario.setNumerocpf(campoCpfDigitado.getText());
        novoFuncionario.setEmail(campoEmailDigitado.getText());
        novoFuncionario.setCargo(campoCargoDigitado.getText());
        novoFuncionario.setEmpresa(campoEmpresaDigitado.getText());
         
        String resposta = null;
        if (!modoEdicao) {

            resposta = ServicoFuncionario.cadastrarCliente(novoFuncionario);

        } else {

            //resposta = ServicoFuncionario.atualizarCliente(novoFuncionario);
        }

        if (resposta == null) {

            if (!modoEdicao) {

                JOptionPane.showMessageDialog(rootPane,
                        "Cliente inserido com sucesso",
                        "Cadastro efetuado",
                        JOptionPane.INFORMATION_MESSAGE);

            } else {

                this.dispose();

            }
        
        
        
        
        
    }                                
    

        
        
        
        
      
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void campoTextoDigitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoDigitadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoDigitadoActionPerformed

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
            java.util.logging.Logger.getLogger(tela_cadastro_funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_cadastro_funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_cadastro_funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_cadastro_funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_cadastro_funcionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoCargoDigitado;
    private javax.swing.JTextField campoCpfDigitado;
    private javax.swing.JTextField campoEmailDigitado;
    private javax.swing.JTextField campoEmpresaDigitado;
    private javax.swing.JTextField campoNascimentoDigitado;
    private javax.swing.JTextField campoRgDigitado;
    private javax.swing.JTextField campoTextoDigitado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
