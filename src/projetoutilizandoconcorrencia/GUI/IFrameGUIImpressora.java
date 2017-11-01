
package projetoutilizandoconcorrencia.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;
import javax.swing.Timer;
import javax.swing.UIManager;
import projetoutilizandoconcorrencia.Entity.RunnableImpressora;
import projetoutilizandoconcorrencia.Util.Constantes;

public class IFrameGUIImpressora extends javax.swing.JFrame {

        GerenciadorImpressora impressora;
        RunnableImpressora r1;
        RunnableImpressora r2;
        RunnableImpressora r3;
    
    
    public IFrameGUIImpressora() {
        initComponents();
        alterarLayout();
        iniciarMain();
    }
    
       private void alterarLayout() {
           this.setLocationRelativeTo(null);
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }  
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jBPausa1 = new javax.swing.JButton();
        jBContinuar1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        backIcon1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelThread1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jProgressBar2 = new javax.swing.JProgressBar();
        jBPausa2 = new javax.swing.JButton();
        jBContinuar2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        backIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelThread2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jProgressBar3 = new javax.swing.JProgressBar();
        jBPausa3 = new javax.swing.JButton();
        jBContinuar3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        backIcon2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelThread3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jProgressBar1.setBackground(new java.awt.Color(255, 255, 255));

