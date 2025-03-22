class Solution {
    public String reversePrefix(String word, char ch) {
        int s=0;
        char[] arr= word.toCharArray();
        int e=0;
        while(e<arr.length && arr[e]!=ch){
            e++;
        }
        if(e==arr.length)return word;
        while(s<e){
            char temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        return new String(arr);

    }
}