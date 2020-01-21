import java.util.Arrays 
int[] arr = {1,2,3,4,5,6}; 
int[] newArr = Arrays.copyOf(arr, arr.length); 
System.out.println("newArr: " + Arrays.toString(newArr)); 
arr[0] = 10; 
System.out.println("arr: " + Arrays.toString(arr)); 
System.out.println("newArr: " + Arrays.toString(newArr)); 
注意事项: 相比于 newArr = arr 这样的赋值, copyOf 是将数组进行了 深拷贝, 即又创建了一个数组对象, 拷贝原有
数组中的所有元素到新数组中. 因此, 修改原数组, 不会影响到新数组。
