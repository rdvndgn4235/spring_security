package com.rd.spring_security.auth;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * Created at 30.05.2022.
 *
 * @author Ridvan Dogan
 */
public class ApplicationUser implements UserDetails {
    private final Collection<? extends GrantedAuthority> grantedAuthorities;
    private final String password;
    private final String username;
    private final boolean isEnabled;
    private final boolean isAccountNonExpired;
    private final boolean isAccountNonLocked;
    private final boolean isCredentialsNonExpired;

    public ApplicationUser(
                            String username,
                            String password,
                            Collection<? extends GrantedAuthority> grantedAuthorities,
                            boolean isEnabled,
                            boolean isAccountNonExpired,
                            boolean isAccountNonLocked,
                            boolean isCredentialsNonExpired) {
        this.grantedAuthorities = grantedAuthorities;
        this.password = password;
        this.username = username;
        this.isEnabled = isEnabled;
        this.isAccountNonExpired = isAccountNonExpired;
        this.isAccountNonLocked = isAccountNonLocked;
        this.isCredentialsNonExpired = isCredentialsNonExpired;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return grantedAuthorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return isAccountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return isAccountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return isCredentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }
}
