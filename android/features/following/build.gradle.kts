import util.libs

plugins {
    `android-feature-plugin`
}

android {
    namespace = "com.thomaskioko.tvmaniac.following"
}

dependencies {
    api(project(":shared:core:ui"))
    api(project(":shared:core:util"))
    api(project(":shared:domain:show-details:api"))
    api(project(":shared:domain:show-common:api"))

    implementation(project(":shared:core:database"))
    implementation(projects.android.common.compose)

    implementation(libs.accompanist.insetsui)
}
