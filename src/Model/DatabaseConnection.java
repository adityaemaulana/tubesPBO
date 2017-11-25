/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class DatabaseConnection {
    
    private Connection conn;
    private Statement sta;

    public void connect()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/db_tubes", "root", "");
            sta = conn.createStatement();
        } catch (Exception ex)
        {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void disconnect()
    {
        try
        {
            conn.close();
            sta.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean manipulate(String query)
    {
        boolean berhasil = false;
        try
        {
            int rows = sta.executeUpdate(query);
            if (rows > 0)
            {
                berhasil = true;
            }

        } catch (Exception ex)
        {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return berhasil;

    }
}
