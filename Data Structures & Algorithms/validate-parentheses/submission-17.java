class Solution {
    public boolean isValid(String s) {
         Stack<Character> stackk=new Stack<>();
		 for(Character i:s.toCharArray()) {
			 if(i=='(' ||i=='[' || i=='{') {
				 stackk.push(i);
			 }else {
				 if(i== ')' || i==']' || i=='}') {
					 if(stackk.isEmpty()) {
						 return false;
					 }
					 if((stackk.peek()=='(' && i==')') ||
					 (stackk.peek()=='[' && i==']') ||
					 (stackk.peek()=='{' && i=='}') ) {
						 stackk.pop();
					 }else {
						 return false;
					 }
			 }
		 }	 
	 
	 }
		 if(stackk.isEmpty()) {
			 return true;
		 }
		 return false;
	 }
}

