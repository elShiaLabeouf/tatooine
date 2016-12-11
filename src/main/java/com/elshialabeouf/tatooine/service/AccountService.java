package com.elshialabeouf.tatooine.service;


import com.elshialabeouf.tatooine.domain.Account;

/**
 * Created by admin on 22.11.2016.
 */

public interface AccountService {

    Account findByUsername(String username);
    Account findByEmail(String email);

}
