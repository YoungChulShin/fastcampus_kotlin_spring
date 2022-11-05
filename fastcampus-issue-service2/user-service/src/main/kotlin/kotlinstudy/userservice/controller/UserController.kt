package kotlinstudy.userservice.controller

import kotlinstudy.userservice.model.*
import kotlinstudy.userservice.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/users")
class UserController(
    val userService: UserService,
) {

    @PostMapping("/signup")
    suspend fun signUp(@RequestBody request: SignUpRequest) {
        userService.signUp(request)
    }

    @PostMapping("/signin")
    suspend fun signIn(@RequestBody request: SignInRequest) : SignInResponse {
        return userService.signIn(request)
    }

    @DeleteMapping("/logout")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    suspend fun logout(@AutoToken token: String) {
        userService.logout(token)
    }

    @GetMapping("/me")
    suspend fun get(@AutoToken token: String) : MeResponse {
        return MeResponse(userService.getByToken(token))
    }

    @GetMapping("/{userId}/username")
    suspend fun getUsername(
        @PathVariable userId: Long) : Map<String, String> {
        return mapOf("reporter" to userService.get(userId).username)
    }
}