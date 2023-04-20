/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;

/**
 *
 * @author joseg
 */
public class CCuenta {

    /**
     * Nombre de la persona titular
     */
    private String nombre;
    
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    private final String ERRORCANTIDADNEGATIVA = "No se puede ingresar una cantidad negativa";

    /**
     * Get the value of ERRORCANTIDADNEGATIVA
     *
     * @return the value of ERRORCANTIDADNEGATIVA
     */
    public String getERRORCANTIDADNEGATIVA() {
        return ERRORCANTIDADNEGATIVA;
    }

    /**
     *
     */
    public CCuenta()
    {
    }

    /**
     *  Constructor
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * devuelve el saldo
     * @return
     */
    public double estado(){
        return this.saldo;
    }

    /**
     *  Hace un ingreso en la cuenta
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     *  Hace un retiro en la cuenta
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (saldo < cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    /**
     *  Devuelve el nombre
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *  Cambia el nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *  Devuelve la cuenta
     * @return
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Cambia la cuenta
     * @param cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve el saldo
     * @return
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Cambia el saldo
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Devuelve el tipoInteres
     * @return
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Cambia el tipoInteres
     * @param tipoInterés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}


    
   