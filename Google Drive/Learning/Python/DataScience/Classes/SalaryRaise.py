# -*- coding: utf-8 -*-
"""
Created on Sun Feb 16 22:29:49 2020

@author: OAdeoye
"""

SALARY_RAISE_FACTOR = 0.04
#Dictionaryz
STATE_CODE_MAP = {'WA': 'Washington', 'TX': 'Texas'}

def update_employee_record(rec):
    "This function is used to update employees record"
    rec['salary'] = rec['salary'] * SALARY_RAISE_FACTOR + rec['salary']
    rec['state_code'] = STATE_CODE_MAP[rec['state_code']]

input_data = [
        {'employee_name': 'Susan', 'salary': 100000.0, 'state_code': 'WA'},
        {'employee_name': 'Ellen', 'salary': 76200.0, 'state_code': 'TX'},
        ]

help(update_employee_record)
for rec in input_data:
    update_employee_record(rec)
    name = rec['employee_name']
    salary = rec['salary']
    state = rec['state_code']
    print(name + ' now lives in '  + state + ' and earns: ' + str(salary))
    
    
sqr = lambda x : x*x
print("Square root of " + str(5) + " is :" + str(sqr(5))) 

def apply_to_evens(a_list, a_func):
    return [a_func(x) for x in a_list if x%2==0]

my_list = [1,2,3,4,5]
square_of_evens = apply_to_evens(my_list, lambda x:x*x)
print(square_of_evens)
