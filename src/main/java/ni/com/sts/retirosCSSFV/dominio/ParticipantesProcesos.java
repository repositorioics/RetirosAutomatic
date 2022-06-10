package ni.com.sts.retirosCSSFV.dominio;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by ICS on 17/01/2022.
 */
@Entity
@javax.persistence.Table(name = "participantes_procesos", schema = "", catalog = "estudios_ics")
public class ParticipantesProcesos {
    private int codigo;

    @Id
    @javax.persistence.Column(name = "codigo")
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    private String adn;

    @Basic
    @javax.persistence.Column(name = "adn")
    public String getAdn() {
        return adn;
    }

    public void setAdn(String adn) {
        this.adn = adn;
    }

    private String casaChf;

    @Basic
    @javax.persistence.Column(name = "casa_chf")
    public String getCasaChf() {
        return casaChf;
    }

    public void setCasaChf(String casaChf) {
        this.casaChf = casaChf;
    }

    private String conpto;

    @Basic
    @javax.persistence.Column(name = "conpto")
    public String getConpto() {
        return conpto;
    }

    public void setConpto(String conpto) {
        this.conpto = conpto;
    }

    private String conmx;

    @Basic
    @javax.persistence.Column(name = "conmx")
    public String getConmx() {
        return conmx;
    }

    public void setConmx(String conmx) {
        this.conmx = conmx;
    }

    private String conmxbhc;

    @Basic
    @javax.persistence.Column(name = "conmxbhc")
    public String getConmxbhc() {
        return conmxbhc;
    }

    public void setConmxbhc(String conmxbhc) {
        this.conmxbhc = conmxbhc;
    }

    private String consChik;

    @Basic
    @javax.persistence.Column(name = "cons_chik")
    public String getConsChik() {
        return consChik;
    }

    public void setConsChik(String consChik) {
        this.consChik = consChik;
    }

    private String consDeng;

    @Basic
    @javax.persistence.Column(name = "cons_deng")
    public String getConsDeng() {
        return consDeng;
    }

    public void setConsDeng(String consDeng) {
        this.consDeng = consDeng;
    }

    private String consFlu;

    @Basic
    @javax.persistence.Column(name = "cons_flu")
    public String getConsFlu() {
        return consFlu;
    }

    public void setConsFlu(String consFlu) {
        this.consFlu = consFlu;
    }

    private String convalesciente;

    @Basic
    @javax.persistence.Column(name = "convalesciente")
    public String getConvalesciente() {
        return convalesciente;
    }

    public void setConvalesciente(String convalesciente) {
        this.convalesciente = convalesciente;
    }

    private int cuantasPersonas;

    @Basic
    @javax.persistence.Column(name = "cuantas_personas")
    public int getCuantasPersonas() {
        return cuantasPersonas;
    }

    public void setCuantasPersonas(int cuantasPersonas) {
        this.cuantasPersonas = cuantasPersonas;
    }

    private String datosParto;

    @Basic
    @javax.persistence.Column(name = "datos_parto")
    public String getDatosParto() {
        return datosParto;
    }

    public void setDatosParto(String datosParto) {
        this.datosParto = datosParto;
    }

    private String datosVisita;

    @Basic
    @javax.persistence.Column(name = "datos_visita")
    public String getDatosVisita() {
        return datosVisita;
    }

    public void setDatosVisita(String datosVisita) {
        this.datosVisita = datosVisita;
    }

    private String encCasa;

    @Basic
    @javax.persistence.Column(name = "enc_casa")
    public String getEncCasa() {
        return encCasa;
    }

    public void setEncCasa(String encCasa) {
        this.encCasa = encCasa;
    }

    private String encCasaChf;

    @Basic
    @javax.persistence.Column(name = "enc_casa_chf")
    public String getEncCasaChf() {
        return encCasaChf;
    }

    public void setEncCasaChf(String encCasaChf) {
        this.encCasaChf = encCasaChf;
    }

    private String encCasaSa;

