## Abstract Factory Pattern
> 어떤 연관된 클래스들을 팩토리를 통하여 <br>
> 일관성 있게 객체생성이 가능하도록 그룹으로 묶어 제공하고 <br> 
> 변경도 유연하도록 제공한다. <br>
> -> 같은 부류인데 각각 세세하게 다른 객체를 생성할 때 생성 
### 📍 절차
- 각각 필요한 행동 특성등을 정의
- Factory 에서 위에 정의한 속성 행동등을 일관성 있게 정의
- 각각의 Factory 를 구현하여 위의 필요한 속성과 행동을 정의함
- 하나의 통합 클래스에서 Factory 를 주입받아 Factory 에서 정의한 것 실행   
    
### 실행 출력
```
shape: Transparent, textStyle: Bold, textSize: 20, SingleClick
shape: Oval, textStyle: normal, textSize: 15, SelectorClick
shape: Rectangle, textStyle: normal, textSize: 15, ToggleClick
```            