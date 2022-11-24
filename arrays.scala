Arrays:
1. 1,2,3,4,5
	0,1,2,3,4

	2,3,4,5,1


def roLeft(a:Array[Int],d:Int):Array[Int]={
		a.drop(d) ++ a.take(d)
}

def roLeft(a:Array[Int],d:Int):Array[Int]={
		val len = a.length	
		for(j <- 1 to d){
		val first = a(0)
		//shift 1 place to left
		for (i<- 1 until len){
		a(i-1) = a(i)
		}
		a(len-1) = first
	}
	a
}
taking the first ele

3.
duuddud

def valley(n:Int,s:String)={
	var sl = 0
	var count = 0
	val graph = for(i <- 0 until n) yield {
		if (s(i) == 'u'){
			sl = sl + 1
		}
		else{
			sl = sl - 1
		}
		sl
	}
	var prev_ele = 0
	for(j <- graph) {
		if (prev_ele == -1 && j == 0 ){
			count += 1
		}
		prev_ele = j
	}
	count
}


using fold left


def valley(n:Int,s:String)={
	var sl = 0
	s.map(x => {
	if(x=='u') sl +=1
	else sl -=1
	sl
}
).foldLeft(0,0)((a,b) => if (a._1 == -1 && b == 0) (b, a._2 + 1) else (b, a._2))._2
}

we get immutability

l = List(2,3,4,5)

List[Int]

reduce((a,b) => a+b)
2+3+4+5
Int

foldLeft('a')((a,b) => a.toChar+b.toChar)
0+2+3+4+5
Char

var total=0
for(e <- l){
	total += e
}
0+2+3+4+5


-1 0 1 2 1 0 -1
---------------------------------------------
1. 0,1,0,0,0,1,0
   0,1,2,3,4,5,6

   at every point check next two steps


0,0 --> jump 


def minJumps(n:Int,s:Array[Int]) = {
	var count = 0
	var i = 0
	while(i<s.length-1){
		if( (i+2 < s.length) && s(i+2) == 0){
			i += 2
		}
		else {			
			i+=1
		}
		count +=1
	}
	count
}

----------------------
1,2,3,4,5
2,3,4,5,1

3,4,

0--l(1)
l(1)--l(2)
l(2)--l(3)

def leftRot(l:Array[Int],d:Int)={
	for (i <- 0 until d){
		val temp = l(0)
		for(j <- 0 until l.length-1){
			l(j) = l(j+1)
		}
		l(l.length-1) = temp
	}
	l
}
------------
def leftRot(arr:Array[Int],d:Int)={
	var l = arr.toList
	for (i <- 0 until d){
			l = l ++ List(l(0))
			l =	(for(j <- 1 until l.length) yield l(j)).toList
	}
	l
}


def leftRot(arr:Array[Int],d:Int)={
	arr.foldLeft(List[Int](),0)((x,y) => if(x._1.isEmpty && x._2==0) (x._1,y) else (x._1 ++ List(x._2),y))
}

foldLeft(0,0)((a,b) => if (a._1 == -1 && b == 0) (b, a._2 + 1) else (b, a._2))._2
--------------
to go over all the ele of l and add first ele at the end

--------
def prodcode(x:String, p: Int = 1):Int={
	 if (x.isEmpty) p 
	 else prodcode(x.tail,(x.head.toInt)*p)
}
----

@tailrec
def leftRot(l:List[Int],d:Int):List[Int]={
	if (d == 0) l
	else leftRot(l.tail ++ List(l.head),d-1)
}

-------

 for one element 
0,0
i,j
	j --3
3 conditions for each element then find the sum of it and display

compare the sums and return mamimum

1 1 1
  1 
1 1 1



def hourglassSum(arr:Array[Array[Int]]):Int = {
	 val nums = List.empty[Int]
	for(i <- 0 until 4;j <- 0 until 4){
		nums ++ List(arr(i)(j) + arr(i)(j+1) + arr(i)(j+2) + arr(i+1)(j+1) + arr(i+2)(j) + arr(i+2)(j+1) + arr(i+2)(j+2))
		println(arr(i)(j) + arr(i)(j+1) + arr(i)(j+2) + arr(i+1)(j+1) + arr(i+2)(j) + arr(i+2)(j+1) + arr(i+2)(j+2))
	}
	nums.max
}

