/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cancioncomparable;

import java.time.LocalDate;

/**
 *
 * @author albertogarzon
 */
public class PruebaCancion {

    public static void main(String[] args) {

        ListaReproduccion listaMetalera = new ListaReproduccion();

        //Se añaden las canciones con el metodo grabarCancion()
        //Se hace uso de LocalDate.parse() para crear una fecha 
        listaMetalera.grabarCancion(new Cancion("Different Sense", "Dir En Grey", "Dum Spiro Spero", 4.56, LocalDate.parse("2011-04-15")));
        listaMetalera.grabarCancion(new Cancion("Ocean Rise", "Caligula's Horse", "Rise Radiant", 3.45, LocalDate.parse("2020-06-23")));
        listaMetalera.grabarCancion(new Cancion("Hold On", "Gojira", "Fortitude", 4.32, LocalDate.parse("2021-02-07")));
        listaMetalera.grabarCancion(new Cancion("Ruin", "Lamb of God", "As the Palaces Burn", 3.45, LocalDate.parse("2019-08-12")));

        //Canciones repetidas usadas para comparar por criterio concatenado en busqueda binario con Comparator
        listaMetalera.grabarCancion(new Cancion("5Du Hast", "Rammstein", "Sehnsucht", 3.20, LocalDate.parse("2007-05-09")));
        listaMetalera.grabarCancion(new Cancion("7Du Hast", "Rammstein", "Sehnsucht", 3.20, LocalDate.parse("2007-05-09")));
        listaMetalera.grabarCancion(new Cancion("9Du Hast", "Rammstein", "Sehnsucht", 3.20, LocalDate.parse("2007-05-09")));
        listaMetalera.grabarCancion(new Cancion("1Du Hast", "Rammstein", "Sehnsucht", 3.20, LocalDate.parse("2007-05-09")));

        System.out.println("Imprimiendo lista de canciones");
        ListaReproduccion.imprimirLista(listaMetalera);
        System.out.println("--------------------------");

        //Ordenamos la lista por nombre
        System.out.println("Se ordena por titulo con Comparable");
        listaMetalera.ordenarPorTitulo();

        ListaReproduccion.imprimirLista(listaMetalera);

        System.out.println("--------------------------");

        //Buscamos por tirulo almacenando la posicion en un entero
        int posicion = listaMetalera.buscarPorTitulo(new Cancion("Hold On", "Gojira", "Fortitude", 4.32, LocalDate.parse("2021-02-07")));

        System.out.println("La posicion de la cancion por titulo es de: " + posicion);

        System.out.println("--------------------------");

        //Se ordena por artista y se imprime por consola
        System.out.println("Se ordena por artista usando Comparator");
        listaMetalera.ordenarComparatorArtista();

        ListaReproduccion.imprimirLista(listaMetalera);

        System.out.println("--------------------------");

        System.out.println("Se ordena por titulo usando Comparator");
        listaMetalera.ordenarComparatorTitulo();

        ListaReproduccion.imprimirLista(listaMetalera);

        System.out.println("--------------------------");

        System.out.println("Se ordena por criterios concatenados usando Comparator (Titulo y Artista)");

        listaMetalera.ordenarTituloCantante();

        ListaReproduccion.imprimirLista(listaMetalera);

        System.out.println("--------------------------");

        //Ten en cuenta que para hacer la busqueda y que funcione antes tienes que ordenar.
        //Si ordenas despues por otro criterio no funcionara la busqueda
        listaMetalera.ordenarComparatorArtista();

        System.out.println("Se hace busqueda binaria por Artista usando Comparator");
        int posicion2 = listaMetalera.buscarBinariaArtista(new Cancion("Hold On", "Gojira", "Fortitude", 4.32, LocalDate.parse("2021-02-07")));
        System.out.println("La posicion por artista es: " + posicion2);

        System.out.println("--------------------------");

        listaMetalera.ordenarComparatorTitulo();
        System.out.println("Se hace busqueda binaria por titulo usando Comparator");
        int posicion3 = listaMetalera.buscarBinariaTitulo(new Cancion("9Du Hast", "Rammstein", "Sehnsucht", 3.20, LocalDate.parse("2007-05-09")));
        System.out.println("La posicion por titulo es: " + posicion3);

        System.out.println("--------------------------");

        System.out.println("Numero de canciones");
        System.out.println(listaMetalera.numeroCanciones());
        System.out.println("--------------------------");

        System.out.println("¿Esta vacia la lista?");
        System.out.println(listaMetalera.estaVacia());
        System.out.println("--------------------------");

        System.out.println("Escuchando la cancion");
        System.out.println(listaMetalera.escucharCancion(2));
        System.out.println("--------------------------");

        System.out.println("Cambiando la cancion");
        listaMetalera.cambiarCancion(3, new Cancion("Battlefield", "Blind Guardian", "A Night at the Opera", 6.10, LocalDate.parse("2010-03-24")));
        System.out.println("--------------------------");

        System.out.println("Grabando una cancion");
        listaMetalera.grabarCancion(new Cancion("Duality", "Slipknot", "Vol. 3:(The Subliminal Verses))", 3.20, LocalDate.parse("2007-06-14")));
        System.out.println("--------------------------");

        System.out.println("Se imprime la lista de nuevo con la nueva cancion y la cancion cambiada");
        ListaReproduccion.imprimirLista(listaMetalera);
        System.out.println("--------------------------");

        System.out.println("Eliminando cancion por posicion");
        listaMetalera.eliminaCancion(0);
        System.out.println("--------------------------");
        System.out.println("Eliminando cancion que se encuentra en la lista");
        listaMetalera.eliminaCancion(new Cancion("Ocean Rise", "Caligula's Horse", "Rise Radiant", 3.45, LocalDate.parse("2020-06-23")));
        System.out.println("--------------------------");
        System.out.println("Usando el metodo remove");
        listaMetalera.remove(new Cancion("Hold On", "Gojira", "Fortitude", 4.32, LocalDate.parse("2021-02-07")));
        System.out.println("--------------------------");

        System.out.println("Se vuelve a imprimir la lista, para saber las canciones eliminadas");
        ListaReproduccion.imprimirLista(listaMetalera);
        System.out.println("--------------------------");

        System.out.println("Buscando una cancion");
        System.out.println(listaMetalera.buscarCancion(new Cancion("Ruin", "Lamb of God", "As the Palaces Burn", 3.45, LocalDate.parse("2019-08-12"))));

    }

}
