package com.rd.spring_security.security;

/**
 * Created at 27.05.2022.
 *
 * @author Ridvan Dogan
 */
public enum UserPermission {
    STUDENT_READ("student:read"),
    STUDENT_WRITE("student:write"),
    COURSE_READ("course:read"),
    COURSE_WRITE("course:write");

    private final String permission;

    UserPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() { 
        return permission;
    }
}
