/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contextoProblema;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sebastián Sanchez
 */
public class fabrica {
    
    ArrayList<String>  pedidos ;
    ArrayList<String>  tipo ;
    ArrayList<String>  talla;
    boolean estampado;
       
     
    
    public void agregarPedido(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese el tipo de su polera");
        System.out.println("1.algodón\n2.polyester\n3.spandex");
        int opcion=teclado.nextInt();
        
        
    }
    
    
    public void mostrarPedidos(ArrayList<String> pedidos){
        for(int i=0;i < pedidos.size();i++){
            System.out.println(pedidos.get(i));
        }
    }
    
    public void borrarPedidos(ArrayList<String> pedidos,int indice){
        pedidos.remove(indice);
    }
    
    public void rellenarTipo(){
       tipo.add("algodón");
       tipo.add("polyester");
       tipo.add("spandex");
    }
    
    public void rellenarTalla(){
       talla.add("S");
       talla.add("M");
       talla.add("L");
       talla.add("XL");
    }
}
