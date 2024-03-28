# Collection

---

---

## List
- 순서가 있는 데이터의 집합=> Array 는 최초 길이 알아야함
-  처음 길이 몰라도 만들 수 있음
-  Array -> 정적배열 
- List(ArrayList) -> 동적배열 : 크기가 가변적으로 늘어난다. 
  - 생성 시점에 작은 연속된 공간을 요청해서 참주형 변수를 담아놓느다.
  - 값이 추가될 떄 더 큰 공간이 필요하면 더 큰 공간을 받아서 저장하니까 상관없다.
  ```
  ArrayList<Integer> arrayList = new ArrayList<Integer>();
  ```
### add
```angular2html
arrayList.add(1);
arrayList.add(2);
arrayList.add(3);

System.out.println(arrayList.get(0));
System.out.println(arrayList.get(1));
System.out.println(arrayList.get(2));
```
### 특정 인덱스 요소 값 변경
```
arrayList.set(2, 10);
System.out.println(arrayList.get(2));
```


### 특정 인덱스 요소 삭제
```
arrayList.remove(1);
System.out.println(arrayList);
```


### 전체값 삭제
```
arrayList.clear();
System.out.println(arrayList);
```

---
## Linked List

- 메모리에 남는 공간을 요청해서 여기 저기 나누어 실제 값을 담는다
- 실제 값이 있는 주소값으로 목록을 구성하고 저장하는 자료구조
- 기본적 기능은 ArrayList와 동일
- 조회 : 느림
- 추가 및 삭제 : 빠름

### 요소 추가 add
```angular2html
linkedList.add(1);
linkedList.add(2);
linkedList.add(3);

 System.out.println(linkedList.get(0));
System.out.println(linkedList.get(1));
System.out.println(linkedList.get(2));
```

### 특정 인덱스 위치에 추가 add
```angular2html
linkedList.add(2, 5);
```

### 수정 set
```angular2html
linkedList.set(1, 10);]
```

### 삭제 
```angular2html
 linkedList.remove(0);
```

### 초기화
```angular2html
linkedList.clear();
```

---

## Stack

```
Stack<Integer> intStack = new Stack<Integer>();
```

### push 추가
```
 intStack.push(10);
```

### pop 마지막 요소 빼오기
```
while(!intStack.isEmpty()) {
      System.out.println(intStack.pop());
}
```

### peek 마지막 요소 조회
```
 System.out.println(intStack.peek());
```

---

## Queue
- FIFO
- add, peek, poll
- 생성자가 없는 인터페이스

```
Queue<Integer> intQueue = new LinkdedList<>();
```

### add 추가
```
intQueue.add(1);
intQueue.add(2);
```

### poll
- 처음에 추가한 요소 1 부터 반환된다.
```
intQueue.poll();
```

### peek 조회
```
intQueue.peek();
```

### size 크기
```
intQueue.size()
```

---

## Set 집합
- 순서 및 중복 없다.
- 순서가 보장되지 않는 대신 중복을 허용하지 않도록 하는 프로그램에서 사용할 수 있는 자료구조
- HashSet, TreeSet 등으로 응용해서 사용 가능
- 생성자가 없어 바로 생성할 수 있다
- 생성자가 존재하는 HashSet을 이용하여 Set을 구현할 수 있다.

```
Set<Integer> intSet = new HashSet<>();

intSet.add(1);
intSet.add(11);
intSet.add(18);
intSet.add(11);
intSet.add(18);

for (Integer value: intSet) {
  System.out.println(value);   // 1 18 11 출력
}
```
중복 값은 제거되어 출력된다.

### contains
- 해당 집합에 요소가 포함되어 있는지 없는지 판별
```
System.out.println(intSet.contains(12)); // false
```


---

## Map
- key- value pair가 주용하다
- key라는 값으로 unique하게 보장되어야 한다.
- Map -> HashMap, TreeMap으로 응용할 수 있다.

```
Map<String, Integer> intMap = new HashMap<>();
```

### put
```
intMap.put("일", 1);
intMap.put("이", 2);
intMap.put("삼", 3);
```

### keySet
- Map에서 key만 뺴서 배열로 만든다
- 중복은 제거한다.
```
for (String key: intMap.keySet()){
  System.out.println(key);
}
```

### values 
- Map에서 value 값만 빼서 배열로 만든다.
- key 값이 중복되면 나중에 들어온 value 값으로 덮어씌운다.
```
for (Integer value: intMap.values()){
  System.out.println(value);
}
```


### get(key)
- 해당 key 값에 매핑되는 value값을 가져온다.

