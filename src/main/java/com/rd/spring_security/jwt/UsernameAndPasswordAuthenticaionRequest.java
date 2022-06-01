package com.rd.spring_security.jwt;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created at 30.05.2022.
 *
 * @author Ridvan Dogan
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsernameAndPasswordAuthenticaionRequest {
    private String username;
    private String password;
}
