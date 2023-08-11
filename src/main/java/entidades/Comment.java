
package entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Comment {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idComment;
    private String IdUser;
    private String idPublicacion;
    private String comment;

    public Comment() {
    }

    public Comment(String IdUser, String idPublicacion, String comment) {
        this.IdUser = IdUser;
        this.idPublicacion = idPublicacion;
        this.comment = comment;
    }

    public String getIdComment() {
        return idComment;
    }

    public String getIdUser() {
        return IdUser;
    }

    public void setIdUser(String IdUser) {
        this.IdUser = IdUser;
    }

    public String getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(String idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}

