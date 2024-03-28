```
public class Main {

    public static void main(String[] args) {
        System.out.println("Our First Project! :");

    }
}
```

## main 메소드
- 자바 프로젝트는 제일 먼저 클래스의 main 메소드를 실행시킨다.

## static
- 프로그램이 시작될 때 무조건 실행된다.

## void
- 메서드의 출력 값의 데이터 타입
- 출력 값 없음

## (String[] args)
- 매개변수 자리


## 객체
- 특징(속성, 변수) + 행동(메소드)


println : 줄바꿈 o
print : 줄바꿈 x


## 변수
### 저장공간 타입 + 저장공간 이름
```
int number = 10;
```
- 저장공간의 선언
- 변하는 저장공간

## 상수
- 변하지 않는 값

```angular2html
final int number;
```

## 기본형 변수
숫자, 문자, Boolean...

  ### 1. 논리형 변수: boolean (true/false)
    
```
 boolean flag = true;
 flag = false;
```
  ### 2. 문자형 변수 : char
- 문자 하나만 저장
- 홑따옴표
     
```
char alpabet = 'A';
```
  ### 3. 정수형 변수 : byte < short < int < long
```
byte byteNumber = 127;
short shortNumber = 32767;
...
```
  ### 4. 실수형 변수 : float(4byte), double(8byte)

```
float floatNum = 0.123F;
double doubleNum = 0.123123123;
```
   

## 참조형 (주소형)
- 별도로 저장한 주소 값을 참조

   ### 문자열 변수 String 저장
   - "텍스트" 문장 저장
  ```
  String hello = "hello world";
  ```
   ### Object(객체), Array(배열), List(리스트) 저장
    ```
  int[] a = {1, 2, 3};
  ```
  

## 형변환
```angular2html
Scanner sc = new Sanner(system.in);
char letter = sc.nextLine().charAt(0); 
int asciiNumber = (int)letter; // 문자를 정수로 형변환
```

