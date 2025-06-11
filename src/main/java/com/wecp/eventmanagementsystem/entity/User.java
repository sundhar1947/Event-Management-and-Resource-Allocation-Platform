package com.wecp.eventmanagementsystem.entity;
 
 
import javax.persistence.*;
 
@Entity
@Table(name = "users") // do not change table name
 
public class User {
    // implement entity
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userID;
    private String username;
    private String password;
    private String email;
    private String role;
 
   
    public User() {
    }
 
    public User(Long userID, String username, String password, String email, String role) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
    }
 
    public Long getUserID() {
        return userID;
    }
 
    public void setUserID(Long userID) {
        this.userID = userID;
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
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
 
    public String getRole() {
        return role;
    }
 
    public void setRole(String role) {
        this.role = role;
    }
}
 