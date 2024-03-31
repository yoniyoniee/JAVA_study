## Class 클래스는 객체를 만들기 위한 설계도다.

### 객체
- 필드(속성) + 메서드(행위)
- 객체는 메서드 호출을 통해 데이터를 주고 받는다.
- 메서드 괄호 안에 넣는 데이터 -> 파라미터
- 객체들의 관계 : 사용, 포함, 상속 관계

### 객체지향 프로그래밍의 특징
- 캡슐화, 상속, 다형성, 추상화
- 캡슐화
  - encaptulation
  - 필드와 메서드를 하나로 묶어 객체로 만든다.
  - 외부에서 알 수 없게 감춘다.
  - 필요하지 않는 것을 굳이 외부에 노출시키지 않아 혼란을 줄인다.
  - 객체가 변화하지 않게 한다.
  - 접근 제어자를 사용한다.
- 상속
  - 자식 객체, 부모 객체
  - 필드와 메서드를 자식 객체에 물려준다.
  - 코드의 중복 감소, 재사용성 증가
- 다형성
  - 하나의 행위에 대해 각 객체의 고유한 특성에 따라 여러 형태로 재구성
  - 설계도에 따라 구현체를 만든다.
- 추상화
  - 객체의 공통된 부분들을 모아 상위 개념으로 새롭게 선언한다.
  - 공통적이고 중요한 것들을 모아 객체를 모델링한다.

### 객체와 클래스
- 객체를 만들기 위해 클래스(설계도)가 필요하다.
- 인스턴스: 해당 클  래스를 토대로 생성된 객체 -> 과정 -> 인스턴스화
- 동일한 클래스로 여러 인스턴스 생성 가능


## 클래스 설계
- 필드, 생성자 메서드
1. 클래스 선언 : 접근제어자 + class + [클래스 이름]
2. 필드 정의
3. 생성자 정의
4. 메서드 정의


```
// 클래스 선언
public class Car {

    // 필드 정의
    String company; 
    String model; 
    String color;
    double speed;

    // 생성자 정의
    public Car() { 
        System.out.println("생성자 호출");

    } // 생성자 - 생략가능
    
    // 메서드 정의
    double gasPedal(double kmh, char type) { 
        changeGear(type);
        speed = kmh;

        return speed;
    }
}
```



## 객체 생성과 참조형 변수

- 객체 생성
```
new Car();
```

- 참조형 변수
  - Car 클래스의 객체인 car1 인스턴스 생성
```
Car car1 = new Car();
```

- 객체 배열
```
Car[] carArray = new Car[3];
Car car1 = new Car();
car1.changeGear('P');
carArray[0] = car1;
```


## 필드
- 객체의 데이터 정의


- 필드 초기값 초기과
```
String model = "Gv80";
```

## 메서드
```
리턴타입 메서드명(매개변수, ...) {
  실행할 코드 작성
}
```
- 매개변수
  - 메서드 호출할 때 메서드로 전달하려는 값을 받기 위해 사용되는 변수
  - 가변길이 매개변수
  ```
  void carSpeeds(double ... speeds) {
    
  }
  ```

### 오버로딩
- 같은 이름의 메서드
- 매개변수의 개수, 타입, 순서가 다름


### 기본형 & 참조형 매개변수
- 기본형 : 매서드 호출할 때 매개값으로 지정한 값을 메서드 매개변수에 복사해서 전달한다.
- 참조형 : 매개값으로 지정한 값의 주소를 매개변수에 복사해서 전달한다.
  - 반환 타입 참조형 = 실제값의 주소
---

## 인스턴스 멤버
- 객체를 생성해야 사용할 수 있다.

## 클래스 멤버
- JAVA 클래스 로더에 의해 메서드 영역에 저장되고 사용된다.
- 객체 생성 없이 사용할 수 있다.

### static
- static 키워드를 사용하여 클래스 멤버로 만들 수 있다.
  - 일반적으로 인스턴스마다 모두 가지고 있을 필요없는 공용적인 데이터를 저장하는 필드는 클래스 멤버로 선언하는 것이 좋다.

```
static String company = "GENESIS"; 

String getCompany() {
    return "(주)" + company;
}
static String setCompany(String companyName) {// System.out.println("자동차 모델 확인: " + model); // 인스턴스 사용 불가
    company = companyName;
    return company;
}
```

