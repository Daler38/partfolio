package net.proselyte.springsecurityapp.service;

/**
 * Service for Security
 *
 * @author Daler Xujaniyozov
 */
public interface SecurityService {
    String findLoggedIdUsername();

    void autoLogin(String username, String password);

}
