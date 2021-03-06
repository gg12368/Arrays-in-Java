数组数字排列
 
给定一个整型数组, 将所有的偶数放在前半部分, 将所有的奇数放在数组后半部分
例如
{1, 2, 3, 4}
调整后得到
{4, 2, 3, 1}
基本思路
设定两个下标分别指向第一个元素和最后一个元素.
用前一个下标从左往右找到第一个奇数, 用后一个下标从右往左找到第一个偶数, 然后交换两个位置的元素.
依次循环即可.
代码示例
public static void main(String[] args) { 
 int[] arr = {1, 2, 3, 4, 5, 6}; 
 transform(arr); 
 System.out.println(Arrays.toString(arr)); 
} 
public static void transform(int[] arr) { 
 int left = 0; 
 int right = arr.length - 1; 
 while (left < right) { 
 // 该循环结束, left 就指向了一个奇数
 while (left < right && arr[left] % 2 == 0) { 
 left++; 
 } 
 // 该循环结束, right 就指向了一个偶数
 while (left < right && arr[right] % 2 != 0) { 
 right--; 
 } 
 // 交换两个位置的元素
 int tmp = arr[left]; 
 arr[left] = arr[right]; 
 arr[right] = tmp; 
 } 
}
