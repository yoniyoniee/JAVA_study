# 예외처리
### 오류(Error)
- 회복 불가능한 문제
- 시스템 레벨 또는 환경적인 문제

### 예외(Exception)
- 회복 가능한 문제
- 예외 발생 가능성 인지하고 대응
- 컴파일 에러
  - .java 파일을 .class 파일로 컴파일할때 발생하는 에러
  - 언어 문법 틀렸을 때 발생
  - 확인된 예외 (Checked Exception)
    - 컴파일 시점에 확인하는 예외
    - 반드시 예외 처리
- 런타임 에러
  - “프로그램”이 실행도중 맞닥뜨리게 되는 예외
  - 미확인된 예외 (Unchecked Exception)
    - 예외 처리가 반드시 필요하지 않은 예외

## 예외 발생

### 예외정의
```
class OurBadException extends Exception {
	public OurBadException() {
		super("위험한 행동을 하면 예외처리를 꼭 해야합니다!");
	}
}
```
### 메서드 위험 알리기 throw, throws

```
class OurClass {
    private final Boolean just = true;
		
		// 신규 문법 throws!
    public void thisMethodIsDangerous() throws OurBadException {
        if (just) {
						// 신규 문법 throw!
            throw new OurBadException();
        }
    }
}
```
### 예외 핸들링 try-catch-finally
```
public static void main(String[] args) {
        OurClass ourClass = new OurClass();

        try {
            // 위험한 메소드 시도   
            ourClass.thisMethodIsDangerous();
            
        } catch (OurBadException e) {
        
            // try 구문 실행하다 예외가 발생시 handling
            System.out.println(e.getMessage());
            
        } finally {
        
            // 예외의 발생 여부와 상관없이, 무조건 실행
            System.out.println("우리는 방금 예외를 handling 했습니다!");
        }

    }
```

---

---

# Generic
- 타입 언어에서 중복되거나 필요없는 코드를 줄여준다
- 타입 안저성 유지
- 클래스/메서드 이름 뒤에 <> 문법 안에 들어가야 할 타입 변수를 지정

```
public class Generic<T> { ... }

Generic<String> stringGeneric = new Generic<>();
```

- 객체의 static 멤버에 사용 할 수 없다.
- 다수의 타입변수를 사용 할 수 있다.
```
public class Generic<T, U, E> {
    public E multiTypeMethod(T t, U u) { ... }
}


Generic<Long, Integer, String> instance = new Generic();
instance.multiTypeMethod(longVal, intVal);
```

---

# List, 배열
### List
- 순서가 있고, 중복을 허용
- 원소들의 모임

### 배열
- 순서대로 번호가 붙은 원소들이 연속적인 형태로 구성된 구조
- 특정한 메모리 공간에 나열

---

# Wrapper
- 기본값을 객체화 하는것을 박싱, 객체를 다시 기본값으로 만드는 것을 언박싱
```
Integer num = new Integer(17);  // Boxing
int n = num.intValue(); // UnBoxing

Character ch = 'X'; // AutoBoxing
char c = ch; // AutoUnBoxing
```

