# -*- coding: utf-8 -*-
"""
Created on Thu Dec 19 15:42:16 2019

@author: OAdeoye
"""

import random

# Gets floating value between the range
value = random.uniform(1,10)
print(value)

# Gets integer value
value = random.randint(0,2)
print(value)

greetings = ['Hello', 'Hi', 'Hey', 'Howdy', 'Hola']
value = random.choice(greetings)
print(value + ', Dotmons')


#used to print the random values 10 times. Variable must always be k
value = random.choices(greetings, k=10)
print('Random choice: ' + str(value))


#Weighting random values from the list
colors = ['Blue', 'Yellow', 'Red', 'Green']
result = random.choices(colors, k=10, weights=[18,20,2,35])
print('Random weighted choise: ' + str(result))


#To shuffle a list betweek 1 and 53
deck = list(range(1,53))
random.shuffle(deck)
print('1 to 53 random decks: ' + str(deck))
#to print unique card from the sequence
hand = random.sample(deck, k=5)
print('unique 5 values: ' + str(hand))


#Real life scenario:
first_names = ['John', 'Jane', 'Dotun']
last_names = ['Ade', 'Bola', 'Adeoye']
street_names = ['Davidson', 'High', 'Calerton']
fake_cities = ['Lagos', 'Ekiti', 'Ikeja']
states = ['ON', 'SK', 'YK']
email_domain = ['@dotmons.com', '@computer.com', '@waterloo.ca']

for num in range(3):
    first = random.choice(first_names)
    last = random.choice(last_names)
    
    phone = f'{random.randint(100, 999)}-888-{random.randint(1000,9999)}'
    
    street_num = random.randint(100, 999)
    street = random.choice(street_names)
    city = random.choice(fake_cities)
    state = random.choice(states)
    zip_code = random.randint(10000, 99999)
    address = f'{street_num} {street} St., {city} {state} {zip_code}'
    email_d = random.choice(email_domain)
    
    email = first.lower() + last.lower() + email_d
    
    print(f'{first} {last}\n{phone}\n{address}\n{email}\n')
    
    
    
    