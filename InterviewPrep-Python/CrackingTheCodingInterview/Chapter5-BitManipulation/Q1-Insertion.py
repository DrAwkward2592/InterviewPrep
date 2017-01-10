def insertion(n, m, i,j):
    left = ~0 << j+1
    right = (1 << i) -1
    mask = left | right
    n_cleared = n & mask
    m_shifted = m << i
    return n_cleared | m_shifted
    
    
if __name__ == '__main__':
    print bin(insertion(1024, 19, 2, 6))