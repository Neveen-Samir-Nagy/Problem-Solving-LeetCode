class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        StringBuilder SB = new StringBuilder();
        SB.append(s);
        String reverse = SB.reverse().toString();
        if(s.equals(reverse)){
            return true;
        }
        return false;
    }
}