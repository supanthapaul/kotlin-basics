fun main(args: Array<String>) {
    val companies = arrayListOf("Google", "Apple", "Microsoft", "Intel", "Oracle")
    val changablePhonebook = hashMapOf("Mom" to 9434609916, "Supantha" to 7718738004, "Dad" to 7001341662)

    // looping through array
    for (company in companies) {
        println("Company - $company")
    }

    // looping through maps
    for ((key, value) in changablePhonebook) {
        println("$key: $value")
    }

    // while loop
    var x = 10
    while (x > 0) {
        println(x)
        x--
    }
}