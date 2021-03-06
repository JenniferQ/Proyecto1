package BiblioTech_AlpizarQuesada_ISemestre_2018;

import domain.Audiovisual;
import file.AudiovisualFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AudiovisualRegister extends javax.swing.JFrame {

    public AudiovisualRegister() {
        initComponents();
        this.setExtendedState(AudiovisualRegister.MAXIMIZED_BOTH);

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
        Lb_brandAudiovisual = new javax.swing.JLabel();
        tf_brandRegister = new javax.swing.JTextField();
        lb_nameAdiovisual = new javax.swing.JLabel();
        tf_nameRegister = new javax.swing.JTextField();
        lb_codeAudiovisual = new javax.swing.JLabel();
        lb_quantityAudiovisual = new javax.swing.JLabel();
        tf_quantityRegister = new javax.swing.JTextField();
        btn_RegisterAudiovisual = new javax.swing.JButton();
        lb_image = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuItenLibrary = new javax.swing.JMenu();
        menuItemStudent = new javax.swing.JMenuItem();
        menuItemLibrary = new javax.swing.JMenuItem();
        menuItemAudiovisual = new javax.swing.JMenuItem();
        menuLoan = new javax.swing.JMenu();
        menuItemSlect = new javax.swing.JMenuItem();
        menuItemReturn = new javax.swing.JMenuItem();
        menuItemTableStudent = new javax.swing.JMenu();
        menuItemRegisterStudent = new javax.swing.JMenuItem();
        menuItemRegisterBook = new javax.swing.JMenuItem();
        menuItemRegisterAudiovisual = new javax.swing.JMenuItem();
        MenuItem_LoanRegister = new javax.swing.JMenuItem();
        menuSystem = new javax.swing.JMenu();
        menuItemAbout = new javax.swing.JMenuItem();
        menuItemExit = new javax.swing.JMenuItem();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(3207, 2635));
        getContentPane().setLayout(null);

        Lb_brandAudiovisual.setFont(new java.awt.Font("Sitka Small", 1, 22)); // NOI18N
        Lb_brandAudiovisual.setText("Brand");
        getContentPane().add(Lb_brandAudiovisual);
        Lb_brandAudiovisual.setBounds(315, 65, 105, 29);

        tf_brandRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_brandRegisterActionPerformed(evt);
            }
        });
        tf_brandRegister.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_brandRegisterKeyTyped(evt);
            }
        });
        getContentPane().add(tf_brandRegister);
        tf_brandRegister.setBounds(563, 69, 440, 30);

        lb_nameAdiovisual.setFont(new java.awt.Font("Sitka Small", 1, 22)); // NOI18N
        lb_nameAdiovisual.setText("Description");
        getContentPane().add(lb_nameAdiovisual);
        lb_nameAdiovisual.setBounds(315, 144, 137, 29);

        tf_nameRegister.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_nameRegisterKeyTyped(evt);
            }
        });
        getContentPane().add(tf_nameRegister);
        tf_nameRegister.setBounds(563, 159, 440, 30);

        lb_codeAudiovisual.setFont(new java.awt.Font("Sitka Small", 1, 22)); // NOI18N
        lb_codeAudiovisual.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lb_codeAudiovisual);
        lb_codeAudiovisual.setBounds(410, 360, 700, 45);

        lb_quantityAudiovisual.setFont(new java.awt.Font("Sitka Small", 1, 22)); // NOI18N
        lb_quantityAudiovisual.setText("Quantity");
        getContentPane().add(lb_quantityAudiovisual);
        lb_quantityAudiovisual.setBounds(315, 235, 115, 29);

        tf_quantityRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_quantityRegisterActionPerformed(evt);
            }
        });
        tf_quantityRegister.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_quantityRegisterKeyTyped(evt);
            }
        });
        getContentPane().add(tf_quantityRegister);
        tf_quantityRegister.setBounds(563, 239, 440, 30);

        btn_RegisterAudiovisual.setFont(new java.awt.Font("Sitka Small", 1, 22)); // NOI18N
        btn_RegisterAudiovisual.setText("Register");
        btn_RegisterAudiovisual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegisterAudiovisualActionPerformed(evt);
            }
        });
        getContentPane().add(btn_RegisterAudiovisual);
        btn_RegisterAudiovisual.setBounds(940, 460, 176, 37);

        lb_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo22_1.png"))); // NOI18N
        getContentPane().add(lb_image);
        lb_image.setBounds(-60, -480, 1990, 1570);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        menuItenLibrary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nota.png"))); // NOI18N
        menuItenLibrary.setText("Register");

        menuItemStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estudiante.png"))); // NOI18N
        menuItemStudent.setText("Students");
        menuItemStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemStudentActionPerformed(evt);
            }
        });
        menuItenLibrary.add(menuItemStudent);

        menuItemLibrary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libros.png"))); // NOI18N
        menuItemLibrary.setText("Books");
        menuItemLibrary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemLibraryActionPerformed(evt);
            }
        });
        menuItenLibrary.add(menuItemLibrary);

        menuItemAudiovisual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/audiovisual.png"))); // NOI18N
        menuItemAudiovisual.setText("Audiovisual");
        menuItemAudiovisual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAudiovisualActionPerformed(evt);
            }
        });
        menuItenLibrary.add(menuItemAudiovisual);

        jMenuBar1.add(menuItenLibrary);

        menuLoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/loan.png"))); // NOI18N
        menuLoan.setText("Loan");

        menuItemSlect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clave.png"))); // NOI18N
        menuItemSlect.setText("Verify");
        menuItemSlect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSlectActionPerformed(evt);
            }
        });
        menuLoan.add(menuItemSlect);

        menuItemReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/espalda (1).png"))); // NOI18N
        menuItemReturn.setText("Return");
        menuItemReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemReturnActionPerformed(evt);
            }
        });
        menuLoan.add(menuItemReturn);

        jMenuBar1.add(menuLoan);

        menuItemTableStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nota.png"))); // NOI18N
        menuItemTableStudent.setText("Records");

        menuItemRegisterStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estudiante.png"))); // NOI18N
        menuItemRegisterStudent.setText("Students");
        menuItemRegisterStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRegisterStudentActionPerformed(evt);
            }
        });
        menuItemTableStudent.add(menuItemRegisterStudent);

        menuItemRegisterBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libros.png"))); // NOI18N
        menuItemRegisterBook.setText("Books");
        menuItemRegisterBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRegisterBookActionPerformed(evt);
            }
        });
        menuItemTableStudent.add(menuItemRegisterBook);

        menuItemRegisterAudiovisual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/audiovisual.png"))); // NOI18N
        menuItemRegisterAudiovisual.setText("Audiovisual");
        menuItemRegisterAudiovisual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRegisterAudiovisualActionPerformed(evt);
            }
        });
        menuItemTableStudent.add(menuItemRegisterAudiovisual);

        MenuItem_LoanRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/espalda (1).png"))); // NOI18N
        MenuItem_LoanRegister.setText("Loan");
        MenuItem_LoanRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_LoanRegisterActionPerformed(evt);
            }
        });
        menuItemTableStudent.add(MenuItem_LoanRegister);

        jMenuBar1.add(menuItemTableStudent);

        menuSystem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libro (1).png"))); // NOI18N
        menuSystem.setText("System");

        menuItemAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/info.png"))); // NOI18N
        menuItemAbout.setText("About");
        menuItemAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAboutActionPerformed(evt);
            }
        });
        menuSystem.add(menuItemAbout);

        menuItemExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salida.png"))); // NOI18N
        menuItemExit.setText("Exit");
        menuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemExitActionPerformed(evt);
            }
        });
        menuSystem.add(menuItemExit);

        jMenuBar1.add(menuSystem);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_brandRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_brandRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_brandRegisterActionPerformed

    private void tf_quantityRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_quantityRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_quantityRegisterActionPerformed

    private void btn_RegisterAudiovisualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegisterAudiovisualActionPerformed
        File file = new File("Audiovisual.dat");
        AudiovisualFile audiovisualFile;
        try {
            audiovisualFile = new AudiovisualFile(file);
            if (audiovisualFile.quantity(tf_nameRegister.getText(), tf_brandRegister.getText(), Integer.parseInt(tf_quantityRegister.getText()))) {
            } else {
                Audiovisual audiovisual = new Audiovisual(tf_brandRegister.getText(), tf_nameRegister.getText(), "" + audiovisualFile.getCodeAudiovisual(), Integer.parseInt(tf_quantityRegister.getText()),
                        Integer.parseInt(tf_quantityRegister.getText()));
                audiovisualFile.addEndRecord(audiovisual);
            }
            tf_brandRegister.setText("");
            tf_nameRegister.setText("");
            tf_quantityRegister.setText("");
        } catch (FileNotFoundException ex) {
            System.out.println("Register button failed");
        } catch (IOException ex) {
            System.out.println("Error");

        }
    }//GEN-LAST:event_btn_RegisterAudiovisualActionPerformed

    private void menuItemStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemStudentActionPerformed
        StudentRegister sr = new StudentRegister();
        sr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuItemStudentActionPerformed

    private void menuItemLibraryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemLibraryActionPerformed
        BookRegister br = new BookRegister();
        br.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuItemLibraryActionPerformed

    private void menuItemAudiovisualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAudiovisualActionPerformed
        AudiovisualRegister av = new AudiovisualRegister();
        av.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuItemAudiovisualActionPerformed

    private void menuItemSlectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSlectActionPerformed
        LoanRegister lr = new LoanRegister();
        lr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuItemSlectActionPerformed

    private void menuItemReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemReturnActionPerformed
        ReturnBook rb;

        try {
            rb = new ReturnBook();
            rb.setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(InterfacePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_menuItemReturnActionPerformed

    private void menuItemRegisterStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRegisterStudentActionPerformed
        TableStudents ts;

        try {
            ts = new TableStudents();
            ts.setVisible(true);
            this.setVisible(false);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(AudiovisualRegister.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_menuItemRegisterStudentActionPerformed

    private void menuItemRegisterBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRegisterBookActionPerformed

        TableBook tb;

        try {
            tb = new TableBook();
            tb.setVisible(true);
            this.setVisible(false);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(InterfacePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_menuItemRegisterBookActionPerformed

    private void menuItemRegisterAudiovisualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRegisterAudiovisualActionPerformed
        TableAudiovisual ta;

        try {
            ta = new TableAudiovisual();
            ta.setVisible(true);
            this.setVisible(false);
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Error");
        }
    }//GEN-LAST:event_menuItemRegisterAudiovisualActionPerformed

    private void MenuItem_LoanRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_LoanRegisterActionPerformed
        TableLoan tl;

        try {
            tl = new TableLoan();
            tl.setVisible(true);
            this.setVisible(false);
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Error");
        }
    }//GEN-LAST:event_MenuItem_LoanRegisterActionPerformed

    private void menuItemAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAboutActionPerformed
        About ab = new About();
        ab.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuItemAboutActionPerformed

    private void menuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuItemExitActionPerformed

    private void tf_brandRegisterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_brandRegisterKeyTyped
        char car = evt.getKeyChar();
        if (!(Character.isLetter(car) || Character.isSpaceChar(car))) {
            evt.consume();
        }

    }//GEN-LAST:event_tf_brandRegisterKeyTyped

    private void tf_nameRegisterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_nameRegisterKeyTyped
        char car = evt.getKeyChar();
        if (!(Character.isLetter(car) || Character.isSpaceChar(car))) {
            evt.consume();
        }
    }//GEN-LAST:event_tf_nameRegisterKeyTyped

    private void tf_quantityRegisterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_quantityRegisterKeyTyped
        char car = evt.getKeyChar();
        if (car < '0' || car > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_tf_quantityRegisterKeyTyped

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
            java.util.logging.Logger.getLogger(AudiovisualRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AudiovisualRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AudiovisualRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AudiovisualRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AudiovisualRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lb_brandAudiovisual;
    private javax.swing.JMenuItem MenuItem_LoanRegister;
    private javax.swing.JButton btn_RegisterAudiovisual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lb_codeAudiovisual;
    private javax.swing.JLabel lb_image;
    private javax.swing.JLabel lb_nameAdiovisual;
    private javax.swing.JLabel lb_quantityAudiovisual;
    private javax.swing.JMenuItem menuItemAbout;
    private javax.swing.JMenuItem menuItemAudiovisual;
    private javax.swing.JMenuItem menuItemExit;
    private javax.swing.JMenuItem menuItemLibrary;
    private javax.swing.JMenuItem menuItemRegisterAudiovisual;
    private javax.swing.JMenuItem menuItemRegisterBook;
    private javax.swing.JMenuItem menuItemRegisterStudent;
    private javax.swing.JMenuItem menuItemReturn;
    private javax.swing.JMenuItem menuItemSlect;
    private javax.swing.JMenuItem menuItemStudent;
    private javax.swing.JMenu menuItemTableStudent;
    private javax.swing.JMenu menuItenLibrary;
    private javax.swing.JMenu menuLoan;
    private javax.swing.JMenu menuSystem;
    private javax.swing.JTextField tf_brandRegister;
    private javax.swing.JTextField tf_nameRegister;
    private javax.swing.JTextField tf_quantityRegister;
    // End of variables declaration//GEN-END:variables
}
