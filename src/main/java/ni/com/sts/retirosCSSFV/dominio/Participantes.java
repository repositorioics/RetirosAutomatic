package ni.com.sts.retirosCSSFV.dominio;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by ICS on 17/01/2022.
 */
@Entity
public class Participantes {
    private int codigo;

    @Id
    @javax.persistence.Column(name = "CODIGO")
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    private String identificadorEquipo;

    @Basic
    @javax.persistence.Column(name = "IDENTIFICADOR_EQUIPO")
    public String getIdentificadorEquipo() {
        return identificadorEquipo;
    }

    public void setIdentificadorEquipo(String identificadorEquipo) {
        this.identificadorEquipo = identificadorEquipo;
    }

    private String estado;

    @Basic
    @javax.persistence.Column(name = "ESTADO")
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    private String pasivo;

    @Basic
    @javax.persistence.Column(name = "PASIVO")
    public String getPasivo() {
        return pasivo;
    }

    public void setPasivo(String pasivo) {
        this.pasivo = pasivo;
    }

    private Timestamp fechaRegistro;

    @Basic
    @javax.persistence.Column(name = "FECHA_REGISTRO")
    public Timestamp getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Timestamp fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    private String usuarioRegistro;

    @Basic
    @javax.persistence.Column(name = "USUARIO_REGISTRO")
    public String getUsuarioRegistro() {
        return usuarioRegistro;
    }

    public void setUsuarioRegistro(String usuarioRegistro) {
        this.usuarioRegistro = usuarioRegistro;
    }

    private String apellido1;

    @Basic
    @javax.persistence.Column(name = "APELLIDO1")
    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    private String apellido1Madre;

    @Basic
    @javax.persistence.Column(name = "APELLIDO1_MADRE")
    public String getApellido1Madre() {
        return apellido1Madre;
    }

    public void setApellido1Madre(String apellido1Madre) {
        this.apellido1Madre = apellido1Madre;
    }

    private String apellido1Padre;

    @Basic
    @javax.persistence.Column(name = "APELLIDO1_PADRE")
    public String getApellido1Padre() {
        return apellido1Padre;
    }

    public void setApellido1Padre(String apellido1Padre) {
        this.apellido1Padre = apellido1Padre;
    }

    private String apellido2;

    @Basic
    @javax.persistence.Column(name = "APELLIDO2")
    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    private String apellido2Madre;

    @Basic
    @javax.persistence.Column(name = "APELLIDO2_MADRE")
    public String getApellido2Madre() {
        return apellido2Madre;
    }

    public void setApellido2Madre(String apellido2Madre) {
        this.apellido2Madre = apellido2Madre;
    }

    private String apellido2Padre;

    @Basic
    @javax.persistence.Column(name = "APELLIDO2_PADRE")
    public String getApellido2Padre() {
        return apellido2Padre;
    }

    public void setApellido2Padre(String apellido2Padre) {
        this.apellido2Padre = apellido2Padre;
    }

    private Timestamp fechanac;

    @Basic
    @javax.persistence.Column(name = "FECHANAC")
    public Timestamp getFechanac() {
        return fechanac;
    }

    public void setFechanac(Timestamp fechanac) {
        this.fechanac = fechanac;
    }

    private String nombre1;

    @Basic
    @javax.persistence.Column(name = "NOMBRE1")
    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    private String nombre1Madre;

    @Basic
    @javax.persistence.Column(name = "NOMBRE1_MADRE")
    public String getNombre1Madre() {
        return nombre1Madre;
    }

    public void setNombre1Madre(String nombre1Madre) {
        this.nombre1Madre = nombre1Madre;
    }

    private String nombre1Padre;

    @Basic
    @javax.persistence.Column(name = "NOMBRE1_PADRE")
    public String getNombre1Padre() {
        return nombre1Padre;
    }

    public void setNombre1Padre(String nombre1Padre) {
        this.nombre1Padre = nombre1Padre;
    }

    private String nombre2;

    @Basic
    @javax.persistence.Column(name = "NOMBRE2")
    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    private String nombre2Madre;

    @Basic
    @javax.persistence.Column(name = "NOMBRE2_MADRE")
    public String getNombre2Madre() {
        return nombre2Madre;
    }

