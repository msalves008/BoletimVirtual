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
public class AlunoDAO {
 
    public void create(Aluno a) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO cadastro_alunos (nome,endereco,nome_da_mae,nome_do_pai,celular,cpf)VALUES(?,?,?,?,?,?)");
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
    
    
    
    
}
