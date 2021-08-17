/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.VO;

public class MaterialProyectoVO {

    private String Nombre_material;
    private Integer Precio_Unidad;
    private Integer Total;

    public MaterialProyectoVO(){

    }
    public MaterialProyectoVO(String nombre_material,Integer precio_Unidad,Integer total){
        Nombre_material=nombre_material;
        Precio_Unidad = precio_Unidad;
        Total = total;
    }
    public String getNombre_material() {
        return Nombre_material;
    }
    public void setNombre_material(String nombre_material) {
        Nombre_material = nombre_material;
    }
    public Integer getPrecio_Unidad() {
        return Precio_Unidad;
    }
    public void setPrecio_Unidad(Integer precio_Unidad) {
        Precio_Unidad = precio_Unidad;
    }
    public Integer getTotal() {
        return Total;
    }
    public void setTotal(Integer total) {
        Total = total;
    }

    
}

