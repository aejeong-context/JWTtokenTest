//package com.token.commons.security;
//
//import com.token.domains.users.domain.MyUserDetails;
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//import javax.annotation.Resource;
//
//@RequiredArgsConstructor
//public class CustomAuthenticationProvider implements AuthenticationProvider {
//    @Resource(name="userDetailsService")
//    private UserDetailsService userDetailsService;
//    private final BCryptPasswordEncoder passwordEncoder;
//
//    @Override
//    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//        UsernamePasswordAuthenticationToken token = (UsernamePasswordAuthenticationToken) authentication;
//        String id = token.getName();
//        String pw = (String) token.getCredentials();
//
//        UserDetails userDetails = userDetailsService.loadUserByUsername(id);
//        if(!passwordEncoder.matches(pw, userDetails.getPassword())){
//            throw new BadCredentialsException(userDetails.getUsername()+"Invalid password");
//        }
//        return new UsernamPa(userDetails,pw,userDetails.getAuthorities());
//    }
//
//    @Override
//    public boolean supports(Class<?> authentication) {
//        return authentication.equals(UsernamePasswordAuthenticationToken.class);
//    }
//}
