/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.ArrayList;

/**
 *
 * @author Sebastián Sanchez
 */
public class Datos {

    public ArrayList<String> pedidos;
    public ArrayList<String> tipo;
    public ArrayList<String> talla;
    public ArrayList<String> estampado;
    

    public Datos() {
        this.pedidos = new ArrayList<String>();
        this.tipo = new ArrayList<String>();
        this.estampado = new ArrayList<String>();
        llenado();
    }

    private void llenado() {

        pedidos.add("algodón,S,estampado");//deberia pasar
        pedidos.add("spandex,L,sinEstampado");//deberia pasar
        pedidos.add("spandex,F,sin estampado");//deberia fallar

        this.tipo.add("algodón");//
        this.tipo.add("polyester");//
        this.tipo.add("spandex");//
        
        this.talla.add("S");
        this.talla.add("M");
        this.talla.add("L");
        this.talla.add("XL");
        
        this.estampado.add("estampado");
        this.estampado.add("sinEstampado");
    
    }
}
