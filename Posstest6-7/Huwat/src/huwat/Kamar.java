/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huwat;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Acer
 */
@Entity
@Table(name = "kamar")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kamar.findAll", query = "SELECT k FROM Kamar k"),
    @NamedQuery(name = "Kamar.findByKodekamar", query = "SELECT k FROM Kamar k WHERE k.kodekamar = :kodekamar"),
    @NamedQuery(name = "Kamar.findByKelaskamar", query = "SELECT k FROM Kamar k WHERE k.kelaskamar = :kelaskamar"),
    @NamedQuery(name = "Kamar.findByTarifkamar", query = "SELECT k FROM Kamar k WHERE k.tarifkamar = :tarifkamar")})
public class Kamar implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kodekamar")
    private String kodekamar;
    @Column(name = "kelaskamar")
    private String kelaskamar;
    @Column(name = "tarifkamar")
    private Integer tarifkamar;

    public Kamar() {
    }

    public Kamar(String kodekamar) {
        this.kodekamar = kodekamar;
    }

    public String getKodekamar() {
        return kodekamar;
    }

    public void setKodekamar(String kodekamar) {
        String oldKodekamar = this.kodekamar;
        this.kodekamar = kodekamar;
        changeSupport.firePropertyChange("kodekamar", oldKodekamar, kodekamar);
    }

    public String getKelaskamar() {
        return kelaskamar;
    }

    public void setKelaskamar(String kelaskamar) {
        String oldKelaskamar = this.kelaskamar;
        this.kelaskamar = kelaskamar;
        changeSupport.firePropertyChange("kelaskamar", oldKelaskamar, kelaskamar);
    }

    public Integer getTarifkamar() {
        return tarifkamar;
    }

    public void setTarifkamar(Integer tarifkamar) {
        Integer oldTarifkamar = this.tarifkamar;
        this.tarifkamar = tarifkamar;
        changeSupport.firePropertyChange("tarifkamar", oldTarifkamar, tarifkamar);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kodekamar != null ? kodekamar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kamar)) {
            return false;
        }
        Kamar other = (Kamar) object;
        if ((this.kodekamar == null && other.kodekamar != null) || (this.kodekamar != null && !this.kodekamar.equals(other.kodekamar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "huwat.Kamar[ kodekamar=" + kodekamar + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
