/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.DAO.AlunoDAO;
import Model.DAO.BoletimDAO;
import Model.DAO.CursoDAO;
import Model.DAO.DiciplinaDAO;
import Model.bean.Aluno;
import Model.bean.Boletim;
import Model.bean.Curso;
import Model.bean.Disciplina;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author MATHEUS1
 */
public class TelaLancarNotas_Freq extends javax.swing.JFrame {

    /**
     * Creates new form TelaLancarNotas_Freq
     */
    public TelaLancarNotas_Freq() {
        initComponents();
         setLocationRelativeTo( null );
        
          DefaultTableModel modelo = (DefaultTableModel) jTableLancarNotas.getModel();
        jTableLancarNotas.setRowSorter(new TableRowSorter(modelo));
         
        DefaultTableModel modelo1 = (DefaultTableModel) tblDisciplinas.getModel();
        tblDisciplinas.setRowSorter(new TableRowSorter(modelo1));

        readJTable();
         readJTableDisciplinas();
         //preencherComboBox();
         
         
    }
 /*public void preencherComboBox(){
        
     DiciplinaDAO d = new DiciplinaDAO();
        
        List<Disciplina> disciplinas = d.read();
        
        Iterator<Disciplina> i = disciplinas.iterator();
        
        while(i.hasNext()){
            
            //jComboBoxDisciplinas.addItem(i.next().getId());
            jComboBoxDisciplinas.addItem(i.next().getNome());
            
        }
    
       
    }*/
     public void readJTable(){
       DefaultTableModel modelo = (DefaultTableModel) jTableLancarNotas.getModel();
       modelo.setNumRows(0);
       AlunoDAO aDAO = new AlunoDAO();
        
        for(Aluno a: aDAO.read()){
            
           modelo.addRow(new Object[]{
               a.getMatricula(),
               a.getNome()
                          
           });
        }
         
         
        }
     
