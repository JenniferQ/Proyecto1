/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BiblioTech_AlpizarQuesada_ISemestre_2018;

import domain.Audiovisual;
import file.AudiovisualFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class TableAudiovisual extends javax.swing.JFrame {

  
    public TableAudiovisual() throws IOException, FileNotFoundException, ClassNotFoundException {
        initComponents();
        ArrayList();
       
       this.setExtendedState(TableAudiovisual.MAXIMIZED_BOTH);
       
       
    }
    public void ArrayList() throws IOException, FileNotFoundException, ClassNotFoundException{
       File fileaudiovisual= new File("Audiovisual.dat");
        DefaultTableModel medel=(DefaultTableModel) tableAudiovisual.getModel();
       
        AudiovisualFile audiovisual =new AudiovisualFile(fileaudiovisual);
        ArrayList<Audiovisual> audio = audiovisual.getStudentList();
        Object Audiovisual[]=new Object[5];
        for (int i = 0; i < audio.size(); i++) {
            Audiovisual[0]=audio.get(i).getBrand();
              Audiovisual[1]=audio.get(i).getName();
                Audiovisual[2]=audio.get(i).getCode();
                  Audiovisual[3]=audio.get(i).getQuantity();
                    Audiovisual[4]=audio.get(i).getAvailable();
          medel.addRow(Audiovisual);
                    
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tableAudiovisual = new javax.swing.JTable();
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

        tableAudiovisual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand ", "Name", "Code", "Quantity", "Available"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableAudiovisual);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(31, 33, 637, 324);

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
            Logger.getLogger(TableAudiovisual.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (IOException ex) {
            System.out.println("Error en la tabla audiovisual");      
        } catch (ClassNotFoundException ex) {
              System.out.println("Error  la tabla audiovisual"); 
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
            java.util.logging.Logger.getLogger(TableAudiovisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableAudiovisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableAudiovisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableAudiovisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new TableAudiovisual().setVisible(true);
                } catch (IOException | ClassNotFoundException ex) {
                    Logger.getLogger(TableAudiovisual.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuItem_LoanRegister;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_image;
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
    private javax.swing.JTable tableAudiovisual;
    // End of variables declaration//GEN-END:variables
}
