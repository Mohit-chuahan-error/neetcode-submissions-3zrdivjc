class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> sc = new Stack<>();
        for (String num : operations) {
            if (num.equals( "+")) {
                int top = sc.pop();
                int s = sc.peek();
                int add = top + s;
                sc.push(top);
                sc.push(add);
            } else if (num.equals( "C")) {
                sc.pop();

            } else if (num.equals( "D")) {
                sc.push(2 * sc.peek());
            } else {
                sc.push(Integer.parseInt(num));
            }
        }
        int sum = 0;
        for (int su : sc) {
            sum = sum + su;
        }
        return sum;
    }
}