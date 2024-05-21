package gestionDeHospital;

public class CitaMedica {
    //Atributos
    private String fecha;
    private String hora;
    private String motivo;
    private String estado;
    private int contador;
    //Relaciones
    GestionCitas gestionCitas;
    Doctor doctor;
    Paciente paciente;

    //Constructor

    //Metodos
    public void setDoctor(Doctor doctor) {
    }

    public void setPaciente(Paciente paciente) {
    }

    public String getEstado() {
        return "Pendiente";
    }
}
