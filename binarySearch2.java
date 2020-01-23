感受二分查找的效率
class Test { 
 static int count = 0; // 创建一个成员变量, 记录二分查找循环次数
 public static void main(String[] args) { 
 int[] arr = makeBigArray(); 
 int ret = binarySearch(arr, 9999); 
 System.out.println("ret = " + ret + " count = " + count); 
 } 
 public static int[] makeBigArray() { 
 int[] arr = new int[10000]; 
 for (int i = 0; i < 10000; i++) { 
 arr[i] = i; 
 } 
 return arr; 
 } 
 public static int binarySearch(int[] arr, int toFind) { 
 int left = 0; 
 int right = arr.length - 1; 
 while (left <= right) { 
 count++; // 使用一个变量记录循环执行次数
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
 } 
 } 
 // 循环结束, 说明没找到
 return -1; 
 } 
} 
// 执行结果
ret = 9999 count = 14 
可以看到, 针对一个长度为 10000 个元素的数组查找, 二分查找只需要循环 14 次就能完成查找. 随着数组元素个数越
多, 二分的优势就越大.
