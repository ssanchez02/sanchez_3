/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import contextoProblema.Fabrica;

/**
 *
 * @author Sebastián Sanchez
 */
public class Main {
    
    public static void main(String[]args){
        Fabrica pedido= new Fabrica();
        pedido.menu();
    }
}
