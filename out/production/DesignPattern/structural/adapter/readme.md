## Adapter Pattern
> 어떤 연관된 클래스들을 팩토리를 통하여 <br>
> 일관성 있게 객체생성이 가능하도록 그룹으로 묶어 제공하고 <br> 
> 변경도 유연하도록 제공한다. <br>
> -> 같은 부류인데 각각 세세하게 다른 객체를 생성할 때 생성

### 시나리오
- 클라이언트는 기존에 차를 이용하여 이동한다.
- 이 때 기차가로 이동수단을 변경할려고 한다.
- problem
  1. 기차와 자동차 인터페이스의 상위 인터페이스 생성
  2. 해당 상위 인터페이스를 클라이언트가 의존하도록 한다.
  3. 위와 같이 리팩터링 시 모든 자동차와 기차의 구현 클래스 의존 코드를 수정해야 한다. ~~(Ex. 자동차 구체 클래스 20개, 기차 구현클래스 20개라면... )~~
  4. 또한 client 의 코드를 수정했으므로 OCP 위반.
- solve
  1. adapter 패턴을 이용하여 호환시켜야하는 인터페이스를 적절하게 위임한다.  
  
   
 
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