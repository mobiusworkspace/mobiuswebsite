# -*- coding: utf-8 -*-
"""
Created on Mon Sep 30 21:21:22 2019

@author: Dotmons
"""

import os
from datetime import datetime

#print(dir(os))
#print(os.getcwd())

#os.chdir('C:/Users/Dotmons/Google Drive/Learning/')
#print('Output:: '+str(os.getcwd))
#print(os.listdir())
#os.makedirs('/sample/innersample')

# This gets the timestamp of last modified file
mod_time = (os.stat('OSModule.py').st_mtime)

#print(datetime.fromtimestamp(mod_time))

#for dirpath, dirnames, filenames in os.walk('C:/Users/Dotmons/Google Drive/Learning/'):
    #print('dirnames:' + str(dirpath))
    #print('dirnames: '+ str(dirnames))
    #print('filenames: '+ str(filenames))

#print(os.environ.get('JAVA_HOME'))

#Used to get the path for a file
file_path = os.path.join(os.environ.get('JAVA_HOME'), 'text.txt')

#print('File path {0}'.format(file_path));

#Dummy path directory
#Print filename
print(os.path.basename('C:/users/text.txt'))
#print directory name
print(os.path.dirname('C:/users/text.txt'))
#Print directoy and file name
print(os.path.split('C:/users/text.txt'))

#to check if the path exist
print(os.path.exists('C:/users/text.txt'))

#To check if the file or directory exist
print(os.path.isdir('C:/users/text.txt'))

#To split the file root and extension
print(os.path.splitext('C:/users/text.txt'))
print('File path with no extension:  '+os.path.splitext('C:/users/text.txt')[0])
print('File extention type: '+os.path.splitext('C:/users/text.txt')[1])
