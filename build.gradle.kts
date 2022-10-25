plugins {
    `java-library`
}

group = "com.intelligt.modbus"
version = "1.2.9.7"
buildDir = file(".build")

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

sourceSets {
    main {
        java {
            srcDir("$rootDir/src")
        }
    }

    test {
        java {
            srcDir("$rootDir/examples")
        }
    }
}

repositories {
    mavenCentral()
    flatDir { dirs("$rootDir/lib") }
}

dependencies {

    api("com.fazecast:jSerialComm:2.9.2")

    implementation(group = "", name = "androidthings-1.0")
    implementation(group = "", name = "purejavacomm")
    implementation(group = "", name = "RXTXcomm")
    implementation(group = "", name = "jssc-2.8.0")
}


tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}

tasks.wrapper {
    gradleVersion = "7.5.1"
    distributionType = Wrapper.DistributionType.ALL
}
