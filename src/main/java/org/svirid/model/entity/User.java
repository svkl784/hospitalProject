package org.svirid.model.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column (name = "id_user")
    private int id_user;
    @Column (name="admin")
    private boolean admin;
    @Column (name = "user_name")
    private String userName;
    @Column (name = "email")
    private String email;
    @Column (name = "password")
    private String password;

    public User() {
    }

    public User(boolean admin, String userName, String email, String password) {
        this.admin = admin;
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "admin=" + admin +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password+'\'' + // как сделать пароль невидимым??подумать
                '}';
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
