package com.tserve.dao;

import com.tserve.pojo.Role;
import com.tserve.pojo.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long>{
    Optional<Role> findByName(RoleName roleName);
}
