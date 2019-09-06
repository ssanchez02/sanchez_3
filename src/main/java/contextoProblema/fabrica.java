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

    ArrayList<String> pedidos;
    ArrayList<String> tipo;
    ArrayList<String> talla;
    boolean estampado;
    Scanner teclado;

    public void agregarPedido() {


    }

    public String pedirTipo() {
        System.out.println("Ingrese el tipo de su polera");
        mostrarPedidos(tipo);
        return this.tipo.get(pedirNumero() - 1);
    }

    public String pedirTalla() {
        System.out.println("Ingrese la talla de su polera");
        System.out.println("1.S\n2.M\n3.L\n4.XL");
        return this.talla.get(pedirNumero() - 1);
    }

    public void mostrarPedidos(ArrayList<String> pedidos) {
        for (int i = 0; i < pedidos.size(); i++) {
            System.out.println(i + "." + pedidos.get(i));
        }
    }

    public void borrarPedidos(int indice) {
        this.pedidos.remove(indice);
    }

    public void rellenarTipo() {
        tipo.add("algodón");
        tipo.add("polyester");
        tipo.add("spandex");
    }

    public void rellenarTalla() {
        talla.add("S");
        talla.add("M");
        talla.add("L");
        talla.add("XL");

    }

    public int pedirNumero() {
        int numero = teclado.nextInt();
        return numero;
    }

    public int validarEntrada(int numero) {
        try {

        } catch (Exception e) {

        }

        return numero;
    }

    public void menu() {
        boolean bandera = true;
        while (bandera) {
            System.out.println("1.Agregar pedido\n2.Eliminar pedido\n3.Mostrar pedidos\n4.Salir");
            int opcion = pedirNumero();
            switch (opcion) {
                case 1:
                    agregarPedido();
                    break;
                case 2:
                    mostrarPedidos(pedidos);
                    System.out.println("Ingrese el numero de pedido que desea eliminar");
                    borrarPedidos(pedirNumero() - 1);
                    break;
                case 3:
                    mostrarPedidos(pedidos);
                    break;
                case 4:
                    bandera = false;
                    break;
            }

        }

    }

}
