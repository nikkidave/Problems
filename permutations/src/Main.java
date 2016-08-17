
import java.util.*;

public class Main {


    public static void main(String[] args) {
        int[] nums = {1,2,3};

        System.out.println("permutations are" + permutations(nums));

    }

    public static List< List < Integer > > permutations(int[] nums) {
        List< List < Integer > > result = new ArrayList< List < Integer > >();
        List< Integer > currentList = new ArrayList<Integer>();

        for(int i : nums) {
            if(result.isEmpty()) {
                currentList.add(i);
                result.add(currentList);
            }else {
                List< List< Integer > > actualResult = new ArrayList< List< Integer > >();


                int resultSize = result.size();
                for(int j = 0; j < resultSize; j ++) {
                    currentList = result.get(j);
                    int curListSize = currentList.size();
                    for(int k = 0; k <= curListSize; k ++) {
                        List< Integer > ls = new ArrayList< Integer >(currentList);
                        ls.add(k, i);
                        actualResult.add(ls);
                    }
                }
                result = actualResult;
            }
        }

        return result;
    }
}

