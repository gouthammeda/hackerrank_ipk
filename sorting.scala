i need to find out maximum number of toys that i can pick up 

7 50
1 12 5 111 200 1000 10

finding different comb that makes <=7 and then getting the max out of it  
single way is fine for the rest

(1,2,3,4) 7
1,2,3-->1
2,3-->2
3,4-->3


def maximumToys(prices:Array[Int],k:Int)={
	val sortPrice = prices.sorted
	var sum = 0
	var toyPrice = List.empty[Int]
	for (i <- 0 until sortPrice.length){
		sum += sortPrice(i)
		if(sum < k){
			toyPrice = toyPrice ++ List(sortPrice(i))
		}
	}
	toyPrice.size
}
---
def maximumToys(prices:Array[Int],k:Int)={
	val sortPrice = prices.sorted
	var sum = 0
	sortPrice.count { toyPrice => 
		sum += toyPrice
		if(sum<k) true else false
	}
}


-----
i = 0,j = 0

sum = 1+2 = 3 
sum = 2+3 = 5 
sum = 3+4 = 7 

i = 1,j = 0 +1

sum = 1+

i=0,j=1
sum = 0+prices(j)2 = 2
sum = 2+3 = 5
sum = 5+4 = 9

i=1,j = 2

sum = 1+3=4
sum = 4+








maximumToys(Array(1,2,3,4),7)

def maximumToys(prices:Array[Int],k:Int)={
	var totalPrices = List.empty[Int]
	val price = prices.toList
	for(i <- 0 until price.length){
		for(j <- 0 until price.length-1){
			var sum = 0
			if(sum < k) {
				sum = price(j)+price(j+1)
			}
			else {
				totalPrices = totalPrices ++ List(price(j)) 
				println(totalPrices)
			}
		}
	}
}



1,2,3
3,4
--------
sort the elements in ascending order and keep adding them to the sum,
when it exceeds limit then those elements can be considered



case class Player(
	name:String,
	score:Int
)

val players = List(Player("Smith",20),Player("Jones",15),Player("Jones",20))
players.sortBy(p=>p.score)



10,20,30,40,50



for(i <- 3 until arr.length){
	val trailingDaysTxn = List(arr(i-3),arr(i-2),arr(i-1))
	getMedian()  >= arr(i)
}


def getMedian(listTxn: List[Int]) = {
	val l = listTxn.length
	if(l%2==0){
		median = l/2,
	}
    else{

    }
}


-----

amount > 2 * median for a trailing number of days


trailing days d and expenditure for n days
num of times notify is received

d=3,n=5 
exp = 10,20,30,40,50

at day 4 no notice
at day 5 notice
n,d

2,2,3,4
0,1,2,3


4/2 = 2

(4/2)/2


10,20,30,40,50,60
0,1,2,3,4,5

6/2

6-2/2=2

6/2-1=2

0,1,2,3,4,5,6,7
10,20,30,40,50,60,70,80

50
40


n=10,d=2

1.first we have to calculate notifications for d to n days
2.notifications--> count
a)
4th day 

median of exp(0) to exp(d) elements

5th day(d=n)

median of exp(1) to exp()

b)
sort and then check for even odd then,even
3)i have to check if 

def countNotify(exp:Array[Int],d:Int)={
	val n = exp.length
	var count = 0
	for(i <- d until n){
		if(exp(d) >= 2*median(exp.slice(i-d,i))) count +=1 
	}
	count
}

def median(expend:Array[Int])={
	val expSorted = expend.sorted
	if (expSorted.length%2 == 0){
		((expSorted(expSorted.length/2)+expSorted((expSorted.length/2)-1)).toDouble/2)
	}
	else {
		expSorted(expSorted.length/2).toDouble
	}
}

10,20,30,40,50
0,1,2,3,4
4th day 

d = 3

i = 3 and go until n=5 

0,3

i  = 4 

(1,4)
---------------------------------
1.choose two distinct flavors so that they spend their money
2.for each trip print ID numbers(indices) of ice cream
trips t = 2,money = 4,n=5,cost = [1,4,5,3,2]
								  1,2,3,4,5
								cost = 1+3 =4

4

1,3,2
---
applying filter

1,4,5,3,2
0,1,2,3,4

i = 0 until 5,j=1

cost(i) + cost(j) = money
0,1
0,2
0,3
0,4

i = 1,j=2

1,2
1,3
1,4



def whatFlavors(cost:Array[Int],money:Int){
	for(i <- 0 until cost.length){
		for(j<- i+1 until cost.length){
			if ((cost(i) + cost(j)) == money){
				println((i+1)+" "+(j+1))
			}
		}
	}	
}
1,4,5,3,2
0,1,2,3,4


whatFlavors(Array(1,4,5,3,2),4)

4,4,4
def whatFlavors(cost:Array[Int],money:Int){
		for(i <- 0 until cost.length;j<- i+1 until cost.length){
			if ((cost(i) + cost(j)) == money){
				println((i+1)+" "+(j+1))
			}
		}	
}