package tk.mybatis.web.controller;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JigSawDemo {
    /**
     * 本来是想计算下17年会拼图题，但是cubic模型设计的不太对，应该用数字集合更好 例：{11，13，14，15，22，24，25，31，45，53}
     * 方便计算，也方便转换角度
     * @param args
     */
    public static void main(String[] args) {
        Cubic cubic = new Cubic();
        cubic.setLen(5);
        ArrayList<List<Integer>> lists = new ArrayList<>();
        lists.add(Arrays.asList(1,1,null,1));
        lists.add(Arrays.asList(1,1,null,1,1));
        cubic.setNums(lists);
        sout(cubic);
    }

    //逆时针90度
    public static Cubic transfer(Cubic c){
        Cubic cubic = new Cubic();
        int len = c.getLen();
        List<List<Integer>> nums = c.getNums();
        cubic.setLen(len);
        ArrayList<List<Integer>> lists = new ArrayList<List<Integer>>();
        for (int i = len-1; i >= 0; i--) {
            ArrayList<Integer> list = new ArrayList<>();
            for (List<Integer> num : nums) {
                if(num.get(i) != null){
                    list.add(num.get(i));
                }else{
                    list.add(null);
                }
            }
            lists.add(list);
        }
        cubic.setNums(lists);
        return cubic;
    }

    /**
     * 输出图形
     * @param c
     */
    public static void sout(Cubic c){
        List<List<Integer>> nums = c.getNums();
        for (List<Integer> num : nums) {
            for (Integer integer : num) {
                System.out.println(integer+'\t');
            }
            System.out.println('\n');
        }
    }
}

 class Cubic{
    private List<List<Integer>> nums;
    private int len;

     public List<List<Integer>> getNums() {
         return nums;
     }

     public void setNums(List<List<Integer>> nums) {
         this.nums = nums;
     }

     public int getLen() {
         return len;
     }

     public void setLen(int len) {
         this.len = len;
     }
 }