package com.tserve.pojo;



import com.tserve.pojo.audit.DateAudit;
import org.hibernate.annotations.NaturalId;


import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="user",uniqueConstraints = {
        @UniqueConstraint(columnNames = {"username"}),
        @UniqueConstraint(columnNames = {"email"})
})
public class User extends DateAudit{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name cannot be null")
    @Size(max = 40)
    private String name;

    @NotBlank(message = "Name cannot be null")
    @Size(max = 25)
    private String userName;

    @NaturalId
    @NotBlank
    @Size(max=40)
    @Email
    private String email;

    @NotBlank(message = "password cannot be null")
    @Size(max=100)
    private String password;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name="user_roles",joinColumns = @JoinColumn(name="user_id"),inverseJoinColumns = @JoinColumn(name="role_id"))
    private Set<Role> roles = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public User(){}

    public User(String name, String userName, String email, String password){
        this.name = name;
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
