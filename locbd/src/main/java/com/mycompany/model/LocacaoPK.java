/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

import com.mycompany.conect.EntidadeBase;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author giovanapinho
 */
@Embeddable
public class LocacaoPK implements Serializable, EntidadeBase{

    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Carro_id")
    private Integer carroid;
    @Basic(optional = false)
    @Column(name = "Cliente_id")
    private Integer clienteid;

    public LocacaoPK() {
    }

    public LocacaoPK(Integer id, Integer carroid, Integer clienteid) {
        this.id = id;
        this.carroid = carroid;
        this.clienteid = clienteid;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCarroid() {
        return carroid;
    }

    public void setCarroid(Integer carroid) {
        this.carroid = carroid;
    }

    public Integer getClienteid() {
        return clienteid;
    }

    public void setClienteid(Integer clienteid) {
        this.clienteid = clienteid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        hash += (carroid != null ? carroid.hashCode() : 0);
        hash += (clienteid != null ? clienteid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LocacaoPK)) {
            return false;
        }
        LocacaoPK other = (LocacaoPK) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        if ((this.carroid == null && other.carroid != null) || (this.carroid != null && !this.carroid.equals(other.carroid))) {
            return false;
        }
        if ((this.clienteid == null && other.clienteid != null) || (this.clienteid != null && !this.clienteid.equals(other.clienteid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.model.LocacaoPK[ id=" + id + ", carroid=" + carroid + ", clienteid=" + clienteid + " ]";
    }
    
}
