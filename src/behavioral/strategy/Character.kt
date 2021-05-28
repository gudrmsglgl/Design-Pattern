package behavioral.strategy

import behavioral.strategy.skill.Skill

class Character {

    val skills = mutableListOf<Skill>()

    fun executeSkill(key: String) {
        skills
            .find { it.isExecute(key) }
            ?.also {
                it.execute()
            }
    }

    fun remakeSkill(param: Skill) {
        skills.apply {
            removeAll { param.isEqualSkill(it) }
            add(param)
        }
    }

}