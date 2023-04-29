/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadbusqueda;

import java.util.List;

/**
 *
 * @author Alexander Elias
 */
public class Estado {

    String nombre;
    Accion[] acciones;

    public Estado() {
    }

    public Estado(String nombre, Accion[] acciones) {
        this.nombre = nombre;
        this.acciones = acciones;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
