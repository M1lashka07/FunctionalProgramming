package profile

import kotlinx.serialization.json.Json
import java.io.File

object ProfilesRepository {

    private val file = File("profiles.json")
    private val _profiles = loadProfiles()
    val profiles: List<Person>
        get() = _profiles.toList()

    private fun loadProfiles(): List<Person> {

        return Json.decodeFromString(file.readText().trim())

    }

}