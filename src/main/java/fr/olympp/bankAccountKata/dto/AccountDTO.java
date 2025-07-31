package fr.olympp.bankAccountKata.dto;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountDTO {

	private long id;
	private BigDecimal balance;
	
	
	
}
