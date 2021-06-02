## Mediator Pattern

> 객체관의 관계가 N:M 혹은 복잡하게 구성되어 있을 때 <br> 
> 결합도를 낮추기 위해 Mediator 객체에 위임하는 패턴 

### 📍 절차
- Mediator 인터페이스 추출
    - [x] Sender 와 Receiver 를 이어줄 메소드 정의
    - [x] Receiver 를 받을 메소드 
- Sender 와 Receiver 를 구현
    - [x] 인터페이스 추출 후 세부 구현
 
### 실행 출력
```
[Display] from: Tcp, event => Connect
[Logger] from: Tcp, event => Connect
[Display] from: Tcp, event => [Chat] this is MediatorPattern
[Logger] from: Tcp, event => [Chat] this is MediatorPattern
[Display] from: **System**, event => Chat message emitted
[Logger] from: **System**, event => Chat message emitted
[Display] from: Tcp, event => Disconnect
[Logger] from: Tcp, event => Disconnect
```