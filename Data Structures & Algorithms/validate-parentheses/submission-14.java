class Solution {
    public boolean isValid(String s) {
        Stack<Character> sc=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{'){
                sc.push(ch);
            }
            else if(ch==')' || ch=='}' || ch==']'){
                if(sc.isEmpty()){
                    return false;
                }
                 char top=sc.peek();
                if((ch==')' && top!='(') || (ch=='}' && top!='{') || (ch==']' && top!='[')  ){
                   return false;
                }
                 sc.pop();
            }
        }
        System.out.print(sc);
        return sc.isEmpty();
    }
}
