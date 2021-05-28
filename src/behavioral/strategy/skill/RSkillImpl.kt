package behavioral.strategy.skill

class RSkillImpl : Skill {

    override fun isExecute(key: String): Boolean = key.toLowerCase() == "r"

    override fun execute() {
        println("R is Ultimate Skill Execute")
    }

    override fun isEqualSkill(skill: Skill): Boolean = skill is RSkillImpl

}