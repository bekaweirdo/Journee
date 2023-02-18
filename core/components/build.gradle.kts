plugins {
    id("CommonPlugin")
}

dependencies {

    api(platform(libs.compose.bom))
    api(libs.bundles.compose)
    debugApi(libs.bundles.compose.debug)

    api(libs.bundles.lyfecycle)
    api(libs.coil)

    androidTestApi(platform(libs.compose.bom))
    androidTestApi(libs.bundles.test.android)
}