```
Car.company = "Audi";
String companyName = Car.setCompany("Benz");
```
- 객체 생성 없이 Car. (도트)연산자로 바로 사용할 수 있다.

### 지역변수
- 메서드 내부에서 선언
- 메서드가 종료될 때까지만 유지된다.

```
public int getNumber() {
        int number = 1; // 지역 변수
        number += 1;
        return number; // 메서드 종료되면 지역변수 제거됨
    }
```

### final 필드와 상수
- final 필드는 초기값이 저장되면 해당값을 프로그램이 실행하는 도중에는 절대로 수정할 수 없다.
- 또한 final 필드는 반드시 초기값을 지정해야 한다.
```angular2html
final String company = "GENESIS";
```
---
## 생성자
- 생성자는 객체가 생성될 때 호출되며 객체를 초기화하는 역할
```
public Car() {} // 선언

...

Car car = new Car(); // 호출
```
- new 연산자에 의해 객체가 생성되면서 Car(); 즉, 생성자가 호출된다.
- 모든 클래스는 반드시 생성자가 하나 이상 존재한다.
  - 기본 생성자 : 괄호( ) 안에 아무것도 넣지 않은 생성
  ###   필드 초기화
    - 객체를 만들때 인스턴스마다 다른 값을 가져야 한다면 생성자를 통해서 필드를 초기화 할 수 있다.
    ```
    public Car(String modelName, String colorName, double priceValue) {
      model = modelName;
      color = colorName;
      price = priceValue;
    }
    ```
    - 이 때 기본 생성자를 호출하면 오류가 난다. 
  
  ### 생성자 오버로딩
  - 매개변수의 개수, 타입 다르게 한다.
--- 

## 접근제어자
- public : 접근 제한 없다.
- protected : 같은 패키지 내에서, 다른 패키지의 자손클래스에서 접근이 가능
- default : 같은 패키지 내에서만 접근이 가능
- private : 같은 클래스 내에서만 접근이 가능
- 사용가능한 접근 제어자
  - 클래스 : `public`, `default`
  - 메서드 & 멤버변수 : `public`, `protected`, `default`, `private`
- `public`, `default`
  - 변경이 없는 상태, 외부에서 필드에 직접 접근하는 것을 막기 위해 사용
  - Getter : 외부에서 읽어올 때 사용
  - Setter : 외부에서 객체의 private 한 필드를 저장/수정할 필요가 있을 때 사용

---

---

# 상속
- 부모 클래스의 필드와 메서드를 자식 클래스에게 물려줄 수 있다.
- 상속을 사용하면 적은 양의 코드로 새로운 클래스를 작성할 수도 있고 공통적인 코드를 관리하여 코드의 추가와 변경이 쉬워질 수도 있다.
- 코드의 중복이 제거되고 재사용성이 크게 증가한다.
- 다중상속을 허용하지 않는다.

  ### extends
  ```
  public class 자식클래스 extends 부모클래스 {
  
  }
  ```
- 부모 클래스에 새로운 필드와 메서드가 추가되면 자식 클래스는 이를 상속받아 사용할 수 있다. 
- 자식 클래스에 새로운 필드와 메서드가 추가되어도 부모 클래스는 어떠한 영향도 받지 않는다.
- 따라서 자식 클래스의 멤버 개수는 부모 클래스보다 항상 같거나 많다.

  ### final 클래스와 메서드
  ```
  public final class Car {}
  
  ...
  
  public class SportsCar extends Car{} // 오류
  ```
  클래스에 final 키워드를 지정하여 선언하면 최종적인 클래스가 됨으로 더 이상 상속할 수 없는 클래스가 된다.
  ```
  public class Car {
  public final void horn() {
  System.out.println("빵빵");
  }
  }
  
  ...
  
  public class SportsCar extends Car{
  public void horn() { // 오류
  super.horn();
  }
  }
  ```
  메서드에 final 키워드를 지정하여 선언하면 최종적인 메서드가 됨으로 더 이상 오버라이딩할 수 없는 메서드가 된다.

  ### Object
  - 모든 클래스들의 최상위 부모 클래스
  - 부모 클래스가 없는 자식 클래스는 컴파일러에 의해 자동으로 Object 클래스를 상속받게 된다.
  
