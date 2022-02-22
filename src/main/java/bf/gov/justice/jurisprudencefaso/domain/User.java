package bf.gov.justice.jurisprudencefaso.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
// @Table(name = "mj_user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String password;
    private boolean actif;
    private String roles;

    public User(String username, String password, boolean actif, String roles) {
        this.username = username;
        this.password = password;
        this.actif = actif;
        this.roles = roles;
    }

    public User() {
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActif() {
        return actif;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
}
