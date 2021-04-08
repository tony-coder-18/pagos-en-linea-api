package com.example.demo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity	
@Table(name="transactions")
public class Transaction {
@Id
private Long id;
@Column
private Long client_identification;
@Column
private String client_direction;
@Column
private Long products_value;

public Transaction(){ }
public Transaction(Long id, Long client_identification, String client_direction, Long products_value) {
this.id=id;
this.client_identification=client_identification;
this.client_direction=client_direction;
this.products_value=products_value;
}
public Long getId() {
return id;
}
public void setId(Long id) {
this.id = id;
}
public Long getClient_identification() {
return client_identification;
}
public void setClient_identification(Long client_identification) {
this.client_identification = client_identification;
}
public String getClient_direction() {
return client_direction;
}
public void setClient_direction(String client_direction) {
this.client_direction = client_direction;
}
public Long getProducts_value() {
return products_value;
}
public void setProducts_value(Long products_value) {
this.products_value = products_value;
}
}