    public void setNombre2Madre(String nombre2Madre) {
        this.nombre2Madre = nombre2Madre;
    }

    private String nombre2Padre;

    @Basic
    @javax.persistence.Column(name = "NOMBRE2_PADRE")
    public String getNombre2Padre() {
        return nombre2Padre;
    }

    public void setNombre2Padre(String nombre2Padre) {
        this.nombre2Padre = nombre2Padre;
    }

    private String sexo;

    @Basic
    @javax.persistence.Column(name = "SEXO")
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    private Integer codigoCasa;

    @Basic
    @javax.persistence.Column(name = "CODIGO_CASA")
    public Integer getCodigoCasa() {
        return codigoCasa;
    }

    public void setCodigoCasa(Integer codigoCasa) {
        this.codigoCasa = codigoCasa;
    }

    private String nombre1Tutor;

    @Basic
    @javax.persistence.Column(name = "NOMBRE1_TUTOR")
    public String getNombre1Tutor() {
        return nombre1Tutor;
    }

    public void setNombre1Tutor(String nombre1Tutor) {
        this.nombre1Tutor = nombre1Tutor;
    }

    private String nombre2Tutor;

    @Basic
    @javax.persistence.Column(name = "NOMBRE2_TUTOR")
    public String getNombre2Tutor() {
        return nombre2Tutor;
    }

    public void setNombre2Tutor(String nombre2Tutor) {
        this.nombre2Tutor = nombre2Tutor;
    }

    private String apellido1Tutor;

    @Basic
    @javax.persistence.Column(name = "APELLIDO1_TUTOR")
    public String getApellido1Tutor() {
        return apellido1Tutor;
    }

    public void setApellido1Tutor(String apellido1Tutor) {
        this.apellido1Tutor = apellido1Tutor;
    }

    private String apellido2Tutor;

    @Basic
    @javax.persistence.Column(name = "APELLIDO2_TUTOR")
    public String getApellido2Tutor() {
        return apellido2Tutor;
    }

    public void setApellido2Tutor(String apellido2Tutor) {
        this.apellido2Tutor = apellido2Tutor;
    }

    private String relacionFamiliar;

    @Basic
    @javax.persistence.Column(name = "RELACION_FAMILIAR")
    public String getRelacionFamiliar() {
        return relacionFamiliar;
    }

    public void setRelacionFamiliar(String relacionFamiliar) {
        this.relacionFamiliar = relacionFamiliar;
    }


