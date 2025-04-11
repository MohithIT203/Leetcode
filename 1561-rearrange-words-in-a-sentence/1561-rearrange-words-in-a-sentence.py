class Solution(object):
    def arrangeWords(self, text):
        text=text[0].lower()+text[1::]
        words=text.split()
        words.sort(key=len)
        words[0]=words[0].capitalize()
        return " ".join(words)
        