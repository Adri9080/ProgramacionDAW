package tema7.CuentaCorriente;

class CuentaCorriente {
    String dni; //del titular
    String nombre; //del titular
    double saldo; //efectivo disponible en la cuenta
    
    //Los parámetros de entrada: nombre y dni, ocultan a los atributos de la clase
    //con el mismo identificador. Para acceder a ellos hay que utilizar this.
    CuentaCorriente(String dni, String nombre) { //constructor
        this.dni = dni; //DNI pasado como parámetro
        this.nombre = nombre; //nombre pasado como parámetro
        saldo = 0; //asignamos el saldo por defecto
    }

    boolean egress(double cant) { //sacar dinero de la cuenta corriente
        boolean operacionPosible;
        if (saldo >= cant) { //si disponemos de saldo suficiente
            saldo -= cant;
            operacionPosible = true;
        } else { //no hay saldo disponible
            System.out.println("No hay dinero suficiente");
            operacionPosible = false;
        }
        return (operacionPosible); //indica si ha sido posible realizar la operación
    }

    void ingreso(double cant) { //añadimos dinero a la cuenta corriente
        saldo += cant;
    }

    void mostrarInformation() { //muestra el estado de la cuenta corriente
        System.out.println("Nombre: " + nombre);
        System.out.println("Dni: " + dni);
        System.out.println("Saldo: " + saldo + " euros");
    }
}
