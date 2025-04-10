package tema7.Ejercicio721_22_AdrianGomez;

import java.util.Arrays;

/* Implementamos las listas con tablas de tipo Integer, que iremos
* redimensionando según vaya haciendo falta. El índice de un elemento en la
* lista coincide con el índice del lugar que ocupa en la tabla. */
public class Lista {
    Integer[] tabla;

    public Lista() {
        tabla = new Integer[0];
    }

    void insertarPrincipio(Integer nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
        tabla[0] = nuevo;
    }

    void insertarFinal(Integer nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = nuevo;
    }

    void insertarFinal(Lista otraLista) {
        int tamIni = tabla.length; // tamaño inicial tabla
        tabla = Arrays.copyOf(tabla, tabla.length + otraLista.tabla.length);
        System.arraycopy(otraLista.tabla, 0, tabla, tamIni, otraLista.tabla.length);
    }

    // El primer parámetro es el índice del lugar donde queremos insertar
    // el valor del segundo parámetro
    void insertar(int posicion, Integer nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, posicion, tabla, posicion + 1,
        tabla.length - posicion - 1);
        tabla[posicion] = nuevo;
    }

    // Se elimina el elemento correspondiente a índice y se devuelve
    Integer eliminar(int índice) {
        Integer eliminado = null;
        if (índice >= 0 && índice < tabla.length) {
            eliminado = tabla[índice];
            for (int i = índice + 1; i < tabla.length; i++) {
                tabla[i - 1] = tabla[i];
            }
            tabla = Arrays.copyOf(tabla, tabla.length - 1);
        }
        return eliminado;
    }

    /* Al siguiente método le pasaremos un índice y nos devolverá el elemento correspondiente de la tabla sin modificarla. En el caso de que el índice no sea válido, devolverá null, con lo cual evitamos que el programa aborte. */
    Integer get(int índice) {
        Integer resultado = null;
        if (índice >= 0 && índice < tabla.length) { // índice válido
            resultado = tabla[índice];
        }
        return resultado;
    }

    int buscar(Integer claveBusqueda) {
        int índice = -1;
        for (int i = 0; i < tabla.length && índice == -1; i++) {
            if (tabla[i].equals(claveBusqueda)) { // no vale tabla[i]==claveBusqueda
                índice = i;
            }
        }
        return índice;
    }

    // El número de elementos de la lista es el número de elementos de la tabla
    public int numeroElementos() {
        return tabla.length;
    }

    // Muestra por consola el contenido de la lista
    public void mostrar() {
        System.out.println("Lista: " + Arrays.toString(tabla));
    }
}