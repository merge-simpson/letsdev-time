plugins {
    java
    `maven-publish`
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

// [2] Add task script to publish
publishing {
    publications {
        create<MavenPublication>("letsdev-time") {
            from(components["java"])
            groupId = "com.github.merge-simpson"
            artifactId = project.name
            version = project.version.toString()
        }
    }
}

tasks.publishToMavenLocal.configure {
    // assemble 작업 후 publishToMavenLocal 실행
    //  assemble: 프로젝트의 아티팩트를 생성합니다. (jar 파일 등)
    //  publishToMavenLocal: 빌드된 아티팩트를 로컬 저장소에 저장합니다. (.m2/repository)
    dependsOn("assemble")
}