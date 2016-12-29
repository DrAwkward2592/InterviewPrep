'''
Created on Dec 29, 2016

@author: drawkward
'''
import unittest

def nullifyRows(matrix, row):
    for i in range(len(matrix)):
        matrix[row][i]=0

def nullifyColumns(matrix, column):
    for i in range(len(matrix)):
        matrix[i][column]=0
        
def nullifyMatrix(matrix):
    
    if(len(matrix)==0 or len(matrix)!=len(matrix[0])):
        return False
    
    rows=[]
    columns = []
    
    for i in range(len(matrix)):
        for j in range(len(matrix[0])):
            if(matrix[i][j]==0):
                rows.append(i)
                columns.append(j)
    
    for row in rows:
        nullifyRows(matrix, row)
        
    for column in columns:
        nullifyColumns(matrix, column)   
        
    return matrix         

class Test(unittest.TestCase):

    data = [
        ([
            [1, 2, 3, 4, 0],
            [6, 0, 8, 9, 10],
            [11, 12, 13, 14, 15],
            [16, 0, 18, 19, 20],
            [21, 22, 23, 24, 25]
        ], [
            [0, 0, 0, 0, 0],
            [0, 0, 0, 0, 0],
            [11, 0, 13, 14, 0],
            [0, 0, 0, 0, 0],
            [21, 0, 23, 24, 0]
        ])
    ]

    def test_zero_matrix(self):
        for [test_matrix, expected] in self.data:
            actual = nullifyMatrix(test_matrix)
            self.assertEqual(actual, expected)



if __name__ == "__main__":
    unittest.main()