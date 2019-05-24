package com.DeliveryManagment;

import java.io.Serializable;
import javax.persistence.Entity; 
import javax.persistence.EntityListeners; 
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import org.springframework.data.jpa.domain.support.AuditingEntityListener; 

@Entity @Table(name="Deliveries") @EntityListeners(AuditingEntityListener.class) public class Delivery  implements Serializable{ 
	 
	 private static final long serialVersionUID = 1143993377101043360L; 
	 
	 @Id  
	 @GeneratedValue(strategy=GenerationType.AUTO)  
	 private Long agentID;  
	 private String date;  
	 private String weight;  
	 private String qty; 
	 private String ServiceCompany;
	 private String totalValue;
	 
	public Long getAgentID() {
		return agentID;
	}
	public void setAgentID(Long agentID) {
		this.agentID = agentID;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	public String getServiceCompany() {
		return ServiceCompany;
	}
	public void setServiceCompany(String serviceCompany) {
		ServiceCompany = serviceCompany;
	}
	public String getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(String totalValue) {
		this.totalValue = totalValue;
	}
}



