package app01a.sortPractice;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BubbleSort {
    public void sortNative(List<Demo> list){
        for(int i = 0; i < list.size() -1;i++){
            for(int j = list.size() - 1;j>i;j--){
                if(list.get(j).compareTo(list.get(i)) < 0){
                    Demo temp = list.get(j);
                    list.set(j,list.get(i));
                    list.set(i,temp);
                }
            }
        }
    }





    public void sort(List list ){
        Collections.sort(list);
    }

}

