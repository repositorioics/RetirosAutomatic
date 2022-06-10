package ni.com.sts.retirosCSSFV.dto;

import java.io.Serializable;

/**
 * Created by ICS on 17/01/2022.
 */
public class ParticipanteDto implements Serializable {

    private Integer codigo_participante;
    private String estudios;
    private Integer edad;
    private Integer estado_participante;
    private Integer casaPDCS;
    private String casaFamilia;

    public ParticipanteDto(){}

    public ParticipanteDto(Integer codigo_participante, String estudios, Integer edad, Integer estado_participante, Integer casaPDCS, String casaFamilia) {
        this.codigo_participante = codigo_participante;
        this.estudios = estudios;
        this.edad = edad;
        this.estado_participante = estado_participante;
        this.casaPDCS = casaPDCS;
        this.casaFamilia= casaFamilia;
    }

    public Integer getCodigo_participante() {
        return codigo_participante;
    }

    public void setCodigo_participante(Integer codigo_participante) {
        this.codigo_participante = codigo_participante;
    }

    public String getEstudios() {
        return estudios;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getEstado_participante() {
        return estado_participante;
    }

    public void setEstado_participante(Integer estado_participante) {
        this.estado_participante = estado_participante;
    }

    public Integer getCasaPDCS() {
        return casaPDCS;
    }

    public void setCasaPDCS(Integer casaPDCS) {
        this.casaPDCS = casaPDCS;
    }

    public String getCasaFamilia() {
        return casaFamilia;
    }

    public void setCasaFamilia(String casaFamilia) {
        this.casaFamilia = casaFamilia;
    }
}
