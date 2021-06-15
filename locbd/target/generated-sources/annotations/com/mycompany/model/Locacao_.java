package com.mycompany.model;

import com.mycompany.model.Carro;
import com.mycompany.model.Cliente;
import com.mycompany.model.LocacaoPK;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-06-14T22:49:12", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Locacao.class)
public class Locacao_ { 

    public static volatile SingularAttribute<Locacao, Double> kmAdquirida;
    public static volatile SingularAttribute<Locacao, Carro> carro;
    public static volatile SingularAttribute<Locacao, Cliente> cliente;
    public static volatile SingularAttribute<Locacao, String> kmDevolvida;
    public static volatile SingularAttribute<Locacao, String> dataLocacao;
    public static volatile SingularAttribute<Locacao, Short> devolvido;
    public static volatile SingularAttribute<Locacao, Double> valorLocacao;
    public static volatile SingularAttribute<Locacao, LocacaoPK> locacaoPK;
    public static volatile SingularAttribute<Locacao, String> horaLocacao;
    public static volatile SingularAttribute<Locacao, String> horaDevolucao;
    public static volatile SingularAttribute<Locacao, String> dataDevolucao;

}