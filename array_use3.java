代码示例: 遍历数组

所谓 "遍历" 是指将数组中的所有元素都访问一遍, 不重不漏. 通常需要搭配循环语句.
int[] arr = {1, 2, 3};
// 获取数组长度
System.out.println("length: " + arr.length); // 执行结果: 3
// 访问数组中的元素
System.out.println(arr[1]); // 执行结果: 2
System.out.println(arr[0]); // 执行结果: 1
arr[2] = 100;
System.out.println(arr[2]); // 执行结果: 100
int[] arr = {1, 2, 3};
System.out.println(arr[100]);

// 执行结果
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 100
        at Test.main(Test.java:4)

