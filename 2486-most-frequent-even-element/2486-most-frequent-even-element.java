class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer , Integer> map = new HashMap<>();
        for(int x:nums){
            if(x%2==0){
                map.put(x , map.getOrDefault(x ,0)+1);
            }
        }
        int max=0;
        int element=-1;
        for(Map.Entry<Integer , Integer> entry:map.entrySet()){
            int el=entry.getKey();
            int freq=entry.getValue();
            if(freq>max){
                max=freq;
                element=el;
            }
            else if(freq==max){
                element=Math.min(el , element);
            }
        }
        return element;

    }
}