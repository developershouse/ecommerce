package org.sid.secservice.repo;

import org.sid.secservice.entities.AppUser;
import org.sid.secservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
