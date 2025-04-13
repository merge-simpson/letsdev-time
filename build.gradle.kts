plugins {
    java
}

group = "me.letsdev"
version = "0.1.0-rc1"

repositories {
    mavenCentral()
}

dependencies {

}

tasks.test {
    useJUnitPlatform()
}