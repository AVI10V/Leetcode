class Solution {
    class pair{
        String s;
        int len;
        public pair(String ss, int x){
            this.s=ss;
            this.len=x;
        }

    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<pair> qu = new LinkedList<pair>();
        Set<String> st= new HashSet<String>();
        for(int i=0;i<wordList.size();i++){
            st.add(wordList.get(i));
        }
        qu.offer(new pair(beginWord,1));
        st.remove(beginWord);
        while(!qu.isEmpty()){
            pair pp=qu.poll();
            String curr=pp.s;
            int curlen=pp.len;
            if(curr.equals(endWord))return curlen;
            for(int i=0;i<curr.length();i++){
                char[] replaced=curr.toCharArray();
                for(char ch='a';ch<='z';ch++){
                    replaced[i]=ch;
                    String news=new String(replaced);
                    if(st.contains(news)){
                        st.remove(news);
                        qu.offer(new pair(news,curlen+1));
                    }
                }

            }

        }
        return 0;


        
    }
}