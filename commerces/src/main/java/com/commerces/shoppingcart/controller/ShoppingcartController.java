package com.commerces.shoppingcart.controller;

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
import com.commerces.shoppingcart.dao.ShoppingcartDAO;
import com.commerces.shoppingcart.model.ShoppingCart;

@RestController
@RequestMapping("/shopping")
public class ShoppingcartController {
@Autowired
ShoppingcartDAO shoppingcartDAO;

/* SAVE AN EMPLOYEE */
@PostMapping("/items")
public ShoppingCart createEmployee(@Valid @RequestBody ShoppingCart itm) {
return shoppingcartDAO.save(itm);
}

/* GET ALL EMPLOYEES*/
@GetMapping("/items")
public List<ShoppingCart> getAllItem(){
return shoppingcartDAO.findAll();
}
/* GET EMPLOYEE BY ID */
@GetMapping("/items/{id}")
public ResponseEntity<ShoppingCart> getShoppingCartById(@PathVariable(value="id") Long
itmId){
ShoppingCart itm = shoppingcartDAO.findOne(itmId);
if(itm==null) {
return ResponseEntity.notFound().build();
}
return ResponseEntity.ok().body(itm);
}
/* UPDATE AN EMPLOYEE BY ID */
@PutMapping("/items/{id}")
public ResponseEntity<ShoppingCart> updateShoppingCart(@PathVariable(value="id") Long itmId,
@Valid @RequestBody ShoppingCart itmDetails){
ShoppingCart itm= shoppingcartDAO.findOne(itmId);
if(itm==null) {
return ResponseEntity.notFound().build();
}
itm.setName(itmDetails.getName());
itm.setQty(itmDetails.getQty());

ShoppingCart updaShoppingCart=shoppingcartDAO.save(itm);
return ResponseEntity.ok().body(updaShoppingCart);
}
/*DELETE AN EMPLOYEE*/
@DeleteMapping("/items/{id}")
public ResponseEntity<ShoppingCart> deleteShoppingCarte(@PathVariable(value="id") Long itmId){
ShoppingCart itm = shoppingcartDAO.findOne(itmId);
if(itm==null) {
return ResponseEntity.notFound().build();
}
shoppingcartDAO.delete(itm);
return ResponseEntity.ok().build();
}
}