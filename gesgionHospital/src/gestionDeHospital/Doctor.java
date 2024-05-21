package gestionDeHospital;

public class Doctor extends Persona {
    //Atributos
    private String especialidad;
    //Relaciones
    private Persona persona;
    //Constructor

    //Metodos
    void atenderPaciente(String paciente) {
        System.out.println("Atendiendo a " + paciente);
    }

    private String nombre;

        public Doctor(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return this.nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
}
