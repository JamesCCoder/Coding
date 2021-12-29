class Solution {
    public int calculate(String s) {
        Queue<Character> res = new ArrayDeque<>();
        for(char c: s.toCharArray()){
            if(c != ' '){
                res.offer(c);
            }
        }
        
        res.offer(' ');
        return helper(res);
    }
    
    public int helper(Queue<Character> res){
        int num = 0;
        int pre = 0;
        int sum = 0;
        char preOp = '+';
        
        while(!res.isEmpty()){
            char c = res.poll();
            
            if(c >= '0' && c<= '9'){
                num = num * 10 + c - '0';
            }else if(c == '('){
                num = helper(res);
            }else{
                switch(preOp){
                    case '+':
                        sum += pre;
                        pre = num;
                        break;
                    case '-':
                        sum += pre;
                        pre = -num;
                        break;
                    case '*':
                        pre *= num;
                        break;
                    case '/':
                        pre /= num;
                        break;
                }
            if(c == ')') break;
                preOp = c;
                num = 0;
            }
        }
        return sum + pre;
    }
}