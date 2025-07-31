package fr.olympp.bankAccountKata.dto;

import java.math.BigDecimal;

import fr.olympp.bankAccountKata.domain.Action;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TransactionDTO {

	private long id;
	private long senderId;
	private long recipientId;
	private BigDecimal amount;
	private Action action;

	
}
