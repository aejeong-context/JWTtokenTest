package com.token.domains.users.application;

import com.token.domains.users.application.dto.UserRequest;
import com.token.domains.users.domain.UsersEntity;
import com.token.domains.users.domain.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UsersRepository usersRepository;

    public Optional<UsersEntity> findByUserId(String userId) {
        return usersRepository.findByUserId(userId);
    }

    public UsersEntity signUp(UserRequest userRequest) {

        return usersRepository.save(UsersEntity.builder().pw(userRequest.getUserPw()).userId(userRequest.getUserId()).build());
    }

    public List<UsersEntity> findUsers(){
        return usersRepository.findAll();
    }
}
