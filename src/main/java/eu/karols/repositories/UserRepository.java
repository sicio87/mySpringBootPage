package eu.karols.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

import eu.karols.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
//	User getUserByConfirmationId(String confirmationId);
//	User getUserByLogin(String login);
	User findUserByLogin(String login);
	Optional<User> findOneByLogin(String login);
	Optional<User> findOneByName(String name);
	Optional<User> findOneByEmail(String email);
}