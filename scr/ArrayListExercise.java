import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExercise {
    public static void main(String[] args) {


        public static List<List<Integer>> getSubSequences(List<Integer> arr) {
            List<List<Integer>> sequence = new ArrayList<>();


            for (int i=0;i<arr.size();i++) {

                Array[] arrTemp = new Array[arr.size()];
                arr.toArray(arrTemp);
                Array[] array = new Array[i];
                for (int j=0 ; j<array.length; j++){
                    List<Integer> pair = new ArrayList<>();
                    array[j]=arrTemp[j];
                }
//         sequence.add(Collections.singletonList(arr.get(i)));


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
    }
}
