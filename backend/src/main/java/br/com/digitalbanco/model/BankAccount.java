package br.com.digitalbanco.model;
import jakarta.persistence.*; import java.math.BigDecimal;
@Entity @Table(name="bank_accounts") public class BankAccount {
@Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
@Column(nullable=false,unique=true) private String accountNumber;
@Column(nullable=false,precision=15,scale=2) private BigDecimal balance=BigDecimal.ZERO;
@OneToOne(optional=false) @JoinColumn(name="customer_id",unique=true) private Customer customer;
public Long getId(){return id;} public String getAccountNumber(){return accountNumber;} public void setAccountNumber(String v){accountNumber=v;} public BigDecimal getBalance(){return balance;} public void setBalance(BigDecimal v){balance=v;} public Customer getCustomer(){return customer;} public void setCustomer(Customer v){customer=v;}
}