class Solution {
    public String truncateSentence(String s, int k) {
        String[] ss = s.split(" ");
        String str="";
        for(int i=0;i<k;i++){
            if(i==k-1){
                str=str+ss[i];
            }
            else{
                str=str+ss[i]+" ";
            }
        }
        return str;
    }
}