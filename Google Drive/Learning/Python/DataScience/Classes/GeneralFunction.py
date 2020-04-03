# -*- coding: utf-8 -*-
"""
Created on Mon Mar  9 03:11:19 2020

@author: Dotmons
"""

def zipFunction():
    "This function is used to create iterator by combining various objects together"
    list_val = [1,2,3,4,5,5]
    str_list = ['one', 'two', 'three', 'four', 'five', 'five']
    number_list = ['ONE', 'TWO', 'THREE', 'FOUR', 'FIVE', 'FIVE']
    
    result = zip(list_val, str_list, number_list)
    
    #Converting iterator to a List
    result_list = set(result)
    print(result_list)
    #print(type(result_list))

help(zipFunction)
zipFunction()