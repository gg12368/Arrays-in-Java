代码示例1 参数传内置类型
public static void main(String[] args) {
    int num = 0;
    func(num);
    System.out.println("num = " + num);
}
public static void func(int x) {
    x = 10;
    System.out.println("x = " + x);
}
// 执行结果
x = 10
num = 0
我们发现, 修改形参 x 的值, 不影响实参的 num 值.

