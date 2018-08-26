package app01a.sortPractice;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public class InsertSort {
    public static void insertSortDemo(List<Integer> list){
        for(int i = 1; i < list.size(); i++){
            Integer temp = list.get(i);
            int j = i-1;
            for(;j>=0 && list.get(j)>temp;j--){
                list.set(j+1,list.get(j));
            }
            list.set(j,temp);
        }
    }
}
