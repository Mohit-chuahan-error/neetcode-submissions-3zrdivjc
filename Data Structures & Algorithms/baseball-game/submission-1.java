class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for (String i : operations) {
        switch (i){
          case "+":
                int top = st.pop();
                int sum = top + st.peek();
            st.push(top);
            st.push(sum);
            break;
            case "D":
                st.push(2 * st.peek());
                break;
            case "C":
                st.pop();
                break;
            default:
                st.push(Integer.parseInt(i));
                break;
        }
        }
        int sum=0;
        for(int i:st){
            sum=sum+i;
        }
        return sum;
    }
}