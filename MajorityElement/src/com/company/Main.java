package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2,4,4,4,3,4,4,4,4,4,4,4,4,4,4,4,4,4};
        System.out.println(majorityElement(arr));

    }

    public static int majorityElement(int[] nums) {
        int counter =0;
        Integer[] Bonk = Arrays.stream(nums).boxed().toArray( Integer[]::new );
        Set<Integer> Ape = new HashSet<>(Arrays.asList(Bonk));
        for(Integer z : Ape){
           for (int i = 0; i < nums.length ; i++){
               if(nums[i] == z){
                   counter++;
                   if(counter > (nums.length/2)){
                       return z;
                   }
               }
           }
        }
        return 0;
    }

}











