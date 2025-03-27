class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] arr=sentence.split(" ");
        for(int i=0;i<arr.length-1;i++){
            if(arr[i].charAt(arr[i].length()-1)!=(arr[i+1].charAt(0)))return false;
        }
        int last = arr.length-1;
        if(arr[last].charAt(arr[last].length()-1)!=arr[0].charAt(0))return false;
        return true;
    }
}