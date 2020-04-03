# -*- coding: utf-8 -*-
"""
Created on Tue Oct 22 19:29:06 2019

@author: OAdeoye
"""



import re

print(all([ # all of these are true, because
not re.match("a", "cat"), # * 'cat' doesn't start with 'a'
re.search("a", "cat"), # * 'cat' has an 'a' in it
not re.search("c", "dog"), # * 'dog' doesn't have a 'c' in it
3 == len(re.split("[ab]", "carbs")), # * split on a or b to ['c','r','s']
"R-D-" == re.sub("[0-9]", "-", "R2D2") # * replace digits with dashes
])) # prints True

print(re.search("a", "cat"))
print(len(re.split("[ab]", "carbs"))) #Takes out ab from the list
print( re.sub("[0-9]", "-", "R2D2"))

