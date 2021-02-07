# tokenTest
공부용으로 작성된 코드입니다!

자세한 설명은 아래의 링크를 참고해주세요.

👉 https://joanaup.tistory.com/entry/Spring-boot-JWT-RefreshToken-%EA%B5%AC%ED%98%84%ED%95%98%EA%B8%B0

부족한 코드 입니다 PR 해주시면 감사합니다 🥰

#Test POSTMAN

### HEADER
ACCESS_TOKEN
 
### API ULR 

SignUp - POST
/user/signUp

id,pw를 입력받아 회원가입을 한다.

ACCESS_TOKEN, REFRESH_TOKEN 발행하여 return
REFRESH_TOKEN은 서버에서 저장

SignIn - POST
/user/signIn

ACCESS_TOKEN 이 만료될 경우 다시 로그인을 할 경우 해당 유저의 REFRESH_TOKEN을 확인 후 
ACCESS_TOKNE을 재발급 해줍니다.

Info - GET 
/info

ACCESS_TOKEN이 유효할 때 정보 조회가 가능합니다.
