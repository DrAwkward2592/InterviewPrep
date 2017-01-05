'''
Created on Jan 4, 2017

@author: drawkward
'''

from LinkedList import LinkedList

def sum(ll1, ll2):
    result_list = LinkedList()
    head1 = ll1.head
    head2 = ll2.head
    
    carry = 0
    while(head1 or head2):
        result = carry
        if(head1):
            result+=head1.value
            head1 = head1.next
        if(head2):
            result+=head2.value
            head2 = head2.next
            
        result_list.add(result%10)
        carry = result // 10
        
    if(carry):
        result_list.add(carry)
            
    return result_list

def sum_forward(ll1, ll2):
    head1 = ll1.head
    head2 = ll2.head
    result =0
    
    if len(ll1) < len(ll2):
        for i in range(len(ll1) - len(ll2)):
            ll1.add_to_beginning(0)
    else:
        for i in range(len(ll1) - len(ll2)):
            ll2.add_to_beginning(0)
            
    while(head1 or head2):
        result = result *10
        if(head1):
            result+=head1.value
            head1 = head1.next
        if(head2):
            result+=head2.value
            head2 = head2.next
    return result

ll_1 = LinkedList()
ll_1.generate(3, 0, 9)
print(ll_1)

ll_2 = LinkedList()
ll_2.generate(3,0,9)
print(ll_2)

print(sum(ll_1, ll_2))
print(sum_forward(ll_1, ll_2))