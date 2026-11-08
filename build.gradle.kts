plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

// Optional: set a repository secret named YOUTUBE_API_KEY to bake the key into the APK.
// If it is empty, the app asks for the key on first launch instead.
val youtubeApiKey: String = System.getenv("YOUTUBE_API_KEY") ?: ""

android {
    namespace = "com.mytube.app"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.mytube.app"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        buildConfigField("String", "DEFAULT_API_KEY", "\"$youtubeApiKey\"")
    }

    buildFeatures {
        buildConfig = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.recyclerview:recyclerview:1.3.2")
    implementation("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")
    implementation("com.github.bumptech.glide:glide:4.16.0")
    // Official YouTube IFrame player wrapped in a WebView (follows YouTube's terms)
    implementation("com.pierfrancescosoffritti.androidyoutubeplayer:core:12.1.0")
}
