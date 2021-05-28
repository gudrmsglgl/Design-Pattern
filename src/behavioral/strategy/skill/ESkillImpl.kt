package behavioral.strategy.skill

class ESkillImpl : Skill {

    override fun isExecute(key: String): Boolean = key.toLowerCase() == "e"

    override fun execute() {
        println("E Skill Execute")
    }

    override fun isEqualSkill(skill: Skill): Boolean = skill is ESkillImpl

}