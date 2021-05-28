package behavioral.strategy.skill

class RemakeQImpl(qSkill: Skill) : Skill by qSkill {
    override fun execute() {
        println("Q skill is Remake Skill Execute")
    }
}