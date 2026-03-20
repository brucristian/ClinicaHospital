package modelos;

public class Medico extends Persona {
    private String especialidad;
    private String tarjeteProfesional;

    public Medico(String especialidad, String tarjeteProfesional) {
        this.especialidad = especialidad;
        this.tarjeteProfesional = tarjeteProfesional;
    }

    public Medico() {
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTarjeteProfesional() {
        return tarjeteProfesional;
    }

    public void setTarjeteProfesional(String tarjeteProfesional) {
        this.tarjeteProfesional = tarjeteProfesional;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "especialidad='" + especialidad + '\'' +
                ", tarjeteProfesional='" + tarjeteProfesional + '\'' +
                '}';
    }

    public void Atender(Consulta c){
    }
}
