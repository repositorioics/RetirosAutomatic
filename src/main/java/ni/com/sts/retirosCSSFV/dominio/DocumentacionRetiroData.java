package ni.com.sts.retirosCSSFV.dominio;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by ICS on 17/01/2022.
 */
@Entity
@javax.persistence.Table(name = "documentacion_retiro_data", schema = "", catalog = "estudios_ics")
public class DocumentacionRetiroData implements Serializable{

    public DocumentacionRetiroData(){}

    public DocumentacionRetiroData(int idretiro, String identificadorEquipo, String estado, String pasivo, Date fechaRegistro, String usuarioRegistro, Boolean actual, String casaFamilia, Integer codigoCasapdcs, String devolvioCarnet, String estudioRetirado, String estudiosAnteriores, Date fechaFallecido, Date fechaRetiro, Integer medicoSupervisor, String motivoRetiro, String observaciones, String otroMotivoRetiro, Integer personaDocumenta, String quienComunica, Integer relfam, String tipoFecha, int codigoParticipante) {
        this.idretiro = idretiro;
        this.identificadorEquipo = identificadorEquipo;
        this.estado = estado;
        this.pasivo = pasivo;
        this.fechaRegistro = fechaRegistro;
        this.usuarioRegistro = usuarioRegistro;
        this.actual = actual;
        this.casaFamilia = casaFamilia;
        this.codigoCasapdcs = codigoCasapdcs;
        this.devolvioCarnet = devolvioCarnet;
        this.estudioRetirado = estudioRetirado;
        this.estudiosAnteriores = estudiosAnteriores;
        this.fechaFallecido = fechaFallecido;
        this.fechaRetiro = fechaRetiro;
        this.medicoSupervisor = medicoSupervisor;
        this.motivoRetiro = motivoRetiro;
        this.observaciones = observaciones;
        this.otroMotivoRetiro = otroMotivoRetiro;
        this.personaDocumenta = personaDocumenta;
        this.quienComunica = quienComunica;
        this.relfam = relfam;
        this.tipoFecha = tipoFecha;
        this.codigoParticipante = codigoParticipante;
    }

    private int idretiro;

    @Id
    @javax.persistence.Column(name = "IDRETIRO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getIdretiro() {
        return idretiro;
    }

