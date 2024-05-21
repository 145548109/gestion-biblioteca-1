import gestionDeHospital.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de gestión del hospital...");

        System.out.print("Por favor, ingresa el nombre del doctor:");
        String nombreDoctor = scanner.nextLine();
        Doctor doctor = new Doctor(nombreDoctor); // Use the constructor that takes a String argument
        System.out.println("Doctor: " + doctor.getNombre()); // Use getNombre() instead of nombreDoctor()

        System.out.println("Contamos con las siguientes especialidades: CARDIOLOGIA, DERMATOLOGIA, PEDIATRA, UROLOGIA");
        System.out.print("Por favor, ingrese la especialidad del doctor:");
        String especialidadDoctor = scanner.nextLine();
//        doctor.setEspecialidad(especialidadDoctor); // Use setEspecialidad() instead of setEspecialidadMedica()
        System.out.println("Especialidad: " + especialidadDoctor);

        System.out.print("Por favor, ingresa el nombre del paciente:");
        String nombrePaciente = scanner.nextLine();
        Paciente paciente = new Paciente();
        paciente.setNombre(nombrePaciente);
        System.out.println("Paciente: " + nombrePaciente);

        CitaMedica citaMedica = new CitaMedica();
        citaMedica.setDoctor(doctor);
        citaMedica.setPaciente(paciente);
        System.out.println("Cita médica creada.");

        System.out.println("Estado de la cita: " + citaMedica.getEstado());

        System.out.println("Vuelva pronto!");
    }
}