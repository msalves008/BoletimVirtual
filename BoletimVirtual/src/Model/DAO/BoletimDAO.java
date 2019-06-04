/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Connection.ConnectionFactory;
import Model.bean.Aluno;
import Model.bean.Boletim;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public class BoletimDAO {
       //Fazendo leitua da tabela do banco de dados
      
    public List<Aluno> read() {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Aluno> alunos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM tbl_aluno ORDER BY nome ASC");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Aluno aluno = new Aluno();

                aluno.setMatricula(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
                
                
                alunos.add(aluno); /*Adicionado os alunos que estão cadastrados no banco de dados  na tabela*/
            }

        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return alunos;

    }
        
      public void create(Boletim b) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO boletim (id_aluno, id_disciplina, nota1)VALUES(?,?,?)");
            //stmt.setInt(1,a.getMatricula());
            stmt.setInt(1, b.getIdAluno());
            stmt.setInt(2, b.getIdDisciplina());
            stmt.setDouble(3, b.getNota1());
           // stmt.setDouble(4, b.getNota2());
            //stmt.setDouble(5, b.getMedia());
                                   

            stmt.executeUpdate();
              

            JOptionPane.showMessageDialog(null, "Notas lançadas com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }





}
