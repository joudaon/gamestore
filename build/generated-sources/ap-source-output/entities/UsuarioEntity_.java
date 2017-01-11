package entities;

import entities.VideojuegoEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-01-11T22:57:17")
@StaticMetamodel(UsuarioEntity.class)
public class UsuarioEntity_ { 

    public static volatile ListAttribute<UsuarioEntity, VideojuegoEntity> listavideojuegos;
    public static volatile SingularAttribute<UsuarioEntity, String> password;
    public static volatile SingularAttribute<UsuarioEntity, String> nombre;

}