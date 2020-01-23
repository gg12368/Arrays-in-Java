针对有序数组, 可以使用更高效的二分查找.
啥叫有序数组?
有序分为 "升序" 和 "降序" 如 1 2 3 4 , 依次递增即为升序. 如 4 3 2 1 , 依次递减即为降序.
以升序数组为例, 二分查找的思路是先取中间位置的元素, 看要找的值比中间元素大还是小. 如果小, 就去左边找; 否则
就去右边找.
代码示例
public static void main(String[] args) { 
 int[] arr = {1,2,3,4,5,6}; 
 System.out.println(binarySearch(arr, 6)); 
} 
public static int binarySearch(int[] arr, int toFind) { 
 int left = 0; 
 int right = arr.length - 1; 
 while (left <= right) { 
 int mid = (left + right) / 2; 
 if (toFind < arr[mid]) { 
 // 去左侧区间找
 right = mid - 1; 
 } else if (toFind > arr[mid]) { 
 // 去右侧区间找
 left = mid + 1; 
 } else { 
 // 相等, 说明找到了
 return mid; 
比特科技
 } 
 } 
 // 循环结束, 说明没找到
 return -1; 
} 
// 执行结果
5
