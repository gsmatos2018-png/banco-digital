package br.com.digitalbanco.model;
import jakarta.persistence.*;
import java.time.LocalDateTime;
@Entity @Table(name="customers") public class Customer {
@Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
@Column(nullable=false) private String name;
@Column(nullable=false,unique=true) private String email;
@Column(nullable=false) private String password;
@Column(nullable=false,unique=true) private String cpf;
private LocalDateTime createdAt=LocalDateTime.now();
public Long getId(){return id;} public String getName(){return name;} public void setName(String v){name=v;} public String getEmail(){return email;} public void setEmail(String v){email=v;} public String getPassword(){return password;} public void setPassword(String v){password=v;} public String getCpf(){return cpf;} public void setCpf(String v){cpf=v;}
}