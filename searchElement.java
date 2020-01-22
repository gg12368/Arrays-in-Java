 查找数组中指定元素(顺序查找)
给定一个数组, 再给定一个元素, 找出该元素在数组中的位置.
代码示例
public static void main(String[] args) { 
 int[] arr = {1,2,3,10,5,6}; 
比特科技
 System.out.println(find(arr, 10)); 
} 
public static int find(int[] arr, int toFind) { 
 for (int i = 0; i < arr.length; i++) { 
 if (arr[i] == toFind) { 
 return i; 
 } 
 } 
 return -1; // 表示没有找到
} 
// 执行结果
3
