
package View;

import Model.DAO.AlunoDAO;
import Model.DAO.BoletimDAO;
import Model.bean.Aluno;
import Model.bean.Usuario;
import java.util.List;
import Model.bean.Boletim;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author MATHEUS1
 */
public class TelaAluno extends javax.swing.JFrame {
 BoletimDAO dao = new BoletimDAO();
 private Usuario usuario = new Usuario();
 
    public TelaAluno() {
        initComponents();
        setTitle("Resultados"); /* Definindo Titlo para o JFrame*/
         setLocationRelativeTo( null );
         
          DefaultTableModel modelo = (DefaultTableModel) jTableResultado.getModel();
          jTableResultado.setRowSorter(new TableRowSorter(modelo));
        
          
        //carregarBoletim();
    }
    
    
   
    
    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
        System.out.println("id: "+usuario.getIdAluno());
        txtMatricula.setText(usuario.getIdAluno()+"");
        txtMatricula.disable();
        ///carregarBoletim();
    }
    /*
    BoletimDAO dao = new BoletimDAO();
    
    public void carregarBoletim(){
        //List<Boletim> boletins = dao.read(usuario.getIdAluno());
        
        DefaultTableModel modelo = (DefaultTableModel) jTableResultado.getModel();
          modelo.setNumRows(0);
        //BoletimDAO bDAO = new BoletimDAO();
       //System.out.println("gerando boletim aluno: "+usuario.getIdAluno());
         // System.out.println(usuario.getIdAluno());
          
        for(Boletim b: dao.read(usuario.getIdAluno())){
            
           modelo.addRow(new Object[]{
               b.getIdDisciplina(),
               b.getNota1(),
               b.getNota2(),
               b.getMedia(),
               b.getMedia()
                   
           });
        }
    }*/

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableResultado = new javax.swing.JTable();
        txtMatricula = new javax.swing.JTextField();
        jLabelMatricula = new javax.swing.JLabel();
        btnGerarBoletim = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/view aluno.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DISCIPLINAS", "NOTA N1", "NOTA N2", "MÉDIA", "RESULTADO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableResultado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 690, 140));
        getContentPane().add(txtMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 90, 30));

        jLabelMatricula.setText("MATRICULA");
        getContentPane().add(jLabelMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        btnGerarBoletim.setText("GERAR BOLETIM ");
        btnGerarBoletim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarBoletimActionPerformed(evt);
            }
        });
        getContentPane().add(btnGerarBoletim, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/view aluno.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGerarBoletimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarBoletimActionPerformed
       
       
        Boletim b1 = new Boletim(); 
        
         Aluno a = new Aluno();
          int id = Integer.parseInt(txtMatricula.getText());
           b1.setIdAluno(id); 
        
          DefaultTableModel modelo = (DefaultTableModel) jTableResultado.getModel();
          modelo.setNumRows(0);
                
          
          System.out.println(id);
          
        for(Boletim b: dao.readById(id)){
            
           modelo.addRow(new Object[]{
               b.getIdDisciplina(),
               b.getNota1(),
               b.getNota2(),
               b.getMedia(),
               b.getMedia()
                   
           });
       // carregarBoletim();
            System.out.println("I´m here");
        }
    }//GEN-LAST:event_btnGerarBoletimActionPerformed
        public void PegandoMatricula(){
            
        }
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
            java.util.logging.Logger.getLogger(TelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAluno().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerarBoletim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelMatricula;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableResultado;
    private javax.swing.JTextField txtMatricula;
    // End of variables declaration//GEN-END:variables
}
