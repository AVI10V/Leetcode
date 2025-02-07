class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        int n=queries.length;
        int[] result=new int[n];
        Map<Integer,Integer> balltocolor= new HashMap<>();
        Map<Integer,Integer> colorcount= new HashMap<>();
        for(int i=0;i<n;i++){
            int ball=queries[i][0];
            int color=queries[i][1];
            if(balltocolor.containsKey(ball)){
                int prevcolor=balltocolor.get(ball);
                colorcount.put(prevcolor,colorcount.get(prevcolor)-1);
                if(colorcount.get(prevcolor)==0){
                    colorcount.remove(prevcolor);
                }
            }
            balltocolor.put(ball,color);
            colorcount.put(color,colorcount.getOrDefault(color,0)+1);
            result[i]=colorcount.size();

        }
        return result;

        
    }
}