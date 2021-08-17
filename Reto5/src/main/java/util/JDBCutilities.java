/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCutilities {
    private final static String UBICACION_BD = "C:/Users/LUIS BOCANEGRA/OneDrive/Escritorio/Proyecto.db";
    
    public static Connection getConnection() throws SQLException{
        String url = "jdbc:sqlite:" + UBICACION_BD;
        return DriverManager.getConnection(url);
    }
}