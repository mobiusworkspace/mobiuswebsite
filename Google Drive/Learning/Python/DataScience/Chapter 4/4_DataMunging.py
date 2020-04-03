# -*- coding: utf-8 -*-
"""
Created on Wed Feb 19 19:39:04 2020

@author: OAdeoye
"""

import pandas as pd

log ="""
Name|Age|Birthdate
Ms. Janice Joplin|65|January 19, 1943
  Bob Dylan |74 Years| may 24 1941
Billy Ray Joel|66yo|Feb. 9, 1941
"""


print(log)


def get_first_last_name(s):
    INVALID_NAME_PARTS = ["mr", "ms", "mrs", "dr", "jr", "sir"]
    parts = s.lower().replace(".","").strip().split()
    parts = [p for p in parts
             if p not in INVALID_NAME_PARTS]
    if len(parts)==0:
        raise ValueError("Name %s is formatted wrong" % s)
    first, last = parts[0], parts[-1]
    first = first[0].upper() + first[1:]
    last = last[0].upper() + last[1:]
    return last, first


def format_age(s):
    chars = list(s)
    digit_value = [c for c in chars if c.isdigit()]    
    return int("".join(digit_value))

def format_date(s):
    monthly_map = {"jan": "01", "feb": "02", "mar": "03"}
    month, day, year = s.strip().replace(",","").replace(".","").split()
    
    if (len(day)<2):
        day = "0" + day
    if (len(year)==2):
        year = "19" + day
    month = monthly_map[month[:3].lower()]

    return year +"-" + month + "-" + day


help(pd)
#df = pd.read_csv(log, sep="|")


print(get_first_last_name("Ms. Janice Joplin"))
print(format_age("65 years old "))
print(format_date("January 19, 1943"))
