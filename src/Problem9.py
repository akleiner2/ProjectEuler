num = 1000
done = False
for a in range(1, num):
	for b in range(1,num):
		c = num - a - b 
		if a**2 + b**2 == c**2:
			print (a*b*c)
			done = True
			break 
	if done == True:
		break
