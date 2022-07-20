import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.springframework.boot.gradle.plugin.SpringBootPlugin

plugins {
    id("org.springframework.boot") version "2.7.1" apply false
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    id("maven-publish")
    kotlin("jvm") version "1.6.21"
    kotlin("plugin.spring") version "1.6.21"
    kotlin("kapt") version "1.6.21"
}

allprojects {
    group = "com.example"
    version = "0.0.1-SNAPSHOT"
    java.sourceCompatibility = JavaVersion.VERSION_17

    repositories {
        mavenLocal()
        mavenCentral()
    }
}

subprojects {
    apply(plugin = "kotlin")
    apply(plugin = "kotlin-apt")
    apply(plugin = "kotlin-spring")
    apply(plugin = "maven-publish")
    apply(plugin = "io.spring.dependency-management")

    dependencies {
        implementation("org.jetbrains.kotlin:kotlin-reflect")
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    }

    dependencyManagement {
        imports {
            mavenBom(SpringBootPlugin.BOM_COORDINATES)
        }
    }
}

//
//import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
//        import org.springframework.boot.gradle.plugin.SpringBootPlugin
//
//        plugins {
//            id("org.springframework.boot") version "2.7.1"
//            id("io.spring.dependency-management") version "1.0.11.RELEASE"
//            kotlin("jvm") version "1.6.21"
//            kotlin("plugin.spring") version "1.6.21"
//        }
//
//group = "com.example"
//version = "0.0.1-SNAPSHOT"
//java.sourceCompatibility = JavaVersion.VERSION_17
//
//repositories {
//    mavenCentral()
//}
//
//dependencies {
//    implementation("org.springframework.boot:spring-boot-starter")
//    implementation("org.jetbrains.kotlin:kotlin-reflect")
//    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
//    testImplementation("org.springframework.boot:spring-boot-starter-test")
//}
//
//tasks.withType<KotlinCompile> {
//    kotlinOptions {
//        freeCompilerArgs = listOf("-Xjsr305=strict")
//        jvmTarget = "17"
//    }
//}
//
//tasks.withType<Test> {
//    useJUnitPlatform()
//}
