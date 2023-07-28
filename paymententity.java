package com.example.demo.entity;
import jakarta.persistence.*;

@Entity
@Table(name="payment")

public class paymententity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int card_Number;
	private String card_Holder;
	private String expiry_Date;
	private int cvv;
	

	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getCard_Number() {
		return card_Number;
	}



	public void setCard_Number(int card_Number) {
		this.card_Number = card_Number;
	}



	public String getCard_Holder() {
		return card_Holder;
	}



	public void setCard_Holder(String card_Holder) {
		this.card_Holder = card_Holder;
	}



	public String getExpiry_Date() {
		return expiry_Date;
	}



	public void setExpiry_Date(String expiry_Date) {
		this.expiry_Date = expiry_Date;
	}



	public int getCvv() {
		return cvv;
	}



	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	



	public paymententity(int id,int card_Number, String card_Holder, String expiry_Date, int cvv) {
		super();
		this.id=id;
		this.card_Number = card_Number;
		this.card_Holder = card_Holder;
		this.expiry_Date = expiry_Date;
		this.cvv = cvv;
	}



	public paymententity() {
	
		
	}

}