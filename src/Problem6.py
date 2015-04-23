sumSquare = sum(range(1,101)) ** 2
squareSum = sum(map(lambda x: x**2, range(1,101)))
diff = abs(sumSquare-squareSum)
print diff