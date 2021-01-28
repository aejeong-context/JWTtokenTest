package com.token.commons.Jwt;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@RequiredArgsConstructor
public class JwtTokenInterceptor implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {

        System.out.println("JwtToken 호출");
        String token = request.getHeader("AUTH_TOKEN");
        System.out.println("header is :" + token);

        if (token != null) {
            if (TokenUtils.isValidToken(token)) {
                return true;
            }
        }
        response.setStatus(401);
        return false;
    }
}
