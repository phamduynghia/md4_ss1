package com.ra.md4_ss1_bt1.model.service;

import com.ra.md4_ss1_bt1.model.entity.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAll();
    Account saveAccount(Account account);
    void deleteAccount(Account account);
    Account findById(long id);
}