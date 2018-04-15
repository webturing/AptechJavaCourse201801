# 北大青鸟Java 实训预科班

## 课程介绍

### 课程资源
- git hub: [课程资源](https://github.com/webturing/AptechJavaCourse201801)
- [牛客网] (www.nowcoder.com)
- csdn
- [AOJ] (oj.ahstu.cc) oj.ahstu.cc

### AOJ的使用和Java提交
- AOJ使用 注册账号 选择题目  编辑代码 选择语言 提交代码
-Java样例
```
public class Main{//主类名必须是Main
    public static void main(String[] args){ //Java的主方法         
        System.out.println("This is my first c program!");  //标准输出
    }     
}
```
## Java Using Java Like C
### 标准输出 System.out(System.err)
- System.out.println(exp);
- System.out.print(exp);
- System.out.printf(FORMAT,expList);
### 标准输入　java.util.Scanner
- System.in.read()
- nextInt()/nextInt(radix)
- nextFloat()/nextDouble()
- next()/nextLine()
- hasNext()/hasNextInt()/hasNextDouble()/hasNextLine()
- useDelimeter(pattern)
### 数学库 java.lang.Math
- Math.PI/Math.E
- sqrt(x)/pow(x,y)/log/log10
- sin/cos/tan/atan/asin/acos/hypot(a,b)
- floor/ceil/round
- max/min
```
import java.util.Scanner;
//import java.lang.Math;//String System
public class Main{
  public static void main(String[] args){
      Scanner cin=new Scanner(System.in);
      double a=cin.nextDouble();
      double b=cin.nextDouble();
      double c=cin.nextDouble();
      double delta=b*b-4*a*c;
      double x1=(-b+Math.sqrt(delta))/(2*a);
      double x2=(-b-Math.sqrt(delta))/(2*a);
      if(x1<x2){
          double t=x1;x1=x2;x2=t;
      }
      System.out.printf("%.2f %.2f\n",x1,x2);
      cin.close();
  }  
}
```
### Scanner 行读取和格式化解析
```
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String line = cin.nextLine();// "8,5"
		String[] ss = line.split(",");// {"8","5"}
		int a = Integer.parseInt(ss[0]);
		int b = Integer.parseInt(ss[1]);
		int max = a;
		if (b > max) {
			max = b;
		}
		System.out.println(String.format("max=%d", max));
		cin.close();
	}
}
```

