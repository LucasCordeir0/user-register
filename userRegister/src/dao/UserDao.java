package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import db.DB;
import entities.User;

public class UserDao {

    public void insert(User user) {

        String sql = "INSERT INTO users (id, name, cpf) VALUES (?, ?, ?)";

        try (Connection conn = DB.getConnection();
             PreparedStatement st = conn.prepareStatement(sql)) {

            st.setInt(1, user.getId());
            st.setString(2, user.getName());
            st.setString(3, user.getCpf());

            st.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir usuário!", e);
        }
    }
}