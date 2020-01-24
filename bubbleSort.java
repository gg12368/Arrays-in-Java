数组排序(冒泡排序)
给定一个数组, 让数组升序 (降序) 排序.
算法思路
每次尝试找到当前待排序区间中最小(或最大)的元素, 放到数组最前面(或最后面).
代码示例

public static void main(String[] args) { 
 int[] arr = {9, 5, 2, 7}; 
 bubbleSort(arr); 
 System.out.println(Arrays.toString(arr)); 
} 
public static void bubbleSort(int[] arr) { 
 // [0, bound) 构成了一个前闭后开区间, 表示已排序区间
 // [bound, length) 构成了一个前闭后开区间, 表示待排序区间
 // 每循环一次, 就找到一个合适大小的元素, 已排序区间就增大1. 
 for (int bound = 0; bound < arr.length; bound++) { 
 for (int cur = arr.length - 1; cur > bound; cur--) { 
 if (arr[cur - 1] > arr[cur]) { 
 int tmp = arr[cur - 1]; 
 arr[cur - 1] = arr[cur]; 
 arr[cur] = tmp; 
 } 
 } 
 } // end for 
} // end bubbleSort 
// 执行结果
[2, 5, 7, 9] 
冒泡排序性能较低. Java 中内置了更高效的排序算法
public static void main(String[] args) { 
 int[] arr = {9, 5, 2, 7}; 
 Arrays.sort(arr); 
 System.out.println(Arrays.toString(arr)); 
} 
关于 Arrays.sort 的具体实现算法, 我们在后面的排序算法课上再详细介绍. 到时候我们会介绍很多种常见排序算法.
