//package com.token.domains.users.domain;
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.experimental.Delegate;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.Collection;
//@AllArgsConstructor
//@Getter
//public class MyUserDetails implements UserDetails {
//    @Delegate
//    private UsersEntity usersEntity;
//    private Collection<? extends GrantedAuthority> authorities;
//
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return authorities;
//    }
//
//    @Override
//    public String getPassword() {
//        return usersEntity.getPw();
//    }
//
//    @Override
//    public String getUsername() {
//        return usersEntity.getUserId();
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//}
