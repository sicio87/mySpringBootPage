package eu.karols.services;

public interface LoginService {
    boolean authenticate(String login, String password);
}
