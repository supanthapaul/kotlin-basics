fun main(args: Array<String>) {

    // IMMUTABLE list / array
    val languages = listOf("C", "Java", "Kotlin", "python", "javascript")
    println(languages.sorted()) // sort
    println(languages[2])   // get element by index
    println(languages.last())   // get last element
    println(languages.contains("Java")) // checks if contains an element

    // MUTABLE list / array
    val companies = arrayListOf("Google", "Apple", "Microsoft", "Intel", "Oracle")
    println(companies.size) // get array size
    companies.add("Vodafone")   // add to the end
    println(companies)
    companies.add(0, "MSI") // add to a specific index
    println(companies)
    println(companies.indexOf("Google"))    // get index of element
    companies.remove("Vodafone")    // remove by element
    println(companies)
    companies.removeAt(2)   // remove by index
    println(companies)

    // IMMUTABLE Maps
    val phonebook = mapOf("Supantha" to 7718738004, "Dad" to 7001341662)
    println(phonebook["Dad"])   // get value by key
    println(phonebook.getOrDefault("Mom", 8900110708))  // get value by key, if not found returns defaultValue

    // MUTABLE Maps
    val changablePhonebook = hashMapOf("Mom" to 9434609916)
    changablePhonebook["Mom"] = 8900110708  // change a value with the key
    changablePhonebook.put("Sis", 7076631636)   // add a new key/value pair
    println(changablePhonebook)
    changablePhonebook.remove("Mom")    // remove a key/value pair by the key
    println(changablePhonebook)
}