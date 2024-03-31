# 쓰레드
### 프로세스
- 실행중인 프로그램
- OS 위에서 실행되는 모든 프로그램은 OS가 만들어준 프로세스에서 실행
- 코드, 데이터, 메모리 영역(Heap, Stack)

### 쓰레드
- 프로세스내에서 일하는 일꾼
- 프로세스가 작업중인 프로그램에서 실행요청이 들어오면 쓰레드(일꾼)을 만들어 명령을 처리
- Java 쓰레드
  - JVM 프로세스 안에서 실행되는 쓰레드
  - Java Main 쓰레드부터 실행되며 JVM에 의해 실행

## 멀티 쓰레드
- Java는 메인 쓰레드가 main() 메서드를 실행시키면서 시작
- 메인 쓰레드는 필요에 따라서 작업 쓸레드들을 생성해서 병렬로 코드를 실행

### 싱글 쓰레드
- Java 프로그램의 경우 main() 메서드만 실행시킬 경우
- 프로세스 안에서 하나의 쓰레드만 실행

### 멀티 쓰레드
- 프로세스 안에서 여러개의 쓰레드가 실행
- 여러개의 작업을 동시에 할 수 있어서 성능이 좋음
- 스택을 제외한 모든 영역에서 메모리를 공유하기 때문에 자원을 보다 효율적으로 사용
- 동기화 문제가 발생
- 교착 상태(데드락)이 발생

---

## Thread 클래스
```
public class TestThread extends Thread {
				@Override
				public void run() {
							// 쓰레드 수행작업
				}
}

...

TestThread thread = new TestThread(); // 쓰레드 생성
thread.start() // 쓰레드 실행
```
### run()
- run() 메서드에 작성된 코드가 쓰레드가 수행할 작업


## Runnable 인터페이스 
- 인터페이스이기 때문에 다른 필요한 클래스를 상속 받을 수 있음  -> 확장성이 뛰어남
```
public class TestRunnable implements Runnable {
				@Override
				public void run() {
							// 쓰레드 수행작업 
				}
}

...

Runnable run = new TestRunnable();
Thread thread = new Thread(run); // 쓰레드 생성

thread.start(); // 쓰레드 실행
```

---

###  데몬 쓰레드
- background 에서 실행되는 낮은 우선순위를 가진 쓰레드
- demon 쓰레드는 우선순위가 낮고 다른 쓰레드가 모두 종료되면 강제 종료

### 사용자 쓰레드
- foregorund 에서 실행되는 높은 우선순위를 가진 쓰레드
- 대표적인 사용자 쓰레드로는 메인 쓰레드
---

## 쓰레드 우선순위
- 쓰레드 작업의 중요도에 따라서 쓰레드의 우선순위를 부여
- 우선순위는 setPriority() 메서드로 설정
```
Thread thread1 = new Thread(task1);
thread1.setPriority(8);
```
- getPriority() 로 우선순위를 반환하여 확인
```
int threadPriority = thread1.getPriority();
System.out.println("threadPriority = " + threadPriority);
```

## 쓰레드 그룹
- 서로 관련이 있는 쓰레드들을 그룹으로 묶어 관리

```
// ThreadGroup 클래스로 객체를 만듭니다.
ThreadGroup group1 = new ThreadGroup("Group1");

// Thread 객체 생성시 첫번째 매개변수로 넣어줍니다.
// Thread(ThreadGroup group, Runnable target, String name)
Thread thread1 = new Thread(group1, task, "Thread 1");
Thread thread2 = new Thread(group1, task, "Thread 2");

// interrupt()는 일시정지 상태인 쓰레드를 실행대기 상태로 만듭니다.
group1.interrupt();
```
- interrupt() 메서드를 실행시키면 해당 그룹 쓰레드들이 실행대기 상태로 변경