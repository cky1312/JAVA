package Arrays;

import java.util.*;
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        int l = nums.length, c = 0;
        for(int i = 0; i < l - 1; i++){
            if(nums[i] != nums[i+1]){
                nums[c++] = nums[i];
            }
        }
        nums[c++] = nums[l - 1];

        System.out.println("Length = "+ c);

        for(int i = 0; i < c; i++){
            System.out.println(nums[i]);
        }
    }
}
