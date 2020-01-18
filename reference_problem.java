代码示例2 参数传数组类型
public static void main(String[] args) { 
 int[] arr = {1, 2, 3}; 
 func(arr); 
 System.out.println("arr[0] = " + arr[0]); 
} 
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
