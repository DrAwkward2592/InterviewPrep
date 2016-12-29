'''
Created on Dec 29, 2016

@author: drawkward
'''
def StringCompression(input):
    
    count = 0
    output=""
    for i in range(len(input)):
        count+=1
        if(i+1>=len(input) or input[i]!=input[i+1]):
            output += input[i] + str(count)
            count=0
            
    if len(output) >= len(input):
        return input
    else:
        return output
if __name__ == '__main__':
    print(StringCompression("aabbccc"))
        