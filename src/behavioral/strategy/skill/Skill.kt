package behavioral.strategy.skill

interface Skill {
    fun isExecute(key: String): Boolean
    fun execute()
    fun isEqualSkill(skill: Skill): Boolean
}