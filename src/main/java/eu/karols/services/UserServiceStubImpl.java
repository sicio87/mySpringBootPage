package eu.karols.services;

import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserServiceStubImpl implements UserService {
    @Override
    public boolean authenticate(String login, String password) {
         // Provide a sample password check: login == password
         return Objects.equals(login, password);
    }
}
