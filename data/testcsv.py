import numpy as np
import pandas as pd

dataset_url = 'data.csv'
data = pd.read_csv(dataset_url, sep=',')

print (data)
