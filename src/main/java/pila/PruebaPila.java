/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila;

/**
 *
 * @author albertogarzon
 */
public class PruebaPila {

    public static void main(String[] args) {

        //Se crea un objeto de tipo pila de un tamaño de 5
        Pila pila = new Pila(5);

        //Se agregan 5 numeros tipo char a la pila
        pila.push('3');
        pila.push('7');
        pila.push('1');
        pila.push('9');
        pila.push('4');

        //Se prueban los distintos metodos para saber si esta vacia, llena, obtener el tamaño y imprimirla
        System.out.println(pila.estaVacia());
        System.out.println("----------------");
        pila.estaLlena();
        System.out.println("----------------");
        System.out.println(pila.getElementos());
        System.out.println("----------------");
        pila.imprimirLista();
        System.out.println("----------------");

        //Elimino el ultimo numero en entrar. Es decir el ultimo numero añadido (4)
        pila.pop();
        //Se imprime de nuevo la lista con el ultimo elemento borrado
        pila.imprimirLista();

        System.out.println("----------------");

        //Procedo a usar la lista y rellenarla en un array que se pasa como parametro
        //Se crea un array de char(con los numeros)
        char[] array = {'1', '5', '8', '9', '4', '2'};

        //Se rellena la lista de la pila con los valores del array de char
        pila.rellenar(array);

        //Se imprime la lista de la pila para comprobar que se ha rellenado con los valores correctos
        pila.imprimirLista();

        System.out.println("----------------");

        //Se muestra los resultados de la nueva lista pero devueltos en un array de char
        System.out.println(pila.sacaElmentos());

    }

}
