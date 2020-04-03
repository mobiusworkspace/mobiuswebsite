# -*- coding: utf-8 -*-
"""
Created on Tue Oct  1 19:53:58 2019

@author: OAdeoye
"""
from __future__ import division
import re
import os

with open(os.path.join('files', 'filerename'), 'r') as file_read:
    print(file_read)

for filenames in os.walk(os.path.join('files', 'filerename')):
    print(filenames)
        
#os.chdir(os.path.join('files', 'filerename'))    
my_regex = re.compile("[0-9]+", re.I)
print('myregex::: '+str(my_regex))