----------
minimum number of bribes req 

1,2,3,4,5,6,7,8
0,1,2,3,4,5,6,7

1,2,3,5,4,6,7,8

1,2,5,4,3,6,7,8

1,5,3,4,2,6,7,8

by subtracting

atmost 2 persons 

1 swap

Bubble Sort:
def minimumBribes(q:Array[Int])={
	var count = 0
	val indexes = (1 until q.length)
	var tooChaotic = false
	for(i <- 0 until q.length){
		println(indexes(i)+" "+q(i))
		if (q(i) - indexes(i) > 2){
			println("too chaotic")
			tooChaotic = true
		}
	}
	if(!tooChaotic){
		for(i <- 0 until q.length - 1;j <- 0 until q.length - 1-i){
			var temp = 0
			if (q(j)>q(j+1)){
				temp = q(j)
				q(j) = q(j+1)
				q(j+1) = temp
				count += 1
			}
		}
		pritnln(count)
	}
}

the outer loop will control how many times we get in the loop and 
the inner does sorting by swapping cons ele by pushing the greatest to the end

1,2,5,4,6,3,7,8

i=0
----
j=0
1,2,5,4,6,3,7,8
j=1
1,2,5,4,6,3,7,8
j=2
1,2,4,5,6,3,7,8
1,2,4,5,6,3,7,8
1,2,4,5,3,6,7,8 <-----end of i=0 greatest element is at the end

i=1
-----
1,2,4,3,5,6,7,8 <--- last 2 are sorted for sure


------------
def minimumBribes(q:Array[Int])={
	var count = 0
	val notChaotic = q.zipWithIndex.map(x => (x._1,x._2+1)).forall{case (e,i) => (e-i)<=2}
	if(notChaotic){
		for(i <- 0 until q.length - 1;j <- 0 until q.length - 1-i){
			var temp = 0
			if (q(j)>q(j+1)){
				temp = q(j)
				q(j) = q(j+1)
				q(j+1) = temp
				count += 1
			}
		}
		println(count)
	}
	else println("Too Chaotic")
}
----
void calc(vector<int> q)
{
    int ans = 0;
    for (int i = q.size() - 1; i >= 0; i--) {
        if (q[i] - (i + 1) > 2) {
            cout << "Too chaotic" << endl;
            return;
        }
        for (int j = max(0, q[i] - 2); j < i; j++)
            if (q[j] > q[i]) ans++;
    }
    cout << ans << endl;
}

1,2,5,4,3,6,7,8
0,1,2,3,4,5,6,7

1st Itr
    i = 7, i >=0,
    if(8-8>2){
    	}
    	j = max(0,6) 6<7

    	7>8
0
2nd Itr:
i = 6 ,i >=0
	0

	j = max(0,5) 5<6
		6>7
0
3rd Itr:
i = 5

j = 4  4<5
3>6

4th Itr:
i =4
j = 1 1<4

2>3
0
j = 2 2<4
5>3 ans = 1
j =3 3<4
4>3 ans = 2

5th Itr:
i = 3
j = 2 ans = 3
6th Itr 
i=2
j=3 
7thItr
i =1 
j=0 0<1
8th
i=0
not go
---------------


4,3,1,2

1,3,4,2

1,2,4,3

1,2,3,4

2,3,4,1,5
0,1,2,3,4

1,3,4,2,5

1,2,4,3,5

1,2,3,4,5

def minimumSwaps(q: Array[Int]): Int = {
	var count = 0
	for(i <- 0 until q.length){
		if (q(i) != i+1){
			val currentIndex = q.indexOf(i+1)
			val temp = q(currentIndex)
			q(currentIndex) = q(i)
			q(i) = temp
			count +=1
		}
	}
	count
}
-----------------

int empty array of size 5
operations = 3

0,0,0,0,0

arr1 = 1,2,100

arr(0),arr(1) 

def arrayManipulation(n: Int, queries: Array[Array[Int]]): Long = {
	val num = new Array[Int](n)
	for(i <- 0 until queries.length){
		val startPos = queries(i)(0)
		val endPos = queries(i)(1)
		val addVal = queries(i)(2)
		for(j <- startPos - 1 to endPos - 1) num(j) += addVal
	}
	num.max
}
---------------------------------------
