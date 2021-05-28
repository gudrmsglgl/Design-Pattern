package behavioral.strategy

import behavioral.strategy.skill.*

fun main(){

    val character = Character().apply {
        skills.addAll(
            listOf(QSkillImpl(), WSkillImpl(), ESkillImpl(), RSkillImpl())
        )
    }

    with (character) {
        executeSkill("q")
        executeSkill("e")
        executeSkill("r")
        executeSkill("w")

        println("======================after remake======================")

        remakeSkill(RemakeQImpl(QSkillImpl()))
        executeSkill("q")
        executeSkill("e")
        executeSkill("r")
        executeSkill("w")
    }

}