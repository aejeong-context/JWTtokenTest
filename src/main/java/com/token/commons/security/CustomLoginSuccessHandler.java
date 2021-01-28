//package com.token.commons.security;
//
//import com.token.domains.users.domain.MyUserDetails;
//import com.token.domains.users.domain.UsersEntity;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//public class CustomLoginSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {
//    @Override
//    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws ServletException, IOException {
//        // 해당 유저의 아이디로 Jwt token을 만드는 과정?
//        // TODO: 2021/01/27 이해해야함
//        UsersEntity user = ((MyUserDetails)authentication.getPrincipal()).getUsersEntity();
//        String token = TokenUtils.generateJwtToken(user);
//
//        response.addHeader("Authorization","BEARER"+""+token);
//    }
//}
