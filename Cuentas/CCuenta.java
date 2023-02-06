package Cuentas;

/**
 * La clase CCuenta nos va a crear un objeto que constara de varios atributos, como nombre del propietario, el número de
 * cuenta del mismo, el saldo del que dispone la cuenta y el tipo de interés de la misma.
 */
public class CCuenta {

    /**
     * Los atributos de se van a declarar a continuación. Serán de tipo privado, y solo se podrá acceder a ellos a
     * través de los getter and setter creados para tal fin. El atributo nombre contiene el nombre del cliente. El
     * atributo cuenta contendrá el número de cuenta del cliente. El atributo saldo contiene el saldo disponible en la
     * cuenta del cliente y el atributo tipoInterés contiene el tipo de interés que tiene la cuenta.
     */

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Creamos el constructor de CCuenta vacío.
     */

    public CCuenta()
    {
    }

    /**
     * @param nom de tipo String que almacena el nombre del cliente.
     * @param cue de tipo String que almacena el número de cuenta del cliente.
     * @param sal de tipo double que almacena el saldo de la cuenta.
     * @param tipo de tipo double que almacena el tipo de interes de la cuenta.
     *
     * Creamos el constructor de CCuenta con los atributos que va a contener.
     */

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * @return un double con el saldo que contiene la cuenta.
     */

    public double estado()
    {
        return saldo;
    }

    /**
     * @param cantidad se recibe como parámetro un dato de tipo float que introduce el usuario
     * @throws Exception Generara excepciones en caso de errores
     *
     * El método ingresar recibirá por parámetro la cantidad a ingresar. Si dicha cantidad es superior a 0 retornara el
     * saldo nuevo que sera el saldo anterior mas la cantidad ingresada. Si la cantidad a ingresar es negativa nos
     * genera una excepción con un mensaje indicando que no se pueden ingresar cantidades negativas.
     */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * @param cantidad recibido como parámetro de tipo float que introduce el usuario
     * @throws Exception que serán generadas en caso de error
     *
     * Este método recibirá por parámetros la cantidad a ingresar. Si dicha cantidad es menor o igual que 0 o superior
     * al valor que almacena saldo nos generara una excepción con un mensaje que indica que no se pueden retirar
     * cantidades negativas y que no tiene suficiente saldo respectivamente. En caso de que la cantidad a retirar sea
     * mayor a 0 e inferior al valor de saldo nos retornará el nuevo salto que será la resta del valor que contiene
     * saldo menos la cantidad a ingresar
     */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    /**
     * @return un string con nombre del cliente o propietario de la cuenta
     */

    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre instancia un String con el nombre del cliente en el atributo nombre.
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return un String con el número de cuenta del cliente.
     */

    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta instancia un String con el número de cuenta del cliente
     */

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return un double con el saldo del cliente
     */

    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo instancia un double con el saldo que contiene la cuenta del cliente
     */

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return un double con el tipo de interés que tine la cuenta.
     */

    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * @param tipoInteres instancia un double con el tipo de interés que va a tener la cuenta.
     */

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
