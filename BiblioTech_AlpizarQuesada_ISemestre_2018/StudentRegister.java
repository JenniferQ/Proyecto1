package BiblioTech_AlpizarQuesada_ISemestre_2018;

import domain.Student;
import file.StudentFile;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentRegister extends javax.swing.JFrame {

   

    /**
     * Creates new form studentRegister
     */
    public StudentRegister() {
        initComponents();
        this.setExtendedState(StudentRegister.MAXIMIZED_BOTH);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_namestudent = new javax.swing.JLabel();
        tf_nameStudent = new javax.swing.JTextField();
        lb_careerStudent = new javax.swing.JLabel();
        lb_yearStudent = new javax.swing.JLabel();
        lb_mailStudent = new javax.swing.JLabel();
        lb_celStudent = new javax.swing.JLabel();
        lb_adressStudent = new javax.swing.JLabel();
        tf_yearStudent = new javax.swing.JTextField();
        tf_mailStudent = new javax.swing.JTextField();
        tf_celStudent = new javax.swing.JTextField();
        tf_adressStudent = new javax.swing.JTextField();
        btn_registerStudent = new javax.swing.JButton();
        cbx_careerStudent = new javax.swing.JComboBox<>();
        lb_correctStudent = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lb_namestudent.setFont(new java.awt.Font("Sitka Small", 1, 22)); // NOI18N
        lb_namestudent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_namestudent.setText("Name");
        lb_namestudent.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(lb_namestudent);
        lb_namestudent.setBounds(170, 60, 160, 32);

        tf_nameStudent.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_nameStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nameStudentActionPerformed(evt);
            }
        });
        tf_nameStudent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_nameStudentKeyTyped(evt);
            }
        });
        getContentPane().add(tf_nameStudent);
        tf_nameStudent.setBounds(520, 60, 410, 30);

        lb_careerStudent.setFont(new java.awt.Font("Sitka Small", 1, 22)); // NOI18N
        lb_careerStudent.setText("Career");
        getContentPane().add(lb_careerStudent);
        lb_careerStudent.setBounds(220, 140, 91, 21);

        lb_yearStudent.setFont(new java.awt.Font("Sitka Small", 1, 22)); // NOI18N
        lb_yearStudent.setText("Year");
        getContentPane().add(lb_yearStudent);
        lb_yearStudent.setBounds(220, 300, 81, 29);

        lb_mailStudent.setFont(new java.awt.Font("Sitka Small", 1, 22)); // NOI18N
        lb_mailStudent.setText("Mail");
        getContentPane().add(lb_mailStudent);
        lb_mailStudent.setBounds(220, 220, 65, 29);

        lb_celStudent.setFont(new java.awt.Font("Sitka Small", 1, 22)); // NOI18N
        lb_celStudent.setText("Phone");
        getContentPane().add(lb_celStudent);
        lb_celStudent.setBounds(220, 500, 81, 21);

        lb_adressStudent.setFont(new java.awt.Font("Sitka Small", 1, 22)); // NOI18N
        lb_adressStudent.setText("Address");
        getContentPane().add(lb_adressStudent);
        lb_adressStudent.setBounds(220, 390, 140, 29);

        tf_yearStudent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_yearStudentKeyTyped(evt);
            }
        });
        getContentPane().add(tf_yearStudent);
        tf_yearStudent.setBounds(520, 300, 420, 30);

        tf_mailStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_mailStudentActionPerformed(evt);
            }
        });
        getContentPane().add(tf_mailStudent);
        tf_mailStudent.setBounds(520, 210, 410, 30);

        tf_celStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_celStudentActionPerformed(evt);
            }
        });
        tf_celStudent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_celStudentKeyTyped(evt);
            }
        });
        getContentPane().add(tf_celStudent);
        tf_celStudent.setBounds(520, 490, 420, 30);

        tf_adressStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_adressStudentActionPerformed(evt);
            }
        });
        getContentPane().add(tf_adressStudent);
        tf_adressStudent.setBounds(520, 400, 420, 30);

        btn_registerStudent.setFont(new java.awt.Font("Sitka Small", 1, 16)); // NOI18N
        btn_registerStudent.setText("Register");
        btn_registerStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerStudentActionPerformed(evt);
            }
        });
        getContentPane().add(btn_registerStudent);
        btn_registerStudent.setBounds(840, 600, 134, 37);

        cbx_careerStudent.setFont(new java.awt.Font("Sitka Small", 1, 13)); // NOI18N
        cbx_careerStudent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computing", "Agronomy", "Education" }));
        cbx_careerStudent.setToolTipText("");
        cbx_careerStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_careerStudentActionPerformed(evt);
            }
        });
        getContentPane().add(cbx_careerStudent);
        cbx_careerStudent.setBounds(520, 140, 410, 30);

        lb_correctStudent.setFont(new java.awt.Font("Sitka Small", 1, 22)); // NOI18N
        getContentPane().add(lb_correctStudent);
        lb_correctStudent.setBounds(210, 770, 840, 50);

        lb_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo22_1.png"))); // NOI18N
        getContentPane().add(lb_image);
        lb_image.setBounds(-40, -330, 2200, 1310);

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

    private void tf_nameStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nameStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nameStudentActionPerformed

    private void tf_nameStudentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_nameStudentKeyTyped

        char car = evt.getKeyChar();
        if (!(Character.isLetter(car) || Character.isSpaceChar(car))) {
            evt.consume();
        }

    }//GEN-LAST:event_tf_nameStudentKeyTyped

    private void tf_yearStudentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_yearStudentKeyTyped
        char car = evt.getKeyChar();
        if (car < '0' || car > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_tf_yearStudentKeyTyped

    private void tf_mailStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_mailStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_mailStudentActionPerformed

    private void tf_celStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_celStudentActionPerformed
       
    }//GEN-LAST:event_tf_celStudentActionPerformed

    private void tf_celStudentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_celStudentKeyTyped
        char car = evt.getKeyChar();

        if (car < '0' || car > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_tf_celStudentKeyTyped

    private void tf_adressStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_adressStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_adressStudentActionPerformed

    private void btn_registerStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerStudentActionPerformed
      
         StudentFile su;
        

            su = new StudentFile("Student.dat");
            
            try {
                if(su.verifyComplete(tf_nameStudent.getText(),(String)cbx_careerStudent.getSelectedItem(), tf_mailStudent.getText(), (String)tf_yearStudent.getText(), tf_celStudent.getText(), tf_adressStudent.getText())!=false){
            String carne = su.getId(Integer.parseInt(tf_yearStudent.getText()), (String) cbx_careerStudent.getSelectedItem());     Student registerStudent = new Student(tf_nameStudent.getText(), carne, (String) cbx_careerStudent.getSelectedItem(),
                Integer.parseInt(tf_yearStudent.getText()), tf_celStudent.getText(), tf_mailStudent.getText(), tf_adressStudent.getText());
                su.serialize(registerStudent);
                
                lb_correctStudent.setText("El estudiante se registro correctamente \n El carné de registro es " + carne);
            }else{
            }
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(StudentRegister.class.getName()).log(Level.SEVERE, null, ex);
            }       
     
   
    }//GEN-LAST:event_btn_registerStudentActionPerformed

    private void cbx_careerStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_careerStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_careerStudentActionPerformed

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
            rb= new ReturnBook();
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
            Logger.getLogger(StudentRegister.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuItemRegisterStudentActionPerformed

    private void menuItemRegisterBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRegisterBookActionPerformed

        TableBook tb;

        try {
            tb = new TableBook();
            tb.setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(InterfacePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
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
        About ab= new About();
        ab.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuItemAboutActionPerformed

    private void menuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuItemExitActionPerformed

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
            java.util.logging.Logger.getLogger(StudentRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StudentRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuItem_LoanRegister;
    private javax.swing.JButton btn_registerStudent;
    private javax.swing.JComboBox<String> cbx_careerStudent;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lb_adressStudent;
    private javax.swing.JLabel lb_careerStudent;
    private javax.swing.JLabel lb_celStudent;
    private javax.swing.JLabel lb_correctStudent;
    private javax.swing.JLabel lb_image;
    private javax.swing.JLabel lb_mailStudent;
    private javax.swing.JLabel lb_namestudent;
    private javax.swing.JLabel lb_yearStudent;
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
    private javax.swing.JTextField tf_adressStudent;
    private javax.swing.JTextField tf_celStudent;
    private javax.swing.JTextField tf_mailStudent;
    private javax.swing.JTextField tf_nameStudent;
    private javax.swing.JTextField tf_yearStudent;
    // End of variables declaration//GEN-END:variables
}