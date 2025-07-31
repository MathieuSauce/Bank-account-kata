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
public class Account {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Nonnull
	private BigDecimal balance;
	
	public Account() {
		this.balance = BigDecimal.ZERO;
	}

	
	
}
