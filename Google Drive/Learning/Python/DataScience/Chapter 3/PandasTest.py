# -*- coding: utf-8 -*-
"""
Created on Mon Feb 17 09:56:01 2020

@author: OAdeoye
"""

import pandas as pd

df = pd.DataFrame({
        "name": ["Bob", "Alex", "Janice"],
        "age": [24, 54, 31]
        })

#Readining datafrom from files

other_df = pd.read_csv("files/sample.csv")
print(other_df)


df["age_plus_one"] = df["age"]+1
df["age_time_two"] = df["age"] * 2
df["age_square"] = df["age"]*df["age"]
df["over_30"] = (df["age"] > 30)
df["total_age"] = df["age"].sum()
df["median_avg"] = df["age"].quantile(0.5)

#Creating a new dataframe
df_less_thirty = df[df["age"] < 50 ]
#df_less_thirty.loc[df_less_thirty["age"]*df_less_thirty["age"]]
#df_less_thirty.loc[lambda df_less_thirty: df_less_thirty["age"] * 2]
df_less_thirty["age"] = df_less_thirty["age"].apply(lambda x: x*x)

#help(df_less_thirty)
print(df_less_thirty)

#Series
s = pd.Series([1,2,3])

print(s)
print(s+2)
print(s + pd.Series([4,5,6]))


# To join two dataframes together

df_w_age = pd.DataFrame({
        "name": ["Tom", "Dotun", "Sule"],
        "age": [25, 47, 30]
        })

df_w_height = pd.DataFrame({
        "name": ["Tom", "Dotun", "Sule"],
        "height": [5.11, 6.2, 5.1]
        })


df_total = df_w_age.set_index("name").join(df_w_height.set_index("name"))
print("To get the joined value>>>>:")
print(df_total)

print("To get the joined value with index>>>>:")
print(df_total.reset_index())

print("\n\n<<<Using the GroupBy Function>>>")
df = pd.DataFrame({
        "name": ["Tom", "Claire", "Tyrell", "Sule"],
        "age": [25, 47, 31, 30],
        "height": [5.11, 6.2, 5.1, 6],
        "gender": ["m", "f", "f", "f"]
        })

print("\n\nTo print the mean after grouping by gender>>>>:")
print(df.groupby("gender").mean())

print("\nTo print the median>>>>:")
#print(df.groupby("gender").median())
print(df.groupby("gender").quantile(0.5))
print("\nTo print the median of age alone for female>>>>:")

#Use a custom aggregation function
print("\nTo print custom made aggregation to return by gender the max")
print("name, max age and average height grouped by gender>>>>:")
print(df.groupby("gender").apply(agg))

def agg(dff):
    return pd.Series({
            "name": max(dff["name"]),
            "oldest": max(dff["age"]),
            "mean_height": dff["height"].mean()
            })

    


    

































































