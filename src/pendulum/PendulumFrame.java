package pendulum;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.io.IOException;

import static java.lang.Math.*;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.SwingWorker;

import javax.swing.Timer;

/**
 * 
 * 
 * @version beta
 * @author labinf22, Francesco Sollazzi
 */
public final class PendulumFrame extends javax.swing.JFrame implements ComponentListener{

    private Timer timer;
    
    private ButtonGroup group;
    
    private double fx = 1/(2*PI);
    private double fy = 1/(2*PI);
    
    public PendulumFrame() {
        initComponents();
        
        addComponentListener(this);
        
        timer = new Timer(1, (ActionEvent e) -> {
            panel.repaint();
            panel.revalidate();
        });
        
        timer.start();
        
        Executor exe = Executors.newSingleThreadExecutor();
        exe.execute(() -> {panel.update();});
        
        toggleActionPerformed(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        panel = new pendulum.PendulumPanel();
        jPanel2 = new javax.swing.JPanel();
        puls = new javax.swing.JRadioButton();
        freq = new javax.swing.JRadioButton();
        insert = new javax.swing.JTextField();
        insert1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        dagle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        daglePanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        incr = new javax.swing.JTextField();
        info = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        term_select = new javax.swing.JCheckBox();
        term = new javax.swing.JTextField();
        tpf = new javax.swing.JCheckBox();
        tsim = new javax.swing.JCheckBox();
        rainbow = new javax.swing.JCheckBox();
        toggle = new javax.swing.JToggleButton();
        dagle1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        insert2 = new javax.swing.JTextField();
        insert3 = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 651, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        buttonGroup1.add(puls);
        puls.setSelected(true);
        puls.setText("Pulsazione (rad/s)");
        puls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pulsActionPerformed(evt);
            }
        });

        buttonGroup1.add(freq);
        freq.setText("Frequenza (Hz)");
        freq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                freqActionPerformed(evt);
            }
        });

        insert.setText("1");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });
        insert.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                insertKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                insertKeyReleased(evt);
            }
        });

        insert1.setText("1");
        insert1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert1ActionPerformed(evt);
            }
        });
        insert1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                insert1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                insert1KeyReleased(evt);
            }
        });

        jLabel1.setText("X:");

        jButton1.setText("Riavvia");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        dagle.setText("Pulsazione:");

        jLabel2.setText("Y:");

        jLabel3.setText("Opzioni avanzate:");

        jLabel4.setText("Incremento (rad/ms):");

        incr.setText("0.00001");
        incr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incrActionPerformed(evt);
            }
        });
        incr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                incrKeyReleased(evt);
            }
        });

        info.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info.setText("Francesco Sollazzi, Dicembre 2019");

        jLabel6.setText("Colore traccia:");

        jButton2.setText("Cambia colore...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        term_select.setSelected(true);
        term_select.setText("Ferma esecuzione a: (πrad)");
        term_select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                term_selectActionPerformed(evt);
            }
        });

        term.setText("2");
        term.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                termActionPerformed(evt);
            }
        });
        term.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                termKeyReleased(evt);
            }
        });

        tpf.setSelected(true);
        tpf.setText("Abilita TPF");
        tpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpfActionPerformed(evt);
            }
        });

        tsim.setSelected(true);
        tsim.setText("Simula tempo");
        tsim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsimActionPerformed(evt);
            }
        });

        rainbow.setText("RaiNbOw");
        rainbow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rainbowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout daglePanelLayout = new javax.swing.GroupLayout(daglePanel);
        daglePanel.setLayout(daglePanelLayout);
        daglePanelLayout.setHorizontalGroup(
            daglePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(daglePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(daglePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, daglePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(incr)
                    .addComponent(info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(term)
                    .addComponent(term_select)
                    .addComponent(tpf)
                    .addComponent(tsim)
                    .addComponent(rainbow))
                .addContainerGap())
        );
        daglePanelLayout.setVerticalGroup(
            daglePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(daglePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(incr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rainbow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(term_select)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(term, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tpf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tsim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(info)
                .addContainerGap())
        );

        toggle.setText("Opzioni avanzate");
        toggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleActionPerformed(evt);
            }
        });

        dagle1.setText("Fase (πrad): ");

        jLabel5.setText("X:");

        jLabel7.setText("Y:");

        insert2.setText("0");
        insert2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert2ActionPerformed(evt);
            }
        });
        insert2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                insert2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                insert2KeyReleased(evt);
            }
        });

        insert3.setText("0.5");
        insert3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert3ActionPerformed(evt);
            }
        });
        insert3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                insert3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                insert3KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(daglePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(toggle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(insert))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(insert1))
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(insert3))
                            .addComponent(dagle)
                            .addComponent(freq)
                            .addComponent(puls)
                            .addComponent(dagle1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(insert2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(freq)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(puls)
                .addGap(18, 18, 18)
                .addComponent(dagle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insert1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dagle1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insert3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insert2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toggle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(daglePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addComponentListener(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void freqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_freqActionPerformed
        if(freq.isSelected())
            dagle.setText("Frequenza:");
        
        fx /= 2*PI;
        fy /= 2*PI;
    }//GEN-LAST:event_freqActionPerformed

    private void pulsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pulsActionPerformed
        if(puls.isSelected())
            dagle.setText("Pulsazione:");
        
        fx *= 2*PI;
        fy *= 2*PI;
    }//GEN-LAST:event_pulsActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        
    }//GEN-LAST:event_insertActionPerformed

    private void insertKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_insertKeyPressed
        
    }//GEN-LAST:event_insertKeyPressed

    private void insert1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert1ActionPerformed
        
    }//GEN-LAST:event_insert1ActionPerformed

    private void insert1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_insert1KeyPressed
        
    }//GEN-LAST:event_insert1KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        panel.setFrequencyX(fx);
        panel.setFrequencyY(fy);
        panel.reset();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void insertKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_insertKeyReleased
        if(insert.getText().isEmpty()) return;
        
        try {
            insert.setForeground(Color.black);
            
            double value = Float.parseFloat(insert.getText());
            
            fx = (freq.isSelected()) ? value : value/(2*PI);
        } catch(NumberFormatException ex){
            insert.setForeground(Color.red);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_insertKeyReleased

    private void insert1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_insert1KeyReleased
        if(insert1.getText().isEmpty()) return;
        
        try {
            insert1.setForeground(Color.black);
            
            double value = Float.parseFloat(insert1.getText());
            
            fy = (freq.isSelected()) ? value : value/(2*PI);
        } catch(NumberFormatException ex){
            insert1.setForeground(Color.red);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_insert1KeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        panel.drawColor = JColorChooser.showDialog(this, "Colore traccia", Color.white);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void toggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleActionPerformed
        for(Component c : daglePanel.getComponents()) c.setVisible(toggle.isSelected());
    }//GEN-LAST:event_toggleActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            info.setIcon(new ImageIcon(ImageIO.read(PendulumFrame.class.getResourceAsStream("error.png"))));
        } catch (IOException ex) {
            Logger.getLogger(PendulumFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        info.setText("");
        
        SwingWorker slave = new SwingWorker() {
            @Override
            protected Object doInBackground() throws Exception {
                Thread.sleep(1000);
                info.setText("Francesco Sollazzi, Dicembre 2019");
                info.setIcon(null);
                return null;
            }
        };
        
        slave.execute();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void incrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incrActionPerformed
        
    }//GEN-LAST:event_incrActionPerformed

    private void term_selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_term_selectActionPerformed
        term.setEnabled(term_select.isSelected());
        
        panel.shouldStop = term_select.isSelected();
    }//GEN-LAST:event_term_selectActionPerformed

    private void termActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_termActionPerformed
        
    }//GEN-LAST:event_termActionPerformed

    private void tpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpfActionPerformed
        panel.tpfEnabled = tpf.isSelected();
    }//GEN-LAST:event_tpfActionPerformed

    private void incrKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_incrKeyReleased
        if(incr.getText().isEmpty()) return;
        
        try {
            incr.setForeground(Color.black);
            
            double value = Float.parseFloat(incr.getText());
            
            panel.increment = value;
        } catch(NumberFormatException ex){
            incr.setForeground(Color.red);
        }
    }//GEN-LAST:event_incrKeyReleased

    private void termKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_termKeyReleased
        if(term.getText().isEmpty()) return;
        
        try {
            term.setForeground(Color.black);
            
            double value = Float.parseFloat(term.getText());
            
            panel.term = value;
        } catch(NumberFormatException ex){
            term.setForeground(Color.red);
        }
    }//GEN-LAST:event_termKeyReleased

    private void tsimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsimActionPerformed
        panel.tsim = tsim.isSelected();
    }//GEN-LAST:event_tsimActionPerformed

    private void rainbowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rainbowActionPerformed
        panel.rainbow = rainbow.isSelected();
    }//GEN-LAST:event_rainbowActionPerformed

    private void insert2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insert2ActionPerformed

    private void insert2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_insert2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_insert2KeyPressed

    private void insert2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_insert2KeyReleased
        if(insert2.getText().isEmpty()) return;
        
        try {
            insert2.setForeground(Color.black);
            
            float value = Float.parseFloat(insert2.getText());
            
            panel.setPhaseY(value*(float)PI);
        } catch(NumberFormatException ex){
            insert2.setForeground(Color.red);
        }
    }//GEN-LAST:event_insert2KeyReleased

    private void insert3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insert3ActionPerformed

    private void insert3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_insert3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_insert3KeyPressed

    private void insert3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_insert3KeyReleased
        if(insert3.getText().isEmpty()) return;
        
        try {
            insert3.setForeground(Color.black);
            
            float value = Float.parseFloat(insert3.getText());
            
            panel.setPhaseX(value*(float)PI);
        } catch(NumberFormatException ex){
            insert3.setForeground(Color.red);
        }
    }//GEN-LAST:event_insert3KeyReleased

    public static void init() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PendulumFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new PendulumFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel dagle;
    private javax.swing.JLabel dagle1;
    private javax.swing.JPanel daglePanel;
    private javax.swing.JRadioButton freq;
    private javax.swing.JTextField incr;
    private javax.swing.JLabel info;
    private javax.swing.JTextField insert;
    private javax.swing.JTextField insert1;
    private javax.swing.JTextField insert2;
    private javax.swing.JTextField insert3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private pendulum.PendulumPanel panel;
    private javax.swing.JRadioButton puls;
    private javax.swing.JCheckBox rainbow;
    private javax.swing.JTextField term;
    private javax.swing.JCheckBox term_select;
    private javax.swing.JToggleButton toggle;
    private javax.swing.JCheckBox tpf;
    private javax.swing.JCheckBox tsim;
    // End of variables declaration//GEN-END:variables

    @Override
    public void componentResized(ComponentEvent e) {
    }

    @Override
    public void componentMoved(ComponentEvent e) {}

    @Override
    public void componentShown(ComponentEvent e) {}

    @Override
    public void componentHidden(ComponentEvent e) {}

}