    @Basic
    @javax.persistence.Column(name = "enc_casa_sa")
    public String getEncCasaSa() {
        return encCasaSa;
    }

    public void setEncCasaSa(String encCasaSa) {
        this.encCasaSa = encCasaSa;
    }

    private String encLacmat;

    @Basic
    @javax.persistence.Column(name = "enc_lacmat")
    public String getEncLacmat() {
        return encLacmat;
    }

    public void setEncLacmat(String encLacmat) {
        this.encLacmat = encLacmat;
    }

    private String encPart;

    @Basic
    @javax.persistence.Column(name = "enc_part")
    public String getEncPart() {
        return encPart;
    }

    public void setEncPart(String encPart) {
        this.encPart = encPart;
    }

    private String encPartSa;

    @Basic
    @javax.persistence.Column(name = "enc_part_sa")
    public String getEncPartSa() {
        return encPartSa;
    }

    public void setEncPartSa(String encPartSa) {
        this.encPartSa = encPartSa;
    }

    private int estPart;

    @Basic
    @javax.persistence.Column(name = "est_part")
    public int getEstPart() {
        return estPart;
    }

    public void setEstPart(int estPart) {
        this.estPart = estPart;
    }

    private String estudio;

    @Basic
    @javax.persistence.Column(name = "estudio")
    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    private String infoVacuna;

    @Basic
    @javax.persistence.Column(name = "info_vacuna")
    public String getInfoVacuna() {
        return infoVacuna;
    }

    public void setInfoVacuna(String infoVacuna) {
        this.infoVacuna = infoVacuna;
    }

    private String mi;

    @Basic
    @javax.persistence.Column(name = "mi")
    public String getMi() {
        return mi;
    }

    public void setMi(String mi) {
        this.mi = mi;
    }

    private String identificadorEquipo;

    @Basic
    @javax.persistence.Column(name = "identificador_equipo")
    public String getIdentificadorEquipo() {
        return identificadorEquipo;
    }

    public void setIdentificadorEquipo(String identificadorEquipo) {
        this.identificadorEquipo = identificadorEquipo;
    }

    private Boolean eliminado;

