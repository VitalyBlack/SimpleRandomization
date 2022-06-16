plugins {
    java
}

group = "org.simpleLib"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {

    implementation("org.jeasy:easy-random-core:5.0.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}