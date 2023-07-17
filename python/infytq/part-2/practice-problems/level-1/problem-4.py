'''
Given a list of numbers, write a python function which returns true if one of the first 4 elements in the list is 9. Otherwise it should return false.

The length of the list can be less than 4 also.
'''

def find_nine(nums):
    for i in range(0, len(nums)):
      if nums[i] == 9:
        return True
      if i == 3:
          return False
      
    return False
	
nums=[1,9,4,5,6]
print(find_nine(nums))