fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val filteredList = list.filter { it % 2 != 0 } 
    println(list) // Output: [1, 2, 3, 4, 5] (original list unchanged)
    println(filteredList) // Output: [1, 3, 5] (new filtered list)

    val set = mutableSetOf(1, 2, 3, 4, 5)
    val filteredSet = set.filter { it % 2 != 0 }.toSet() // toSet() needed for Set
    println(set) // Output: [1, 2, 3, 4, 5] (original set unchanged)
    println(filteredSet) // Output: [1, 3, 5] (new filtered set)

    val map = mutableMapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four", 5 to "five")
    val filteredMap = map.filter { it.key % 2 != 0 } 
    println(map) // Output: {1=one, 2=two, 3=three, 4=four, 5=five} (original map unchanged)
    println(filteredMap) // Output: {1=one, 3=three, 5=five} (new filtered map)
} 