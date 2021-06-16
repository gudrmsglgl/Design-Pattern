## Singleton Pattern
> 매번 새로운 객체를 생성하지 않고 <br> 
> 오직 하나의 객체만 생성하어 사용하려고 할때 사용한다.

### 📍 절차
- 파라미터가 필요 없는 싱글톤
  - [x] object 
- 파라미터가 필요한 싱글톤
  - [x] companion object 
       - var instance
       - fun getInstance(param)    
    
### 실행 출력
```
Singleton Pattern: Type: No Parameter -> Object 
Singleton Pattern: Type: Parameter(싱글톤패턴) -> Like Java Singleton
```             