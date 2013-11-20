import sys

def recur(str1, str2, i, imax, j):
    if (i>=imax or j>=imax):
        if (i>=imax):
            return 0
        else :
            return (j-i)
    else:
        if(str2[j:].count(str1[i]) >= 1):
            while(str2[j:].count(str1[i]) == str2[j+1:].count(str1[i])):
                j+=1
            return recur(str1, str2, i+1, imax,j+1)
        else:
            return recur(str1, str2, i+1, imax,j)+1
        
alist = []
for line in sys.stdin:
    alist.append(line.rstrip('\n'));

alist.remove(alist[0])

for a in alist:
    str1 = sorted(a[:int(len(a)/2)])
    str2 = sorted(a[int(len(a)/2):])
    ans = (recur(str1, str2, 0, int(len(a)/2), 0))

    if (len(a) % 2 == 0):
        print(ans)
    else:
        ans+=1
        ansEq = int(len(a)/2)
        if (ansEq%2 == 1):
            ansEq += 1
        if (ans == ansEq/2):
            print (-1)
        else:
            print(ans)