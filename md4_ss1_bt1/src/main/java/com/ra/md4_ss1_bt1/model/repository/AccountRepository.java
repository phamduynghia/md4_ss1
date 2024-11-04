package com.ra.md4_ss1_bt1.model.repository;

import com.ra.md4_ss1_bt1.model.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
