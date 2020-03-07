import math
import os
import random
import re
import sys

# Complete the hourglassSum function below.
def hourglassSum(arr):
    maxs=-100
    arr1=[[0,1,2],[1,2,3],[2,3,4],[3,4,5]]
    arr2=[[0,2],[1,3],[2,4],[3,5]]
    count=0
    p=0
    j=0
    maxs=0
    for i in range(16):
        if count==4:
            p=p+1
            count=0
            j=0
        f=arr2[p][0]
        l1=arr1[j][0]
        l2=arr1[j][-1]+1
        mid=arr[p+1][l1+1]
        g=arr2[p][1]
        #ar=arr[f][l1:l2]+mid+arr[g][l1:l2]
        sum1=sum(arr[f][l1:l2])
        sum3=sum(arr[g][l1:l2])
        res=sum1+mid+sum3
        maxs=max(res,maxs)
        count=count+1
        j=j+1
        res=0
        sum1=0
        sum3=0
    return(maxs)
    


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    arr = []

    for _ in range(6):
        arr.append(list(map(int, input().rstrip().split())))

    result = hourglassSum(arr)

    fptr.write(str(result) + '\n')

    fptr.close()