package com.mycompany.model;

import com.mycompany.model.Locacao;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-06-14T22:49:12", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Carro.class)
public class Carro_ { 

    public static volatile SingularAttribute<Carro, String> marca;
    public static volatile SingularAttribute<Carro, Double> km;
    public static volatile SingularAttribute<Carro, Integer> estado;
    public static volatile SingularAttribute<Carro, String> tipoCombustivel;
    public static volatile ListAttribute<Carro, Locacao> locacaoList;
    public static volatile SingularAttribute<Carro, String> cor;
    public static volatile SingularAttribute<Carro, String> chassi;
    public static volatile SingularAttribute<Carro, Integer> id;
    public static volatile SingularAttribute<Carro, String> modelo;
    public static volatile SingularAttribute<Carro, String> placa;

}