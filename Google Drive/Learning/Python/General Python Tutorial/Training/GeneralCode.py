# -*- coding: utf-8 -*-
"""
Created on Mon Oct 21 19:37:35 2019

@author: OAdeoye
"""
import random
from functools import partial
#List comprehensions
even_numbers = [x for x in range(5) if x % 2 == 0]
square = [x * x for x in range(5)]
even_squares = [x * x for x in range(5) if x % 2 == 0]
square_dictionary = {x : x*x for x in range(5)}
#Set does not contain duplicate
set_square = {x*x for x in [-1, 1]} 
zeroes = [0 for _ in even_numbers]

print('Even numbers: {0}'.format(even_numbers))
print('List Comprehension: {0}'.format(square))
print('Even Square: {0}'.format(even_squares))
print('Dictionary Square: {0}'.format(square_dictionary))
print('Set Square: {0}'.format(set_square))

pairs = [(x,y) for x in range(10) for y in range(x+1, 10)]
print(pairs)

four_uniform_randoms = [random.random() for x in range(4)]
print(four_uniform_randoms)

#Deterministic random values
#random.seed(10)
print(random.random())
#random.seed(10)
print(random.random())

#To print random range:
print(str(random.randrange(10))) # print from 0 to 9
print(str(random.randrange(3,6))) # print from 3 to 5

up_to_ten = [x for x in range(10)]
random.shuffle(up_to_ten)
print('Values: '+str(up_to_ten))

my_padi = ["Sule", "Norberth", "Anthony"]
print(random.choice(my_padi))

lottery_number = [x for x in range(60)]
print(random.sample(lottery_number, 8))

# Pick 0 to 9 four times, with possible replacement
four_with_replacement = [random.choice(up_to_ten) for _ in range(4)]
print(four_with_replacement)




#Working with partial
def exp(base, power):
    return base ** power

def two_to_the(power):
    return exp(2, power)
    
square_of = partial(exp, 2)
print(square_of(3))

#Partial is used to hold temporary values or assign value in a function

def double(x):
   return 2 * x

xs = [1, 2, 3, 4]
twice_xs = [double(x) for x in xs] # [2, 4, 6, 8]
twice_xs = map(double, xs) # same as above
list_doubler = partial(map, double) # *function* that double
print('list_doubler: {0}'.format(list_doubler))
twice_xs = list(list_doubler(xs))
print('twice_xs: {0}'.format(twice_xs))


def multiply(x, y): return x * y
products = list(map(multiply, [1, 2], [4, 5])) # [1 * 4, 2 * 5] = [4, 10]
print(products)






#Zip
list1 = ['a', 'b', 'c']
list2 = [1, 2, 3]
print(set(zip(list1, list2)))

#unzip
pairs = [('a', 1), ('b', 2), ('c', 3)]
letters, numbers = zip(*pairs)

print('letters: '+str(letters))
print('numbers: '+str(numbers))

# initializing lists 
name = [ "Manjeet", "Nikhil", "Shambhavi", "Astha" ] 
roll_no = [ 4, 1, 3, 2 ] 
marks = [ 40, 50, 60, 70 ]  
# using zip() to map values 
mapped = zip(name, roll_no, marks)  
# converting values to print as set 
mapped = set(mapped) 
  
# printing resultant values  
print ("The zipped result is : ",end="") 
print (mapped) 

#unzip
name,roll_no,marks = zip(*mapped)
