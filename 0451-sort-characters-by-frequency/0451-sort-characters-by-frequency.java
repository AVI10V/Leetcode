class Solution {
    class pair{
        char c ;
        int freq;
        public pair(char c , int x){
            this.c=c;
            this.freq=x;
        }
    }
    public String frequencySort(String s) {
        PriorityQueue<pair> pq = new PriorityQueue<>((a,b)->b.freq-a.freq);
        Map<Character , Integer> map = new HashMap<>();
        char[] ch = s.toCharArray();
        for(char c:ch){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet() ){
           pair p = new pair(entry.getKey() , entry.getValue());
           pq.add(p);
        }
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            pair temp=pq.poll();
            char c=temp.c;
            int freq=temp.freq;
            String result = String.valueOf(c).repeat(freq);
            sb.append(result);

            
        }
        return sb.toString();
        
    }
}