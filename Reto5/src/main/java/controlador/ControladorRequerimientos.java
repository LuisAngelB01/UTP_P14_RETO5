/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.SQLException;
import java.util.ArrayList;
import modelo.DAO.*;
import modelo.VO.*;

public class ControladorRequerimientos {

    private static final MaterialProyectoDAO materialProyectoDAO = new MaterialProyectoDAO();
    private static final LiderSalarioCartagoDAO liderSalarioCartagoDAO = new LiderSalarioCartagoDAO();
    private static final LideresCostosPromDAO lideresCostosPromDAO = new LideresCostosPromDAO();

    public ControladorRequerimientos(){

    }

    public static ArrayList<MaterialProyectoVO> consultarMaterialesProtectos() throws SQLException {
        return materialProyectoDAO.MaterialProyecto();
    }

    public static ArrayList<LiderSalariosCartagoVO> ConsultarLideresCartago()throws SQLException {
        return liderSalarioCartagoDAO.ConsultarLideresCartago();
    }

    public static ArrayList<LideresCostoPromVO> ConsultarLideresCostoProm()throws SQLException {
        return lideresCostosPromDAO.ConsultarLideresCostoProm();
    }
}
