fun main(args: Array<String>) {
    val str = "May the force be with you."

    // multi line string
    val rawCrawl = """|A long time ago
        |in a galaxy
        |far far away
        |BUM BUMM BUMMMM""".trimMargin("|")
    println(rawCrawl)

    val contentEquals = str.contentEquals("May the force be with you.")
    println(contentEquals)  // out: true

    val contains = str.contains("Force", true)
    println(contains)   // out: true

    val uppercase = str.toUpperCase()
    val lowercase = str.toLowerCase()
    println(uppercase)
    println(lowercase)

    val subSequence = str.subSequence(4, 13)
    println(subSequence) // out: the force

    // string templates
    val luke = "Luke Skywalker"
    val lightSaberColor = "green"
    val vehicle = "landspeeder"
    println("$luke has a $lightSaberColor lightsaber and drives a $vehicle")
    println("$luke contains ${luke.length} characters")
}