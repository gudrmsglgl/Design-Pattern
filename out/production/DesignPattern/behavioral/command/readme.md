## Command Pattern
> Strategy 패턴과 유사하나 <br>
> Strategy 패턴은 같은 일을 다른 알고리즘을 적용할 때 <br> 
> Command 다른 일을 처리하거나 종합적으로 처리할 때

### 📍 절차
- 명령 인터페이스 정의
- 명령 세부화
    - [x] 처리할 receiver 한테 작업 양도
- Invoker 에서 필요한 작업들 실행

### 실행 출력
```
음료: 아메리카노(2잔) { 옵션: 디카페인, 샷: 2 }, 가격: 8000
음료: 라떼(1잔) { 옵션: 샷: 2 }, 가격: 4500
음료: 모카라뗴(1잔) { 옵션: 없음 }, 가격: 3500
총 가격: 16000

16000원 결제 요청 되었습니다.
배달 요청
주문 제작 요청
```    