        jBPausa1.setBackground(new java.awt.Color(204, 204, 204));
        jBPausa1.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        jBPausa1.setForeground(new java.awt.Color(51, 51, 51));
        jBPausa1.setText("Pausar");
        jBPausa1.setFocusable(false);
        jBPausa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPausa1ActionPerformed(evt);
            }
        });

        jBContinuar1.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        jBContinuar1.setForeground(new java.awt.Color(51, 51, 51));
        jBContinuar1.setText("Continuar");
        jBContinuar1.setEnabled(false);
        jBContinuar1.setFocusable(false);
        jBContinuar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBContinuar1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("IMPRESSÃO 1");

        backIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetoutilizandoconcorrencia/GUI/Img/impressora.jpg"))); // NOI18N

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Barra de progresso Impressão 1");

        jLabelThread1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelThread1.setText("Imprimindo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jBPausa1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBContinuar1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 1, Short.MAX_VALUE)
                                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelThread1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backIcon1)
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBContinuar1)
                    .addComponent(jBPausa1))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelThread1)
                .addGap(11, 11, 11)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jProgressBar2.setBackground(new java.awt.Color(255, 255, 255));

        jBPausa2.setBackground(new java.awt.Color(204, 204, 204));
        jBPausa2.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        jBPausa2.setForeground(new java.awt.Color(51, 51, 51));
        jBPausa2.setText("Pausar");
        jBPausa2.setFocusable(false);
        jBPausa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPausa2ActionPerformed(evt);
            }
        });

        jBContinuar2.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        jBContinuar2.setForeground(new java.awt.Color(51, 51, 51));
        jBContinuar2.setText("Continuar");
        jBContinuar2.setEnabled(false);
        jBContinuar2.setFocusable(false);
        jBContinuar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBContinuar2ActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 153, 153));
        jTextField1.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 204, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Impressora Thread's");
        jTextField1.setBorder(null);
        jTextField1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextField1.setEnabled(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        backIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetoutilizandoconcorrencia/GUI/Img/impressora.jpg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("IMPRESSÃO 2");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Barra de progresso Impressão 2");

        jLabelThread2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelThread2.setText("Imprimindo:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jProgressBar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jBPausa2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBContinuar2)
                                .addGap(20, 20, 20))))
                    .addComponent(jLabelThread2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(backIcon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBPausa2)
                    .addComponent(jBContinuar2))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelThread2)
                .addGap(13, 13, 13)
                .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jPanel3.setBackground(new java.awt.Color(255, 102, 102));

        jProgressBar3.setBackground(new java.awt.Color(255, 255, 255));

        jBPausa3.setBackground(new java.awt.Color(204, 204, 204));
        jBPausa3.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        jBPausa3.setForeground(new java.awt.Color(51, 51, 51));
        jBPausa3.setText("Pausar");
        jBPausa3.setFocusable(false);
        jBPausa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPausa3ActionPerformed(evt);
            }
        });

        jBContinuar3.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        jBContinuar3.setForeground(new java.awt.Color(51, 51, 51));
        jBContinuar3.setText("Continuar");
        jBContinuar3.setEnabled(false);
        jBContinuar3.setFocusable(false);
        jBContinuar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBContinuar3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("IMPRESSÃO 3");

        backIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetoutilizandoconcorrencia/GUI/Img/impressora.jpg"))); // NOI18N

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Barra de progresso Impressão 3");

        jLabelThread3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelThread3.setText("Imprimindo:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backIcon2)
                .addGap(43, 43, 43))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jBPausa3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBContinuar3))
                            .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelThread3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backIcon2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBPausa3)
                    .addComponent(jBContinuar3))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelThread3)
                .addGap(9, 9, 9)
                .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBPausa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPausa1ActionPerformed
            pausarImpressao(Constantes.IMPRESSAO1);
    }//GEN-LAST:event_jBPausa1ActionPerformed

    private void jBPausa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPausa2ActionPerformed
          pausarImpressao(Constantes.IMPRESSAO2);
    }//GEN-LAST:event_jBPausa2ActionPerformed

    private void jBContinuar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBContinuar3ActionPerformed
        continuarImpressao(Constantes.IMPRESSAO3);
    }//GEN-LAST:event_jBContinuar3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
       
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jBPausa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPausa3ActionPerformed
          pausarImpressao(Constantes.IMPRESSAO3);
    }//GEN-LAST:event_jBPausa3ActionPerformed

    private void jBContinuar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBContinuar1ActionPerformed
          continuarImpressao(Constantes.IMPRESSAO1);
    }//GEN-LAST:event_jBContinuar1ActionPerformed

    private void jBContinuar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBContinuar2ActionPerformed
          continuarImpressao(Constantes.IMPRESSAO2);
    }//GEN-LAST:event_jBContinuar2ActionPerformed

  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            new IFrameGUIImpressora().setVisible(true);
        });
    }
    
    private void iniciarMain() {
          
             impressora = new GerenciadorImpressora(this);
             r1 = new RunnableImpressora(Constantes.IMPRESSAO1, 2000, impressora);
             r2 = new RunnableImpressora(Constantes.IMPRESSAO2, 2000, impressora);
             r3 = new RunnableImpressora(Constantes.IMPRESSAO3, 2000, impressora);
             r1.ligarDesligarImpressora(true);
             r2.ligarDesligarImpressora(true);
             r3.ligarDesligarImpressora(true);
             
    }

        public void defineJProgressBar(int min, int max, String nomeThreadAtual) {
             JProgressBar jProgressBarAtual = getJProgressBar(nomeThreadAtual);
             jProgressBarAtual.setMaximum(max);
             jProgressBarAtual.setMinimum(min);
        }
       
       public void atualizajProgressBar(int value, String nomeThreadAtual) {
           getJProgressBar(nomeThreadAtual).setValue(value);
        }
       
       public void atualizarLabelThread(String nomeThreadAtual,String string) {
                getJLabelThread(nomeThreadAtual).setText(string);
        }

       public int pegarProgressoAtual (String nomeThreadAtual) {
            return getJProgressBar(nomeThreadAtual).getValue();
         }
       
       public int pegarMaxProgressoAtual(String nomeThreadAtual) {
            return getJProgressBar(nomeThreadAtual).getMaximum();
       }
       
       
       public JProgressBar getJProgressBar(String jProgressBarName) {
           JProgressBar progressBarAtual = null;
           switch(jProgressBarName){
                case Constantes.IMPRESSAO1:
                    progressBarAtual = this.jProgressBar1;
                break;
                case Constantes.IMPRESSAO2:
                    progressBarAtual = this.jProgressBar2;
                break;
                 case Constantes.IMPRESSAO3:
                    progressBarAtual =  this.jProgressBar3;
                break;
          }
           return progressBarAtual;
       }
       
       
       public JLabel getJLabelThread(String jLabelName) {
           JLabel jLabelAtual = null;
           switch(jLabelName){
                case Constantes.IMPRESSAO1:
                    jLabelAtual = this.jLabelThread1;
                break;
                case Constantes.IMPRESSAO2:
                    jLabelAtual = this.jLabelThread2;
                break;
                 case Constantes.IMPRESSAO3:
                    jLabelAtual = this.jLabelThread3;
                break;
          }
           return jLabelAtual;
       }
       
       public String pegarNomeLabelAtual(String nomeThread) {
           JLabel jLabel = getJLabelThread(nomeThread);
           return jLabel.getText();
       }
       
       
       private JButton []  pegarJButtonPausarContinuar(String nomeThread) {
           JButton jButtonContinuar = null;  
           JButton jButtonPausar = null;
           
           switch(nomeThread){
                case Constantes.IMPRESSAO1:
                    jButtonPausar = jBPausa1;
                    jButtonContinuar = jBContinuar1;
                break;
                case Constantes.IMPRESSAO2:
                    jButtonPausar = jBPausa2;
                    jButtonContinuar = jBContinuar2;
                break;
                 case Constantes.IMPRESSAO3:
                   jButtonPausar = jBPausa3;
                    jButtonContinuar = jBContinuar3;
                break;
           }
           return new JButton []{jButtonPausar, jButtonContinuar};
       }
       
       private void pausarImpressao(String nomeThread) {
           JButton [] pausarContinuar = pegarJButtonPausarContinuar(nomeThread);
           JButton jButtonPausar= pausarContinuar[0];  
           JButton jButtonContinuar = pausarContinuar[1];  
           //disableBotoesPausar(jButtonPausar);
           jButtonPausar.setEnabled(false);
           jButtonContinuar.setEnabled(true);
           impressora.pausarThread(nomeThread);
       }
       
       private void continuarImpressao (String nomeThread) {
           JButton [] pausarContinuar = pegarJButtonPausarContinuar(nomeThread);
           JButton jButtonPausar= pausarContinuar[0];  
           JButton jButtonContinuar = pausarContinuar[1];  
           jButtonPausar.setEnabled(true);
           jButtonContinuar.setEnabled(false);
           impressora.continuarThread(nomeThread);
       }     
       
       
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backIcon;
    private javax.swing.JLabel backIcon1;
    private javax.swing.JLabel backIcon2;
    private javax.swing.JButton jBContinuar1;
    private javax.swing.JButton jBContinuar2;
    private javax.swing.JButton jBContinuar3;
    private javax.swing.JButton jBPausa1;
    private javax.swing.JButton jBPausa2;
    private javax.swing.JButton jBPausa3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelThread1;
    private javax.swing.JLabel jLabelThread2;
    private javax.swing.JLabel jLabelThread3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
