/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Connection.ConnectionFactory;
import Model.bean.Usuario;
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
public class UsuarioDAO {
     
    public boolean checkLogin(String nomeUsuario, String senha) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean check = false;

        try {

            stmt = con.prepareStatement("SELECT * FROM usuario WHERE nomeUsuario = ? and senha = ?");
            stmt.setString(1, nomeUsuario);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();

            if (rs.next()) {

                
                check = true;
            }
            
            if(check){
                List<Usuario> usuarios = readNome(nomeUsuario);
               // System.out.println(usuarios.get(0).getIdAluno());
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return check;

    }
    
    public List<Usuario> readNome(String nomeUsuario){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Usuario> usuarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM usuario where nomeUsuario like ?  ORDER BY nomeUsuario ASC");
            stmt.setString(1, '%'+nomeUsuario+'%');
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Usuario usuario = new Usuario();

                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nomeUsuario"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setIdAluno(rs.getInt("idaluno"));
                
                
               usuarios.add(usuario);
                
            }
//JOptionPane.showMessageDialog(null, "Busca realizada com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Falha ao Buscar ......!");
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return usuarios;

    }
    
    public void create(Usuario u){
        
         Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO usuario (nomeUsuario,senha)VALUES(?,?)");
            //stmt.setInt(1,a.getMatricula());
            
            stmt.setString (1, u.getLogin());
            stmt.setString(2, u.getSenha());

            stmt.executeUpdate();
              

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
