package com.rd.spring_security.auth;

import java.util.Optional;

/**
 * Created at 30.05.2022.
 *
 * @author Ridvan Dogan
 */
public interface ApplicationUserDao {
    public Optional<ApplicationUser> selectApplicationUserByUsername(String username);
}
