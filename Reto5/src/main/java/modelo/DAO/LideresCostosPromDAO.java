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

import modelo.VO.LideresCostoPromVO;

public class LideresCostosPromDAO {
    public ArrayList<LideresCostoPromVO> ConsultarLideresCostoProm() throws SQLException {

        ArrayList<LideresCostoPromVO> respuestaConsulta5= new ArrayList<LideresCostoPromVO>();

        Connection conexion= JDBCutilities.getConnection();

        String consulta=
        "SELECT Nombre || \" \" || Primer_Apellido || \" \" || Segundo_Apellido Nombre, SUM(mc.Precio_Unidad* c.Cantidad) / COUNT(DISTINCT p.ID_Proyecto) Promedio "+
        "FROM Lider l LEFT JOIN Proyecto p ON p.ID_Lider = l.ID_Lider LEFT JOIN Compra c ON p.ID_Proyecto = c.ID_Proyecto LEFT JOIN MaterialConstruccion mc ON c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion "+
        "WHERE p.Clasificacion = 'Condominio' "+
        "GROUP BY l.ID_Lider  "+
        "HAVING COUNT(DISTINCT p.ID_Proyecto) >= 2 "+
        "ORDER BY Promedio DESC " + "LIMIT 3";

        Statement st= conexion.createStatement();

        ResultSet rs= st.executeQuery(consulta);

        while(rs.next()){
            String Nombre= rs.getString("Nombre");
            Integer Promedio= rs.getInt("Promedio");
            respuestaConsulta5.add(new LideresCostoPromVO(Nombre,Promedio));
        }

        rs.close();
        st.close();
        conexion.close();
        return respuestaConsulta5;
}}
