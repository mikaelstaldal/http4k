description = "http4k incubator module"

dependencies {
    api(project(":http4k-core"))
    api(project(":http4k-format-moshi"))
    api(Square.moshi.adapters)
    implementation(project(mapOf("path" to ":http4k-testing-webdriver")))
    compileOnly(Testing.junit.jupiter.api)

    testImplementation(project(":http4k-client-apache"))

    testImplementation("dev.forkhandles:values4k:_")

    testImplementation(testFixtures(project(":http4k-common")))
    testImplementation(project(path = ":http4k-testing-approval"))
    testImplementation(testFixtures(project(":http4k-contract")))
}
