import sys

alist = []
for line in sys.stdin:
    alist.append(line.rstrip('\n'));
    
i = 0
for a in alist:
    i+=1
    if (i%3 == 1):
        value = a
    if (i%3 == 0):
        b = a.split()
        j = 0
        for c in b:
            if (int(c) == int(value)):
                print(j)
            j+=1    