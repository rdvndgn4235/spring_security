package com.rd.spring_security.security;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created at 27.05.2022.
 *
 * @author Ridvan Dogan
 */
public enum UserRole {
    STUDENT,
    ADMIN,
    ADMIN_TRAINEE;
}
