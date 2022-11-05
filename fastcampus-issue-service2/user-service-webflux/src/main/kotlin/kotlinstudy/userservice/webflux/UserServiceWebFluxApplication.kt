package kotlinstudy.userservice.webflux

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class UserServiceWebFluxApplication

fun main(args: Array<String>) {
    runApplication<UserServiceWebFluxApplication>(*args)
}
