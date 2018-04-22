#Java Array I
## Array Declaration
- ```int[] a={1,2,3,4,5};//initialzier```
- ```int[] b=new int[4];//dynamic allocation```
- ```int[] c=a;//c and a are all refer one array  MEANINGS shadow copy```
- ```int []d=a.clone();//d and a have same contents but not refer one MEANSING clone```
- ```int[] d;//d=null```
## Array Input & Output

### Input

```java
for(int i=0;i<arr.length;i++){
    arr[i]=cin.nextInt();
}
```

### Output

- Access by Index

  ```Java
  for(int i=0;i<arr.length;i++){}
  ```

- For reach

  ```Java
  for(int i:arr){}
  ```

- Debug

  ```java
  System.out.println(Arrays.toString(arr));
  ```

  ​

## Array  Algorithm

- max

  ```Java
  static int max(int[] arr){
      int ret=arr[0];
      for(int i=1;i<arr.length;i++)
      	if(arr[i]>ret)
      		ret=arr[i];
  	return ret;    
  }
  ```

  ​

- min

- sum/average

- reverse

- sorting

#



