package com.project.Controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.Entities.Payment;
import com.project.Services.PaymentService;
@RestController  
@CrossOrigin("http://127.0.0.1:3306")
public class PaymentController {

	@Autowired
	PaymentService manager;
	
	@GetMapping(value = "api/Payments")
	 public List<Payment> showPayments()
	 {
		  return manager.getPayments(); 
		
	 }
	
	 @GetMapping(value = "api/PaymentsById/{pid}")
	 public Optional<Payment> getPayment(@PathVariable int pid)
	 {
		Optional<Payment> p=manager.getPayment(pid);
		return p;
	 }
	 
	
	 @DeleteMapping(value = "api/Payments/{pid}")
	 public void removePayment(@PathVariable int pid)
	 {
		manager.delete(pid);
	 }
	 
	 
	 @PutMapping(value = "api/Payments/{pid}")
	 public void updatePayment(@RequestBody Payment Payment,@PathVariable int pid)
	 {
	
		manager.update(Payment,pid);
	 }
	 
	 
	 @PostMapping(value = "api/Payments")
	 public void addPayment(@RequestBody Payment Payment)
	 {
		
		manager.addPayment(Payment);
	 }
	 
}