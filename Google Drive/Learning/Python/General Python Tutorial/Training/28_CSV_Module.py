# -*- coding: utf-8 -*-
"""
Created on Mon Oct 14 19:49:47 2019

@author: Dotmons
"""

import csv

with open('files/email.csv', 'r') as csv_file:
    csv_reader = csv.reader(csv_file, delimiter=',')
    
    #This command is used to omit the first line. i.e, the header in a file
    next(csv_reader)
    
    #To print CSV files
    #for line in csv_reader:
        #print(csv_line)
        #print('First name index value : {0}'.format(line[0]))
        #print(line[2]
    
    with open('files/new_email.csv', 'w') as new_file:
        csv_writer = csv.writer(new_file, delimiter='\t')
    
        for line in csv_reader:
            csv_writer.writerow(line)
            #print('First name index value : {0}'.format(line[0]))
            #print(line[2]
            
#Another way to read file is with the use of Dictionary reader and writer
#This is a much better approch to reading files. By default, it takes the 
# header names and parse with the output            
with open('files/email.csv', 'r') as csv_dict_file:
    csv_dict_reader = csv.DictReader(csv_dict_file)
    
    with open('files/new_email_dict.csv', 'w') as new_dit_file:
        fieldnames = ['firstname', 'lastname', 'emailaddress']
        csv_writer_dict = csv.DictWriter(new_dit_file, fieldnames=fieldnames, delimiter='\t')
        csv_writer_dict.writeheader()
        for line_reader in csv_dict_reader:
            csv_writer_dict.writerow(line_reader)
            print(line_reader)
            #You can access index or column using dictionary based on key (header)
            print('{0}, {1}, {2}'.format(line_reader['firstname'], line_reader['lastname'], line_reader['emailaddress']))
           



        