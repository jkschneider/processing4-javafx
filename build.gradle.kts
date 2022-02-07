plugins {
  `java`
  `maven-publish`
   id("org.openjfx.javafxplugin") version "0.0.10"
}

javafx {
    version = "17"
    modules = listOf("javafx.controls")
}

repositories {
  mavenCentral()
  mavenLocal()
}

dependencies {
  implementation("com.jkschneider:processing4:4.0-b5")
}

sourceSets {
  main {
      java {
          setSrcDirs(listOf("src"))
      }
  }
}

publishing {
  publications {
      create<MavenPublication>("maven") {
          groupId = "com.jkschneider"
          artifactId = "processing4-javafx"
          version = "4.0-b5"

          from(components["java"])
      }
  }
}
