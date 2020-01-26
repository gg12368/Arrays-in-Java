 二维数组
 
二维数组本质上也就是一维数组, 只不过每个元素又是一个一维数组.
基本语法
数据类型[][] 数组名称 = new 数据类型 [行数][列数] { 初始化数据 }; 

代码示例
int[][] arr = { 
 {1, 2, 3, 4}, 
 {5, 6, 7, 8}, 
 {9, 10, 11, 12} 
}; 
for (int row = 0; row < arr.length; row++) { 
 for (int col = 0; col < arr[row].length; col++) { 
 System.out.printf("%d\t", arr[row][col]); 
 } 
 System.out.println(""); 
} 
// 执行结果
1 2 3 4 
5 6 7 8 
9 10 11 12
