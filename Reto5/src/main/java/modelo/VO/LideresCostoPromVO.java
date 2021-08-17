/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.VO;

/**
 *
 * @author LUIS BOCANEGRA
 */
public class LideresCostoPromVO {
    private String Nombre;
    private Integer Promedio;

    public LideresCostoPromVO(String Nombre, Integer Promedio) {
        this.Nombre = Nombre;
        this.Promedio = Promedio;
    }
        public String getNombre() {
            return Nombre;
        }
    
        public void setNombre(String nombre) {
            Nombre = nombre;
        }
    
        public Integer getPromedio() {
            return Promedio;
        }
    
        public void setPromedio(Integer promedio) {
            Promedio = promedio;
        }
}
