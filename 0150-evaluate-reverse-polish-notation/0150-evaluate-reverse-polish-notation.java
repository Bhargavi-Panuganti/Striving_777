class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> st=new Stack<>();

        for(String token : tokens)
        {
            if(isNumber(token))
            {
                st.push(Integer.parseInt(token));
            }

            else if(isOperator(token)){
                int b=st.pop();
                int a=st.pop();

                st.push(applyOperator(a,b,token));
            }
        }
        return st.pop();
    }


    private static boolean isNumber(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") ||
               token.equals("*") || token.equals("/") ||
               token.equals("%");
    }

    private static int applyOperator(int a, int b, String operator) {
        switch (operator) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/":
                if (b == 0) throw new ArithmeticException("Division by zero!");
                return a / b;
            case "%":
                if (b == 0) throw new ArithmeticException("Modulo by zero!");
                return a % b;
            default:
                throw new RuntimeException("Unknown operator: " + operator);
        }
    }
}