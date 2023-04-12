val ktorVersion = "2.2.2"

plugins {
    kotlin("multiplatform")
    id("com.android.library")
    kotlin("plugin.serialization") version "1.8.20"

    kotlin("native.cocoapods")
    id("co.touchlab.faktory.kmmbridge") version "0.3.7"
    `maven-publish`
}

version = "0.1"
kotlin {
    android()

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.4.0")
                implementation("io.ktor:ktor-client-core:$ktorVersion")
                implementation("io.ktor:ktor-client-content-negotiation:$ktorVersion")
                implementation("io.ktor:ktor-serialization-kotlinx-json:$ktorVersion")
            }
        }

        val iosMain by creating {
            dependsOn(commonMain)
            dependencies {
                implementation("io.ktor:ktor-client-darwin:$ktorVersion")
            }
        }
    }

    ios()
//    iosSimulatorArm64()
    cocoapods {
        summary = "KMMBridgeSampleKotlin"
        homepage = "https://touchlab.dev"
        ios.deploymentTarget = "13"
    }
}

android {
    compileSdk = 32

    defaultConfig {
        minSdk = 21
        targetSdk = 32
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

addGithubPackagesRepository()
kmmbridge {
    mavenPublishArtifacts()
    githubReleaseVersions()
    spm()
    cocoapods("git@github.com:ionel71089/PublicPodspecs.git")
    versionPrefix.set("0.8")
}