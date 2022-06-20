//import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.6.8"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    kotlin("plugin.spring") version "1.6.21"

    kotlin("jvm") version "1.6.21"
    `java-library`
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")

    //Dependencies for OpenFeign
    implementation("org.springframework.cloud:spring-cloud-starter-openfeign:3.1.3")
    implementation("org.springframework.cloud:spring-cloud-dependencies:2021.0.3")
}

repositories {
    mavenCentral()
}

tasks.named<Jar>("jar") {
    enabled = true
}

tasks.named<Jar>("bootJar") {
    enabled = false
}