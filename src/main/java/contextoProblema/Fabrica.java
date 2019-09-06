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
public class Fabrica {

    ArrayList<String> pedido = new ArrayList<>();
    ArrayList<String> tipo = new ArrayList<>();
    ArrayList<String> talla = new ArrayList<>();
    

    public ArrayList<String> agregarPedido(String tipo, String talla, String estampado) {
        this.pedido.add(tipo + "," + talla + "," + estampado);
        return pedido;
    }

    public String pedirTipo() {
        System.out.println("Ingrese el tipo de su polera\n1.algodón\n2.polyester\n3.spandex");
        this.tipo.add("algodón");
        this.tipo.add("polyester");
        this.tipo.add("spandex");
        return tipo.get(pedirNumero() - 1);
    }

    public String pedirTalla() {
        System.out.println("Ingrese la talla de su polera\n1.S\n2.M\n3.L\n4.XL");
        this.talla.add("S");
        this.talla.add("M");
        this.talla.add("L");
        this.talla.add("XL");
        return talla.get(pedirNumero() - 1);
    }

    public String pedirEstampado() {
        System.out.println("Ingrese 0 si desea su polera con estampado o un 1 si desea su polera sin estampado");
        String estampado = "";
        if (pedirNumero() == 0) {
            estampado = "estampado";
        } else {
            estampado = "sinEstampado";
        }
        
        return estampado;
    }

    public static void mostrarPedidos(ArrayList<String> pedido) {
        for (int i = 0; i < pedido.size(); i++) {
            System.out.println((i+1)+".-  "+pedido.get(i));
        }
    }

    public void borrarPedidos(int indice) {
        this.pedido.remove(indice);
    }

    public static int pedirNumero() {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        return numero;
    }

    /**
     *
     * public int validarEntrada(int numero) { try {
     *
     * } catch (Exception e) {
     *
     * }
     *
     * return numero; }
     *
     *
     */
    public void menu() {
        boolean bandera = true;
        System.out.println("Bienvenido a la fábrica textil Raptor");
        while (bandera) {
            System.out.println("\n1.Agregar pedido\n2.Eliminar pedido\n3.Mostrar pedidos\n4.Salir");
            int opcion = pedirNumero();
            switch (opcion) {
                case 1:
                    
                    agregarPedido(pedirTipo(), pedirTalla(), pedirEstampado());
                    System.out.println("Pedido agregado");
                    break;
                case 2:
                    mostrarPedidos(pedido);
                    System.out.println("Ingrese el numero de pedido que desea eliminar");
                    borrarPedidos(pedirNumero()-1);
                    System.out.println("Pedido eliminado");
                    break;
                case 3:
                    System.out.println("----------------");
                    mostrarPedidos(pedido);
                    break;
                case 4:
                    bandera = false;
                    break;
            }

        }

    }

}
