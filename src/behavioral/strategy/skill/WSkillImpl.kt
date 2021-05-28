package behavioral.strategy.skill

class WSkillImpl : Skill {

    override fun isExecute(key: String): Boolean = key.toLowerCase() == "w"

    override fun execute() {
        println("W Skill Execute")
    }

    override fun isEqualSkill(skill: Skill): Boolean = skill is WSkillImpl

}