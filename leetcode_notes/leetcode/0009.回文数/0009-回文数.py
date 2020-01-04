class Solution:
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        
        if x < 0: return False
        
        n = x
        reversed_num = []
        while n > 0:
            reversed_num.append(n % 10)
            n = n // 10
        return reversed_num[::-1] == reversed_num