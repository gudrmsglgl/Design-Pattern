## Visitor Pattern
> 로직을 객체 구조에서 분리 시키는 디자인 패턴 <br>
> 비슷한 종류의 객체들을 가진 그룹에서 작업을 수행할 때 사용
> Double Dispatch 하여 클래스를 변경하지 않고 메서드만 추가하는 패턴


### 📍 절차
- 처리할 데이터들 (군집, 그룹) 정의 (Element)
    - [x] 각 Visitor 별 위임 메소드 정의
- Visitor interface 정의
    - [x] 각 군집을 세분화
        - 메소드 오버로딩 (파라미터로 그룹을 세분화)
- 군집 데이터들을 한번에 어떤 것을 처리할지 세분화 (Visitor impl 세분화)
    - [x] 처리하는 클래스를 정의하고 들어온 파라미터 별 세분화처리 
    
### 실행 출력
```
Q Skill Execute
E Skill Execute
R is Ultimate Skill Execute
W Skill Execute
======================after remake======================
Q skill is Remake Skill Execute
E Skill Execute
R is Ultimate Skill Execute
W Skill Execute
```             