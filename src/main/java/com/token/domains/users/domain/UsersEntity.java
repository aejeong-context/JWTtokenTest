package com.token.domains.users.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Getter
@RequiredArgsConstructor
@Table(name = "users")
@Entity
public class UsersEntity {

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private Long id;

  private String userId;

  private String pw;

  @Builder
  public UsersEntity(String userId, String pw) {
    this.userId = userId;
    this.pw = pw;
  }
}
