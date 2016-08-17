
import java.util.*;

public class Main {


    public static void main(String[] args) {
        int[] nums = {1,2,3};

        System.out.println("permutations are" + permute(nums));

    }

    public static List< List < Integer > > permute(int[] nums) {
        List< List < Integer > > result = new ArrayList< List < Integer > >();
        List< Integer > curList = new ArrayList<Integer>();

        for(int i : nums) {
            if(result.isEmpty()) {
                curList.add(i);
                result.add(curList);
            }else {
                List< List< Integer > > newResult = new ArrayList< List< Integer > >();


                int resultSize = result.size();
                for(int j = 0; j < resultSize; j ++) {
                    curList = result.get(j);
                    int curListSize = curList.size();
                    for(int k = 0; k <= curListSize; k ++) {
                        List< Integer > ls = new ArrayList< Integer >(curList);
                        ls.add(k, i);
                        newResult.add(ls);
                    }
                }
                result = newResult;
            }
        }

        return result;
    }
}

