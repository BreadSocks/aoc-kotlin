plugins {
    kotlin("jvm") version "2.1.0"
}

sourceSets {
    main {
        kotlin.srcDir("src/main/kotlin")
    }
    test {
        kotlin.srcDir("src/test/kotlin")
    }
}

tasks {
    wrapper {
        gradleVersion = "8.11.1"
    }
    test {
        useJUnitPlatform()
    }
}

dependencies {
    implementation("org.junit.jupiter:junit-jupiter:5.11.3")
}
