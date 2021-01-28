package com.token.commons.Jwt;

import com.token.domains.users.domain.UsersEntity;
import io.jsonwebtoken.*;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TokenUtils {
    private static final String secretKey = "secretKey";

    public static String generateJwtToken(UsersEntity usersEntity) {
        JwtBuilder builder = Jwts.builder()
                .setSubject(usersEntity.getUserId())
                .setHeader(createHeader())
                .setClaims(createClaims(usersEntity))
                .setExpiration(createExpireDate())
                .signWith(SignatureAlgorithm.HS256, createSigningKey());

        return builder.compact();
    }
    public static boolean isValidToken(String token) {
        try {
            Claims claims = getClaimsFormToken(token);
            System.out.println("expireTime: "+ claims.getExpiration());
            System.out.println("userId: "+ claims.get("userId"));
            return true;
        } catch (ExpiredJwtException exception) {
            System.out.println("Token Expired");
            // 토큰 재발급
            return false;
        } catch (JwtException exception) {
            System.out.println("Token Tampered");

            return false;
        } catch (NullPointerException exception) {
            System.out.println("Token is null");

            return false;
        }
    }
    // 유효기간 1일
    private static Date createExpireDate(){
        return new Date(System.currentTimeMillis()+1*(1000*60*60*24));
    }

    private static Map<String, Object> createHeader() {
        Map<String, Object> header = new HashMap<>();

        header.put("typ", "JWT");
        header.put("alg", "HS256");
        header.put("regDate", System.currentTimeMillis());

        return header;
    }

    private static Map<String,Object> createClaims(UsersEntity usersEntity){
        Map<String,Object> claims = new HashMap<>();
        claims.put("userId",usersEntity.getUserId());
        return claims;
    }
    private static Key createSigningKey() {
        byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(secretKey);
        return new SecretKeySpec(apiKeySecretBytes, SignatureAlgorithm.HS256.getJcaName());
    }
    private static Claims getClaimsFormToken(String token){
        return Jwts.parser().setSigningKey(DatatypeConverter.parseBase64Binary(secretKey))
                .parseClaimsJws(token).getBody();
    }
}
