warm up challenges:

1. 7   1,2,1,2,1,3,2,1  
			
1
2 1 2 1 3......
2
1 2 1 3 2 1
1
-------
def sockMerchant(n: Int, ar: Array[Int]): Int = {
    var pair = 0  
    for(i <- 0 until n;j <- i+1 until n){
      		if ((ar(i) == ar(j)) && (ar(j)!= -999)){
            	pair = pair + 1
            	ar(j) = -999
            }
        }
    pair
}
---------------

def sockMerchant(n: Int, ar: Array[Int]): Int = ar.map(x => (x,1)).reduce



-----


pair --> 2 

n times pair = n-1

1,0
2,1
3,1
4,2
5,2
6,3
7,3
8,4
9,4
10,5

n -> n%2


1,2
2,1
1,2
2,1
1,3
3,2


find distinct

if a(0) == b(0)
	pair +=1



//socks.distinct.map(i => socks.count(_ == i)/2).sum

def main


ar.groupBy(identity).map{case(e,a) => (e,a.length)}.map{case(e,c) => (e,c/2)}.values.sum

ar.groupBy(x => x).map(x => (x._1,x._2.length)).map(x => (x._1,x._2 / 2)).values.sum


2.

s = [dduuuudd]

   +-
-- +- ------------ two valleys
  -+
  -+

  +
-- -
   -   +
   -+- +

---------------


_/\      _
   \    /
    \/\/

1, 0, -1, -2, -1, -2, -1, 0


def dist(n:Int,s:String)={
 var sealevel = 0
 val graph = for(ele<- s) yield { 
 	if (ele == 'D') 
 		sealevel -= 1
 	else 
 		sealevel +=1
 	sealevel
 }	
 var i = 0; var numvalley = 0
 while(i<graph.length){
 	if(graph(i)<0){
 		while(graph(i)<0){
 		  if (i == 0 || graph(i-1)==0) numvalley +=1 
 		  i += 1
 		}
 	}
 	else i+=1
 }
 numvalley 
}

------

3.cumulus = current cloud + 1 or 2
	no thunder heads
	minimum jumps as integer
	0-safe
	1-avoid
	avoid 1 and 5

0,1,0,0,0,1,0--6
0,1,2,3,4,5,6

	0,2,4,6 -- 3 jumps
	0,2,3,4,6 -- 4 jumps


0,0,0,1,0,0 -- 6
0,1,2,3,4,5

def emma(c:Array[Int])={
	var minSteps = 0
	var index = 0
	while (index < c.length-1){
		(c(index+1),if (index+2<c.length-1) c(index+2) else 1) match {
			case (_,0) => { minSteps += 1; index +=2 }
			case (0,1) => { minSteps += 1; index +=1 }
			case (1,1) => index += 1
		}	
	}
 	minSteps
}


c(0,0) match 
	minsteps = 1,index = 2

1,0) match 
ms = 2 ind = 4


0,1 match

ms = 3 index 4


1,0

4   6
-----
s = "abcac" n = 10
abcacabcac, number of a's is 4

5 - 10
if (s.length > n){
	
}
else {
	s*(n/s.length)
}

def repeat(s:String,n:Long):Long={
	var p = 0
	var k = n/s.length.toLong
	var x  = ""
	for(i <- 0L until k){
		x += s
	}
	println(x)
	if(x.length < n){ 
		x = x ++ s.take(n.toInt-x.length)
		println(x)
	}
	x.count(c=> c == 'a')
}