/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

import com.mycompany.conect.EntidadeBase;
import com.mycompany.conect.GenericDAO;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author giovanapinho
 */
@Entity
@Table(name = "locacao")
@NamedQueries({
    @NamedQuery(name = "Locacao.findAll", query = "SELECT l FROM Locacao l"),
    @NamedQuery(name = "Locacao.findById", query = "SELECT l FROM Locacao l WHERE l.locacaoPK.id = :id"),
    @NamedQuery(name = "Locacao.findByValorLocacao", query = "SELECT l FROM Locacao l WHERE l.valorLocacao = :valorLocacao"),
    @NamedQuery(name = "Locacao.findByHoraLocacao", query = "SELECT l FROM Locacao l WHERE l.horaLocacao = :horaLocacao"),
    @NamedQuery(name = "Locacao.findByDataLocacao", query = "SELECT l FROM Locacao l WHERE l.dataLocacao = :dataLocacao"),
    @NamedQuery(name = "Locacao.findByKmAdquirida", query = "SELECT l FROM Locacao l WHERE l.kmAdquirida = :kmAdquirida"),
    @NamedQuery(name = "Locacao.findByDevolvido", query = "SELECT l FROM Locacao l WHERE l.devolvido = :devolvido"),
    @NamedQuery(name = "Locacao.findByHoraDevolucao", query = "SELECT l FROM Locacao l WHERE l.horaDevolucao = :horaDevolucao"),
    @NamedQuery(name = "Locacao.findByDataDevolucao", query = "SELECT l FROM Locacao l WHERE l.dataDevolucao = :dataDevolucao"),
    @NamedQuery(name = "Locacao.findByKmDevolvida", query = "SELECT l FROM Locacao l WHERE l.kmDevolvida = :kmDevolvida"),
    @NamedQuery(name = "Locacao.findByCarroid", query = "SELECT l FROM Locacao l WHERE l.locacaoPK.carroid = :carroid"),
    @NamedQuery(name = "Locacao.findByClienteid", query = "SELECT l FROM Locacao l WHERE l.locacaoPK.clienteid = :clienteid")})
