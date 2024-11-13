class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, new cmp());
        int unit=0;
        int n=boxTypes.length;
        for(int i=0;i<n;i++){
            if(truckSize>=boxTypes[i][0]){
                unit+=boxTypes[i][1]*boxTypes[i][0];
                truckSize-=boxTypes[i][0];
                continue;
            }
            if(truckSize<boxTypes[i][0] && truckSize!=0){
                while(truckSize!=0){
                    truckSize--;
                    unit+=boxTypes[i][1];
                }

            }
            if(truckSize==0){
                break;
            }
            
        }
        return unit;


        
    }
   
    static class cmp implements Comparator<int[]>{
        public int compare(int[] a , int[] b){
            return b[1]-a[1];
        }
       
    }

}