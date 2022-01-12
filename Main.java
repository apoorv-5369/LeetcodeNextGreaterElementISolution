class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int f=0, count=0;
        int in[] = new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i]==nums2[j]){
                    f=j;
                        while(nums2.length>f){
                            if(nums2[f]>nums1[i]){
                                in[i]=nums2[f];
                                count++;
                                break;
                            }
                            f++;
                        }
                     f=0;
                    if(count==0){
                        in[i]=-1;
                    }
                   
                    count=0;
                }
            }
        }
        return in;
    }
}
