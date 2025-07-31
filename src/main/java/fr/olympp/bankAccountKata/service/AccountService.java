package fr.olympp.bankAccountKata.service;

import org.springframework.stereotype.Service;

import fr.olympp.bankAccountKata.domain.Account;
import fr.olympp.bankAccountKata.dto.AccountDTO;
import fr.olympp.bankAccountKata.mapper.AccountMapper;
import fr.olympp.bankAccountKata.repository.AccountRepository;

@Service
public class AccountService {

	private final AccountRepository accountRepository;
	
	public AccountService(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}
	
	public AccountDTO getById(long id) throws Exception {
		Account account = accountRepository.findById(id)
				.orElseThrow(() -> new Exception("Account with id " + id +"not found"));
		return AccountMapper.toAccountDTO(account);
	}
	
	public AccountDTO create(AccountDTO accountDTO) {
		Account savedAccount = accountRepository.save(AccountMapper.toAccount(accountDTO));
		return AccountMapper.toAccountDTO(savedAccount);
	}
}