    public void setIdretiro(int idretiro) {
        this.idretiro = idretiro;
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

    private Date fechaRegistro;

    @Basic
    @javax.persistence.Column(name = "FECHA_REGISTRO")
    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
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

    private Boolean actual;

    @Basic
    @javax.persistence.Column(name = "ACTUAL")
    public Boolean getActual() {
        return actual;
    }

    public void setActual(Boolean actual) {
        this.actual = actual;
    }

    private String casaFamilia;

    @Basic
    @javax.persistence.Column(name = "CASA_FAMILIA")
    public String getCasaFamilia() {
        return casaFamilia;
    }

    public void setCasaFamilia(String casaFamilia) {
        this.casaFamilia = casaFamilia;
    }

    private Integer codigoCasapdcs;

    @Basic
    @javax.persistence.Column(name = "CODIGO_CASAPDCS")
    public Integer getCodigoCasapdcs() {
        return codigoCasapdcs;
    }

    public void setCodigoCasapdcs(Integer codigoCasapdcs) {
        this.codigoCasapdcs = codigoCasapdcs;
    }

    private String devolvioCarnet;

    @Basic
    @javax.persistence.Column(name = "DEVOLVIO_CARNET")
    public String getDevolvioCarnet() {
        return devolvioCarnet;
    }

    public void setDevolvioCarnet(String devolvioCarnet) {
        this.devolvioCarnet = devolvioCarnet;
    }

    private String estudioRetirado;

    @Basic
    @javax.persistence.Column(name = "ESTUDIO_RETIRADO")
    public String getEstudioRetirado() {
        return estudioRetirado;
    }

    public void setEstudioRetirado(String estudioRetirado) {
        this.estudioRetirado = estudioRetirado;
    }

    private String estudiosAnteriores;

    @Basic
    @javax.persistence.Column(name = "ESTUDIOS_ANTERIORES")
    public String getEstudiosAnteriores() {
        return estudiosAnteriores;
    }

    public void setEstudiosAnteriores(String estudiosAnteriores) {
        this.estudiosAnteriores = estudiosAnteriores;
    }

    private Date fechaFallecido;

    @Basic
    @javax.persistence.Column(name = "FECHA_FALLECIDO")
    public Date getFechaFallecido() {
        return fechaFallecido;
    }

    public void setFechaFallecido(Date fechaFallecido) {
        this.fechaFallecido = fechaFallecido;
    }

    private Date fechaRetiro;

    @Basic
    @javax.persistence.Column(name = "FECHA_RETIRO")
    @Temporal(TemporalType.DATE)
    public Date getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(Date fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    private Integer medicoSupervisor;

    @Basic
    @javax.persistence.Column(name = "MEDICO_SUPERVISOR")
    public Integer getMedicoSupervisor() {
        return medicoSupervisor;
    }

    public void setMedicoSupervisor(Integer medicoSupervisor) {
        this.medicoSupervisor = medicoSupervisor;
    }

    private String motivoRetiro;

    @Basic
    @javax.persistence.Column(name = "MOTIVO_RETIRO")
    public String getMotivoRetiro() {
        return motivoRetiro;
    }

    public void setMotivoRetiro(String motivoRetiro) {
        this.motivoRetiro = motivoRetiro;
    }

    private String observaciones;

    @Basic
    @javax.persistence.Column(name = "OBSERVACIONES")
    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    private String otroMotivoRetiro;

    @Basic
    @javax.persistence.Column(name = "OTRO_MOTIVO_RETIRO")
    public String getOtroMotivoRetiro() {
        return otroMotivoRetiro;
    }

    public void setOtroMotivoRetiro(String otroMotivoRetiro) {
        this.otroMotivoRetiro = otroMotivoRetiro;
    }

    private Integer personaDocumenta;

    @Basic
    @javax.persistence.Column(name = "PERSONA_DOCUMENTA")
    public Integer getPersonaDocumenta() {
        return personaDocumenta;
    }

    public void setPersonaDocumenta(Integer personaDocumenta) {
        this.personaDocumenta = personaDocumenta;
    }

    private String quienComunica;

    @Basic
    @javax.persistence.Column(name = "QUIEN_COMUNICA")
    public String getQuienComunica() {
        return quienComunica;
    }

    public void setQuienComunica(String quienComunica) {
        this.quienComunica = quienComunica;
    }

    private Integer relfam;

    @Basic
    @javax.persistence.Column(name = "RELFAM")
    public Integer getRelfam() {
        return relfam;
    }

    public void setRelfam(Integer relfam) {
        this.relfam = relfam;
    }

    private String tipoFecha;

    @Basic
    @javax.persistence.Column(name = "TIPO_FECHA")
    public String getTipoFecha() {
        return tipoFecha;
    }

    public void setTipoFecha(String tipoFecha) {
        this.tipoFecha = tipoFecha;
    }

    private int codigoParticipante;

    @Basic
    @javax.persistence.Column(name = "CODIGO_PARTICIPANTE")
    public int getCodigoParticipante() {
        return codigoParticipante;
    }

    public void setCodigoParticipante(int codigoParticipante) {
        this.codigoParticipante = codigoParticipante;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DocumentacionRetiroData that = (DocumentacionRetiroData) o;

        if (codigoParticipante != that.codigoParticipante) return false;
        if (idretiro != that.idretiro) return false;
        if (actual != null ? !actual.equals(that.actual) : that.actual != null) return false;
        if (casaFamilia != null ? !casaFamilia.equals(that.casaFamilia) : that.casaFamilia != null) return false;
        if (codigoCasapdcs != null ? !codigoCasapdcs.equals(that.codigoCasapdcs) : that.codigoCasapdcs != null)
            return false;
        if (devolvioCarnet != null ? !devolvioCarnet.equals(that.devolvioCarnet) : that.devolvioCarnet != null)
            return false;
        if (estado != null ? !estado.equals(that.estado) : that.estado != null) return false;
        if (estudioRetirado != null ? !estudioRetirado.equals(that.estudioRetirado) : that.estudioRetirado != null)
            return false;
        if (estudiosAnteriores != null ? !estudiosAnteriores.equals(that.estudiosAnteriores) : that.estudiosAnteriores != null)
            return false;
        if (fechaFallecido != null ? !fechaFallecido.equals(that.fechaFallecido) : that.fechaFallecido != null)
            return false;
        if (fechaRegistro != null ? !fechaRegistro.equals(that.fechaRegistro) : that.fechaRegistro != null)
            return false;
        if (fechaRetiro != null ? !fechaRetiro.equals(that.fechaRetiro) : that.fechaRetiro != null) return false;
        if (identificadorEquipo != null ? !identificadorEquipo.equals(that.identificadorEquipo) : that.identificadorEquipo != null)
            return false;
        if (medicoSupervisor != null ? !medicoSupervisor.equals(that.medicoSupervisor) : that.medicoSupervisor != null)
            return false;
        if (motivoRetiro != null ? !motivoRetiro.equals(that.motivoRetiro) : that.motivoRetiro != null) return false;
        if (observaciones != null ? !observaciones.equals(that.observaciones) : that.observaciones != null)
            return false;
        if (otroMotivoRetiro != null ? !otroMotivoRetiro.equals(that.otroMotivoRetiro) : that.otroMotivoRetiro != null)
            return false;
        if (pasivo != null ? !pasivo.equals(that.pasivo) : that.pasivo != null) return false;
        if (personaDocumenta != null ? !personaDocumenta.equals(that.personaDocumenta) : that.personaDocumenta != null)
            return false;
        if (quienComunica != null ? !quienComunica.equals(that.quienComunica) : that.quienComunica != null)
            return false;
        if (relfam != null ? !relfam.equals(that.relfam) : that.relfam != null) return false;
        if (tipoFecha != null ? !tipoFecha.equals(that.tipoFecha) : that.tipoFecha != null) return false;
        if (usuarioRegistro != null ? !usuarioRegistro.equals(that.usuarioRegistro) : that.usuarioRegistro != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idretiro;
        result = 31 * result + (identificadorEquipo != null ? identificadorEquipo.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (pasivo != null ? pasivo.hashCode() : 0);
        result = 31 * result + (fechaRegistro != null ? fechaRegistro.hashCode() : 0);
        result = 31 * result + (usuarioRegistro != null ? usuarioRegistro.hashCode() : 0);
        result = 31 * result + (actual != null ? actual.hashCode() : 0);
        result = 31 * result + (casaFamilia != null ? casaFamilia.hashCode() : 0);
        result = 31 * result + (codigoCasapdcs != null ? codigoCasapdcs.hashCode() : 0);
        result = 31 * result + (devolvioCarnet != null ? devolvioCarnet.hashCode() : 0);
        result = 31 * result + (estudioRetirado != null ? estudioRetirado.hashCode() : 0);
        result = 31 * result + (estudiosAnteriores != null ? estudiosAnteriores.hashCode() : 0);
        result = 31 * result + (fechaFallecido != null ? fechaFallecido.hashCode() : 0);
        result = 31 * result + (fechaRetiro != null ? fechaRetiro.hashCode() : 0);
        result = 31 * result + (medicoSupervisor != null ? medicoSupervisor.hashCode() : 0);
        result = 31 * result + (motivoRetiro != null ? motivoRetiro.hashCode() : 0);
        result = 31 * result + (observaciones != null ? observaciones.hashCode() : 0);
        result = 31 * result + (otroMotivoRetiro != null ? otroMotivoRetiro.hashCode() : 0);
        result = 31 * result + (personaDocumenta != null ? personaDocumenta.hashCode() : 0);
        result = 31 * result + (quienComunica != null ? quienComunica.hashCode() : 0);
        result = 31 * result + (relfam != null ? relfam.hashCode() : 0);
        result = 31 * result + (tipoFecha != null ? tipoFecha.hashCode() : 0);
        result = 31 * result + codigoParticipante;
        return result;
    }
}
