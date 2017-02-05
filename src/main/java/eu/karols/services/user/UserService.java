package eu.karols.services.user;

import java.util.Collection;
import java.util.Optional;

import eu.karols.domain.User;
import eu.karols.forms.UserCreateForm;

public interface UserService {

    Optional<User> getUserById(long id);
    Optional<User> getUserByLogin(String login);
    Optional<User> getUserByName(String name);
    Optional<User> getUserByEmail(String email);
    Collection<User> getAllUsers();

    User findUserByLogin(String login);
    User create(UserCreateForm form);
    void deleteById(Long id);
}
