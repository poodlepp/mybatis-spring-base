package app01a.sortPractice;

import java.util.Vector;

/**
 * 二分查找，假设数组从小到大排列
 */
public class BinarySearch {

    public static void main(String[] args) throws Exception {
        Integer[] arr = {1,2,3,4,5,7,8,9,10};
        int search = search(arr, 6);
        System.out.println("查询结果："+search);
    }

    //这个方法其实可以省略，直接调用递归
    public static int search(Integer[] arr,Integer tar) throws Exception {
        int left = 0;
        int right = arr.length -1;
        int len;//临时下标
        len = findTarget(left,right,arr,tar);
        return len;
    }

    private static int findTarget(int left, int right, Integer[] arr, Integer tar) throws Exception {
        int len = (left + right)/2;
        System.out.println("left:"+left + "\t"+"right:"+right);
        Integer temp = arr[len];
        if(temp == null){
            throw new Exception("非法数组！");
        }
        if(temp == tar){
            return len;
        }else if(temp < tar){
            left = len + 1;
            if(arr[left] > tar){   //检查直接被跳过情况
                return 99;
            }
            if(left > right){   //检查边界异常情况
                return 99; //查找无结果
            }
            return findTarget(left,right,arr,tar);
        }else if(temp > tar){
            right = temp -1;
            if(arr[right] < tar){
                return 99;
            }
            if(left > right){
                return 99; //查找无结果
            }
            return findTarget(left,right,arr,tar);
        }else{
            throw new Exception("执行错误！");
        }
    }

    //简单二分
    public static int search(Vector<Integer> v, Integer key){
        int left = 0;
        int right = v.size() - 1;
        while (left <= right){
            int len = (left + right)/2;
            Integer temp = v.get(len);
            if(temp.equals(key)){
                return len;
            }else if(temp < key){
                right = len - 1;
            }else if(temp > key){
                left = len + 1;
            }else{
                return 999;
            }
        }
        return 999;
    }
}
