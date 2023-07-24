'''
Represent each train's detail as a dictionary in the following format:
train_dict={“train_no”:train number, “name”:train name, “from”:source, “to”:destination, “days_of_run”:list of running days, “sleeper_fare”:sleeper fare, “ac_fare”:AC fare }

get_train_name(train_no)
    This function accepts the train number and returns the dict which contains the details of the train.

get_trains_for_day(day_of_run)
    This function accepts a day and returns the list of numbers of the trains running on that day.

get_total_fare(train_no,passenger_dict)
    This function accepts train_no and a dictionary of passenger details. The passenger_dict is of the following format:
        passenger_dict={ “sleeper”:5, “ac”,1 }
    This function returns the total fare based on the passenger details and train number.

Sample Input
train_no = 25627
day_of_run = “We”
passenger_dict ={"sleeper":10, "ac":10}	

Expected Output
Karnataka Express
[16453, 22642, 22905]
41000
'''

train_list=[
{"train_no":16453,"name":"Prasanti Express","from":"SBC","to":"BBS","days_of_run":['Mo','We','Th'],"sleeper_fare":600,"ac_fare": 987},
{"train_no":25627,"name":"Karnataka Express","from":"SBC","to":"DEC","days_of_run":['Su','Tu'],"sleeper_fare":1600,"ac_fare": 2500},
{"train_no":22642,"name":"Trivandrum SF Express","from":"VSKP","to":"TVM","days_of_run":['Mo','Tu','We','Th','Fr','Sa'],"sleeper_fare":800,"ac_fare": 1256},
{"train_no":22905,"name":"Okha Howrah Express","from":"ST","to":"KOAA","days_of_run":['We','Sa'],"sleeper_fare":987,"ac_fare": 2879}]

def get_train_name (train_no):
    global train_list
    
    for dict in train_list:
        if dict['train_no'] == train_no:
            return dict
            
    return "Invalid Train_no"

def get_trains_for_day(day_of_run):
    if len(day_of_run) != 2:
        return "Invalid day"
        
    global train_list
    ans = []
    
    for dict in train_list:
        ls = dict['days_of_run']
        if day_of_run in ls:
            ans.append(dict['train_no'])
    
    return ans

def get_total_fare(train_no,passenger_dict):
    global train_list
    
    dict = {}
    
    for d in train_list:
        if d['train_no'] == train_no:
            dict = d
            
    sleeper_cost = dict['sleeper_fare']
    ac_cost = dict['ac_fare']
    
    n_sleeper = passenger_dict['sleeper']
    n_ac = passenger_dict['ac']
    
    return sleeper_cost * n_sleeper + ac_cost * n_ac
    
    
print(get_train_name(25627))
print(get_trains_for_day("Mo"))
print(get_total_fare(22642,{"sleeper":5, "ac":1}))