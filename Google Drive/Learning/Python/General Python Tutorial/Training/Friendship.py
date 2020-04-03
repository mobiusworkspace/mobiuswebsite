# -*- coding: utf-8 -*-
"""
Created on Thu Oct 17 18:15:10 2019

@author: OAdeoye
"""

from collections import Counter

users = [
{ "id": 0, "name": "Hero" },
{ "id": 1, "name": "Dunn" },
{ "id": 2, "name": "Sue" },
{ "id": 3, "name": "Chi" },
{ "id": 4, "name": "Thor" },
{ "id": 5, "name": "Clive" },
{ "id": 6, "name": "Hicks" },
{ "id": 7, "name": "Devin" },
{ "id": 8, "name": "Kate" },
{ "id": 9, "name": "Klein" }
]

friendships = [(0, 1), (0, 2), (1, 2), (1, 3), (2, 3), (3, 4),(4, 5), (5, 6), (5, 7), (6, 8), (7, 8), (8, 9)]

for user in users:
    user["friends"] = []


for i, j in friendships:
# this works because users[i] is the user whose id is i
    

    #print("i = " + str(i) + " j = " + str(j))
    users[i]["friends"].append(users[j]) # add i as a friend of j    
    #print('>>>' + str(users[i]["friends"]) + '\n\n')
    users[j]["friends"].append(users[i]) # add j as a friend of i
    #print('<<<' + str(users[j]["friends"]) + '\n\n')

def number_of_friends(user):
    """how many friends does _user_ have?"""
    return len(user["friends"]) # length of friend_ids list

total_connections = sum(number_of_friends(user)
for user in users) # 24

# integer division is lame
num_users = len(users) # length of the users list
avg_connections = total_connections / num_users

print('Total number of users: ' + str(number_of_friends(users[9])))








interests = [
(0, "Hadoop"), (0, "Big Data"), (0, "HBase"), (0, "Java"),
(0, "Spark"), (0, "Storm"), (0, "Cassandra"),
(1, "NoSQL"), (1, "MongoDB"), (1, "Cassandra"), (1, "HBase"),
(1, "Postgres"), (2, "Python"), (2, "scikit-learn"), (2, "scipy"),
(2, "numpy"), (2, "statsmodels"), (2, "pandas"), (3, "R"), (3, "Python"),
(3, "statistics"), (3, "regression"), (3, "probability"),
(4, "machine learning"), (4, "regression"), (4, "decision trees"),
(4, "libsvm"), (5, "Python"), (5, "R"), (5, "Java"), (5, "C++"),
(5, "Haskell"), (5, "programming languages"), (6, "statistics"),
(6, "probability"), (6, "mathematics"), (6, "theory"),
(7, "machine learning"), (7, "scikit-learn"), (7, "Mahout"),
(7, "neural networks"), (8, "neural networks"), (8, "deep learning"),
(8, "Big Data"), (8, "artificial intelligence"), (9, "Hadoop"),
(9, "Java"), (9, "MapReduce"), (9, "Big Data")
]

words_and_counts = Counter(word for user, interest in interests for word in interest.lower().split())

for word, count in words_and_counts.most_common():
    if count > 1:
        print (word, count)




se = set();
for id, course in interests:
    se = course
print('Unique courses = {0}'.format(se))
