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
        if self.is_empty():
            raise "Stack is empty"
        else:
            data = self.head.data
            self.head = self.head.next
            return data
        
    def is_empty(self):
        return self.head is None

    def peek(self):
        if self.is_empty():
            raise "Stack is empty"
        else:
            return self.head.data
        
class MyQueue(object):
    
    def __init__(self):
        self.oldestTop = Stack()
        self.newestTop = Stack()
        
    def enqueue(self, data):
        self.newestTop.push(data)
    
    def shiftStack(self):
        if(self.oldestTop.is_empty()):
            while not self.newestTop.is_empty():
                self.oldestTop.push(self.newestTop.pop())

    def peek(self):
        self.shiftStack()
        return self.oldestTop.head.data
    
    def dequeue(self):
        self.shiftStack()
        return self.oldestTop.pop()
    
    def is_empty(self):
        return self.oldestTop.is_empty() and self.newestTop.is_empty()
        
        
if __name__ == '__main__':
    q = MyQueue()
    q.enqueue(1)
    q.enqueue(2)
    q.enqueue(3)
    q.enqueue(4)
    q.enqueue(5)
    print(q.peek())
    print(q.dequeue())
    print(q.peek())
    print(q.dequeue())
    print(q.peek())
    print(q.dequeue())
    print(q.peek())
    print(q.dequeue())
    print(q.peek())
    print(q.dequeue())
