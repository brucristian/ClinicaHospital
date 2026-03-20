package modelos;

import java.util.Date;

public class Consulta {
    private Date fecha;
    private String motivo;
    private String diagnostico;

    public Consulta(Date fecha, String motivo, String diagnostico) {
        this.fecha = fecha;
        this.motivo = motivo;
        this.diagnostico = diagnostico;
    }

    public Consulta() {
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Consulta getConsulta(Consulta i){
        return i;
    }

    public Consulta registrarConsulta(Consulta c){

        return c;
    }
}
