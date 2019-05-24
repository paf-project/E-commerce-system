package com.DeliveryManagment;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
import org.springframework.transaction.annotation.Isolation; 
import org.springframework.transaction.annotation.Transactional;
import com.DeliveryManagment.Delivery; 
import com.DeliveryManagment.DeliveryRepository;; 

@Service public class DeliveryDAO { 
 
	@Autowired  
	DeliveryRepository deliveryRepository;    
 
	/* SAVE AN DELIVERY */ 
	@Transactional(readOnly = false,isolation = Isolation.READ_COMMITTED)  
	public Delivery save(Delivery Del) {   
		return deliveryRepository.save(Del);  
		 
	}
 
	/* SEARCH ALL DELIVERY */  
	public List<Delivery> findAll(){   
		return deliveryRepository.findAll();  
	}    
	
	/* GET AN DELIVERY */ 
	public Delivery findOne(Long DelId) {  
		Optional<Delivery> op = deliveryRepository.findById(DelId);   
		if(op.isPresent()) {   
			return op.get();   
			}   else {    
				return null;   
			}  }    
	
	/* DELETE AN DELIVERY by id */  
	@Transactional(readOnly = false,isolation = Isolation.READ_COMMITTED) 
	public void delete(Delivery Del) {   
		deliveryRepository.delete(Del);  
		} 
	}  

