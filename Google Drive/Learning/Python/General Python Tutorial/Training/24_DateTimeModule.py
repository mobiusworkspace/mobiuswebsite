# -*- coding: utf-8 -*-
"""
Created on Tue Oct  1 10:51:32 2019

@author: OAdeoye
"""

import datetime
import pytz

d = datetime.date(2016, 7, 24)
td = datetime.date.today()
print(d)
print(td)
print(td.year)
print(td.weekday())
print(td.isoweekday())

#Creating dummy 7 days
tdelta = datetime.timedelta(days=7)

print('Today {0}'.format(tdelta))
#Printing today minus 7 days
print(td - tdelta)

bday = datetime.date(2019, 10, 31)
bornday = datetime.date(1988, 10, 31)
bubuday = datetime.date(1990, 12, 27)
print('Your age is {0}'.format(bday - td))
print('Total number of days spent on earth is : {0}'.format(td - bornday))

print('Age difference between Dotun and Bukola is {0}'.format(bubuday - bornday))

# This gets the date and time 
print(datetime.datetime(2019,10,31,12,00,00,1000))
print('datetime.datetime.now(): {0}'.format(datetime.datetime.now()))
print('datetime.datetime.today(): {0}'.format(datetime.datetime.today()))
print('datetime.datetime.utcnow-(): {0}'.format(datetime.datetime.utcnow()))



#USING pytz
dt = datetime.datetime(2019,10,31,12,00,45, tzinfo=pytz.UTC)
print(dt)

dtnow = datetime.datetime.now(tz=pytz.UTC)
print(dtnow)


dtutnow = datetime.datetime.utcnow().replace(tzinfo=pytz.UTC)
print(dtutnow)

print('###################')
print('Getting all timezone')

v = 0

for tz in pytz.all_timezones:
    if (v<100):
        print('Time zones: {0}'.format(tz))
        v=v+1

#working with timezone
dt_toronto_timezone = dtutnow.astimezone(pytz.timezone('Canada/Eastern'))
print('Toronto time zone::: {0}'.format(dt_toronto_timezone))

dt_lagos_timezone = dtutnow.astimezone(pytz.timezone('Africa/Lagos'))
print('Lagos timing is ::: {0}'.format(dt_lagos_timezone))

# To print in ISO format, which is the international format for date:
print(dt_lagos_timezone.strftime('%B %d, %Y'))

# To convert string to datetime

dt_str = 'October 01, 2019'
str_to_date = datetime.datetime.strptime(dt_str, '%B %d, %Y')
print('String to date: {0}'.format(str_to_date))
