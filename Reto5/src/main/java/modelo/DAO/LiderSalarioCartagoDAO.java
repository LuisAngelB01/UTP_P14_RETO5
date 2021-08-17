/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.DAO;

import java.util.ArrayList;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

import util.JDBCutilities;

import modelo.VO.LiderSalariosCartagoVO;
/**
 *
 * @author LUIS BOCANEGRA
 */
public class LiderSalarioCartagoDAO {
    public ArrayList<LiderSalariosCartagoVO> ConsultarLideresCartago() throws SQLException {

        ArrayList<LiderSalariosCartagoVO> respuestaConsulta1= new ArrayList<LiderSalariosCartagoVO>();

        Connection conexion= JDBCutilities.getConnection();

        String consulta=
        "SELECT Nombre || \" \" || Primer_Apellido || \" \" || Segundo_Apellido Nombre, Salario "+
        "FROM Lider l "+
        "WHERE Ciudad_Residencia = 'Cartago' "+
        "ORDER BY Nombre ";

        Statement st= conexion.createStatement();

        ResultSet rs= st.executeQuery(consulta);

        while(rs.next()){
            String Nombre= rs.getString("Nombre");
            Integer Salario= rs.getInt("Salario");
            respuestaConsulta1.add(new LiderSalariosCartagoVO(Nombre,Salario));
        }

        rs.close();
        st.close();
        conexion.close();
        return respuestaConsulta1;
    }
}