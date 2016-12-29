'''
Created on Dec 29, 2016

@author: drawkward
'''
import unittest

def oneAway(s1, s2):
    l1 = len(s1)
    l2 = len(s2)
    if abs(l1-l2)>1:
        return False
    
    diffCount=0
    i=0
    j=0
    while i<l1 and j < l2:
        if s1[i]!=s2[j]:
            if diffCount==1:
                return False
            
            if l1<l2:
                j+=1
            if l1>l2:
                i+=1
            else:
                i+=1
                j+=1
            diffCount+=1
        else:
            i+=1
            j+=1
    if i<l1 or j<l2:
        diffCount+=1
        
    return diffCount==1
    

class Test(unittest.TestCase):
    '''Test Cases'''
    data = [
         ('pale', 'ple', True),
         ('pales', 'pale', True),
         ('pale', 'bale', True),
         ('paleabc', 'pleabc', True),
         ('pale', 'ble', False),
         ('a', 'b', True),
         ('', 'd', True),
         ('d', 'de', True),
         ('pale', 'pale', True),
         ('pale', 'ple', True),
         ('ple', 'pale', True),
         ('pale', 'bale', True),
         ('pale', 'bake', False),
         ('pale', 'pse', False),
         ('ples', 'pales', True),
         ('pale', 'pas', False),
        ('pas', 'pale', False),
        ('pale', 'pkle', True),
        ('pkle', 'pable', False),
        ('pal', 'palks', False),
        ('palks', 'pal', False)
    ]   

    def test_one_away(self):
        for [test_s1, test_s2, expected] in self.data:
            actual = oneAway(test_s1, test_s2)
            self.assertEqual(actual, expected)
     
if __name__ == '__main__':
    unittest.main()