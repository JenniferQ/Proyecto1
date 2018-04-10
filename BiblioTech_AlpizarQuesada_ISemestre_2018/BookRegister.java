package BiblioTech_AlpizarQuesada_ISemestre_2018;

import domain.Books;
import file.MaterialFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BookRegister extends javax.swing.JFrame {

    File archivo;
    MaterialFile material;

    public BookRegister() {
        initComponents();
        this.setExtendedState(BookRegister.MAXIMIZED_BOTH);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_nameBook = new javax.swing.JLabel();
        tf_nameBook = new javax.swing.JTextField();
        lb_quantityBooks = new javax.swing.JLabel();
        tf_quatityBook = new javax.swing.JTextField();
        lb_authorBook = new javax.swing.JLabel();
        tf_authorBook = new javax.swing.JTextField();
        lb_yearBook = new javax.swing.JLabel();
        tf_yearBook = new javax.swing.JTextField();
        lb_formatBook = new javax.swing.JLabel();
        cbx_formatBook = new javax.swing.JComboBox<>();
        lb_correctbook = new javax.swing.JLabel();
        btn_registerBook = new javax.swing.JButton();
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

        lb_nameBook.setFont(new java.awt.Font("Sitka Small", 1, 22)); // NOI18N
        lb_nameBook.setText("Description");
        getContentPane().add(lb_nameBook);
        lb_nameBook.setBounds(220, 70, 146, 22);

        tf_nameBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nameBookActionPerformed(evt);
            }
        });
        tf_nameBook.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_nameBookKeyTyped(evt);
            }
        });
        getContentPane().add(tf_nameBook);
        tf_nameBook.setBounds(400, 70, 315, 30);

        lb_quantityBooks.setFont(new java.awt.Font("Sitka Small", 1, 22)); // NOI18N
        lb_quantityBooks.setText("Quantity");
        getContentPane().add(lb_quantityBooks);
        lb_quantityBooks.setBounds(230, 160, 130, 29);

        tf_quatityBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_quatityBookActionPerformed(evt);
            }
        });
        tf_quatityBook.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_quatityBookKeyTyped(evt);
            }
        });
        getContentPane().add(tf_quatityBook);
        tf_quatityBook.setBounds(400, 160, 315, 30);

        lb_authorBook.setFont(new java.awt.Font("Sitka Small", 1, 22)); // NOI18N
        lb_authorBook.setText("Author");
        getContentPane().add(lb_authorBook);
        lb_authorBook.setBounds(230, 250, 120, 31);

        tf_authorBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_authorBookActionPerformed(evt);
            }
        });
        tf_authorBook.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_authorBookKeyTyped(evt);
            }
        });
        getContentPane().add(tf_authorBook);
        tf_authorBook.setBounds(400, 250, 315, 30);

        lb_yearBook.setFont(new java.awt.Font("Sitka Small", 1, 22)); // NOI18N
        lb_yearBook.setText("Year");
        getContentPane().add(lb_yearBook);
        lb_yearBook.setBounds(230, 340, 78, 21);

        tf_yearBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_yearBookActionPerformed(evt);
            }
        });
        tf_yearBook.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_yearBookKeyTyped(evt);
            }
        });
        getContentPane().add(tf_yearBook);
        tf_yearBook.setBounds(400, 330, 315, 30);

        lb_formatBook.setFont(new java.awt.Font("Sitka Small", 1, 22)); // NOI18N
        lb_formatBook.setText("Format");
        getContentPane().add(lb_formatBook);
        lb_formatBook.setBounds(230, 410, 130, 29);

        cbx_formatBook.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Digital", "Physical" }));
        getContentPane().add(cbx_formatBook);
        cbx_formatBook.setBounds(400, 410, 315, 30);

        lb_correctbook.setFont(new java.awt.Font("Sitka Small", 1, 22)); // NOI18N
        lb_correctbook.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lb_correctbook);
        lb_correctbook.setBounds(270, 707, 630, 40);

        btn_registerBook.setFont(new java.awt.Font("Sitka Small", 1, 22)); // NOI18N
        btn_registerBook.setText("Register");
        btn_registerBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerBookActionPerformed(evt);
            }
        });
        getContentPane().add(btn_registerBook);
        btn_registerBook.setBounds(620, 540, 132, 37);

        lb_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo22_1.png"))); // NOI18N
        getContentPane().add(lb_image);
        lb_image.setBounds(0, -340, 2200, 1310);

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

    private void tf_nameBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nameBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nameBookActionPerformed

    private void tf_quatityBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_quatityBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_quatityBookActionPerformed

    private void tf_authorBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_authorBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_authorBookActionPerformed

    private void tf_yearBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_yearBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_yearBookActionPerformed

    private void btn_registerBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerBookActionPerformed
        try {
            archivo = new File("Books.dat");
            material = new MaterialFile(archivo);
            if (material.verifyCompleteBook(tf_nameBook.getText(), tf_authorBook.getText(), (String) cbx_formatBook.getSelectedItem(),
                    (String) tf_yearBook.getText(), (String) tf_quatityBook.getText()) != false) {
                if (material.quantity(tf_nameBook.getText(), tf_authorBook.getText(), Integer.parseInt(tf_quatityBook.getText()), (String) cbx_formatBook.getSelectedItem(), Integer.parseInt(tf_yearBook.getText()))) {

                } else {
                    Books book = new Books(Integer.parseInt(tf_yearBook.getText()), tf_authorBook.getText(), (String) cbx_formatBook.getSelectedItem(),
                            tf_nameBook.getText(), material.getCode(), Integer.parseInt(tf_quatityBook.getText()), Integer.parseInt(tf_quatityBook.getText()));
                    material.addEndRecord(book);
                }
            } else {

            }
            tf_authorBook.setText("");
            tf_nameBook.setText("");
            tf_quatityBook.setText("");
            tf_yearBook.setText("");

        } catch (FileNotFoundException ex) {
            System.out.println("Error boton registrar estudiante");

        } catch (IOException ex) {
            Logger.getLogger(BookRegister.class.getName()).log(Level.SEVERE, null, ex);
        }
        lb_correctbook.setText("The book was correctly registered with the code: " + material.getCode());

    }//GEN-LAST:event_btn_registerBookActionPerformed

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
            Logger.getLogger(BookRegister.class.getName()).log(Level.SEVERE, null, ex);
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

    private void tf_nameBookKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_nameBookKeyTyped
        char car = evt.getKeyChar();
        if (!(Character.isLetter(car) || Character.isSpaceChar(car))) {
            evt.consume();
        }
    }//GEN-LAST:event_tf_nameBookKeyTyped

    private void tf_quatityBookKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_quatityBookKeyTyped
        char car = evt.getKeyChar();
        if (car < '0' || car > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_tf_quatityBookKeyTyped

    private void tf_authorBookKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_authorBookKeyTyped
        char car = evt.getKeyChar();
        if (!(Character.isLetter(car) || Character.isSpaceChar(car))) {
            evt.consume();
        }
    }//GEN-LAST:event_tf_authorBookKeyTyped

    private void tf_yearBookKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_yearBookKeyTyped
        char car = evt.getKeyChar();
        if (car < '0' || car > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_tf_yearBookKeyTyped

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
            java.util.logging.Logger.getLogger(BookRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BookRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuItem_LoanRegister;
    private javax.swing.JButton btn_registerBook;
    private javax.swing.JComboBox<String> cbx_formatBook;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lb_authorBook;
    private javax.swing.JLabel lb_correctbook;
    private javax.swing.JLabel lb_formatBook;
    private javax.swing.JLabel lb_image;
    private javax.swing.JLabel lb_nameBook;
    private javax.swing.JLabel lb_quantityBooks;
    private javax.swing.JLabel lb_yearBook;
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
    private javax.swing.JTextField tf_authorBook;
    private javax.swing.JTextField tf_nameBook;
    private javax.swing.JTextField tf_quatityBook;
    private javax.swing.JTextField tf_yearBook;
    // End of variables declaration//GEN-END:variables
}
