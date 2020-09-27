import csv
import matplotlib.pyplot as plt 

realDate = []#x1
avgDate = []#x2

rawData = []#y1
avgData = []#y2
with open('Electric_consumption.csv', 'r', encoding='utf8') as csv_file:
    csv_reader = csv.reader(csv_file)
    bar = 0
    for row in csv_reader:
        if bar is 0:
            bar = bar + 1
            continue
        realDate.append(bar)
        rawData.append(float(row[1]))
        if(bar > 24):
            avgDate.append(bar)
            avgData.append(float(row[2]))
        bar = bar + 1
            

plt.plot(realDate,rawData,label="Electric consumption")
plt.plot(avgDate,avgData,label="Average consumption")
plt.xlabel('mouth')
plt.ylabel('electric consumption')
plt.title('Electric consumption in 1985 - 2017')
plt.legend()

plt.show()

