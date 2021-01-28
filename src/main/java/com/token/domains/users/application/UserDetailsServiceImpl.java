//package com.token.domains.users.application;
//
//import com.token.domains.users.domain.MyUserDetails;
//import com.token.domains.users.domain.UsersRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.Collections;
//
//@RequiredArgsConstructor
//@Service("userDetailsService")
//public class UserDetailsServiceImpl implements UserDetailsService {
//
//    private final UsersRepository usersRepository;
//
//    @Override
//    public MyUserDetails loadUserByUsername(String userId) {
//        return usersRepository.findByUserId(userId).map(usersEntity ->
//                new MyUserDetails(usersEntity, Collections.singleton(
//                        new SimpleGrantedAuthority(usersEntity.getRole().getValue())))).orElseThrow(() -> new UsernameNotFoundException(userId));
//    }
//}
