class Solution(object):
    def isStrictlyPalindromic(self, n):
        def to_base(num, base):
            digits = ""
            while num > 0:
                digits = str(num % base) + digits
                num //= base
            return digits
        
        def is_palindrome(s):
            return s == s[::-1]
        
        for i in range(2, n - 1):
            if not is_palindrome(to_base(n, i)):
                return False
        return True
