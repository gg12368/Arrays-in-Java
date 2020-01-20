array_as_return_value_of_method_1.java代码固然可行, 但是破坏了原有数组. 有时候我们不希望破坏原数组, 就需要在方法内部创建一个新的数组, 并由方
法返回出来.

// 返回一个新的数组
class Test { 
 public static void main(String[] args) { 
 int[] arr = {1, 2, 3}; 
 int[] output = transform(arr); 
 printArray(output); 
 } 
 public static void printArray(int[] arr) { 
 for (int i = 0; i < arr.length; i++) { 
 System.out.println(arr[i]); 
 } 
 } 
 public static int[] transform(int[] arr) { 
 int[] ret = new int[arr.length]; 
 for (int i = 0; i < arr.length; i++) { 
 ret[i] = arr[i] * 2; 
 } 
 return ret; 
 } 
} 
这样的话就不会破坏原有数组了.
另外由于数组是引用类型, 返回的时候只是将这个数组的首地址返回给函数调用者, 没有拷贝数组内容, 从而比较高效.
