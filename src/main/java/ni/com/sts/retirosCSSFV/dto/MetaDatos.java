package ni.com.sts.retirosCSSFV.dto;

import java.io.Serializable;

/**
 * Created by ICS on 3/6/2022.
 */
public class MetaDatos implements Serializable {

    private String noombreUsuario;
    private String identificador;
    private Integer medicoSupervisor;
    private Integer personalDocumenta;
    private Integer relacionFamiliar;

    public MetaDatos(){}

    public MetaDatos(java.lang.String noombreUsuario, java.lang.String identificador, java.lang.Integer medicoSupervisor, java.lang.Integer personalDocumenta, java.lang.Integer relacionFamiliar) {
        this.noombreUsuario = noombreUsuario;
        this.identificador = identificador;
        this.medicoSupervisor = medicoSupervisor;
        this.personalDocumenta = personalDocumenta;
        this.relacionFamiliar = relacionFamiliar;
    }

    public java.lang.String getNoombreUsuario() {
        return noombreUsuario;
    }

    public void setNoombreUsuario(java.lang.String noombreUsuario) {
        this.noombreUsuario = noombreUsuario;
    }

    public java.lang.String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(java.lang.String identificador) {
        this.identificador = identificador;
    }

    public java.lang.Integer getMedicoSupervisor() {
        return medicoSupervisor;
    }

    public void setMedicoSupervisor(java.lang.Integer medicoSupervisor) {
        this.medicoSupervisor = medicoSupervisor;
    }

    public java.lang.Integer getPersonalDocumenta() {
        return personalDocumenta;
    }

    public void setPersonalDocumenta(java.lang.Integer personalDocumenta) {
        this.personalDocumenta = personalDocumenta;
    }

    public java.lang.Integer getRelacionFamiliar() {
        return relacionFamiliar;
    }

    public void setRelacionFamiliar(java.lang.Integer relacionFamiliar) {
        this.relacionFamiliar = relacionFamiliar;
    }
}
