class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder neend =new StringBuilder();
        int balance=0;
        for(char c: s.toCharArray()){
            if(c=='('){
             if(balance>0){
                neend.append(c);
             }
             balance++;
            }
            else if(c==')'){
                balance--;
                if(balance>0){
                    neend.append(c);
                }
            }
        }
            return neend.toString();
    }
}
