package net.proselyte.springsecurityapp.service;


import org.apache.catalina.User;

/**
 *  Service class for {@link net.proselyte.springsecurityapp.model.User}
 *
 * @author Xujaniyozov Daler
 */
public interface UserService {
    void save(net.proselyte.springsecurityapp.model.User user);

    void save(User user);

    net.proselyte.springsecurityapp.model.User findByUsername(String usernaem);

}
