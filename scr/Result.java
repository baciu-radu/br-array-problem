import java.util.ArrayList;
import java.util.List;

public class Result {
    public static void getSubSequences(List<Integer> arr) {
        List<List<Integer>> sequence = new ArrayList<>();


//        for (int i = 1; i <= arr.size(); i++) {
//
//            for (int j = 0; j < i; j++) {
//                List<Integer> addSequence = new ArrayList<>();
////                for (int k =j ; k<i; k++){
//                int k = j;
//                   do{
//                      addSequence.add(arr.get(k));
//
//                      k++;
//                  }while (k<i);
//                System.out.println("Sequence [i"+i+"][j"+j+"] " + k + " is:" + addSequence + "\n");
//                }
//            }
//        }
        for (int i = 0; i < arr.size(); i++) {

            for (int j = i; j < arr.size(); j++) {
                List<Integer> addSequence = new ArrayList<>();
                addSequence.add(arr.get(j));
                for (int k = 0; k < arr.size() - i; k++) {
                    if (k!=j){addSequence.add(arr.get(k));}
                    System.out.println("Sequence [i" + i + "][j" + j + "] " + k + " is:" + addSequence + "\n");

                }

            }
        }
    }
}


//import java.util.ArrayList;
//        import java.util.List;
//
//public class Result {
//
//    // [2, 4, 1, 7]
//    public static List<List<Integer>> getSubsequences1(List<Integer> arr) {
//        List<List<Integer>> sequences = new ArrayList<>();
//
//        for (int i = 1; i < arr.size(); i++) {
//            List<Integer> pair = new ArrayList<>();
//            pair.add(arr.get(0));
//            pair.add(arr.get(i));
//            sequences.add(pair);
//        }
//
//
//
//    }
//
//    public static boolean isSumO

