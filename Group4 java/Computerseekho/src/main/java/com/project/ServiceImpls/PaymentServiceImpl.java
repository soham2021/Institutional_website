package com.project.ServiceImpls;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Entities.Payment;
import com.project.Repositories.PaymentRepository;
import com.project.Services.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	PaymentRepository repository;
	
	public void addPayment(Payment p) {
		// TODO Auto-generated method stub
		
		repository.save(p);
	}

	public List<Payment> getPayments() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	public void update(Payment Payment, int PaymentId) {
		// TODO Auto-generated method stub
		repository.update(Payment.getPaymentDate(),Payment.getCourseFee(),Payment.getStudentPaymentId(),Payment.getAmount(),Payment.getBalance(),Payment.getPaymentType(),Payment.getPaymentId());
	}

	public Optional<Payment> getPayment(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	
}

