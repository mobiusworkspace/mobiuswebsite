# -*- coding: utf-8 -*-
"""
Created on Tue Oct  1 18:25:31 2019

@author: OAdeoye
"""

import os


#To read a file  
f = open(os.path.join('files','testfile.txt'), 'r')
# to get the mode of the file
print(f.mode)
#to get the file name
print(f.name)

# To close the buffered file
f.close()

#Another way to work on file is to use context manager block concept

with open(os.path.join('files','testfile.txt'), 'r') as fl:
    f_contents = fl.read()
    #print(f_contents)
    
with open(os.path.join('files','testfile.txt'), 'r') as fl:
    f_contents = fl.readlines()
    #print(f_contents)
    f_contents_line_by_line = fl.readline()
    #print(f_contents_line_by_line, end='')
    #Another way to read using loop, and reads one line at a time
    for line in fl:
        pass
        #print(line, end='')

with open(os.path.join('files','testfile.txt'), 'r') as fla:
    size_to_read = 10
    f_content = fla.read(size_to_read) 
    print('file.tell(): {0}'.format(fla.tell()))
    while len(f_content) > 0:
       #print(f_content, end='\n\n\n')
       f_content = fla.read(size_to_read)


# To read from file using number
with open(os.path.join('files','testfile.txt'), 'r') as ftest:
    size_to_read = 10
    f_content = ftest.read(size_to_read)
    #print(f_content)
    
    #To restart reading from the start,
    ftest.seek(0)    
    f_content = ftest.read(size_to_read)
    print(f_content)
    
#Writing to file
with open(os.path.join('files','testfile.txt'), 'w') as wtest:
    wtest.write('Yes boss!!!')
    wtest.write('Oya na')
    
# to copy file by creating a copy line by line
with open(os.path.join('files','testfile.txt'), 'r') as rf:
    with open(os.path.join('files','textfile_copy.txt'), 'w') as wf:
        for line in rf:
            wf.write(line)
            

#to create a file image copy file. To work with file, you need to use binary mode. Set to rb 
# to assign to binary
with open(os.path.join('files','logo.png'), 'rb') as rf:
    with open(os.path.join('files','logo_copy.png'), 'wb') as wf:
        for line in rf:
            wf.write(line)
            
#Another way to read files, this time .. in chunk.. bit by bit    
isCihi = True            
with open(os.path.join('files','logo.png'), 'rb') as rf:
    with open(os.path.join('files','logo_copy_chunk.png'), 'wb') as wf:
        chunk_size = 4000
        rf_chunk = rf.read(chunk_size)
        while len(rf_chunk) > 0:
            if (isCihi):
                print('Reading')
                wf.write(rf_chunk)
                isCihi = True
            rf_chunk = rf.read(chunk_size)