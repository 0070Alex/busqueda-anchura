/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadbusqueda;

/**
 *
 * @author Alexander Elias
 */
public class Laberinto {
    
    public final short OBSTACULO = -1;
    public final short INICIO = -2;
    private static short OBJETIVO = -3;
    private int alto = 3;
    private int largo = 3;

    private short [][] laberinto;
    
    public Laberinto() {
        
        System.out.println("Nuevo laberinto de tamaño " + alto + " por " + largo);
        
        laberinto = new short[largo + 2][alto + 2];
        
        for (int i = 0; i< largo + 2; i++) {
            for (int j = 0; j < alto + 2; j++) {
                laberinto[i][j] = 0;              
            }          
        }
        
        for (int i = 0; i < alto + 2; i++) {
            laberinto[0][i] = laberinto[largo + 1][i] = OBSTACULO;
        }
        
        for (int i = 0; i < largo + 2; i++) {
            laberinto[i][0] = laberinto[i][alto + 1] = OBSTACULO;
        }
        
        //Colocar obstaculos
        setValor(3, 2, OBSTACULO);
        setValor(2, 3, OBSTACULO);
        setValor(1, 2, OBSTACULO);
        
        //Especificar el estado inicial
        setValor(1, 1, (short)0);
        
        //Especifiar el estado objetivo
        setValor(largo - 1, alto - 1, OBJETIVO);
        
         for (int i = 0; i< largo + 2; i++) {
            for (int j = 0; j < alto + 2; j++) {               
                System.out.println("["+i+","+j+"] = " + laberinto[i][j]);
            }
            System.out.println("");
        }
    }
    
    public short getValor(int x, int y) { 
        return laberinto[x + 1][y + 1]; 
    }
    
    public void setValor(int x, int y, short value) { 
        laberinto[x + 1][y + 1] = value; 
    }
    
    public int getLargo() { 
        return largo; 
    }
    
    public int getAlto() { 
        return alto; 
    }
    
    
}
