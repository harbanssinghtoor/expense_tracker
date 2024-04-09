package com.project.expensetracker.repository;

import com.project.expensetracker.entities.UserInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserInfo, String> {
        public UserInfo findByUsername(String username);
}
