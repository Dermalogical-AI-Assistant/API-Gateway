plugins {
    java
    id("org.springframework.boot") version "3.4.2"
    id("io.spring.dependency-management") version "1.1.7"
}

group = "org.xenwithu"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-autoconfigure:3.4.4")
    implementation("org.springframework.cloud:spring-cloud-starter-gateway:4.2.0")
    implementation("org.springframework.cloud:spring-cloud-gateway-server:4.2.0")
    implementation("org.springframework.boot:spring-boot-starter-webflux:3.4.4")
    implementation("org.springframework.cloud:spring-cloud-starter:4.2.0")
    implementation("io.projectreactor.netty:reactor-netty:1.1.12")

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")

}

tasks.withType<Test> {
    useJUnitPlatform()
}