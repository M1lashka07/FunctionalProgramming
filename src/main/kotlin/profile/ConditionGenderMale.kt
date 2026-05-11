package profile

class ConditionGenderMale: Condition {

    override fun isSuitable(person: Person): Boolean {
        return person.gender == Gender.MALE
    }
}