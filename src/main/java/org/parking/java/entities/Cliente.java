package org.parking.java.entities;

import java.util.List;
import java.util.ArrayList;

public class Cliente {
    public String nombre;
    public String apellidos;
    public Long numeroIdentificacion;
    public List<Vehiculo> misVehiculos = new ArrayList<Vehiculo>();

    //definir metodo de clase
    //addCar: vincular un carrito al cliente
    public void addVehiculo(Vehiculo vehiculo){
        //añadir el carrito a la lista 
        //this: para acceder a atributos
        //y metodos al interior del objeto
        //NOTA: usenla al interior de metodos
        this .misVehiculos.add(vehiculo);
    }
    //sobrecarga del metodo 

    
    //addVehiculo
    public void addVehiculo(String placa, 
                                TipoVehiculo tv){
                                    Vehiculo v = new Vehiculo();
                                    v.placa = placa;
                                    v.tipoVehiculo = tv;
                                    this.misVehiculos.add(v);
                                }


    public Cliente(String nombre, String apellidos, Long numeroIdentificacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroIdentificacion = numeroIdentificacion;
    } 
    
}
