/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uiumeetup;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class Studentframe extends javax.swing.JFrame {

    /**
     * Creates new form Studentframe
     */
    public Studentframe() {
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

        CGPA = new javax.swing.JButton();
        ASSIGNMENT = new javax.swing.JButton();
        ROUTINE = new javax.swing.JButton();
        FACULTY = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CGPA.setText("CGPA");
        CGPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CGPAActionPerformed(evt);
            }
        });

        ASSIGNMENT.setText("ASSIGNMENT");
        ASSIGNMENT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ASSIGNMENTActionPerformed(evt);
            }
        });

        ROUTINE.setText("ROUTINE");
        ROUTINE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ROUTINEActionPerformed(evt);
            }
        });

        FACULTY.setText("FACULTY");
        FACULTY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FACULTYActionPerformed(evt);
            }
        });

        txtarea.setColumns(20);
        txtarea.setRows(5);
        jScrollPane1.setViewportView(txtarea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CGPA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ASSIGNMENT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ROUTINE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FACULTY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ASSIGNMENT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ROUTINE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FACULTY, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CGPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CGPAActionPerformed
/*Student e=null;//, p=null;
       FileInputStream f=null;
       ObjectInputStream in =null;
       
       try {
           Student p = new Student(3.9,"Sunday-computer architecture,monday-java","C.A-farabi,java-rubaba hasan");
            FileOutputStream fo=new FileOutputStream("input.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fo);
            oos.writeObject(p);
            oos.close();
            
           
           
           f=new FileInputStream("input.txt");
           in = new ObjectInputStream(f);
           
        e = (Student) in.readObject();
        //in.writeObject(e);
         //double s=Student.cgpa;
         //p = (Student) in.readObject();
         in.close();
         f.close();
                System.out.println(e.cgpa);

        } catch (Exception ex) {
            
            ex.printStackTrace();
        } 
        //Double a=Double.parseDouble(cgpatxt.getText());
        txtarea.setText(Double.toString(e.cgpa));
        */
    }//GEN-LAST:event_CGPAActionPerformed

    private void ASSIGNMENTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ASSIGNMENTActionPerformed
        // TODO add your handling code here:
       // String assign= (txtarea.getText());
    }//GEN-LAST:event_ASSIGNMENTActionPerformed

    private void ROUTINEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ROUTINEActionPerformed
     /* Student e=null;//, p=null;
       FileInputStream f=null;
       ObjectInputStream in =null;
       
       try {
           Student p = new Student(3.9,"Sunday-computer architecture,monday-java","C.A-farabi,java-rubaba hasan");
            FileOutputStream fo=new FileOutputStream("input.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fo);
            oos.writeObject(p);
            oos.close();
            
           
           
           f=new FileInputStream("input.txt");
           in = new ObjectInputStream(f);
           
        e = (Student) in.readObject();
        //in.writeObject(e);
         //double s=Student.cgpa;
         //p = (Student) in.readObject();
         in.close();
         f.close();
                System.out.println(e.routine);

        } catch (Exception ex) {
            
            ex.printStackTrace();
        } 
       txtarea.setText(e.routine);
        */
    }//GEN-LAST:event_ROUTINEActionPerformed

    private void FACULTYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FACULTYActionPerformed
        // TODO add your handling code here:
       /*  Student e=null;//, p=null;
       FileInputStream f=null;
       ObjectInputStream in =null;
       
       try {
           Student p = new Student(3.9,"Sunday-computer architecture,monday-java","C.A-farabi,java-rubaba hasan");
            FileOutputStream fo=new FileOutputStream("input.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fo);
            oos.writeObject(p);
            oos.close();
            
           
           
           f=new FileInputStream("input.txt");
           in = new ObjectInputStream(f);
           
        e = (Student) in.readObject();
        //in.writeObject(e);
         //double s=Student.cgpa;
         //p = (Student) in.readObject();
         in.close();
         f.close();
                System.out.println(e.routine);

        } catch (Exception ex) {
            
            ex.printStackTrace();
        } 
       txtarea.setText(e.faculty);
        */
        
    }//GEN-LAST:event_FACULTYActionPerformed

    
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
            java.util.logging.Logger.getLogger(Studentframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Studentframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Studentframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Studentframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Studentframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ASSIGNMENT;
    private javax.swing.JButton CGPA;
    private javax.swing.JButton FACULTY;
    private javax.swing.JButton ROUTINE;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtarea;
    // End of variables declaration//GEN-END:variables
}
