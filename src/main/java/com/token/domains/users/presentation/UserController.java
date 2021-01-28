package com.token.domains.users.presentation;

import com.token.commons.Jwt.TokenUtils;
import com.token.domains.users.application.UserService;
import com.token.domains.users.application.dto.TokenResponse;
import com.token.domains.users.application.dto.UserRequest;
import com.token.domains.users.domain.UsersEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

    @PostMapping("/user/signUp")
    public ResponseEntity<TokenResponse> signUp(@RequestBody UserRequest userRequest) {

        return userService.findByUserId(userRequest.getUserId()).isPresent() ? ResponseEntity.badRequest().build() :
                ResponseEntity.ok(TokenResponse.builder().ACCESS_TOKEN((TokenUtils.generateJwtToken(userService.signUp(userRequest)))).build());
    }

    @GetMapping("/info")
    public ResponseEntity<List<UsersEntity>> findUser(){
        return ResponseEntity.ok().body(userService.findUsers());

    }


}
