'''
The road transport corporation (RTC) of a city wants to know whether a particular bus-route is running on profit or loss.

Assume that the following information are given:
Price per litre of fuel = 70
Mileage of the bus in km/litre of fuel = 10
Price(Rs) per ticket = 80

The bus runs on multiple routes having different distance in kms and number of passengers.
Write a function to calculate and return the profit earned (Rs) in each route. Return -1 in case of loss.
'''
def calculate(distance,no_of_passengers):
    fuel_consumed = distance / 10
    cost = fuel_consumed * 70
    
    revenue_generated = 80 * no_of_passengers
    net = revenue_generated - cost
    
    if net > 0:
        return net
        
    return -1
    


distance=20
no_of_passengers=50
print(calculate(distance,no_of_passengers))