description = "Http4k XML support using Jackson as an underlying engine"

dependencies {
    api(project(":http4k-format-core"))
    api(project(":http4k-format-jackson"))
    api(platform("com.fasterxml.jackson:jackson-bom:_"))
    api("com.fasterxml.jackson.dataformat:jackson-dataformat-xml")
    testImplementation(project(":http4k-core"))
    testImplementation(testFixtures(project(":http4k-common")))
    testImplementation(testFixtures(project(":http4k-format-core")))
}
