package behavioral.strategy.skill

class QSkillImpl : Skill {

    override fun isExecute(key: String): Boolean = key.toLowerCase() == "q"

    override fun execute() {
        println("Q Skill Execute")
    }

    override fun isEqualSkill(skill: Skill): Boolean = skill is QSkillImpl

}