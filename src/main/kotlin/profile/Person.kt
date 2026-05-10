package profile

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Person(
    @SerialName("id") val id: Int,
    @SerialName("address") val address: String,
    @SerialName("age") val age: Int,
    @SerialName("email") val email: String,
    @SerialName("first_name") val firstName: String,
    @SerialName("gender") val gender: Gender,
    @SerialName("last_name") val lastName: String,
    @SerialName("phone_number") val phoneNumber: String
)