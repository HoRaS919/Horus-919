plugins { 
    id("com.android.application") 
    id("kotlin-android") 
}

android { 
    compileSdk = 33 

    defaultConfig { 
        applicationId = "com.example.horus" 
        minSdk = 21 
        targetSdk = 33 
        versionCode = 1 
        versionName = "1.0" 
    } 

    buildTypes { 
        getByName("release") { 
            isMinifyEnabled = false 
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro") 
        } 
    } 
}

dependencies { 
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.5.31") 
    implementation("androidx.appcompat:appcompat:1.3.1") 
    implementation("com.google.android.material:material:1.4.0") 
    implementation("androidx.constraintlayout:constraintlayout:2.1.0") 
}