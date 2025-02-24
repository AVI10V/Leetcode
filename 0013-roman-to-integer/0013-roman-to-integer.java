class Solution {
    public int romanToInt(String s) {
    Map<Character,Integer> map = new HashMap<>();
    map.put('I',1);
    map.put('V',5);
    map.put('X',10);
    map.put('L',50);
    map.put('C',100);
    map.put('D',500);
    map.put('M',1000);
    int ans =0;
    int i=0;
    int n=s.length();
    while(i<s.length()){
        if(i<(n-1) && s.charAt(i)=='I' && s.charAt(i+1)=='V'){
            ans+=4;
            i=i+2;
        }
        else if(i<(n-1) && s.charAt(i)=='I' && s.charAt(i+1)=='X'){
            ans+=9;
            i=i+2;
        }
        else if(i<(n-1) && s.charAt(i)=='X' && s.charAt(i+1)=='L'){
            ans+=40;
            i=i+2;
        }
        else if(i<(n-1) && s.charAt(i)=='X' && s.charAt(i+1)=='C'){
            ans+=90;
            i=i+2;
        }
         else if(i<(n-1) && s.charAt(i)=='C' && s.charAt(i+1)=='D'){
            ans+=400;
            i=i+2;
        }
         else if(i<(n-1) && s.charAt(i)=='C' && s.charAt(i+1)=='M'){
            ans+=900;
            i=i+2;
        }
        else{
            ans+=map.get(s.charAt(i));
            i++;
        }
        
    }
    return ans;
    }
}