public class Locacao implements Serializable, EntidadeBase{

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LocacaoPK locacaoPK;
    @Basic(optional = false)
    @Column(name = "valorLocacao")
    private double valorLocacao;
    @Basic(optional = false)
    @Column(name = "horaLocacao")
    private String horaLocacao;
    @Basic(optional = false)
    @Column(name = "dataLocacao")
    private String dataLocacao;
    @Basic(optional = false)
    @Column(name = "kmAdquirida")
    private double kmAdquirida;
    @Basic(optional = false)
    @Column(name = "devolvido")
    private short devolvido;
    @Basic(optional = false)
    @Column(name = "horaDevolucao")
    private String horaDevolucao;
    @Basic(optional = false)
    @Column(name = "dataDevolucao")
    private String dataDevolucao;
    @Basic(optional = false)
    @Column(name = "kmDevolvida")
    private String kmDevolvida;
    @JoinColumn(name = "Carro_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Carro carro;
    @JoinColumn(name = "Cliente_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Cliente cliente;
   

    public Locacao() {
    }

    public Locacao(LocacaoPK locacaoPK) {
        this.locacaoPK = locacaoPK;
    }

    public Locacao(LocacaoPK locacaoPK, double valorLocacao, String horaLocacao, String dataLocacao, double kmAdquirida, short devolvido, String horaDevolucao, String dataDevolucao, String kmDevolvida) {
        this.locacaoPK = locacaoPK;
        this.valorLocacao = valorLocacao;
        this.horaLocacao = horaLocacao;
        this.dataLocacao = dataLocacao;
        this.kmAdquirida = kmAdquirida;
        this.devolvido = devolvido;
        this.horaDevolucao = horaDevolucao;
        this.dataDevolucao = dataDevolucao;
        this.kmDevolvida = kmDevolvida;
    }

    public Locacao(Integer id, Integer carroid, Integer clienteid) {
        this.locacaoPK = new LocacaoPK(id, carroid, clienteid);
    }

    public LocacaoPK getLocacaoPK() {
        return locacaoPK;
    }
   
    @Override
    public Integer getId() {
        return this.locacaoPK.getId();
    }
    
    public void setLocacaoPK(LocacaoPK locacaoPK) {
        this.locacaoPK = locacaoPK;
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public String getHoraLocacao() {
        return horaLocacao;
    }

    public void setHoraLocacao(String horaLocacao) {
        this.horaLocacao = horaLocacao;
    }

    public String getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(String dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public double getKmAdquirida() {
        return kmAdquirida;
    }

    public void setKmAdquirida(double kmAdquirida) {
        this.kmAdquirida = kmAdquirida;
    }

    public short getDevolvido() {
        return devolvido;
    }

    public void setDevolvido(short devolvido) {
        this.devolvido = devolvido;
    }

    public String getHoraDevolucao() {
        return horaDevolucao;
    }

    public void setHoraDevolucao(String horaDevolucao) {
        this.horaDevolucao = horaDevolucao;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getKmDevolvida() {
        return kmDevolvida;
    }

    public void setKmDevolvida(String kmDevolvida) {
        this.kmDevolvida = kmDevolvida;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
 //   public Locacao Consultar(LocacaoPK id) {
 //       GenericDAO genericDAO = new GenericDAO();
 //       return genericDAO.findById(this(),id.getId());
//        int n = locacoes.size();
//
//        for (int i = 0; i < n; i++) {
//            Locacao l = locacoes.get(i);
//
//            //COMPARA SE O CÓDIGO DA LOCAÇÃO É IGUAL AO CÓDIGO DIGITADO PELO USUÁRIO E RETORNA A LOCAÇÃO SE TRUE
//            if (id.equals(l.getLocacaoPK())) {
//                System.out.print("\nDados da locação:\n\n");
//                System.out.println("Valor Locação:" + l.getValorLocacao());
//                System.out.println("Hora Locação:" + l.getHoraLocacao());
//                System.out.println("Data Locação:" + l.getDataLocacao());
//                System.out.println("Km Adquirida:" + l.getKmAdquirida());
//                if(l.getDevolvido()==1){//PRINTA OS DADOS DA DEVOLUÇÃO
//                    System.out.println("Hora Devolução:" + l.getHoraDevolucao());
//                    System.out.println("Data Devolução:" + l.getDataDevolucao());
//                    System.out.println("Km Devolvida:" + l.getKmDevolvida());
//                }
//                //DADOS DO CLIENTE
//                System.out.print("\nCLIENTE:\n");
//                System.out.println("Nome:" + l.cli.getNome());
//                System.out.println("Tel:" + l.cli.getTelefone());
//                System.out.println("Email:" + l.cli.getEmail());
//                System.out.println("Cpf:" + l.cli.getId());
//                System.out.println("end:" + l.cli.getEndereco());
//                //DADOS DO CARRO
//                System.out.print("\nCARRO:\n");
//                System.out.println("Marca:" + l.car.getMarca());
//                System.out.println("Modelo:" + l.car.getModelo());
//                System.out.println("Placa:" + l.car.getPlaca());
//                System.out.println("Chassi:" + l.car.getChassi());
//                System.out.println("Cor:" + l.car.getCor());
//                System.out.println("Tipo combustível:" + l.car.getTipoCombustivel());
//                System.out.println("Km:" + l.car.getKm());
//               
//                return l;
//            }
//            
//        }
//        return null;
 //}

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (locacaoPK != null ? locacaoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Locacao)) {
            return false;
        }
        Locacao other = (Locacao) object;
        if ((this.locacaoPK == null && other.locacaoPK != null) || (this.locacaoPK != null && !this.locacaoPK.equals(other.locacaoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.model.Locacao[ locacaoPK=" + locacaoPK + " ]";
    }
    
}
