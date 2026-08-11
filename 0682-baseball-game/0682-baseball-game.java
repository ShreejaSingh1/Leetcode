class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            
                if(operations[i].equals("C")){
                    st.pop();
                }
                else if(operations[i].equals("D")){
                    st.push(2*st.peek());
                }
                else if(operations[i].equals("+")){
                    int last = st.pop();
                    int secondLast = st.peek();

                    st.push(last);
                    st.push(last + secondLast);
                }
            
            else{
                st.push(Integer.parseInt(operations[i]));
            }
        }
        int sum = 0;

        while (!st.isEmpty()) {
            sum += st.pop();
        }

        return sum;

    }
}