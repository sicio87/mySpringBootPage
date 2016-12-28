package eu.karols.services;

import java.util.List;

import eu.karols.domain.User;

public interface UserService {

List<User> findAll();
User findById(Long id);
User create(User user);
User edit(User user);
void deleteById(Long id);

}
