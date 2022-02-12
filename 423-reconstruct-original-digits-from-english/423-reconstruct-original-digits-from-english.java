class Solution {
    public String originalDigits(String s) {
        int[] in = new int[10];
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == 'z') in[0]++;
            if(c == 'w') in[2]++;
            if(c == 'u') in[4]++;
            if(c == 'x') in[6]++;
            if(c == 'g') in[8]++;               //12333
            if(c == 's') in[7]++;
            if(c == 'f') in[5]++;
            if(c == 'h') in[3]++;
            if(c == 'i') in[9]++;
            if(c == 'o') in[1]++;               //11221
        }
        in[7] -= in[6];                            //76
        in[5] -= in[4];                            //54
        in[3] -= in[8];                            //38
        in[9] = in[9] - in[8] - in[5] - in[6];     //9856
        in[1] = in[1] - in[0] - in[2] - in[4];     //1024\
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<= 9; i++){
            for(int j = 0; j<in[i]; j++){
                sb.append(i);
            }
        }
        return sb.toString();
    }
}