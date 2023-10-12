mapOf(
        Pair("minSdk", 30),
        Pair("compileSdk", 33),
        Pair("gradleBuildTool",  "8.1.1"),
        Pair("kotlin",  "1.9.0"),
        Pair("hiltCoreVersion", "2.46"),
        Pair("spotlessGradle", "6.1.0")
).entries.forEach {
        project.extra.set(it.key, it.value)
}