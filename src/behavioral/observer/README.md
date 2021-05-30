## Observer Pattern

> 객체가 상태에 대한 변경사항을 게시할 수 있도록 사용

### 📍 절차
- 인터페이스 추출
- 구체적으로 구현할 클래스 추출
- 관찰하고자 하는 클래스 추출
   - [x] 인터페이스 속성으로 갖음
   - [x] 변경할 값을 by Delegates 로 처리 -> 변경 전 후 값을 인터페이스로 넘김 

### 실행 출력
```
oldText: $41 -> newText: LA Town <br>
oldText size: 3 -> newText size: 7
```
``