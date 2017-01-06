'''
Created on Jan 6, 2017

@author: drawkward
'''
from LinkedList import LinkedList

def loop(linkedList):
    slow = linkedList.head
    fast = linkedList.head
    
    while fast and fast.next and fast is not slow:
        fast = fast.next.next
        slow = slow.next
        
    if fast is None or fast.next is None:
        return None
    
    slow = linkedList.head
    
    while slow is not fast:
        slow = slow.next
        fast = fast.next
    
    return slow
    
    