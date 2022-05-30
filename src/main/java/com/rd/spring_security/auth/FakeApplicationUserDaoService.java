package com.rd.spring_security.auth;

import com.rd.spring_security.security.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * Created at 30.05.2022.
 *
 * @author Ridvan Dogan
 */
@Repository("fake")
public class FakeApplicationUserDaoService implements ApplicationUserDao {

    private final PasswordEncoder passwordEncoder;

    @Autowired
    public FakeApplicationUserDaoService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Optional<ApplicationUser> selectApplicationUserByUsername(String username) {
        return getApplicationUsers().stream()
                .filter(applicationUser -> applicationUser.getUsername().equals(username))
                .findFirst();
    }

    private List<ApplicationUser> getApplicationUsers() {
        List<ApplicationUser> applicationUsers = Arrays.asList(
                new ApplicationUser(
                        "anna",
                        passwordEncoder.encode("password"),
                        Collections.singletonList(new SimpleGrantedAuthority(UserRole.STUDENT.name())),
                        true,
                        true,
                        true,
                        true
                ),
                new ApplicationUser(
                        "tom",
                        passwordEncoder.encode("password123"),
                        Collections.singletonList(new SimpleGrantedAuthority(UserRole.ADMIN_TRAINEE.name())),
                        true,
                        true,
                        true,
                        true
                ),
                new ApplicationUser(
                        "linda",
                        passwordEncoder.encode("password123"),
                        Collections.singletonList(new SimpleGrantedAuthority(UserRole.ADMIN.name())),
                        true,
                        true,
                        true,
                        true
                )
        );
        return applicationUsers;
    }
}
