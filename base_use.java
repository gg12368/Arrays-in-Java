public static void main(String[] args) {
    int[] arr = {1, 2, 3};
    printArray(arr);
}
public static void printArray(int[] a) {
    for (int x : a) {
        System.out.println(x);
   }
}
// 执行结果
123
int[] a 是函数的形参, int[] arr 是函数实参.
如果需要获取到数组长度, 同样可以使用 a.length
