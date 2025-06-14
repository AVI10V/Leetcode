class Solution {
    public int minMaxDifference(int num) {
        int max = funcmax(num);
        int min = funcmin(num);
        return max-min;
    }
    public int funcmax(int num){
        String numStr = String.valueOf(num);
        int[] digits = new int[numStr.length()];
        int n=digits.length;
       for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';  // Convert char to int
        }
        int head=-1;
        boolean found=false;
        for(int i=0;i<n;i++){
            if(digits[i]==9)continue;
            if(digits[i]==head){
              digits[i]=9;
              continue;
            }
            else if(!found){
                head=digits[i];
                digits[i]=9;
                found=true;
            }

        }
        int main=0;
        for(int x:digits){
            main=main*10+x;
        }
        return main;

    }
    public int funcmin(int num){
        String numStr = String.valueOf(num);
        int[] digits = new int[numStr.length()];
        int n=digits.length;
       for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';  // Convert char to int
        }
        int head=-1;
        boolean found=false;
        for(int i=0;i<n;i++){
            if(digits[i]==0)continue;
            if(digits[i]==head){
              digits[i]=0;
              continue;
            }
            else if(!found){
                head=digits[i];
                digits[i]=0;
                found=true;
            }

        }
        int main=0;
        for(int x:digits){
            main=main*10+x;
        }
        return main;

    }
}