package eu.karols.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eu.karols.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}