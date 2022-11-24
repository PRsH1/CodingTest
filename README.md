# 개인적으로 알고리즘,자료구조 등 코딩 테스트 대비 공부하는 레포지토리 입니다


## 윤년
#### 1.백준 2753번 윤년 문제

기본적인 계산 문제였음
손풀기 용으로 테스트 겸 코딩



## 최대공약수 최소공배수(GCD LCM)
#### 1.백준 2753번 GCD,LCM문제

두 수를 입력받아 두 수의 최대공약수와 최소공배수를 구하는 문제

중고등학생떄는 소인수분해를 이용해 최대공약수와 최소공배수를 구하였으나 프로그래밍 시에는 적절치 않은 방법임

### 2.유클리드 호제법


A를 B로 나눈 몫을 Q라 하고, 나머지를 R이라 하자. 이 때, gcd(A,B)=gcd(B,R)이다.
예시 A=60 B=24 일 때 Q=A/B 이므로 Q=2이고 R=은 12이다
즉 60=24X2+12 이고 이는 gcd(60,24)=gcd(24,12)를 만족한다

유클리드 호제법 알고리즘은 다음과 같다

A와 B의 최대공약수를 구하기 위해 
1.A/B로 나눈 나머지 R1을 구한다
2.B를 R1으로 나눈 나머지 R2를 구한다
3.R1을 R2로 나눈 나머지 R3을 구한다
...
이 과정을 반복해 어느 한 쪽이 나누어질때 이 직전 얻은 나머지(n번 수행시 그 직전 나머지 Rn-1이 최대공약수가 된다


최소공배수(LCM)은 A,B 두 수를 곱하고 위에서 구한 최대공약수로 나누어주면 최소공배수를 구할 수 있다.

## 스택
#### 1.백준 10828번 스택


자료구조에서 많이 사용하는 스택

이 문제에서 명령어는 총 다섯 가지로 push pop size empty top이 있다.
자바에서 제공하는 스택 라이브러리로도 구현할 수 있었으나 나는 LinkedList를 이용해 구현하기로 함          

LinkedList 클래스 
```java

private Node head;//맨 앞을 가리키기 위한 Node형 head 변수임
private class Node{
    //노드 클래스
		Node link;//다른 노드를 가리킬 Link
		int temp;//숫자 데이터를 저장할 변수 temp
		Node(int temp){
    //초기화
		this.temp=temp;
			}
		}
    
    
public void addFirstNode(int number) {
		Node d=new Node(number);
		d.link=head;
		head=d;
		}
    
    //새로운 노드를 추가하는 메서드임(맨 앞에 추가됨)
    //그 외 다른 메서드들은 생략함
```

참고로 백준에선 System.out.println으로 각각 출력하면 시간 초과가 된다

```java

StringBuffer str=new  StringBuffer();  //stringBuffer를 이용하자 
```


#### 2.실수했던 것

```java
	for(int i=0; i<count; i++) {
			order=input.next();
			switch(order) {
			case "push":
				int push=input.nextInt();
				list.addFirstNode(push);
				break;
			case "top":
				str.append(list.top()).append("\n");
				break;
			case "pop":
				str.append(list.pop()).append("\n");
				break;
			case "size":
				str.append(list.size()).append("\n");
				break;
			case "empty":
				str.append(list.empty()).append("\n");
				break;
			}
			
	
		}
```

이 부분에서 switch문이 아니라 if~else if 문을 쓰면 문자열을 읽을 수 없음(배열로 문자열 저장하고 시도해도 읽히지 않음)

스위치 문을 자주 사용하자



## 소수


#### 1. 백준 1978번 소수 찾기


주어진 수들 중 소수를 찾는 문제이다

소수란 1과 나 자신으로만 나누어 떨어지는 수를 말한다

즉 양의 약수가 1과 나 자신으로만 이루어져 있는 수이다.

소수는 1과 나 자신으로만 나누어 떨어지므로 

어떤 숫자 n이 소수인지를 판별하기 위해선 2부터 n까지 1씩 증가하면서 나누어 떨어지는지 계산하면 된다

만약 n이외에 나누어 떨어지는 숫자가 있으면 그 수는 소수가 아니고 n까지 가서 나누어 떨어졌을 땐 그 숫자는 소수이다.

```java 


for(int i=0; i<tryCount; i++) {
	for(int j=2; j<=primeArray[i]; j++) {
		if(primeArray[i]==0 || primeArray[i]==1)
			break;
		else if(primeArray[i]==j) {
			primeCount++;
			break;
				}
		else if(primeArray[i]%j==0) {
			break;
				}

			}
		}


```

위 코드의 시간복잡도는 O(n)이다.


#### 2. 더 효율적인 방법에는 어떤게 있을까?

바로 제곱근을 이용하는 것이다

만약 어떤 수 n이 소수이기 위해선 그 수의 제곱근보다 크지 않은 모든 수로 나누어 떨어지지 않으면 된다.

만약 n=23이라고 가정하면 23의 제곱근은 4.xxxx이므로 23을 2 3 4로 나누어보고 나누어 떨어지지 않으면 소수이다.

```java

for(int i=0; i<n; i++){
	int k=input.nextInt();
	boolean isPrime=true;
	if(k==1)
	    continue;//1은 소수가 아님
	for(int j=2; j<Math.sqrt(k); j++){
		if(k%j==0)
			isPrime=false;
			}
		if(isPrime){
			primeCount++;
			}
}
	
```


탐색할 수를 확실히 줄이고 시간복잡도도 O(√n)로 줄인 것을 볼 수 있다.
