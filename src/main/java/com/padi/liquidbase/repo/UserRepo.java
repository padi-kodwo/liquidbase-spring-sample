package com.padi.liquidbase.repo;

import com.padi.liquidbase.domain.User;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepo extends PagingAndSortingRepository<User, String>, CrudRepository<User, String>, JpaSpecificationExecutor<User> {
}
