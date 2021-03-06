package com.ilyashutko.buspark.dal;

import com.ilyashutko.buspark.model.Role;
import com.ilyashutko.buspark.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
