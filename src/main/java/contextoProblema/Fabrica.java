/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contextoProblema;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase fabrica donde se crean pedidos de poleras con sus caracteristicas
 *
 * @author Sebastián Sanchez
 */
public class Fabrica {

    ArrayList<String> pedido = new ArrayList<>();
    ArrayList<String> tipo = new ArrayList<>();
    ArrayList<String> talla = new ArrayList<>();

    /**
     * Método que guarda el pedido en el ArrayList pedido
     *
     * @param tipo Un string con el tipo de material de la polera
     * @param talla Un string con la talla de la polera
     * @param estampado Un string estampado o sinEstampado de la polera
     * @return ArrayList con el pedido guardado
     */
    public ArrayList<String> agregarPedido(String tipo, String talla, String estampado) {
        this.pedido.add(tipo + "," + talla + "," + estampado);
        return pedido;
    }

    /**
     * Método que pide seleccionar el tipo de material de la polera
     *
     * @return el tipo de material elegido por el usuario
     */
    public String pedirTipo() {
        System.out.println("Ingrese el tipo de su polera\n1.algodón\n2.polyester\n3.spandex");
        this.tipo.add("algodón");
        this.tipo.add("polyester");
        this.tipo.add("spandex");
        return tipo.get(leerTeclado() - 1);
    }

    /**
     * Método que pide seleccionar la talla de la polera
     *
     * @return la talla elegida por el usario
     */
    public String pedirTalla() {
        System.out.println("Ingrese la talla de su polera\n1.S\n2.M\n3.L\n4.XL");
        this.talla.add("S");
        this.talla.add("M");
        this.talla.add("L");
        this.talla.add("XL");
        return talla.get(leerTeclado() - 1);
    }

    /**
     * Método que pide la opcion para guardar su pedido de polera con o sin
     * estampado
     *
     * @return la opcion elegida por el usuario como cadena de texto
     */
    public String pedirEstampado() {
        System.out.println("Ingrese 0 si desea su polera con estampado o un 1 si desea su polera sin estampado");
        String estampado = "";
        if (leerTeclado() == 0) {
            estampado = "estampado";
        } else if (leerTeclado() == 1) {
            estampado = "sinEstampado";
        }
        return estampado;
    }

    /**
     * Método que muestra el contenido del ArrayList
     *
     * @param pedido el ArrayList que se desea mostrar
     */
    public static void mostrarPedidos(ArrayList<String> pedido) {
        for (int i = 0; i < pedido.size(); i++) {
            System.out.println((i + 1) + ".-  " + pedido.get(i));
        }
    }

    /**
     * Método para borrar un pedido
     *
     * @param indice la posicion donde se encuentra el pediodo a borrar
     */
    public void borrarPedidos(int indice) {
        this.pedido.remove(indice);
    }

    /**
     * Método que lee la entrada por teclado del usuario
     *
     * @return numero ingresado
     */
    public int leerTeclado() {
        Scanner teclado = new Scanner(System.in);
        int numero;
        try {
            numero = teclado.nextInt();
            if (numero < 0) {
                leerTeclado();
            }
        } catch (InputMismatchException e) {
            System.out.println("Dato ingresado incorrecto, intentar nuevamente");
            numero = leerTeclado();
        }
        return numero;
    }

    /**
     * Método que despliega el menu de la fabrica de poleras
     */
    public void menu() {
        boolean bandera = true;
        System.out.println("Bienvenido a la fábrica textil Raptor");
        while (bandera) {
            System.out.println("\n1.Agregar pedido\n2.Eliminar pedido\n3.Mostrar pedidos\n4.Salir");
            int opcion = leerTeclado();
            switch (opcion) {
                case 1:
                    agregarPedido(pedirTipo(), pedirTalla(), pedirEstampado());
                    System.out.println("Pedido agregado");
                    break;
                case 2:
                    mostrarPedidos(pedido);
                    System.out.println("Ingrese el numero de pedido que desea eliminar");
                    borrarPedidos(leerTeclado() - 1);
                    System.out.println("Pedido eliminado");
                    break;
                case 3:
                    System.out.println("----------------------");
                    mostrarPedidos(pedido);
                    break;
                case 4:
                    bandera = false;
                    break;
            }

        }

    }

}
