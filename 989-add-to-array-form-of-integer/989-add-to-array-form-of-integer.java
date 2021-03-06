class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> result=new ArrayList<>();
        int carry=0;
        for(int i=num.length-1;i>=0;i--){
            int temp=num[i]+k%10+carry;
            result.add(temp%10);
            carry=temp/10;
            k=k/10;
        }
        while(k>0){
            int t=(k%10+carry);
            result.add(t%10);
            carry=t/10;
            k=k/10;
        }
        if(carry==1) result.add(1);
        Collections.reverse(result);
        return result;
    }
}