package fastcampus.userservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class FactcampusUserServiceApplication

fun main(args: Array<String>) {
    runApplication<FactcampusUserServiceApplication>(*args)
}