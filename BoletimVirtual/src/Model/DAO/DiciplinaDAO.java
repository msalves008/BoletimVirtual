/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Connection.ConnectionFactory;
import Model.bean.Aluno;
import Model.bean.Disciplina;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Matheus
 */
    public class DiciplinaDAO {
          public List<Disciplina> read() {

            Connection con = ConnectionFactory.getConnection();

            PreparedStatement stmt = null;
            ResultSet rs = null;

            List<Disciplina> disciplinas = new ArrayList<>();

            try {
                stmt = con.prepareStatement("SELECT * FROM disciplina ORDER BY nomedisciplina ASC");
                rs = stmt.executeQuery();

                while (rs.next()) {

                    Disciplina disciplina = new Disciplina();

                   disciplina.setNome(rs.getString("nomedisciplina"));


                    disciplinas.add(disciplina); /*Adicionado os alunos que estão cadastrados no banco de dados  na tabela*/
                }

            } catch (SQLException ex) {
                Logger.getLogger(DiciplinaDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                ConnectionFactory.closeConnection(con, stmt, rs);
            }

            return disciplinas;
    }
}

