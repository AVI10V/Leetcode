class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Integer e1=null;
        Integer e2=null;
        int count1 =0;
        int count2 =0;
        int n=nums.length;
        for(int i=0;i<n;i++){
           if(e1!=null && nums[i]==e1){
            count1++;
           }
           else if(e2!=null && nums[i]==e2){
            count2++;
           }
           else if(count1==0){
            e1=nums[i];
            count1=1;
           }
           else if(count2==0){
            e2=nums[i];
            count2=1;
           }
           else{
            count1--;
            count2--;
           }
        }
        count1=0;
        count2=0;
        for(int x:nums){
            if(x==e1)count1++;
            else if(x==e2)count2++;
        }
        List<Integer> ans = new ArrayList<>();
        if(count1>n/3)ans.add(e1);
        if(count2>n/3)ans.add(e2);
        return ans;

    }
}