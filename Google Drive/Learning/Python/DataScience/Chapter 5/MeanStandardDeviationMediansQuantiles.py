# -*- coding: utf-8 -*-
"""
Created on Wed Mar 25 11:27:27 2020

@author: Dotmons
"""


import pandas as pd
from matplotlib import pyplot as py
import sklearn.datasets

def get_iris_df():
    ds = sklearn.datasets.load_iris()
    df = pd.DataFrame(ds['data'], columns = ds['feature_names'])
    code_species_map = dict(zip(range(3), ds['target_names']))
    #print(code_species_map)
    df['species'] = [code_species_map[c] for c in ds['target']]
    return df


df = get_iris_df()['sepal length (cm)']
average = df.mean()
std = df.std();
median = df.median()
percentile25 = df.quantile(0.25)
percentile50 = df.quantile(0.5)
    
print('average: sepal length (cm) ' + str(average))
print('standard deviation: sepal length (cm) ' + str(std))
print('median: sepal length (cm) ' + str(median))
print('percentile25: sepal length (cm) ' + str(percentile25))
print('percentile50: sepal length (cm) ' + str(percentile50))

df_petal_length = get_iris_df()['petal length (cm)']
print(list(df_petal_length))