/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.VO;

public class LiderSalariosCartagoVO {
    private String Nombre;
    private Integer Salario;

    public LiderSalariosCartagoVO(String Nombre, Integer Salario) {
        this.Nombre = Nombre;
        this.Salario = Salario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Integer getSalario() {
        return Salario;
    }

    public void setSalario(Integer salario) {
        Salario = salario;
    }
    
}
