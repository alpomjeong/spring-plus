# SPRING PLUS

# LV.1-1. 코드 개선 퀴즈 - @Transactional의 이해
* TodoService의 Transactional 에서 readonly=true 삭제 하여 해결.
* 수정, 추가 부분 :
* TodoService.java

# LV 1-2. 코드 추가 퀴즈 - JWT의 이해
* User 엔티티, AuthUser 등 nickname 필드 추가 및 호출 부들 모두 수정,
* JwtUtil에서 토큰 생성시 닉네임을 집어넣게함
* AuthService에서 저장된 유저 정보에서 닉네임을 꺼내서 response하게 함
* 수정, 추가 부분 : 
* AuthUserArgumentResolver.java
* JwtUtil.java       
* SignupRequest.java
* SigninResponse.java
* AuthService.java
* User.java

# LV 1-3. 코드 개선 퀴즈 -  JPA의 이해
* JPQL 쿼리로 조건을 걸어서 처리함
* 수정, 추가 부분 :
* TodoController.java
* TodoRespository.java
* TodoService.java

# LV 1-4. 테스트 코드 퀴즈 - 컨트롤러 테스트의 이해
* 기존 200 Ok를 400으로 바꿔서 해결함
* 수정, 추가 부분 :
* TodoControllerTest.java

# LV 1-5. 코드 개선 퀴즈 - AOP의 이해
* 기존 어노테이션을 @Before("execution(* org.example.expert.domain.user.controller.UserAdminController.changeUserRole(..))")로
* 바꿔서 해결함
* 수정, 추가 부분 :
* AdminAccessLoggingAspect.java

# LV 2-1. JPA Cascade
* @OneToMany(mappedBy = "todo", cascade = CascadeType.PERSIST, orphanRemoval = true) 설정
* 수정, 추가 부분 :
* Todo.java

# LV 2-2. N+1
* @Query("SELECT c FROM Comment c JOIN FETCH c.user WHERE c.todo.id = :todoId") 페치 조인으로 해결
*  수정, 추가 부분 :
* CommentRepository.java

# LV 2-3. QueryDSL
* 쿼리 dsl 관련 의존성 추가 후 커스텀 리포지토리 생성하여 해결
* 수정, 추가 부분 :
* build.gradle
* QueryDslConfig.java
* TodoRepositoryCustom.java
* TodoRepositoryCustomImpl.java

# LV 2-4 Spring Security
* 시큐리티 관련 의존성 추가 후 Security 설정하여 해결
* 수정, 추가 부분 :
* build.gradle
* JwtUtil.java
* SecurityConfig.java
* JwtAuthenticationFilter.java
* UserRole.java