package fr.olympp.bankAccountKata.mapper;

import fr.olympp.bankAccountKata.domain.Transaction;
import fr.olympp.bankAccountKata.dto.TransactionDTO;

public class TransactionMapper {

	
	public static TransactionDTO toTransactionDTO(Transaction transaction) {
		return TransactionDTO.builder()
				.id(transaction.getId())
				.senderId(transaction.getSenderId())
				.recipientId(transaction.getRecipientId())
				.amount(transaction.getAmount())
				.action(transaction.getAction())
				.build();
	}
	
	public static Transaction toTransaction(TransactionDTO transactionDTO) {
		Transaction transaction = new Transaction();
		transaction.setId(transactionDTO.getId());
		transaction.setSenderId(transactionDTO.getSenderId());
		transaction.setRecipientId(transaction.getRecipientId());
		transaction.setAmount(transactionDTO.getAmount());
		transaction.setAction(transactionDTO.getAction());
		return transaction;
	}
}
