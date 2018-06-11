package com.rvfs.challenge.mcc.repository;


import com.rvfs.challenge.mcc.model.Account;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface AccountRepository extends Repository<Account, Long> {

    Optional<Account> findByUsername(String username);

    Optional<Account> findById(Long id);

    Account save(Account account);

    Integer countByUsername(String username);


}
