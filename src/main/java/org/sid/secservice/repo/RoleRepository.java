package org.sid.secservice.repo;

import org.sid.secservice.entities.Product;
import org.sid.secservice.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
}
