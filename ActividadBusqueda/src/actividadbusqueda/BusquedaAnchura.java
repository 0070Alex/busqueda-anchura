/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadbusqueda;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author Alexander Elias
 */
public class BusquedaAnchura {

    private Queue<Nodo> cola;
    static ArrayList<Nodo> nodo = new ArrayList<Nodo>();

    static class Nodo {

        int dato;
        boolean visitado;

        List<Nodo> siguiente;

        Nodo(int dato) {
            this.dato = dato;
            this.siguiente = new ArrayList<>();
        }

        public void aggSiguiente(Nodo nodoSiguiente) {
            this.siguiente.add(nodoSiguiente);
        }

        public List<Nodo> getSiguiente() {
            return siguiente;
        }

        public void setsiguiente(List<Nodo> siguiente) {
            this.siguiente = siguiente;
        }

    }

    public BusquedaAnchura() {
        cola = new LinkedList<Nodo>();
    }
    
    public void busqueda(Nodo nodo){
        cola.add(nodo);
        nodo.visitado = true;
        
        while (!cola.isEmpty()) {
           
            Nodo elemento = cola.remove();
            System.out.println("cola: " + elemento.dato);
            
            List<Nodo> siguiente = elemento.getSiguiente();
            
            for (int i = 0; i < siguiente.size(); i++) {
                Nodo nod = siguiente.get(i);
                if (nod != null && !nod.visitado) {
                    cola.add(nod);
                    nod.visitado = true;
                }
            }
            
        }
    }
}
