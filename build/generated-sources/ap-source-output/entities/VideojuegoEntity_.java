package entities;

import entities.ComentarioEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-01-13T22:58:50")
@StaticMetamodel(VideojuegoEntity.class)
public class VideojuegoEntity_ { 

    public static volatile SingularAttribute<VideojuegoEntity, String> descripcion;
    public static volatile SingularAttribute<VideojuegoEntity, String> urlfoto;
    public static volatile SingularAttribute<VideojuegoEntity, Integer> precio;
    public static volatile SingularAttribute<VideojuegoEntity, String> estilo;
    public static volatile SingularAttribute<VideojuegoEntity, String> plataforma;
    public static volatile SingularAttribute<VideojuegoEntity, String> urlvideo;
    public static volatile SingularAttribute<VideojuegoEntity, String> nombre;
    public static volatile ListAttribute<VideojuegoEntity, ComentarioEntity> listacomentario;

}