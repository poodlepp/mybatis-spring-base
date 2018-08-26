//package app01a.sortPractice;
//
//import java.util.List;
//
//import static com.sun.tools.javac.jvm.ByteCodes.swap;
//import static java.util.Arrays.swap;
//
//public class QuickSort {
//    public void sort(List<Integer> list,int left,int right){
//        //中轴
//        //左右指针
//        //挖坑法
//        //前后指针
//        //优化：中轴可以三数取中；值不是很多时，可以使用插入排序，减少递归
//
//
//        //下面是左右指针法demo
//        int mid = getMid(list,left,right);
//        int val = list.get(mid);
//        swap(list.get(mid),list.get(right));//swap是工具包中交换值的方法
//        while(left < right){
//            while(left < right && list.get(left) <= val){
//                left++;
//            }
//            while(left < right && list.get(right) >= val){
//                right--;
//            }
//            swap(list.get(left),list.get(right));
//        }
//        swap(list.get(left),val);
//        return left;
//    }
//
//    public static int getMid(List<Integer> list,int left,int right){
//        int mid = (left + right)>>1;
//        int midval = list.get(mid);
//        int leftval = list.get(left);
//        int rightval = list.get(right);
//        return 1;//返回中间值
//    }
//}
