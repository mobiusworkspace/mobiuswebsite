import datetime
# -*- coding: utf-8 -*-
"""
Created on Mon Sep 30 20:23:13 2019

@author: Dotmons
"""

person = {'name': 'Dotun', 'age': 31}

sentence = 'My name is ' + person['name'] + ' and age is : ' + str(person['age'])
#print(sentence)

sentence = 'My name is {0} and I am {1} years old. Good night Mr. {0}'.format(person['name'], person['age'])
#print('Formated object: ' + sentence)

sentence = 'My name is {0[name]} and I am {1[age]} years old. Good night Mr. {0}'.format(person, person)
#print('Formated object: ' + sentence)

sentence = 'My name is {0[name]} and I am {0[age]} years old. Good night Mr. {0}'.format(person)
#print('Formated object: ' + sentence)

sentence = 'My name is {name} and I am {age} years old. Good night Mr. {name}'.format(**person)
#print('Formated object: ' + sentence)

#Used to pad the output file
for i in range(1,11):
    print('Final output: {:03}'.format(i))
    
# To format to decimal places
pi = 3.1425485434
print('The value of pi is {:.2f}'.format(pi))

sentence = '1 MB is equal to {:,.2f} bytes'.format(1000*2)
print(sentence)

myDate = datetime.datetime(2019,9,24,12,30,45)
print('My date is {0}'.format(myDate))
print('My date is {:%B, %d, %Y}'.format(myDate))






