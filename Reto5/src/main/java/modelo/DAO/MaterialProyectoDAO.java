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

import modelo.VO.MaterialProyectoVO;
public class MaterialProyectoDAO {
    public ArrayList<MaterialProyectoVO> MaterialProyecto() throws SQLException {

        ArrayList<MaterialProyectoVO> respuestaConsulta4= new ArrayList<MaterialProyectoVO>();

        Connection conexion= JDBCutilities.getConnection();

        String consulta=
        "SELECT mc.Nombre_Material , mc.Precio_Unidad , SUM(c.Cantidad) Total "+
        "FROM Proyecto p LEFT JOIN Compra c ON p.ID_Proyecto  = c.ID_Proyecto LEFT JOIN MaterialConstruccion mc ON c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion "+
        "WHERE p.ID_Proyecto in (199, 7, 378, 120, 216) "+
        "GROUP BY mc.Nombre_Material "+
        "ORDER BY mc.Nombre_Material ";

        Statement st= conexion.createStatement();

        ResultSet rs= st.executeQuery(consulta);

        while(rs.next()){
            String Nombre_Material= rs.getString("Nombre_Material");
            Integer Precio_Unidad= rs.getInt("Precio_Unidad");
            Integer Total= rs.getInt("Total");
            respuestaConsulta4.add(new MaterialProyectoVO(Nombre_Material,Precio_Unidad,Total));
        }

        rs.close();
        st.close();
        conexion.close();
        return respuestaConsulta4;
    }
}
