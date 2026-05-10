package profile

import kotlinx.serialization.json.Json
import java.io.File

fun main() {

    ProfilesRepository.profiles.forEach(::println)

}
