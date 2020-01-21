实现自己版本的拷贝数组
public static int[] copyOf(int[] arr) { 
 int[] ret = new int[arr.length]; 
 for (int i = 0; i < arr.length; i++) { 
 ret[i] = arr[i]; 
 } 
 return ret; 
}
