/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadbusqueda;

import actividadbusqueda.BusquedaAnchura.Nodo;



/**
 *
 * @author Alexander Elias
 */
public class ActividadBusqueda {

    public static void main(String[] args) {
        
        
        Nodo node40 = new Nodo(40);
        Nodo node10 = new Nodo(10);
        Nodo node20 = new Nodo(20);
        Nodo node30 = new Nodo(30);
        Nodo node60 = new Nodo(60);
        Nodo node50 = new Nodo(50);
        Nodo node70 = new Nodo(70);
        
        node40.aggSiguiente(node10);
        node40.aggSiguiente(node20);        
        node10.aggSiguiente(node30);
        node20.aggSiguiente(node10);
        node20.aggSiguiente(node30);
        node20.aggSiguiente(node60);
        node20.aggSiguiente(node50);        
        node30.aggSiguiente(node60);
        node60.aggSiguiente(node70);
        node50.aggSiguiente(node70);
        node70.aggSiguiente(node20);
        
        System.out.println("La busqueda en anchura del árbol es: ");
        BusquedaAnchura busquedaAnchura = new BusquedaAnchura();
        
        busquedaAnchura.busqueda(node10);
        
        

    }
    
  
}
