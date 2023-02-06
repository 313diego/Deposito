package Cuentas;

/**
 * Creamos la clase pública que contendrá el método main que solo llamará al método operativa_cuenta y el método
 * operativa_cuenta que contendrá todas las sentencias para crear una nueva instancia de cuenta1.
 */

public class Main {

    /**
     * @param args método main
     */
    public static void main(String[] args) {

        operativa_cuenta();

    }

    /**
     * Método operativa_cuenta que contiene la instancia de una nueva cuenta, los atributos saldo y cantidad,
     * los valores que contendrán los atributos del objeto cuenta1 (nombre de tipo String, cuenta, de tipo String,
     * saldo de tipo double y tipo de tipo float). Contendrá un tray catch para capturar excepciones en caso de que se
     * produzcan con los mensajes correspondientes.
     */

    public static void operativa_cuenta(){

        CCuenta cuenta1;
        double saldoActual;
        float cantidad;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es "+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }

    }

}
