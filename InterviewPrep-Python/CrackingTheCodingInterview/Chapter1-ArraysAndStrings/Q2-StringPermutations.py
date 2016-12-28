'''
Created on Dec 18, 2016

@author: drawkward
'''
import collections
def StringPermutations(first, second):
    if len(first) != len(second):
        return False
    
    dict1 = collections.defaultdict(int)
    dict2 = collections.defaultdict(int)
    
    for c in first:
        dict1[c] +=1
        
    for c in second:
        dict2[c] +=1
        
    if dict1 == dict2:
        return True
    else:
        return False

def main():
    print StringPermutations("abcde", "abedc")
    print(result)
    
if __name__=="__main__":
    main()