import java.util.*;

class Main{
    public static <T extends Comparable<T>> void sortList(List<T> list){
        Collections.sort(list);
        System.out.println(list);
    }

    public static void main(String args[]){
        List<Integer> l=Arrays.asList(5,2,4,1,3);
        sortList(l);
    }
}
