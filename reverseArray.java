 数组逆序
 
给定一个数组, 将里面的元素逆序排列.
思路
设定两个下标, 分别指向第一个元素和最后一个元素. 交换两个位置的元素.
然后让前一个下标自增, 后一个下标自减, 循环继续即可.
代码示例
public static void main(String[] args) { 
 int[] arr = {1, 2, 3, 4}; 
 reverse(arr); 
 System.out.println(Arrays.toString(arr)); 
} 
public static void reverse(int[] arr) { 
 int left = 0; 
 int right = arr.length - 1; 
 while (left < right) { 
 int tmp = arr[left]; 
 arr[left] = arr[right]; 
 arr[right] = tmp; 
 left++; 
 right--; 
 } 
}
