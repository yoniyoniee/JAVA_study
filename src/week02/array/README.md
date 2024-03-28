# 복사

## 얕은 복사
```
int[] arr1 = {a, b, c}
```
여기서 {a,b,c}는 별도 공간에 저장된다.

```
int[] arr2 = arr1;
```
arr2에 arr1의 주소값이 복사된다.
arr1의 값을 바꾸면 arr2에도 영향을 미친다.

## 깊은 복사
배열 a 와 b는 다른 주소값을 바라보고 있는다.
```
int[] a = {1, 2,3 ,4, 5};
int[] b = new int[a.length];
        
for (int i = 0; i < a.length; i++) {
    b[i] = a[i]; // 깊은 복사
}
        
b[0] = 3;

System.out.println(a[0]);
```

##  깊은 복사 메서드

### clone()
- 2차원 이상의 배열에서는 얕은 복사로 동작한다.
```
int[] a = {1, 2, 3, 4};
int[] b = a.clone();
```

### copyOf()
```
int[] a = {1, 2,3 ,4, 5};
int[] b = new int[a.length];
        
for (int i = 0; i < a.length; i++) {
     b[i] = a[i]; // 깊은 복사
}
        
b[0] = 3;

System.out.println(a[0]);
```



