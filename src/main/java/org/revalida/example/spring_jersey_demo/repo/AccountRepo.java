package org.revalida.example.spring_jersey_demo.repo;

import org.revalida.example.spring_jersey_demo.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepo extends JpaRepository<Account, Long>{

}
