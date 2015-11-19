# AndroidLoggingLibrariesUsage

Demostrates the usage of some logging libraries.

Consider the next points:

 - Include the following classpath at /build.gradle:

```
buildscript {
    repositories {
        maven { url "https://jitpack.io" }
        mavenCentral()
    }
    dependencies {
        classpath 'com.jakewharton.hugo:hugo-plugin:1.2.1'
    }
}

allprojects {
    repositories {
        maven { url "https://jitpack.io" }
        mavenCentral()
    }
}
```
 - Add the hugo plugin after the android application plugin at /app/build.gradle:

```
    apply plugin: 'com.android.application'
    apply plugin: 'com.jakewharton.hugo'
```

 - Include the following dependency at /app/build.gradle:

```
dependencies {
    compile 'com.github.orhanobut:logger:1.12'
}
```

### Version
1.0


