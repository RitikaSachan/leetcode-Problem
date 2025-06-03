class Solution {
    public String reverseWords(String s) {
        String [] words=s.trim().split("\\s+");
        StringBuilder Reversed=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            Reversed.append(words[i]);
            if(i>0){
                Reversed.append(" ");
            }
        }
        return Reversed.toString();
    }
}
