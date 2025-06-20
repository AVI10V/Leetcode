class Solution {
    public int maxDistance(String s, int k) {
        int north = 0;
        int south = 0;
        int east = 0;
        int west = 0;
        int n=s.length();
        int max =0;
        int total=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='N')north++;
            else if(s.charAt(i)=='S')south++;
            else if(s.charAt(i)=='W')west++;
            else if(s.charAt(i)=='E')east++;
            total++;
            int md=Math.abs(north-south)+Math.abs(east-west);
            int waste=total-md;
            int extra=Math.min(2*k,waste);
            max=Math.max(max,md+extra);

        }
        return max;



    }
}