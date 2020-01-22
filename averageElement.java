求数组中元素的平均值
给定一个整型数组, 求平均值
代码示例
public static void main(String[] args) { 
 int[] arr = {1,2,3,4,5,6}; 
 System.out.println(avg(arr)); 
} 
public static double avg(int[] arr) { 
 int sum = 0; 
 for (int x : arr) { 
 sum += x; 
 } 
 return (double)sum / (double)arr.length; 
} 
// 执行结果
3.5
