package fr.olympp.bankAccountKata;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import fr.olympp.bankAccountKata.domain.Account;
import fr.olympp.bankAccountKata.dto.AccountDTO;
import fr.olympp.bankAccountKata.repository.AccountRepository;
import fr.olympp.bankAccountKata.service.AccountService;


@ExtendWith(MockitoExtension.class)
public class AccountServiceTest {
	
	@Mock
	private AccountRepository accountRepository;
	
	@InjectMocks
	private AccountService accountService;
	
	@Test
	void testGetById() throws Exception {
		Account account = new Account();
		account.setId(1L);
		account.setBalance(BigDecimal.valueOf(1000));
		
		when(accountRepository.findById(1L)).thenReturn(Optional.of(account));
		
		AccountDTO result = accountService.getById(1L);
		assertEquals(1L, result.getId());
		assertEquals(BigDecimal.valueOf(1000), result.getBalance());
		verify(accountRepository).findById(1L);
	}

}
