## Memento Pattern

> 객체 내부 상태를 저장하므로써 객체 상태가 변경되었을 때 이전 상태로의 복구

### 📍 절차
- Originator
    - [x] 현재 State 를 가지고 있음
    - [x] 객체(Memento)로 부터 이전 상태를 복구 
- Caretaker
    - [x] 변경 취소 및 저장에 대해서만 제공 (단일-책임원칙)
    - [x] Memento 들을 가지고 있음 
        - 복구 시 해당 시점 객체를 리턴하기 위해 (to Originator)
 - Memento
    - [x] 상태를 가지고 있는 POJO (snapshot)
### 실행 출력
```
현재: Originator(tutorial, 1)
변경: Originator(tutorial, 2)
복구: Originator(tutorial, 1)
```