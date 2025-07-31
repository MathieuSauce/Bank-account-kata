package fr.olympp.bankAccountKata.domain;

import java.math.BigDecimal;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Transaction {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Nonnull
	private long senderId;
	

	private long recipientId;
	
	@Nonnull
	private BigDecimal amount;
	
	@Nonnull
	private Action action;

	
}
