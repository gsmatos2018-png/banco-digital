package br.com.digitalbanco.model;
import jakarta.persistence.*; import java.math.BigDecimal; import java.time.LocalDateTime;
@Entity @Table(name="bank_transactions") public class BankTransaction {
@Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @Column(nullable=false) private String type; @Column(nullable=false,precision=15,scale=2) private BigDecimal amount; private String description; private LocalDateTime createdAt=LocalDateTime.now(); @ManyToOne(optional=false) private BankAccount account;
public Long getId(){return id;} public String getType(){return type;} public void setType(String v){type=v;} public BigDecimal getAmount(){return amount;} public void setAmount(BigDecimal v){amount=v;} public String getDescription(){return description;} public void setDescription(String v){description=v;} public LocalDateTime getCreatedAt(){return createdAt;} public BankAccount getAccount(){return account;} public void setAccount(BankAccount v){account=v;}
}