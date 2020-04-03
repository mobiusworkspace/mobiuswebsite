# -*- coding: utf-8 -*-
"""
Created on Thu Oct 17 19:24:50 2019

@author: OAdeoye
"""

from collections import Counter



c_counter = Counter('abcdeabcdabcaba')

print('Printing out the three top {0} '.format(c_counter.most_common(3)))
print('Print out unique elements in c = {0}'.format(sorted(c_counter)))
print('Print elements with repetition {0}'.format(''.join(sorted(c_counter.elements()))))
print('Print out the sum in the list {0}'.format(sum(c_counter.values())))
print('Get total occurence of c in the list {0}'.format(c_counter['c']))

# To add to the elemenet
for elem in 'shazam':
    c_counter[elem] = +1
    
# To delete all character b from the list
del c_counter['b']

d_counter = Counter('simsalabim')
c_counter.update(d_counter)

print('Value of d_counter {0}'.format(d_counter))

#Clearing up c_counter
c_counter.clear()
print('Printing out c_counter value after deletion: '.format(c_counter))

#help(Counter)






def applytoone(f):
    return f(1)
















