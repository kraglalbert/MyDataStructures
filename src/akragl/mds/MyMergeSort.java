package akragl.mds;
import java.util.*;

public class MyMergeSort {

  public static void main(String[] args) {

    Integer[] array = {5, 2, 20, 8, 4, 100, 3, 14, 1, 2, 2};
    ArrayList<Integer> testList = new ArrayList<Integer>(Arrays.asList(array));
    
    ArrayList<Integer> sortedList = mergesort(testList);
    System.out.println(sortedList.toString());   
  }
  
  public static ArrayList<Integer> mergesort(ArrayList<Integer> list) {
    if (list.size() <= 1) {
      return list;
    } else {
      int mid = (list.size()-1) / 2;
      ArrayList<Integer> list1 = new ArrayList<Integer>(list.subList(0, mid+1));
      ArrayList<Integer> list2 = new ArrayList<Integer>(list.subList(mid+1, list.size()));
      list1 = mergesort(list1);
      list2 = mergesort(list2);
      return merge(list1, list2);
    }
  }
  
  public static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2) {
    ArrayList<Integer> result = new ArrayList<Integer>();
    while (!list1.isEmpty() && !list2.isEmpty()) {
      if (list1.get(0) < list2.get(0)) {
        result.add(list1.remove(0));
      } else {
        result.add(list2.remove(0));
      }
    }
    while (!list1.isEmpty()) {
      result.add(list1.remove(0));
    }
    while (!list2.isEmpty()) {
      result.add(list2.remove(0));
    }
    return result;  
  }
}