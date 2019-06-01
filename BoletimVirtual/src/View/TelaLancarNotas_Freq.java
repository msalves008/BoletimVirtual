/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.DAO.AlunoDAO;
import Model.DAO.CursoDAO;
import Model.DAO.DiciplinaDAO;
import Model.bean.Aluno;
import Model.bean.Curso;
import Model.bean.Disciplina;
import java.util.Iterator;
import java.util.List;
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

        readJTable();
         
         preencherComboBox();
         
         
    }
 public void preencherComboBox(){
        
     DiciplinaDAO d = new DiciplinaDAO();
        
        List<Disciplina> disciplinas = d.read();
        
        Iterator<Disciplina> i = disciplinas.iterator();
        
        while(i.hasNext()){
            
            jComboBoxDisciplinas.addItem(i.next().getNome());
            
        }
    
       
    }
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("mysql?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        columnStatsQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM ColumnStats c");
        columnStatsList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : columnStatsQuery.getResultList();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLancarNotas = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabelLancarnotas = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxDisciplinas = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtN1 = new javax.swing.JTextField();
        txtN2 = new javax.swing.JTextField();
        jButtonLancarNotas = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAluno = new javax.swing.JTextField();

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableLancarNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MATRICULA", " ALUNO", "NOTA N1", "NOTA N2", "MÉDIA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
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
            jTableLancarNotas.getColumnModel().getColumn(2).setHeaderValue("NOTA N1");
            jTableLancarNotas.getColumnModel().getColumn(3).setHeaderValue("NOTA N2");
            jTableLancarNotas.getColumnModel().getColumn(4).setHeaderValue("MÉDIA");
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 216, 538, 211));

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));

        jLabelLancarnotas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelLancarnotas.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLancarnotas.setText("LANÇAR NOTAS");
        jLabelLancarnotas.setToolTipText("");
        jLabelLancarnotas.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(jLabelLancarnotas, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(191, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabelLancarnotas)
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Disciplinas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 129, 67, 19));

        jComboBoxDisciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDisciplinasActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxDisciplinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 156, 260, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("N1:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("N2:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, -1, -1));

        txtN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtN1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 140, 23));

        txtN2.setMinimumSize(new java.awt.Dimension(6, 24));
        txtN2.setPreferredSize(new java.awt.Dimension(6, 24));
        getContentPane().add(txtN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 140, -1));

        jButtonLancarNotas.setText("Lançar");
        getContentPane().add(jButtonLancarNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Matrícula:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 72, -1, -1));
        getContentPane().add(txtMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 101, 56, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Aluno:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 72, -1, -1));

        txtAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlunoActionPerformed(evt);
            }
        });
        getContentPane().add(txtAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 101, 190, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtN1ActionPerformed

    private void txtAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlunoActionPerformed

    private void jComboBoxDisciplinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDisciplinasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDisciplinasActionPerformed

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
    private java.util.List<View.ColumnStats> columnStatsList;
    private javax.persistence.Query columnStatsQuery;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButtonLancarNotas;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JComboBox jComboBoxDisciplinas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelLancarnotas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLancarNotas;
    private javax.swing.JTextField txtAluno;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtN1;
    private javax.swing.JTextField txtN2;
    // End of variables declaration//GEN-END:variables
}
