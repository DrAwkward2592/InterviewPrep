'''
Created on Dec 29, 2016

@author: drawkward
'''
import collections
def PalinPermutation(input):
    input = str.lower(input);
    frequencies = collections.Counter(input)
    
    oneOdd = False
    for c in frequencies:
        if(oneOdd):
            return False
        if(frequencies[c] %2 ==1):
            oneOdd = True
    return True  
    
if __name__ == '__main__':
    print (PalinPermutation("racecar"))