package eu.karols.services;

import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class LoginServiceStubImpl implements LoginService {

    @Override
    public boolean authenticate(String login, String password) {
        return Objects.equals(login, password);
    }
}