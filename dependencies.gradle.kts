mapOf(
        Pair("minSdk", 30),
        Pair("compileSdk", 33),
        Pair("gradleBuildTool",  "8.1.1"),
        Pair("kotlin",  "1.9.0"),
        Pair("hiltCoreVersion", "2.46"),
        Pair("hiltVersion", "1.0.0"),
        Pair("spotlessGradle", "6.1.0"),
        Pair("retrofitVersion", "2.9.0"),
        Pair("coroutinesVersion", "1.6.0"),
        Pair("materialVersion", "1.9.0"),
        Pair("fragmentVersion", "1.6.1"),
        Pair("navigationVersion", "2.7.4"),
        Pair("lifecycleVersion", "2.6.2"),
        Pair("roomVersion", "2.5.2"),
        Pair("archCompomentVersion", "2.2.0"),
        Pair("bindablesVersion", "1.0.9"),
        Pair("appCompat", "1.6.1"),
        Pair("sandwichVersion", "1.2.2"),
        Pair("firebaseBom", "32.4.0"),
).entries.forEach {
        project.extra.set(it.key, it.value)
}