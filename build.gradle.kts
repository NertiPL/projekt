plugins {
    id("org.jetbrains.kotlin.jvm") version "2.1.10"
    id("com.google.devtools.ksp") version "1.9.10-1.0.13"
    id("com.utopia-rise.godot-kotlin-jvm") version "0.13.1-4.4.1"
}

repositories {
    gradlePluginPortal()
    google()
    mavenCentral()
    maven {
        url = uri("https://maven.pkg.jetbrains.space/utopia-rise/p/godot-kotlin-dev/maven")
    }
}

kotlin {
    jvmToolchain(17)
}

godot {
    registrationFileBaseDir.set(projectDir.resolve("gdj"))
    isRegistrationFileGenerationEnabled.set(true)
}


dependencies {
    implementation("com.utopia-rise:godot-entry-generator:0.13.1-4.4.1")
    implementation("com.utopia-rise:godot-core-library-debug:0.13.1-4.4.1")
    implementation("com.utopia-rise:godot-coroutine-library-debug:0.13.1-4.4.1")
    ksp("com.utopia-rise:godot-kotlin-symbol-processor:0.13.1-4.4.1")
}


tasks.withType<godot.gradle.tasks.GenerateEmbeddedJreTask>().configureEach {
    javaHome = "C:/Program Files/Java/jdk-17"
    modules = arrayOf("java.base", "java.logging")
    arguments = arrayOf("--strip-debug", "--no-header-files", "--no-man-pages")
}

