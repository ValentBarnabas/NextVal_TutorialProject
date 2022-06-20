import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.6.8"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    kotlin("jvm") version "1.6.21"
    kotlin("plugin.spring") version "1.6.21"
    kotlin("kapt") version "1.6.21"

    kotlin("plugin.jpa") version "1.3.72"	//makes default ctor for classes
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
//	runtimeOnly("com.h2database:h2")	//include for in memory database
    runtimeOnly("org.postgresql:postgresql:42.3.6")
    testImplementation("org.springframework.boot:spring-boot-starter-test")

    implementation("org.hibernate:hibernate-core")
    implementation("org.hibernate:hibernate-testing")

    //Dependencies for Mapping services
    implementation("org.mapstruct:mapstruct:1.5.1.Final")
    kapt("org.mapstruct:mapstruct-processor:1.5.1.Final")

    implementation(project(":rating-app:rating-app-api"))

    //Dependencies for OpenFeign
    implementation("org.springframework.cloud:spring-cloud-starter-openfeign:3.1.3")
    implementation("org.springframework.cloud:spring-cloud-dependencies:2021.0.3")

}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}