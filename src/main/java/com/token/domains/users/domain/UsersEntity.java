package com.token.domains.users.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Getter
@RequiredArgsConstructor
@Table(name = "users")
@Entity
public class UsersEntity{

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String userId;

    private String pw;

    private String refreshToken;

//    @Enumerated(EnumType.STRING)
//    private UserRole role;

    @Builder
    public UsersEntity(String userId, String pw,String refreshToken) {
        this.userId = userId;
        this.pw = pw;
        this.refreshToken = refreshToken;
//        this.role = role;
    }

}
