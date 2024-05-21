package gestionDeHospital;

import javax.print.Doc;

public class Enfermero extends Persona{
    //Atributos

    //Relaciones
    private Doctor doctor;
    //Constructor

    //Metodos

    public void asistir(String doctor) {
        System.out.println("Asistiendo a " + doctor);
    }
}
