package com.DeliveryManagment;

import java.util.List; 
import javax.validation.Valid; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.http.ResponseEntity; 
import org.springframework.web.bind.annotation.DeleteMapping; 
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.PutMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController; 
import com.DeliveryManagment.DeliveryDAO; 
import com.DeliveryManagment.Delivery; 

@RestController 
@RequestMapping("/DeliveryDET") 
public class Controller {   
	@Autowired  DeliveryDAO deliveryDAO; 

 
     /* SAVE AN EMPLOYEE */ 
      @PostMapping("/deliveries")  
      public Delivery createDelivery(@Valid @RequestBody Delivery Del) {   
    	  return deliveryDAO.save(Del);  
    	  }   
      
      /* GET ALL EMPLOYEES*/ 
      @GetMapping("/deliveries")  
      public List<Delivery> getAllDelivery(){  
    	  return deliveryDAO.findAll();  
    	  }    
      /* GET EMPLOYEE BY ID */  
      @GetMapping("/deliveries/{agentID}")  
      public ResponseEntity<Delivery> getDeliveryById(@PathVariable(value="agentID") Long DelID){   
    	  Delivery Del = deliveryDAO.findOne(DelID);      
    	  
    	  if(Del==null) {    
    		  return ResponseEntity.notFound().build();   
    		  }   
    	  return ResponseEntity.ok().body(Del);      
      }
	
     /* UPDATE AN EMPLOYEE BY ID */  
      @PutMapping("/deliveries/{agentID}")  
      public ResponseEntity<Delivery> updateDelivery(@PathVariable(value="agentID") Long DelID, 
    @Valid @RequestBody Delivery delDetails){  
    	  
    	  Delivery Del=deliveryDAO.findOne(DelID);      
    	  
    	  if(Del==null) {    
    		  return ResponseEntity.notFound().build();  
    	}   
    	Del.setDate(delDetails.getDate());   
    	Del.setWeight(delDetails.getWeight());   
    	Del.setQty(delDetails.getQty());
    	Del.setServiceCompany(delDetails.getServiceCompany());   
    	Del.setTotalValue(delDetails.getTotalValue());
    	
    	Delivery updaDeliver=deliveryDAO.save(Del);     
    	return ResponseEntity.ok().body(updaDeliver);   
    	
      }
    	
    	/*DELETE AN EMPLOYEE*/ 
      @DeleteMapping("/deliveries/{agentID}")  
      public ResponseEntity<Delivery> deleteDelivery(@PathVariable(value="agentID") Long DelID){  
    	  Delivery Del = deliveryDAO.findOne(DelID);   
    	  if(Del==null) {    
    		  return ResponseEntity.notFound().build();  
    		  }   
    	  deliveryDAO.delete(Del);   
    	  return ResponseEntity.ok().build();  
    	  }
      }


