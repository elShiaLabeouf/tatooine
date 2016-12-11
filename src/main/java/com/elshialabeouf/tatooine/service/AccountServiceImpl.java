package com.elshialabeouf.tatooine.service;

import com.elshialabeouf.tatooine.domain.Account;
import com.elshialabeouf.tatooine.repos.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * Created by admin on 09.12.2016.
 */

@Service("accountService")
@Transactional
public class AccountServiceImpl implements AccountService{

    List<Account> accountList;

    @Autowired
    private AccountRepository accountRepository;

    public AccountServiceImpl(){
        accountList = StreamSupport.stream(findAll().spliterator(),false).collect(Collectors.toList());
    }
    @Override
    public Account findByUsername(String username) {
        return null;//accountList.stream().filter((Account a)-> a.getUsername()==username).;
    }

    @Override
    public Account findByEmail(String email) {
        return null;
    }

    private Iterable<Account> findAll(){
        return accountRepository.findAll();
    }
}
