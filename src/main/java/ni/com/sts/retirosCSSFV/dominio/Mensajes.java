package ni.com.sts.retirosCSSFV.dominio;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by ICS on 19/05/2022.
 */
@Entity
public class Mensajes {
    private String messageKey;
    private String catKey;
    private String catRoot;
    private String en;
    private String isCat;
    private int orden;
    private String catPasive;
    private String es;

    @Id
    @Column(name = "messageKey")
    public String getMessageKey() {
        return messageKey;
    }

    public void setMessageKey(String messageKey) {
        this.messageKey = messageKey;
    }

    @Basic
    @Column(name = "catKey")
    public String getCatKey() {
        return catKey;
    }

    public void setCatKey(String catKey) {
        this.catKey = catKey;
    }

    @Basic
    @Column(name = "catRoot")
    public String getCatRoot() {
        return catRoot;
    }

    public void setCatRoot(String catRoot) {
        this.catRoot = catRoot;
    }

    @Basic
    @Column(name = "en")
    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    @Basic
    @Column(name = "isCat")
    public String getIsCat() {
        return isCat;
    }

    public void setIsCat(String isCat) {
        this.isCat = isCat;
    }

    @Basic
    @Column(name = "orden")
    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    @Basic
    @Column(name = "catPasive")
    public String getCatPasive() {
        return catPasive;
    }

    public void setCatPasive(String catPasive) {
        this.catPasive = catPasive;
    }

    @Basic
    @Column(name = "es")
    public String getEs() {
        return es;
    }

    public void setEs(String es) {
        this.es = es;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Mensajes mensajes = (Mensajes) o;

        if (orden != mensajes.orden) return false;
        if (catKey != null ? !catKey.equals(mensajes.catKey) : mensajes.catKey != null) return false;
        if (catPasive != null ? !catPasive.equals(mensajes.catPasive) : mensajes.catPasive != null) return false;
        if (catRoot != null ? !catRoot.equals(mensajes.catRoot) : mensajes.catRoot != null) return false;
        if (en != null ? !en.equals(mensajes.en) : mensajes.en != null) return false;
        if (es != null ? !es.equals(mensajes.es) : mensajes.es != null) return false;
        if (isCat != null ? !isCat.equals(mensajes.isCat) : mensajes.isCat != null) return false;
        if (messageKey != null ? !messageKey.equals(mensajes.messageKey) : mensajes.messageKey != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = messageKey != null ? messageKey.hashCode() : 0;
        result = 31 * result + (catKey != null ? catKey.hashCode() : 0);
        result = 31 * result + (catRoot != null ? catRoot.hashCode() : 0);
        result = 31 * result + (en != null ? en.hashCode() : 0);
        result = 31 * result + (isCat != null ? isCat.hashCode() : 0);
        result = 31 * result + orden;
        result = 31 * result + (catPasive != null ? catPasive.hashCode() : 0);
        result = 31 * result + (es != null ? es.hashCode() : 0);
        return result;
    }
}
