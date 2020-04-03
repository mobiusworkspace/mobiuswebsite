# -*- coding: utf-8 -*-
"""
Created on Wed Mar  4 04:47:15 2020

@author: Dotmons
"""

import pandas as pd
from matplotlib import pyplot as plt
import sklearn.datasets

def get_iris_df():
    ds = sklearn.datasets.load_iris()    
    df = pd.DataFrame(ds['data'], columns = ds['feature_names'])
    code_species_map = dict(zip(range(3), ds['target_names']))
    #print(code_species_map)
    df['species'] = [code_species_map[c] for c in ds['target']]   
    return df

# To get the headers    
#print(list(get_iris_df()))

#Plotting pie chart using one of the four parameters
df = get_iris_df()
sum_by_species = df.groupby('species').sum()
var = 'sepal width (cm)'


#Plotting the graph based on sepal width. We have four items from the record
sum_by_species[var].plot(kind='pie', fontsize=30, subplots='false')
plt.ylabel(var, horizontalalignment='left')
plt.title('Breakdown for ' + var, fontsize=25)
plt.savefig('../files/iris_pie_for_one_variable_1.jpg')
#plt.close()




#Plotting the four items in the dataframe
'''
sum_by_species.plot(kind='pie', subplots='true', layout=(2,2), legend=False)
plt.title("Total Measurements, by Species")
plt.savefig('../files/iris_pie_for_one_variable_2.jpg')
'''


#Plotting dataframe using barchart
'''
sum_by_species[var].plot(kind='bar', fontsize=20, subplots='false', rot=30)
#rot means rotation and it is used to rotate the text title.
plt.title("Breakdown for " + var)
plt.savefig("../files/iris_barchart_1")
'''

#Plotting dataframe for all four components
'''
sum_by_species.plot(kind='bar', fontsize=20, layout=(2,2), subplots='true')
#Use suptitle when you want to title for items with subplots... plotting for
#many entities
plt.suptitle("Breakdown for " + var)
plt.savefig("../files/iris_barchart_2")
'''

#Plotting dataframe for histogram
'''
df .plot(kind='hist', fontsize=20, layout=(2,2), subplots=True)
plt.suptitle("Breakdown for " + var, fontsize=20)
plt.savefig("../files/iris_histogram_1")
'''

#Plotting for each species seperately
'''
for spec in df['species'].unique():
    forspec = df[df['species']==spec]
    #forspec.plot(kind='hist', fontsize=20, alpha=0.4)
    forspec['petal length (cm)'].plot(kind='hist', fontsize=20, subplot='false', alpha=0.4, lable=spec)
    plt.legend(loc='upper right')
    plt.suptitle('Petal Length by Species')
    plt.savefig('../files/iris_hist_by_spec.jpg')
'''

#Mean, Median and Mode...