         public void readJTableDisciplinas(){
       DefaultTableModel modelo1 = (DefaultTableModel) tblDisciplinas.getModel();
       modelo1.setNumRows(0);
       DiciplinaDAO dDAO = new DiciplinaDAO();
        
        for(Disciplina d: dDAO.read()){
            
           modelo1.addRow(new Object[]{
               d.getId(),
               d.getNome()
                          
           });
        }
         
         
        }
     
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("mysql?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        columnStatsQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM ColumnStats c");
        columnStatsList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : columnStatsQuery.getResultList();
        textArea1 = new java.awt.TextArea();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLancarNotas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtN1 = new javax.swing.JTextField();
        txtN2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAluno = new javax.swing.JTextField();
        btnLancarNotas = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDisciplinas = new javax.swing.JTable();
        txtNomeDisciplina = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdDisciplina = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/View Lançar Notas 3.png"))); // NOI18N
        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableLancarNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MATRICULA", " ALUNO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableLancarNotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableLancarNotasMouseClicked(evt);
            }
        });
        jTableLancarNotas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableLancarNotasKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTableLancarNotas);
        if (jTableLancarNotas.getColumnModel().getColumnCount() > 0) {
            jTableLancarNotas.getColumnModel().getColumn(0).setPreferredWidth(90);
            jTableLancarNotas.getColumnModel().getColumn(0).setMaxWidth(336);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 460, 170));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("SELECIONE UMA DISCIPLINA ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 200, 19));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("N1:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("N2:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, -1, 20));

        txtN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtN1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 140, 30));

        txtN2.setMinimumSize(new java.awt.Dimension(6, 24));
        txtN2.setPreferredSize(new java.awt.Dimension(6, 24));
        getContentPane().add(txtN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 140, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Matrícula:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));
        getContentPane().add(txtMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 90, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Aluno:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        txtAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlunoActionPerformed(evt);
            }
        });
        getContentPane().add(txtAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 300, 30));

        btnLancarNotas.setText("Lançar N1");
        btnLancarNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLancarNotasActionPerformed(evt);
            }
        });
        getContentPane().add(btnLancarNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, -1, 30));

        tblDisciplinas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DISCIPLINA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDisciplinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDisciplinasMouseClicked(evt);
            }
        });
        tblDisciplinas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblDisciplinasKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblDisciplinas);
        if (tblDisciplinas.getColumnModel().getColumnCount() > 0) {
            tblDisciplinas.getColumnModel().getColumn(0).setPreferredWidth(60);
            tblDisciplinas.getColumnModel().getColumn(0).setMaxWidth(668);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 460, 170));
        getContentPane().add(txtNomeDisciplina, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));
        getContentPane().add(txtIdDisciplina, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logo DP.png"))); // NOI18N
        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 490, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/View Lançar Notas final.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtN1ActionPerformed

    private void txtAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlunoActionPerformed

    private void jTableLancarNotasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableLancarNotasKeyReleased
         if (jTableLancarNotas.getSelectedRow() != -1) {

            txtAluno.setText(jTableLancarNotas.getValueAt(jTableLancarNotas.getSelectedRow(), 0).toString());
           
        }
   
    }//GEN-LAST:event_jTableLancarNotasKeyReleased

    private void jTableLancarNotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableLancarNotasMouseClicked
        if (jTableLancarNotas.getSelectedRow() != -1) {

            txtMatricula.setText(jTableLancarNotas.getValueAt(jTableLancarNotas.getSelectedRow(),0 ).toString());
            txtAluno.setText(jTableLancarNotas.getValueAt(jTableLancarNotas.getSelectedRow(),1 ).toString());
           

        }
    }//GEN-LAST:event_jTableLancarNotasMouseClicked

    private void btnLancarNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLancarNotasActionPerformed
    
        if (Double.parseDouble (txtN1.getText())<=10 ){ 
       double n1 = Double.parseDouble(txtN1.getText());
       
       
        Boletim b = new Boletim();
       BoletimDAO bDAO = new BoletimDAO();
        
       b.setIdAluno((int) jTableLancarNotas.getValueAt(jTableLancarNotas.getSelectedRow(), 0));
       b.setIdDisciplina((int) tblDisciplinas.getValueAt(tblDisciplinas.getSelectedRow(), 0) );
       b.setNota1(Double.parseDouble(txtN1.getText()));
       //b.setNota2(Double.parseDouble(txtN2.getText()));
     
        bDAO.create(b);
        }else{
             JOptionPane.showMessageDialog(null, "Valor invalido, Digite notas ate 10 pontos!"); 
        }
          
         
    }//GEN-LAST:event_btnLancarNotasActionPerformed

    private void tblDisciplinasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDisciplinasKeyReleased
         if (tblDisciplinas.getSelectedRow() != -1) {

            txtIdDisciplina.setText(tblDisciplinas.getValueAt(jTableLancarNotas.getSelectedRow(), 0).toString());
           
        }
    }//GEN-LAST:event_tblDisciplinasKeyReleased

    private void tblDisciplinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDisciplinasMouseClicked
       if (tblDisciplinas.getSelectedRow() != -1) {

            txtIdDisciplina.setText(tblDisciplinas.getValueAt(tblDisciplinas.getSelectedRow(),0 ).toString());
            txtNomeDisciplina.setText(tblDisciplinas.getValueAt(tblDisciplinas.getSelectedRow(),1 ).toString());
           

        }
    }//GEN-LAST:event_tblDisciplinasMouseClicked
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
            java.util.logging.Logger.getLogger(TelaLancarNotas_Freq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLancarNotas_Freq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLancarNotas_Freq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLancarNotas_Freq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLancarNotas_Freq().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JButton btnLancarNotas;
    private java.util.List<View.ColumnStats> columnStatsList;
    private javax.persistence.Query columnStatsQuery;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableLancarNotas;
    private javax.swing.JTable tblDisciplinas;
    private java.awt.TextArea textArea1;
    private javax.swing.JTextField txtAluno;
    private javax.swing.JLabel txtIdDisciplina;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtN1;
    private javax.swing.JTextField txtN2;
    private javax.swing.JLabel txtNomeDisciplina;
    // End of variables declaration//GEN-END:variables
}
