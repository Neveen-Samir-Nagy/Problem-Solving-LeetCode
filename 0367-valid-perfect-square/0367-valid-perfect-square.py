class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        x = sqrt(num)
        if(not(x - int(x)) == 0): return False
        return True