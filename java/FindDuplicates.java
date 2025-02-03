import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class FindDuplicates {

  public static List<Integer> findDuplicatesNestedLoops(List<Integer> l) {
    // replace "return null" with your code:
    List<Integer> duplicates = new ArrayList<Integer>();
    for (int i = 0; i < l.size(); i++) {
      for (int j = i + 1; j < l.size(); j++) {
        if (l.get(i) == l.get(j) && !duplicates.contains(l.get(i))) {
          duplicates.add(l.get(i));
        }
      }
    }

    return duplicates;
  }

  public static List<Integer> findDuplicatesHashSet(List<Integer> l) {
    Set<Integer> hashset = new HashSet<Integer>();
    Set<Integer> dupSet = new HashSet<Integer>();

    // use the hashset to find duplicate entries in the List
    for (int i = 0; i < l.size(); i++) {
      if (!hashset.add(l.get(i))) {
        dupSet.add(l.get(i));
      }
    }

    // convert the hashset to a List
    List<Integer> duplicates = new ArrayList<Integer>(dupSet);
    return duplicates;
  }

  public static void main(String[] args) {
    // some test strings:
    List<Integer> sample1 = new ArrayList<Integer>(Arrays.asList(3, 7, 5, 6, 7, 4, 8, 5, 7, 66));
    List<Integer> sample2 = new ArrayList<Integer>(Arrays.asList(3, 5, 6, 4, 4, 5, 66, 6, 7, 6));
    List<Integer> sample3 = new ArrayList<Integer>(Arrays.asList(3, 0, 5, 1, 0));
    List<Integer> sample4 = new ArrayList<Integer>(Arrays.asList(3));
    System.out.println("Sample 1: " + findDuplicatesNestedLoops(sample1));
    System.out.println("Sample 2: " + findDuplicatesNestedLoops(sample2));
    System.out.println("Sample 3: " + findDuplicatesNestedLoops(sample3));
    System.out.println("Sample 4: " + findDuplicatesNestedLoops(sample4));

    System.out.println("Sets 1: " + findDuplicatesHashSet(sample1));
    System.out.println("Sets 2: " + findDuplicatesHashSet(sample2));
    System.out.println("Sets 3: " + findDuplicatesHashSet(sample3));
    System.out.println("Sets 4: " + findDuplicatesHashSet(sample4));
  }

}