    @Basic
    @javax.persistence.Column(name = "eliminado")
    public Boolean getEliminado() {
        return eliminado;
    }

    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }

    private String terminado;

    @Basic
    @javax.persistence.Column(name = "terminado")
    public String getTerminado() {
        return terminado;
    }

    public void setTerminado(String terminado) {
        this.terminado = terminado;
    }

    private String estado;

    @Basic
    @javax.persistence.Column(name = "estado")
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    private Integer idInstancia;

    @Basic
    @javax.persistence.Column(name = "id_instancia")
    public Integer getIdInstancia() {
        return idInstancia;
    }

    public void setIdInstancia(Integer idInstancia) {
        this.idInstancia = idInstancia;
    }

    private String instancePath;

    @Basic
    @javax.persistence.Column(name = "instance_path")
    public String getInstancePath() {
        return instancePath;
    }

    public void setInstancePath(String instancePath) {
        this.instancePath = instancePath;
    }

    private String numeroTelefono;

    @Basic
    @javax.persistence.Column(name = "numero_telefono")
    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    private Integer recurso1;

    @Basic
    @javax.persistence.Column(name = "recurso1")
    public Integer getRecurso1() {
        return recurso1;
    }

    public void setRecurso1(Integer recurso1) {
        this.recurso1 = recurso1;
    }

    private Integer recurso2;

    @Basic
    @javax.persistence.Column(name = "recurso2")
    public Integer getRecurso2() {
        return recurso2;
    }

    public void setRecurso2(Integer recurso2) {
        this.recurso2 = recurso2;
    }

    private String serieSim;

    @Basic
    @javax.persistence.Column(name = "serie_sim")
    public String getSerieSim() {
        return serieSim;
    }

    public void setSerieSim(String serieSim) {
        this.serieSim = serieSim;
    }

    private String creado;

    @Basic
    @javax.persistence.Column(name = "creado")
    public String getCreado() {
        return creado;
    }

    public void setCreado(String creado) {
        this.creado = creado;
    }

    private Timestamp fechaRegistro;

    @Basic
    @javax.persistence.Column(name = "fecha_registro")
    public Timestamp getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Timestamp fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    private String ultimoCambio;

    @Basic
    @javax.persistence.Column(name = "ultimo_cambio")
    public String getUltimoCambio() {
        return ultimoCambio;
    }

    public void setUltimoCambio(String ultimoCambio) {
        this.ultimoCambio = ultimoCambio;
    }

    private String username;

    @Basic
    @javax.persistence.Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String obsequio;

    @Basic
    @javax.persistence.Column(name = "obsequio")
    public String getObsequio() {
        return obsequio;
    }

    public void setObsequio(String obsequio) {
        this.obsequio = obsequio;
    }

    private String paxgene;

    @Basic
    @javax.persistence.Column(name = "paxgene")
    public String getPaxgene() {
        return paxgene;
    }

    public void setPaxgene(String paxgene) {
        this.paxgene = paxgene;
    }

    private String pbmc;

    @Basic
    @javax.persistence.Column(name = "pbmc")
    public String getPbmc() {
        return pbmc;
    }

    public void setPbmc(String pbmc) {
        this.pbmc = pbmc;
    }

    private String pesoTalla;

    @Basic
    @javax.persistence.Column(name = "peso_talla")
    public String getPesoTalla() {
        return pesoTalla;
    }

    public void setPesoTalla(String pesoTalla) {
        this.pesoTalla = pesoTalla;
    }

    private String posZika;

    @Basic
    @javax.persistence.Column(name = "pos_zika")
    public String getPosZika() {
        return posZika;
    }

    public void setPosZika(String posZika) {
        this.posZika = posZika;
    }

    private String reconsDen;

    @Basic
    @javax.persistence.Column(name = "recons_den")
    public String getReconsDen() {
        return reconsDen;
    }

    public void setReconsDen(String reconsDen) {
        this.reconsDen = reconsDen;
    }

    private Integer relacionFam;

    @Basic
    @javax.persistence.Column(name = "relacion_fam")
    public Integer getRelacionFam() {
        return relacionFam;
    }

    public void setRelacionFam(Integer relacionFam) {
        this.relacionFam = relacionFam;
    }

    private String tutor;

    @Basic
    @javax.persistence.Column(name = "tutor")
    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    private String retoma;

    @Basic
    @javax.persistence.Column(name = "retoma")
    public String getRetoma() {
        return retoma;
    }

    public void setRetoma(String retoma) {
        this.retoma = retoma;
    }

    private Double volRetoma;

    @Basic
    @javax.persistence.Column(name = "vol_retoma")
    public Double getVolRetoma() {
        return volRetoma;
    }

    public void setVolRetoma(Double volRetoma) {
        this.volRetoma = volRetoma;
    }

    private String zika;

    @Basic
    @javax.persistence.Column(name = "zika")
    public String getZika() {
        return zika;
    }

    public void setZika(String zika) {
        this.zika = zika;
    }

    private String consSa;

    @Basic
    @javax.persistence.Column(name = "cons_sa")
    public String getConsSa() {
        return consSa;
    }

    public void setConsSa(String consSa) {
        this.consSa = consSa;
    }

    private Double volRetomaPbmc;

    @Basic
    @javax.persistence.Column(name = "vol_retoma_pbmc")
    public Double getVolRetomaPbmc() {
        return volRetomaPbmc;
    }

    public void setVolRetomaPbmc(Double volRetomaPbmc) {
        this.volRetomaPbmc = volRetomaPbmc;
    }

    private String coordenada;

    @Basic
    @javax.persistence.Column(name = "coordenada")
    public String getCoordenada() {
        return coordenada;
    }

    public void setCoordenada(String coordenada) {
        this.coordenada = coordenada;
    }

    private String obsequioChf;

    @Basic
    @javax.persistence.Column(name = "obsequio_chf")
    public String getObsequioChf() {
        return obsequioChf;
    }

    public void setObsequioChf(String obsequioChf) {
        this.obsequioChf = obsequioChf;
    }

    private String cDatosParto;

    @Basic
    @javax.persistence.Column(name = "c_datos_parto")
    public String getcDatosParto() {
        return cDatosParto;
    }

    public void setcDatosParto(String cDatosParto) {
        this.cDatosParto = cDatosParto;
    }

    private String reconsChf18;

    @Basic
    @javax.persistence.Column(name = "recons_chf_18")
    public String getReconsChf18() {
        return reconsChf18;
    }

    public void setReconsChf18(String reconsChf18) {
        this.reconsChf18 = reconsChf18;
    }

    private String posDengue;

    @Basic
    @javax.persistence.Column(name = "pos_dengue")
    public String getPosDengue() {
        return posDengue;
    }

    public void setPosDengue(String posDengue) {
        this.posDengue = posDengue;
    }

    private String estudioZen;

    @Basic
    @javax.persistence.Column(name = "estudio_zen")
    public String getEstudioZen() {
        return estudioZen;
    }

    public void setEstudioZen(String estudioZen) {
        this.estudioZen = estudioZen;
    }

    private String mxSuperficie;

    @Basic
    @javax.persistence.Column(name = "mx_superficie")
    public String getMxSuperficie() {
        return mxSuperficie;
    }

    public void setMxSuperficie(String mxSuperficie) {
        this.mxSuperficie = mxSuperficie;
    }

    private String preguntarAntecedenteTutor;

    @Basic
    @javax.persistence.Column(name = "preguntar_antecedente_tutor")
    public String getPreguntarAntecedenteTutor() {
        return preguntarAntecedenteTutor;
    }

    public void setPreguntarAntecedenteTutor(String preguntarAntecedenteTutor) {
        this.preguntarAntecedenteTutor = preguntarAntecedenteTutor;
    }

    private String preguntarAlfabeto;

    @Basic
    @javax.persistence.Column(name = "preguntar_alfabeto")
    public String getPreguntarAlfabeto() {
        return preguntarAlfabeto;
    }

    public void setPreguntarAlfabeto(String preguntarAlfabeto) {
        this.preguntarAlfabeto = preguntarAlfabeto;
    }

    private String preguntarMadreAlfabeto;

    @Basic
    @javax.persistence.Column(name = "preguntar_madre_alfabeto")
    public String getPreguntarMadreAlfabeto() {
        return preguntarMadreAlfabeto;
    }

    public void setPreguntarMadreAlfabeto(String preguntarMadreAlfabeto) {
        this.preguntarMadreAlfabeto = preguntarMadreAlfabeto;
    }

    private String preguntarNumParto;

    @Basic
    @javax.persistence.Column(name = "preguntar_num_parto")
    public String getPreguntarNumParto() {
        return preguntarNumParto;
    }

    public void setPreguntarNumParto(String preguntarNumParto) {
        this.preguntarNumParto = preguntarNumParto;
    }

    private String preguntarPadreAlfabeto;

    @Basic
    @javax.persistence.Column(name = "preguntar_padre_alfabeto")
    public String getPreguntarPadreAlfabeto() {
        return preguntarPadreAlfabeto;
    }

    public void setPreguntarPadreAlfabeto(String preguntarPadreAlfabeto) {
        this.preguntarPadreAlfabeto = preguntarPadreAlfabeto;
    }

    private String consCovid19;

    @Basic
    @javax.persistence.Column(name = "cons_covid19")
    public String getConsCovid19() {
        return consCovid19;
    }

    public void setConsCovid19(String consCovid19) {
        this.consCovid19 = consCovid19;
    }

    private String subestudios;

    @Basic
    @javax.persistence.Column(name = "subestudios")
    public String getSubestudios() {
        return subestudios;
    }

    public void setSubestudios(String subestudios) {
        this.subestudios = subestudios;
    }

    private String consChf;

    @Basic
    @javax.persistence.Column(name = "cons_chf")
    public String getConsChf() {
        return consChf;
    }

    public void setConsChf(String consChf) {
        this.consChf = consChf;
    }

    private String cuestCovid19;

    @Basic
    @javax.persistence.Column(name = "cuest_covid19")
    public String getCuestCovid19() {
        return cuestCovid19;
    }

    public void setCuestCovid19(String cuestCovid19) {
        this.cuestCovid19 = cuestCovid19;
    }

    private String mxAdicCovid19;

    @Basic
    @javax.persistence.Column(name = "mx_adic_covid19")
    public String getMxAdicCovid19() {
        return mxAdicCovid19;
    }

    public void setMxAdicCovid19(String mxAdicCovid19) {
        this.mxAdicCovid19 = mxAdicCovid19;
    }

    private String posCovid;

    @Basic
    @javax.persistence.Column(name = "pos_covid")
    public String getPosCovid() {
        return posCovid;
    }

    public void setPosCovid(String posCovid) {
        this.posCovid = posCovid;
    }

    private String consDenParteE;

    @Basic
    @javax.persistence.Column(name = "cons_den_parte_e")
    public String getConsDenParteE() {
        return consDenParteE;
    }

    public void setConsDenParteE(String consDenParteE) {
        this.consDenParteE = consDenParteE;
    }

    private String mxDenParteE;

    @Basic
    @javax.persistence.Column(name = "mx_den_parte_e")
    public String getMxDenParteE() {
        return mxDenParteE;
    }

    public void setMxDenParteE(String mxDenParteE) {
        this.mxDenParteE = mxDenParteE;
    }

    private String infoRetiro;

    @Basic
    @javax.persistence.Column(name = "info_retiro")
    public String getInfoRetiro() {
        return infoRetiro;
    }

    public void setInfoRetiro(String infoRetiro) {
        this.infoRetiro = infoRetiro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ParticipantesProcesos that = (ParticipantesProcesos) o;

        if (codigo != that.codigo) return false;
        if (cuantasPersonas != that.cuantasPersonas) return false;
        if (estPart != that.estPart) return false;
        if (adn != null ? !adn.equals(that.adn) : that.adn != null) return false;
        if (cDatosParto != null ? !cDatosParto.equals(that.cDatosParto) : that.cDatosParto != null) return false;
        if (casaChf != null ? !casaChf.equals(that.casaChf) : that.casaChf != null) return false;
        if (conmx != null ? !conmx.equals(that.conmx) : that.conmx != null) return false;
        if (conmxbhc != null ? !conmxbhc.equals(that.conmxbhc) : that.conmxbhc != null) return false;
        if (conpto != null ? !conpto.equals(that.conpto) : that.conpto != null) return false;
        if (consChf != null ? !consChf.equals(that.consChf) : that.consChf != null) return false;
        if (consChik != null ? !consChik.equals(that.consChik) : that.consChik != null) return false;
        if (consCovid19 != null ? !consCovid19.equals(that.consCovid19) : that.consCovid19 != null) return false;
        if (consDenParteE != null ? !consDenParteE.equals(that.consDenParteE) : that.consDenParteE != null)
            return false;
        if (consDeng != null ? !consDeng.equals(that.consDeng) : that.consDeng != null) return false;
        if (consFlu != null ? !consFlu.equals(that.consFlu) : that.consFlu != null) return false;
        if (consSa != null ? !consSa.equals(that.consSa) : that.consSa != null) return false;
        if (convalesciente != null ? !convalesciente.equals(that.convalesciente) : that.convalesciente != null)
            return false;
        if (coordenada != null ? !coordenada.equals(that.coordenada) : that.coordenada != null) return false;
        if (creado != null ? !creado.equals(that.creado) : that.creado != null) return false;
        if (cuestCovid19 != null ? !cuestCovid19.equals(that.cuestCovid19) : that.cuestCovid19 != null) return false;
        if (datosParto != null ? !datosParto.equals(that.datosParto) : that.datosParto != null) return false;
        if (datosVisita != null ? !datosVisita.equals(that.datosVisita) : that.datosVisita != null) return false;
        if (eliminado != null ? !eliminado.equals(that.eliminado) : that.eliminado != null) return false;
        if (encCasa != null ? !encCasa.equals(that.encCasa) : that.encCasa != null) return false;
        if (encCasaChf != null ? !encCasaChf.equals(that.encCasaChf) : that.encCasaChf != null) return false;
        if (encCasaSa != null ? !encCasaSa.equals(that.encCasaSa) : that.encCasaSa != null) return false;
        if (encLacmat != null ? !encLacmat.equals(that.encLacmat) : that.encLacmat != null) return false;
        if (encPart != null ? !encPart.equals(that.encPart) : that.encPart != null) return false;
        if (encPartSa != null ? !encPartSa.equals(that.encPartSa) : that.encPartSa != null) return false;
        if (estado != null ? !estado.equals(that.estado) : that.estado != null) return false;
        if (estudio != null ? !estudio.equals(that.estudio) : that.estudio != null) return false;
        if (estudioZen != null ? !estudioZen.equals(that.estudioZen) : that.estudioZen != null) return false;
        if (fechaRegistro != null ? !fechaRegistro.equals(that.fechaRegistro) : that.fechaRegistro != null)
            return false;
        if (idInstancia != null ? !idInstancia.equals(that.idInstancia) : that.idInstancia != null) return false;
        if (identificadorEquipo != null ? !identificadorEquipo.equals(that.identificadorEquipo) : that.identificadorEquipo != null)
            return false;
        if (infoRetiro != null ? !infoRetiro.equals(that.infoRetiro) : that.infoRetiro != null) return false;
        if (infoVacuna != null ? !infoVacuna.equals(that.infoVacuna) : that.infoVacuna != null) return false;
        if (instancePath != null ? !instancePath.equals(that.instancePath) : that.instancePath != null) return false;
        if (mi != null ? !mi.equals(that.mi) : that.mi != null) return false;
        if (mxAdicCovid19 != null ? !mxAdicCovid19.equals(that.mxAdicCovid19) : that.mxAdicCovid19 != null)
            return false;
        if (mxDenParteE != null ? !mxDenParteE.equals(that.mxDenParteE) : that.mxDenParteE != null) return false;
        if (mxSuperficie != null ? !mxSuperficie.equals(that.mxSuperficie) : that.mxSuperficie != null) return false;
        if (numeroTelefono != null ? !numeroTelefono.equals(that.numeroTelefono) : that.numeroTelefono != null)
            return false;
        if (obsequio != null ? !obsequio.equals(that.obsequio) : that.obsequio != null) return false;
        if (obsequioChf != null ? !obsequioChf.equals(that.obsequioChf) : that.obsequioChf != null) return false;
        if (paxgene != null ? !paxgene.equals(that.paxgene) : that.paxgene != null) return false;
        if (pbmc != null ? !pbmc.equals(that.pbmc) : that.pbmc != null) return false;
        if (pesoTalla != null ? !pesoTalla.equals(that.pesoTalla) : that.pesoTalla != null) return false;
        if (posCovid != null ? !posCovid.equals(that.posCovid) : that.posCovid != null) return false;
        if (posDengue != null ? !posDengue.equals(that.posDengue) : that.posDengue != null) return false;
        if (posZika != null ? !posZika.equals(that.posZika) : that.posZika != null) return false;
        if (preguntarAlfabeto != null ? !preguntarAlfabeto.equals(that.preguntarAlfabeto) : that.preguntarAlfabeto != null)
            return false;
        if (preguntarAntecedenteTutor != null ? !preguntarAntecedenteTutor.equals(that.preguntarAntecedenteTutor) : that.preguntarAntecedenteTutor != null)
            return false;
        if (preguntarMadreAlfabeto != null ? !preguntarMadreAlfabeto.equals(that.preguntarMadreAlfabeto) : that.preguntarMadreAlfabeto != null)
            return false;
        if (preguntarNumParto != null ? !preguntarNumParto.equals(that.preguntarNumParto) : that.preguntarNumParto != null)
            return false;
        if (preguntarPadreAlfabeto != null ? !preguntarPadreAlfabeto.equals(that.preguntarPadreAlfabeto) : that.preguntarPadreAlfabeto != null)
            return false;
        if (reconsChf18 != null ? !reconsChf18.equals(that.reconsChf18) : that.reconsChf18 != null) return false;
        if (reconsDen != null ? !reconsDen.equals(that.reconsDen) : that.reconsDen != null) return false;
        if (recurso1 != null ? !recurso1.equals(that.recurso1) : that.recurso1 != null) return false;
        if (recurso2 != null ? !recurso2.equals(that.recurso2) : that.recurso2 != null) return false;
        if (relacionFam != null ? !relacionFam.equals(that.relacionFam) : that.relacionFam != null) return false;
        if (retoma != null ? !retoma.equals(that.retoma) : that.retoma != null) return false;
        if (serieSim != null ? !serieSim.equals(that.serieSim) : that.serieSim != null) return false;
        if (subestudios != null ? !subestudios.equals(that.subestudios) : that.subestudios != null) return false;
        if (terminado != null ? !terminado.equals(that.terminado) : that.terminado != null) return false;
        if (tutor != null ? !tutor.equals(that.tutor) : that.tutor != null) return false;
        if (ultimoCambio != null ? !ultimoCambio.equals(that.ultimoCambio) : that.ultimoCambio != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (volRetoma != null ? !volRetoma.equals(that.volRetoma) : that.volRetoma != null) return false;
        if (volRetomaPbmc != null ? !volRetomaPbmc.equals(that.volRetomaPbmc) : that.volRetomaPbmc != null)
            return false;
        if (zika != null ? !zika.equals(that.zika) : that.zika != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codigo;
        result = 31 * result + (adn != null ? adn.hashCode() : 0);
        result = 31 * result + (casaChf != null ? casaChf.hashCode() : 0);
        result = 31 * result + (conpto != null ? conpto.hashCode() : 0);
        result = 31 * result + (conmx != null ? conmx.hashCode() : 0);
        result = 31 * result + (conmxbhc != null ? conmxbhc.hashCode() : 0);
        result = 31 * result + (consChik != null ? consChik.hashCode() : 0);
        result = 31 * result + (consDeng != null ? consDeng.hashCode() : 0);
        result = 31 * result + (consFlu != null ? consFlu.hashCode() : 0);
        result = 31 * result + (convalesciente != null ? convalesciente.hashCode() : 0);
        result = 31 * result + cuantasPersonas;
        result = 31 * result + (datosParto != null ? datosParto.hashCode() : 0);
        result = 31 * result + (datosVisita != null ? datosVisita.hashCode() : 0);
        result = 31 * result + (encCasa != null ? encCasa.hashCode() : 0);
        result = 31 * result + (encCasaChf != null ? encCasaChf.hashCode() : 0);
        result = 31 * result + (encCasaSa != null ? encCasaSa.hashCode() : 0);
        result = 31 * result + (encLacmat != null ? encLacmat.hashCode() : 0);
        result = 31 * result + (encPart != null ? encPart.hashCode() : 0);
        result = 31 * result + (encPartSa != null ? encPartSa.hashCode() : 0);
        result = 31 * result + estPart;
        result = 31 * result + (estudio != null ? estudio.hashCode() : 0);
        result = 31 * result + (infoVacuna != null ? infoVacuna.hashCode() : 0);
        result = 31 * result + (mi != null ? mi.hashCode() : 0);
        result = 31 * result + (identificadorEquipo != null ? identificadorEquipo.hashCode() : 0);
        result = 31 * result + (eliminado != null ? eliminado.hashCode() : 0);
        result = 31 * result + (terminado != null ? terminado.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (idInstancia != null ? idInstancia.hashCode() : 0);
        result = 31 * result + (instancePath != null ? instancePath.hashCode() : 0);
        result = 31 * result + (numeroTelefono != null ? numeroTelefono.hashCode() : 0);
        result = 31 * result + (recurso1 != null ? recurso1.hashCode() : 0);
        result = 31 * result + (recurso2 != null ? recurso2.hashCode() : 0);
        result = 31 * result + (serieSim != null ? serieSim.hashCode() : 0);
        result = 31 * result + (creado != null ? creado.hashCode() : 0);
        result = 31 * result + (fechaRegistro != null ? fechaRegistro.hashCode() : 0);
        result = 31 * result + (ultimoCambio != null ? ultimoCambio.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (obsequio != null ? obsequio.hashCode() : 0);
        result = 31 * result + (paxgene != null ? paxgene.hashCode() : 0);
        result = 31 * result + (pbmc != null ? pbmc.hashCode() : 0);
        result = 31 * result + (pesoTalla != null ? pesoTalla.hashCode() : 0);
        result = 31 * result + (posZika != null ? posZika.hashCode() : 0);
        result = 31 * result + (reconsDen != null ? reconsDen.hashCode() : 0);
        result = 31 * result + (relacionFam != null ? relacionFam.hashCode() : 0);
        result = 31 * result + (tutor != null ? tutor.hashCode() : 0);
        result = 31 * result + (retoma != null ? retoma.hashCode() : 0);
        result = 31 * result + (volRetoma != null ? volRetoma.hashCode() : 0);
        result = 31 * result + (zika != null ? zika.hashCode() : 0);
        result = 31 * result + (consSa != null ? consSa.hashCode() : 0);
        result = 31 * result + (volRetomaPbmc != null ? volRetomaPbmc.hashCode() : 0);
        result = 31 * result + (coordenada != null ? coordenada.hashCode() : 0);
        result = 31 * result + (obsequioChf != null ? obsequioChf.hashCode() : 0);
        result = 31 * result + (cDatosParto != null ? cDatosParto.hashCode() : 0);
        result = 31 * result + (reconsChf18 != null ? reconsChf18.hashCode() : 0);
        result = 31 * result + (posDengue != null ? posDengue.hashCode() : 0);
        result = 31 * result + (estudioZen != null ? estudioZen.hashCode() : 0);
        result = 31 * result + (mxSuperficie != null ? mxSuperficie.hashCode() : 0);
        result = 31 * result + (preguntarAntecedenteTutor != null ? preguntarAntecedenteTutor.hashCode() : 0);
        result = 31 * result + (preguntarAlfabeto != null ? preguntarAlfabeto.hashCode() : 0);
        result = 31 * result + (preguntarMadreAlfabeto != null ? preguntarMadreAlfabeto.hashCode() : 0);
        result = 31 * result + (preguntarNumParto != null ? preguntarNumParto.hashCode() : 0);
        result = 31 * result + (preguntarPadreAlfabeto != null ? preguntarPadreAlfabeto.hashCode() : 0);
        result = 31 * result + (consCovid19 != null ? consCovid19.hashCode() : 0);
        result = 31 * result + (subestudios != null ? subestudios.hashCode() : 0);
        result = 31 * result + (consChf != null ? consChf.hashCode() : 0);
        result = 31 * result + (cuestCovid19 != null ? cuestCovid19.hashCode() : 0);
        result = 31 * result + (mxAdicCovid19 != null ? mxAdicCovid19.hashCode() : 0);
        result = 31 * result + (posCovid != null ? posCovid.hashCode() : 0);
        result = 31 * result + (consDenParteE != null ? consDenParteE.hashCode() : 0);
        result = 31 * result + (mxDenParteE != null ? mxDenParteE.hashCode() : 0);
        result = 31 * result + (infoRetiro != null ? infoRetiro.hashCode() : 0);
        return result;
    }
}