---
## 오버라이딩(재정의)
부모 클래스로부터 상속받은 메서드의 내용을 재정의 하는 것
- 선언부가 부모 클래스의 메서드와 일치해야 한다.
- 접근 제어자를 부모 클래스의 메서드 보다 좁은 범위로 변경할 수 없다.
- 예외는 부모 클래스의 메서드 보다 많이 선언할 수 없다.

  ### super
  - 부모 클래스의 멤버를 참조
  - 부모 클래스의 생성자를 호출

---

## 다형성
- 참조변수 자동 타입변환
  - `부모타입 변수 = 자식타입객체;` 는 자동으로 부모타입으로 변환
- 강제 타입변환
  - 자식타입 변수 = (자식타입) 부모타입객체
  - 자식타입객체가 부모타입으로 자동 타입변환된 후 다시 자식타입으로 변환될 때 만 강제 타입변환이 가능
  ```
  // 자식타입객체가 자동 타입변환된 부모타입의 변수
  Mammal mammal = new Whale();
  mammal.feeding();
  
  // 자식객체 고래의 수영 기능을 사용하고 싶다면
  // 다시 자식타입으로 강제 타입변환을 하면된다.
  Whale whale = (Whale) mammal;
  whale.swimming();
  ```

---

## 추상 클래스
### 추상 클래스
  - 미완성된 설계도
  - 추상 클래스는 자식 클래스에 상속되어 자식 클래스에 의해서만 완성
  ```
  public abstract class 추상클래스명 {
      
  }
  ```

### 추상 메서드
- 아직 구현되지 않은 미완성된 메서드
- 추상 메서드는 일반적인 메서드와는 다르게 블록{ }이 없다.
  - 정의만 할 뿐, 실행 내용은 가지고 있지 않다.
```
public abstract class 추상클래스명 {
		abstract 리턴타입 메서드이름(매개변수, ...);
}
```

### 추상 클래스 상속
- 상속받은 클래스에서 추상 클래스의 추상 메서드는 반드시 오버라이딩 되어야 한다.
```
public class 클래스명 extends 추상클래스명 {
		@Override
    public 리턴타입 메서드이름(매개변수, ...) {
		       // 실행문
    }
}
```

---

# 인터페이스
- 인터페이스의 구현 클래스들은 반드시 정의된 메서드들을 구현
- 구현 클래스들의 동일한 사용 방법과 행위를 보장

```
public interface 인터페이스명 { 

}
```
- 모든 멤버변수는 public static final - 생략가능
- 모든 메서드는 public abstract 

```
public class 클래스명 implements 인터페이스명 { 
			// 추상 메서드 오버라이딩
			@Override
	    public 리턴타입 메서드이름(매개변수, ...) {
			       // 실행문
	    }
}
```
- 인터페이스의 추상 메서드는 구현될 때 반드시 오버라이딩 

### 인터페이스 상속
- 클래스와는 다르게 다중상속 가능
```
public class Main implements C {

    @Override
    public void a() {
        System.out.println("A");
    }

    @Override
    public void b() {
	    System.out.println("B");  
    }
}

interface A {
    void a();
}
interface B {
    void b();
}
interface C extends A, B { }
```

---

## default 메서드
- 추상 메서드의 기본적인 구현을 제공하는 메서드
- 추상 메서드가 아니기 때문에 인터페이스의 구현체들에서 필수로 재정의 할 필요 없다.
```
public class Main implements A {

    @Override
    public void a() {
        System.out.println("A");
    }


    public static void main(String[] args) {
        Main main = new Main();
        main.a();

        // 디폴트 메서드 재정의 없이 바로 사용가능합니다.
        main.aa();
    }
}

interface A {
    void a();
    default void aa() {
        System.out.println("AA");
    }
}
```

---
## static 메서드
- 객체 없이 호출이 가능
```
public class Main implements A {

    @Override
    public void a() {
        System.out.println("A");
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.a();
        main.aa();
        System.out.println();

        // static 메서드 aaa() 호출
        A.aaa();
    }
}
```
---

## 다형성
- 인터페이스 변수 = 구현객체
- 구현객체타입 변수 = (구현객체타입) 인터페이스변수
