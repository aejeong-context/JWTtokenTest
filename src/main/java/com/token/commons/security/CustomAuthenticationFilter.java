//package com.token.commons.security;
//
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.token.commons.exception.InputNotFoundException;
//import com.token.domains.users.domain.UsersEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//// 요청이 왔을 때 해당 class 로 요청이 먼저 오게 되고, 아이디 비밀번호 기반으로
//// UserPasswordAuthenticationToken 을 발급해주어야 한다.
//
//public class CustomAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
//    public CustomAuthenticationFilter(AuthenticationManager authenticationManager){
//        super.setAuthenticationManager(authenticationManager);
//    }
//
//    @Override
//    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
//        UsernamePasswordAuthenticationToken authenticationToken;
//
//        try{
//            UsersEntity user = new ObjectMapper().readValue(request.getInputStream(),UsersEntity.class);
//            authenticationToken = new UsernamePasswordAuthenticationToken(user.getId(),user.getPw());
//        }catch (IOException exception){
//            throw new InputNotFoundException();
//        }
//        setDetails(request,authenticationToken);
//
//        return this.getAuthenticationManager().authenticate(authenticationToken);
//    }
//}
