mapOf(
        Pair("minSdk", 30),
        Pair("compileSdk", 33),
        Pair("gradleBuildTool",  "8.1.1")
).entries.forEach {
        project.extra.set(it.key, it.value)
}