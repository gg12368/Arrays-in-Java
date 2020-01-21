找数组中的最大元素
给定一个整型数组, 找到其中的最大元素 (找最小元素同理)
代码示例
public static void main(String[] args) { 
 int[] arr = {1,2,3,4,5,6}; 
 System.out.println(max(arr)); 
} 
public static int max(int[] arr) { 
 int max = arr[0]; 
 for (int i = 1; i < arr.length; i++) { 
 if (arr[i] > max) { 
 max = arr[i]; 
 } 
 } 
 return max; 
} 
// 执行结果
6
