package com.project.Entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity

public class Payment {
    private int paymentId;
    private Date paymentDate;
    private long courseFee;
    private int studentPaymentId;
    private long amount;
    private long balance;
    private String paymentType;
    
    
    public Payment()
    {
    	
    }
      
    
    public Payment(int paymentId, Date paymentDate, long courseFee, int studentPaymentId, long amount, long balance,
			String paymentType) {
		super();
		this.paymentId = paymentId;
		this.paymentDate = paymentDate;
		this.courseFee = courseFee;
		this.studentPaymentId = studentPaymentId;
		this.amount = amount;
		this.balance = balance;
		this.paymentType = paymentType;
	}



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getPaymentId() {
        return paymentId;
    }
    
    public Date getPaymentDate() {
        return paymentDate;
    }
    
    public long getCourseFee() {
        return courseFee;
    }
    
  
    
    public long getAmount() {
        return amount;
    }
    
    public long getBalance() {
        return balance;
    }
    
    public int getStudentPaymentId() {
		return studentPaymentId;
	}

	public void setStudentPaymentId(int studentPaymentId) {
		this.studentPaymentId = studentPaymentId;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getPaymentType() {
        return paymentType;
    }
    
    // Setters
    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }
    
    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }
    
    public void setCourseFee(long courseFee) {
        this.courseFee = courseFee;
    }
}