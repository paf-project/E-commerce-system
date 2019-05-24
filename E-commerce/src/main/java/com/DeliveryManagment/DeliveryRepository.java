package com.DeliveryManagment;

//Modify package according to your project 
import org.springframework.data.jpa.repository.JpaRepository; 
import com.DeliveryManagment.Delivery; 

public interface DeliveryRepository  extends JpaRepository <Delivery, Long> {

}
