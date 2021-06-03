package behavioral.memento

fun main(){

    val originator = Originator("tutorial","1")
    println("현재: $originator")

    val careTaker = CareTaker()
    careTaker.saving(originator)

    originator.modifyState("tutorial","2")
    println("변경: $originator")

    careTaker.restoring(originator)
    println("복구: $originator")
}