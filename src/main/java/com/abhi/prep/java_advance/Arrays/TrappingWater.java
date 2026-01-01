package com.abhi.prep.java_advance.Arrays;

public class TrappingWater {

    static int trappingwatter(int arr[]){
        int left=0;
        int right=arr.length-1;
        int leftmax=0;
        int rightmax=0;
        int water=0;

        while(left<right){
            if(arr[left]<=arr[right]){
                if(arr[left]>=leftmax){
                    leftmax=arr[left];
                }
                else{
                    water=water+leftmax-arr[left];
                }
                left++;
            }
            else{
                if(arr[right]>=rightmax){
                    rightmax=arr[right];
                }
                else{
                    water=water+rightmax-arr[right];
                }
                right--;
            }
        }
        return water;
    }
    public static void main(String[] args) {
        int arr[]={3,0,1,2,5};
        System.out.println(trappingwatter(arr));
    }

}
