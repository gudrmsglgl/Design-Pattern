## Decorator Pattern

> 객체의 결합을 통해 동적으로 유연하게 확장 할 수 있게 해주는 패턴 <br>
> 기본 기능 외에 필요한 기능 추가 뿐만 아니라 <br>
> 추가 기능의 🚀 조합을 설계 하는 방식이 가능하다.

### 🤔 Decorator Pattern 어떨 때 필요할까
- 스타벅스에서는 같은 커피라도 여러 커스텀이 가능하다.
- 클라이언트의 요구에 따라 같은 커피에서 수많은 경우의 수가 생긴다. 
- 이 때, 커스텀 한 커피를 일일이 클래스로 선언하여 제조하는 것이 아닌
- Decorator pattern 을 사용하면 다양한 경우의 수의 커스텀을 조합하여 생성

![image](https://user-images.githubusercontent.com/16537977/124348155-4e445800-dc23-11eb-870d-448feefeeff1.png)

### 📍 절차
- Component
    - [x] 기본적인 기능을 생각하여 interface 로 추출
- ConcreateComponent
    - [x] 기본적인 기능 구체화 클래스 추출
- Decorator
    - [x] Component <I> 합성 관계로 기본 기능을 Component에게 위임
    - [x] 필요한 구체적 기능을 만들어 기본 기능에 추가
    
### 실행 출력
```
기본 도로 표시
	차선 표시
기본 도로 표시
	교툥량 표시
기본 도로 표시
	차선 표시
	교툥량 표시
```
