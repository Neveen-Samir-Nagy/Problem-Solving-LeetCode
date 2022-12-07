class Solution {
    public int reverse(int x) {
         System.out.println(Integer.MAX_VALUE);
        if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE){
            return 0;
        }
        boolean sign = x < 0 ? true : false;
        if(sign){
            x = x * -1;
        }
        String original = String.valueOf(x);
        StringBuilder SB = new StringBuilder();
        SB.append(original);
        SB.reverse();
        String reversedString = SB.toString();
        try{
            int reversed = Integer.parseInt(reversedString);
            if(sign){
            reversed *= -1;
            }
            return reversed;
        }catch(Exception e) {
            return 0;
        }
    }
}