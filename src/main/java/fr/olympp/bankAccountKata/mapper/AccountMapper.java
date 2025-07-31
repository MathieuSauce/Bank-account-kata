package fr.olympp.bankAccountKata.mapper;

import fr.olympp.bankAccountKata.domain.Account;
import fr.olympp.bankAccountKata.dto.AccountDTO;

public class AccountMapper {

	public static AccountDTO toAccountDTO(Account account) {
		return AccountDTO.builder()
				.id(account.getId())
				.balance(account.getBalance())
				.build();
	}
	
	public static Account toAccount (AccountDTO accountDTO) {
		Account account = new Account();
		account.setId(accountDTO.getId());
		account.setBalance(account.getBalance());
		return account;
	}
}
