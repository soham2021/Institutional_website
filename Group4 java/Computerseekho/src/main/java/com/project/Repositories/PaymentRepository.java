package com.project.Repositories;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.Entities.Payment;


@Repository
@Transactional
public interface PaymentRepository extends JpaRepository<Payment,Integer> 
{
	
	@Modifying
	@Query("update Payment f set f.paymentDate=:paymentDate, f.courseFee=:courseFee,f.studentPaymentId=:studentPaymentId, f.amount=:amount, f.balance=:balance, f.paymentType=:paymentType where f.paymentId = :paymentId")
	void update(@Param("paymentDate") Date paymentDate,@Param("courseFee")long courseFee,@Param("studentPaymentId") int studentPaymentId, @Param("amount") long amount, @Param("balance")long balance, @Param("paymentType") String paymentType,@Param("paymentId")int paymentId);
	
}