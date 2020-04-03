# -*- coding: utf-8 -*-
"""
Created on Fri Dec 20 18:28:07 2019

@author: OAdeoye
"""

import csv

#Used to read from a file path
with open('files/samplecsvfile.csv') as csv_file:
    csv_reader = csv.reader(csv_file)

    #Skip header file    
    next(csv_reader)    
    for line in csv_reader:
        pass
        #print(line)
        
 #Used to write to a file
with open('files/samplecsvfile.csv', 'r') as csv_file:
    csv_reader = csv.reader(csv_file)
    
    with open('files/newfile.csv', 'w') as new_csv_file:
        csv_writer = csv.writer(new_csv_file, delimiter='\t')
        
        for line in csv_reader:
            csv_writer.writerow(line)

with open('files/newfile.csv', 'r') as csv_file:
    csvreader = csv.reader(csv_file, delimiter = '\t')
    
    for line in csvreader:
        #pass
        print(line)
    

#Using dictionary reader to read csv
        #Very handy to print out the key/value in a csv
with open('files/samplecsvfile.csv', 'r') as csv_file:
    csv_reader = csv.DictReader(csv_file)
    
    #Items are printed in Dictionary by calling the values out
    #for line in csv_reader:
    #    print('Email address after string parsing in dict: '+str(line['email_address']))
            
    with open('files/newfiledict.csv', 'w') as opencsv:
        field_names = ['first_name','last_name']
        csvwriter = csv.DictWriter(opencsv, fieldnames=field_names)
        csvwriter.writeheader()
        
        for line in csv_reader:
            # Used to delete fields not required in the new file
            del line['phone_number']
            del line['address']
            del line['email_address']
            print('Output: ' + str(line))
            csvwriter.writerow(line)