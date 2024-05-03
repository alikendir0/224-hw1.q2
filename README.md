You are a tour guide in a country and you need to organize a city tour for your guests. 
There are M cities in the country and the N undirected roads connect these cities. The city tour you 
will organize should start from city X and include city Y and return to the beginning point at the 
end of the tour. 
In the input, the first line contains 2 space-separated integers, N, and M. N denotes the 
number of cities we have, and M denotes the number of connections between the N cities. Next M 
lines contain two space-separated integers each, U and V denoting that there is a bidirectional road 
between city U and city V. Next line contains two space-separated integers, X the city we start the 
tour and Y the city tour should include. 
In the first line it is given that we have 6 cities and 6 bidirectional paths between them. The 
next lines give the connections between the cities and the last line gives which city is the starting 
point and which city should be included to the tour for this case. 
>Sample Input: 

6 6 
1 2 
1 3 
2 4 
3 4 
3 5 
5 6 
1 4 

In the output, print K space separated integers denoting the path which the tour starts from 
city X and includes city Y. There can be multiple paths. Print the lexicographically smallest one. 
The output for the above inputs as follows. Please check your program with this input as 
well as the others that you will create. Please note that we may use other inputs when grading your 
assignments. 
>Sample Output: 

1 2 3 4 
