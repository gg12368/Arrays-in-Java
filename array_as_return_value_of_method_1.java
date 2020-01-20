 数组作为方法的返回值
 
代码示例: 写一个方法, 将数组中的每个元素都 * 2
// 直接修改原数组
class Test { 
 public static void main(String[] args) { 
 int[] arr = {1, 2, 3}; 
 transform(arr); 
 printArray(arr); 
 } 
 public static void printArray(int[] arr) { 
 for (int i = 0; i < arr.length; i++) { 
 System.out.println(arr[i]); 
 } 
 } 
 public static void transform(int[] arr) { 
 for (int i = 0; i < arr.length; i++) { 
 arr[i] = arr[i] * 2; 

 } 
 } 
}
