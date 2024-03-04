package org.parking.java;

import org.parking.java.entities.Cliente;
import org.parking.java.entities.Cupo;
import org.parking.java.entities.Empleado;
import org.parking.java.entities.Pago;
import org.parking.java.entities.TipoVehiculo;
import org.parking.java.entities.Vehiculo;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //sitema de gestion de E/S
        //de vehiculos en un parking
        //1. dos carritos:
        //objetos(instancias)
        //1.Tipo de clase
        //2. nombre del objeto
        //3. asignacion y new
        //4. constructor del objeto
        Vehiculo carrito1 = new Vehiculo("ASD 789", TipoVehiculo.PARTICULAR);

        Vehiculo carrito2 = new Vehiculo("FGH 123",TipoVehiculo.MOTO);

        Vehiculo motico = new Vehiculo();
        motico.setPlaca("ACF 543");
        //crear(instanciar un cliente)
      
     


        Cliente cliente1 = new Cliente("Eric" , "Gonzales Jaramillo", 1016715041L );
        
        //invocar el metodo addCar
        cliente1.addVehiculo(carrito2);
        cliente1.addVehiculo(carrito1);
        cliente1.addVehiculo("WWW999", TipoVehiculo.MOTO);
        //recorrer la lista de vehiculo 
        //del cliente 

        //Instanciar cupos:
        Cupo cupito1 = new Cupo('A');
        Cupo cupito2 = new Cupo('B');

        //Instanciar empleados:

        Empleado empleado1 = new Empleado("Carlitos", "Rodriguez Montezco", "23");
        Empleado empleado2 = new Empleado("Allison", "Patiño", "26");

        //crear fechas:
        LocalDateTime fechaHoraInicio = LocalDateTime.of(2024, Month.APRIL, 15, 17, 25, 2);
        LocalDateTime fechaHoraFin = LocalDateTime.of(2024, Month.DECEMBER, 5, 2, 4, 23);

        //hacer registros(pagos) E/S de vehiculos
        Pago pago1 = new Pago(fechaHoraInicio,fechaHoraFin, 7000.00, cliente1.getMisVehiculos().get(0), cupito1, empleado1);

        Pago pago2 = new Pago(fechaHoraInicio, fechaHoraFin, 6500.00, cliente1.getMisVehiculos().get(1), cupito2, empleado2);


        //añadir pagos a una lista de pagos
        List<Pago>misPagos = new ArrayList<Pago>();
        misPagos.add(pago1);
        misPagos.add(pago2);

        //recorrer los pagos para mostrar informacion
        for(Pago p : misPagos){
            //evidencia:
            //mostrar:
            //  -Placa del vehiculo
            //  -Valor pagado
            //  -Fecha y hora inicio
            //  -Fecha y hora fin
            //  -cupo(nombre)
            System.out.println("Pago:|Placa:"+ p.getVehiculo().getPlaca() + "|" +
            "|Valor:"+ p.getValor() + "|" +
            "|Fecha de inicio:" + p.getFechaHoraInicio().toString() +"|" +
            "|Fecha de Fin:" + p.getFechaHoraFin().toString() +"|" +
            "|Cupo:" + p.getCupo().getNombre() + "|" +
            "|Empleado:"+ p.getEmpleado().getCodigo() + "|");
            
        }
    }
}