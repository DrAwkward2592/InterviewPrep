# Given a real number between 0 and 1 (e.g., 0.72) that is passed in as a double, print the
# binary representation. If the number cannot be represented accurately in binary with at most
# 32 characters, print "ERROR."
from scipy.linalg._matfuncs_inv_ssq import fractional_matrix_power

def binaryToString(number):
    if number>=1 or number<=0:
        return "Error"
    
    binary = "."
    while number>0:
        if len(binary) >= 32:
            return "Error"
        r = float(number*2)
        if r>=1:
            binary+="1"
            number = r-1
        else:
            binary+="0"
            number = r
        
    return str(binary)
    
def binaryToString2(num):
    
    if num>=1 or num<=0:
        return "Error"
    
    frac = float(0.5)
    binary = "."
    
    while num>0:
        if len(binary)>=32:
            return "Error"
        
        if num>=frac:
            binary+="1"
            num-=frac
        else:
            binary+="0"
            
        frac/=2
    return str(binary)

if __name__=="__main__":
    print(binaryToString2(0.25))
    