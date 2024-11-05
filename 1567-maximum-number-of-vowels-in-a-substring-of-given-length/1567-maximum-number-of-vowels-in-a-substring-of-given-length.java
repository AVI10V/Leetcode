class Solution {
    public int maxVowels(String s, int k) {
        HashSet <Character> mpp=new HashSet<Character>();
        mpp.add('a');
        mpp.add('e');
        mpp.add('i');
        mpp.add('o');
        mpp.add('u');
        int count =0;
        int maxc=0;
        int r=k;
        int l=0;
        for(int i=0;i<k;i++){
            if(mpp.contains(s.charAt(i))){
                count++;
            }
        }
        maxc=count;
        while(r<s.length()){
            if(mpp.contains(s.charAt(l))){
                count--;
            }
            l++;
            if(mpp.contains(s.charAt(r))){
                count++;
            }
            maxc=Math.max(maxc,count);
            r++;

        }
        return maxc;

        
    }
}