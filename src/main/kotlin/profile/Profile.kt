package profile

fun main() {

    ProfilesRepository.profiles
        .filter { it.age > 25 }
        .filter { it.gender == Gender.MALE }
        .filter { it.firstName.startsWith("A") }
        .filter { it.age < 30 }
        .transform { it.copy(age = it.age + 1) }
        .forEach(::println)

}

fun <R> List<Person>.transform(operation: (Person) -> R ): List<R> {

    val result = mutableListOf<R>()

    this.forEach {
        result.add(operation(it))
    }

    return result
}

fun List<Person>.filter (isSuitable: (Person) -> Boolean): List<Person> {

    val result = mutableListOf<Person>()

    this.forEach { profile ->
        if (isSuitable(profile)) {
            result.add(profile)
        }
    }

    return result

}