    private ParticipantesProcesos participantesProcesos;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "codigo")
    public ParticipantesProcesos getParticipantesProcesos() {
        return participantesProcesos;
    }

    public void setParticipantesProcesos(ParticipantesProcesos participantesProcesos) {
        this.participantesProcesos = participantesProcesos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Participantes that = (Participantes) o;

        if (codigo != that.codigo) return false;
        if (apellido1 != null ? !apellido1.equals(that.apellido1) : that.apellido1 != null) return false;
        if (apellido1Madre != null ? !apellido1Madre.equals(that.apellido1Madre) : that.apellido1Madre != null)
            return false;
        if (apellido1Padre != null ? !apellido1Padre.equals(that.apellido1Padre) : that.apellido1Padre != null)
            return false;
        if (apellido1Tutor != null ? !apellido1Tutor.equals(that.apellido1Tutor) : that.apellido1Tutor != null)
            return false;
        if (apellido2 != null ? !apellido2.equals(that.apellido2) : that.apellido2 != null) return false;
        if (apellido2Madre != null ? !apellido2Madre.equals(that.apellido2Madre) : that.apellido2Madre != null)
            return false;
        if (apellido2Padre != null ? !apellido2Padre.equals(that.apellido2Padre) : that.apellido2Padre != null)
            return false;
        if (apellido2Tutor != null ? !apellido2Tutor.equals(that.apellido2Tutor) : that.apellido2Tutor != null)
            return false;
        if (codigoCasa != null ? !codigoCasa.equals(that.codigoCasa) : that.codigoCasa != null) return false;
        if (estado != null ? !estado.equals(that.estado) : that.estado != null) return false;
        if (fechaRegistro != null ? !fechaRegistro.equals(that.fechaRegistro) : that.fechaRegistro != null)
            return false;
        if (fechanac != null ? !fechanac.equals(that.fechanac) : that.fechanac != null) return false;
        if (identificadorEquipo != null ? !identificadorEquipo.equals(that.identificadorEquipo) : that.identificadorEquipo != null)
            return false;
        if (nombre1 != null ? !nombre1.equals(that.nombre1) : that.nombre1 != null) return false;
        if (nombre1Madre != null ? !nombre1Madre.equals(that.nombre1Madre) : that.nombre1Madre != null) return false;
        if (nombre1Padre != null ? !nombre1Padre.equals(that.nombre1Padre) : that.nombre1Padre != null) return false;
        if (nombre1Tutor != null ? !nombre1Tutor.equals(that.nombre1Tutor) : that.nombre1Tutor != null) return false;
        if (nombre2 != null ? !nombre2.equals(that.nombre2) : that.nombre2 != null) return false;
        if (nombre2Madre != null ? !nombre2Madre.equals(that.nombre2Madre) : that.nombre2Madre != null) return false;
        if (nombre2Padre != null ? !nombre2Padre.equals(that.nombre2Padre) : that.nombre2Padre != null) return false;
        if (nombre2Tutor != null ? !nombre2Tutor.equals(that.nombre2Tutor) : that.nombre2Tutor != null) return false;
        if (pasivo != null ? !pasivo.equals(that.pasivo) : that.pasivo != null) return false;
        if (relacionFamiliar != null ? !relacionFamiliar.equals(that.relacionFamiliar) : that.relacionFamiliar != null)
            return false;
        if (sexo != null ? !sexo.equals(that.sexo) : that.sexo != null) return false;
        if (usuarioRegistro != null ? !usuarioRegistro.equals(that.usuarioRegistro) : that.usuarioRegistro != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codigo;
        result = 31 * result + (identificadorEquipo != null ? identificadorEquipo.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (pasivo != null ? pasivo.hashCode() : 0);
        result = 31 * result + (fechaRegistro != null ? fechaRegistro.hashCode() : 0);
        result = 31 * result + (usuarioRegistro != null ? usuarioRegistro.hashCode() : 0);
        result = 31 * result + (apellido1 != null ? apellido1.hashCode() : 0);
        result = 31 * result + (apellido1Madre != null ? apellido1Madre.hashCode() : 0);
        result = 31 * result + (apellido1Padre != null ? apellido1Padre.hashCode() : 0);
        result = 31 * result + (apellido2 != null ? apellido2.hashCode() : 0);
        result = 31 * result + (apellido2Madre != null ? apellido2Madre.hashCode() : 0);
        result = 31 * result + (apellido2Padre != null ? apellido2Padre.hashCode() : 0);
        result = 31 * result + (fechanac != null ? fechanac.hashCode() : 0);
        result = 31 * result + (nombre1 != null ? nombre1.hashCode() : 0);
        result = 31 * result + (nombre1Madre != null ? nombre1Madre.hashCode() : 0);
        result = 31 * result + (nombre1Padre != null ? nombre1Padre.hashCode() : 0);
        result = 31 * result + (nombre2 != null ? nombre2.hashCode() : 0);
        result = 31 * result + (nombre2Madre != null ? nombre2Madre.hashCode() : 0);
        result = 31 * result + (nombre2Padre != null ? nombre2Padre.hashCode() : 0);
        result = 31 * result + (sexo != null ? sexo.hashCode() : 0);
        result = 31 * result + (codigoCasa != null ? codigoCasa.hashCode() : 0);
        result = 31 * result + (nombre1Tutor != null ? nombre1Tutor.hashCode() : 0);
        result = 31 * result + (nombre2Tutor != null ? nombre2Tutor.hashCode() : 0);
        result = 31 * result + (apellido1Tutor != null ? apellido1Tutor.hashCode() : 0);
        result = 31 * result + (apellido2Tutor != null ? apellido2Tutor.hashCode() : 0);
        result = 31 * result + (relacionFamiliar != null ? relacionFamiliar.hashCode() : 0);
        return result;
    }
}
