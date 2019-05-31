package Model.DAO;

/**
 *
 * @author Matheus
 */

import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Model.bean.Aluno;
import Model.bean.Usuario;
public class AlunoDAO {
 
    public void create(Aluno a) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO tbl_aluno (nome,endereco,nome_da_mae,nome_do_pai,celular,cpf, idcurso)VALUES(?,?,?,?,?,?,10)");
            //stmt.setInt(1,a.getMatricula());
            stmt.setString(1, a.getNome());
            stmt.setString(2, a.getEndereco());
            stmt.setString(3, a.getNomeDaMae());
            stmt.setString(4, a.getNomeDoPai());
            //stmt.setString(5, a.getTelefone() );
            stmt.setString(5, a.getCelular());
            stmt.setString(6, a.getCpf());
                        

            stmt.executeUpdate();
              

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
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
                aluno.setEndereco(rs.getString("endereco"));
                aluno.setNomeDaMae(rs.getString("nome_da_mae"));
                aluno.setNomeDoPai(rs.getString("nome_do_pai"));
                aluno.setCelular(rs.getString("celular"));
                aluno.setCpf(rs.getString("cpf"));
                
                alunos.add(aluno); /*Adicionado os alunos que estão cadastrados no banco de dados  na tabela*/
            }

        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return alunos;

    }
    
      public List<Aluno> readNome(String nome) { // selecionando aluno pelo nome

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Aluno> alunos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM tbl_aluno where nome like ?  ORDER BY nome ASC");
            stmt.setString(1, '%'+nome+'%');
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Aluno aluno = new Aluno();

                aluno.setMatricula(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
                aluno.setEndereco(rs.getString("endereco"));
                aluno.setNomeDaMae(rs.getString("nome_da_mae"));
                aluno.setNomeDoPai(rs.getString("nome_do_pai"));
                aluno.setCelular(rs.getString("celular"));
                aluno.setCpf(rs.getString("cpf"));
                
                alunos.add(aluno); /*Adicionado os alunos que estão cadastrados no banco de dados  na tabela*/
            }
JOptionPane.showMessageDialog(null, "Busca realizada com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Falha ao Buscar!");
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return alunos;

    }
          public void delete(Aluno a) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM tbl_aluno WHERE id = ?");
            stmt.setInt(1, a.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
           
          public void  Atualizar(Aluno a) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        List<Aluno> alunos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("UPDATE tbl_aluno SET nome = ? ,endereco = ?,nome_da_mae = ?, nome_do_pai =?, celular = ?, cpf =? WHERE id = ?");
            

                // Aluno aluno = new Aluno();
   
               // aluno.setMatricula(rs.getInt("id"));
               /* aluno.setNome(rs.getString("nome"));
                aluno.setEndereco(rs.getString("endereco"));
                aluno.setNomeDaMae(rs.getString("nome_da_mae"));
                aluno.setNomeDoPai(rs.getString("nome_do_pai"));
                aluno.setCelular(rs.getString("celular"));
                aluno.setCpf(rs.getString("cpf"));*/
            stmt.setInt(7, a.getId()); 
            stmt.setString(1, a.getNome());
            stmt.setString(2, a.getEndereco());
            stmt.setString(3, a.getNomeDaMae());
            stmt.setString(4, a.getNomeDoPai());
            //stmt.setString(5, a.getTelefone() );
            stmt.setString(5, a.getCelular());
            stmt.setString(6, a.getCpf());
                        
            //System.out.println("passei aqui");
        stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

          }

    
    //Fazendo leitua da tabela do banco de dados
      public List<Aluno> readPesquisarAluno() {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Aluno> alunos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT id,nome FROM tbl_aluno ORDER BY nome ASC");
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
    
}
