给定一个整型数组, 判断是否该数组是有序的(升序)
public static void main(String[] args) { 
 int[] arr = {1,2,3,10,5,6}; 
 System.out.println(isSorted(arr)); 
} 
public static boolean isSorted(int[] arr) { 
 for (int i = 0; i < arr.length - 1; i++) { 
 if (arr[i] > arr[i + 1]) { 
 return false; 
 } 
 } 
 return true; 
}
