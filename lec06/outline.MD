# JAVA Object-Oriented Programming
##1. 类和对象(实例instance)
###	实例化和存储
*	静态static
     * 静态/类字段field
      * 静态/类方法 method
- 成员member   this
    - 成员字段 field
    - 成员方法 method
###	OOP
- 构造函数	Constructor:
     -	与类同名 Fraction
     -	无返回值类型 也不是void
     -	this() //super````
     -  构造函数的重载
-	toString 字符串化方法
     - 覆盖了Object.toString() 
```
    public String toString() {
                 return getClass().getName() + "@" + Integer.toHexString(hashCode());
             }
```
     - 权限是public 
     - 返回String
     - @Override标注(annotation)
###	权限：
-	private 私有权限 仅限本类访问
-	protected 子类权限 本类和该类的子类都可以访问
-	default 默认权限（包权限） 同一个包（子包）都可以访问
-	public 公开权限 所有的都可以访问

## 案例
### 几何建模
- 点（二维、三维）
- 直线、圆、线段

### 分数建模
- 分数的字段
    - 成员字段
        - 分子up
        - 分母down
    - 静态常字段
        - ONE
        - ZERO
####分数的方法
- 构造器
- 字符串化 toString
- 化简方法
- 二元运算
    -  add
    -  sub
    -  mul
    - div
    - compareTo
- 一元运算
    - 求倒数
    - 求相反数
    - 计算浮点近似值

### 其他
- 时间类 Time24
    - 字段
        - hour
        - minute
        - second        
    - 方法
        - 构造方法
           - Time24() 00:00:00
           - Time24(hh)  hh:00:00
           ...
        - toString
            - 24格式   like 20：18：30
            - AM/PM格式 08:18:30PM
        - API:
          - 设置时分秒getXXX/setXXX
          - 计算 s0+s
          - s1-s2
- 日期类
- 日期时间类
## 面向对象开发步骤
- 设计类（字段field 方法 method)
- 单元测试
- 类应用

