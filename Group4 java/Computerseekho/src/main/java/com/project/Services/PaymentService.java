package com.project.Services;



import java.util.List;
import java.util.Optional;

import com.project.Entities.Payment;

public interface PaymentService {

		void addPayment(Payment p);
		List<Payment> getPayments();
		void delete(int paymentId);
		void update(Payment Payment,int id);
		Optional<Payment> getPayment(int id);
		

}