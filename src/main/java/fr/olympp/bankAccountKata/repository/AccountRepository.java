package fr.olympp.bankAccountKata.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.olympp.bankAccountKata.domain.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long>{

}
