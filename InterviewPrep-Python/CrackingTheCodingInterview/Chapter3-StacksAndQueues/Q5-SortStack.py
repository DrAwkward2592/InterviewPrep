'''
Created on Jan 7, 2017

@author: drawkward
'''
class Node(object):
    
    def __init__(self, data, next=None):
        self.data = data
        self.next = next
        
class Stack(object):
    
    def __init__(self, head=None):
        self.head = head
    
    def push(self, data):
        self.head = Node(data, self.head)
        
    def pop(self):
        if self.head is None:
            raise "Stack is empty"
        else:
            popped = self.head.data
            self.head = self.head.next
            return popped
        
    def is_empty(self):
        return self.head is None
    
    def peek(self):
        return self.head.data
    
    def print_stack(self):
        x = self.head
        while x:
            print(x.data)
            x = x.next
        print(None)
        
    @staticmethod
    def sort( primary):
        secondary = Stack()
        
        while not primary.is_empty():
            temp = primary.pop()
            
            while( not secondary.is_empty() and secondary.peek() < temp):
                primary.push(secondary.pop())
            secondary.push(temp)
            
        return secondary
if __name__ == '__main__':
    
    sorted = Stack()
    sorted.push(1)
    sorted.push(4)
    sorted.push(5)
    sorted.push(2)
    sorted.push(3)
    sorted.push(7)
    sorted.push(45)
    r = Stack.sort(sorted)
    r.print_stack()
    
    