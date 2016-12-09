package com.elshialabeouf.tatooine.repos;

import com.elshialabeouf.tatooine.domain.Account;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by admin on 20.11.2016.
 */
@Repository("accountRepository")
public interface AccountRepository extends CrudRepository<Account, Long> {


}
