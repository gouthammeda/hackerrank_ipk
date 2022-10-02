--Problems
1.

def signum(x:Int):Int = {
if (x > 0) 1 
	else if (x == 0) 0 else -1
}

------
def signum(x:Int):Int = {
  x.signum
}

def signum(x:Int): Int = x match{
	case x if (x>0) => 1
	case x if (x<0) => -1
	case _ => 0
}

for(i <- 10 to 0 by -1 if(i%2==0)) println(i)

for(i <- 10 to 0 by -1 if(i%2==0)) yield(i)--> it gives the vector sequence

def countdown(n:Int) = {
	for(i <- n to 0 by -1) yield(i)
}
--------

def prodcode(x:String) = {
	var p = 1
	for (i <- 0 until x.length){
		p = p * x(i).toInt 
	}
	p
}

----
def prodcode(x:String) = {
	var p = 1
	//for (i <- x) p = p * i.toInt 
	for (i <- x) yield i.toInt
	p
}

not returning anything just changing the value of a varable i should return something 

def prodcode(x:String) = x.map(c => (c.toInt)/2).reduce((a,b) => a*b)
----------------
Recursion:
def prodcode(x:String):Int={
	 if (x.isEmpty) 1 
	 else (x.head.toInt) * prodcode(x.tail)
}


Hello

1
90 * 1
78 * 90 * 1
78 * 78 * 90 * 1
109 * prodcode("llo")
108 * prodcode"(ello")

we keep on adding the elements to the stack and multiplying only on the way back.
--------difference normal recursion vs tail recursion --------
      T
S1 S2 S3
---------------------------------------------
@tailrec
def prodcode(x:String, p: Int = 1):Int={
	 if (x.isEmpty) p 
	 else prodcode(x.tail,(x.head.toInt)*p)
}

prodcode("Hello",1)  ----> x="Hello" p=1
prodcode("ello",108*1)  -> x ="ello" p=108
prodcode("llo",104*108) -->x="llo" p = 10024
prodcode("lo",105*10024)-->x="lo" p =8787
prodcode("o",106*8787)-->x = "o" p = 83472
prodcode(" ",83472)-->x=" " p=83472

we are multiplying the elements in the variable only so stack is not required.
--------------

def prodcode(x:String):Int={
	 if (x.isEmpty) 1 
	 else (x.head.toInt) * prodcode(x.tail)
}
//try fibonacci with normal && tailrecursion
--------------------------------------
def func(x:Int,n:Int):Float={
	if(n==0) 1
	else if (n%2 == 0 && n>0) {val y = func(x,n/2);y*y} 
	else if (n%2 == 1 && n>0)  x * func(x,n-1)
	else 1/func(x,-n)
}
-----------------------------
0,1,1,2,3,5,8,13
0,1,2,3,4,5,6,7

def fib(n:Int):Int={
	if(n==0) 0 
	else if (n==1) 1
	else fib(n-1) + fib(n-2)
}

def fibseries(n:Int):String={
	if (n==0) " 0 "
	else fibseries(n-1)+" "+fib(n)
}
//using tail recursion do the print of all members

(fib(2) + fib(1) + fib(1) + fib(0)) + ((fib(1)+fib(0)) 
(fib(3) + fib(2)) + (fib(2)+fib(1))
fib(4) + fib(3)
n=5

pow(x,n)

------
def prodcode(x:String, p: Int = 1):Int={
	 if (x.isEmpty) p 
	 else prodcode(x.tail,(x.head.toInt)*p)
}

def fib(n:Int,p:Int=0,q:Int=1):Int={
	if (n<=0) {
		p
	}
	else { 
	fib(n-1,p=p+q,q=p)
	}
}

def fibseries(n:Int,count:Int=0,k:String=" "):String={
	if (count >= n) {println("we are inside the if");k}
	else {println("we are inside the else");fibseries(n,count+1,k +" "+ fib(count))}
}

//ask him
-------------------------

def genAry(n:Int)={
	val nums = new Array[Int](n)
	for(i <- nums) yield scala.util.Random.nextInt(n)
}

def genAry(n:Int)= {
	val nums = new Array[Int](n)
	nums.map(x=>scala.util.Random.nextInt(n))
}

def genAry(n:Int)= (1 to n).map(x=>scala.util.Random.nextInt(n)).toArray
----------

def swapAdj(arr: Array[Int])={	
	for(i <- (0 until arr.size by 2)){
	 if(i+1 < arr.size){
	  val tmp = arr(i+1)
	  arr(i+1) = arr(i)
	  arr(i) = tmp
	 }	 
    }
    arr
}

-------------
def swapAdj(arr: Array[Int])={	
	for(i <- 0 until arr.size if (i % 2==0)) yield {
	 if(i+1 < arr.size){
	  val tmp = arr(i+1)
	  arr(i+1) = arr(i)
	  arr(i) = tmp
	 }	 
    }
  arr
}

when you want to play with swapping indices we have to use until only.
 
4.
-1,5,7,3,0,-7

5,7,3,-1,0,-7

if n > 0{
	5,7,3
}

else n <= 0
-1,0,-7


import scala.collection.mutable.ArrayBuffer
def posNeg(arr:Array[Int])={
	val b = ArrayBuffer[Int]()
	val c = ArrayBuffer[Int]()
	for (ele<-arr){
		if(ele>0)
			b += ele
		else 
			c += ele
	}
	b++c
}
--------------------
def posNegNew(arr: Array[Int]) = {
	val out = ArrayBuffer[Int]()
}

-1,5,7,3,0,7

def posNeg(arr:Array[Int])={
	val b = ArrayBuffer[Int]()
	for (ele<-arr){
		if(ele>0)
			b += ele		
	}
	for(ele<-arr){
		if(ele<=0)
			b += ele
	}
	b
}
-----------------------------
def posNeg(arr:Array[Int]) = {
	val b = ArrayBuffer[Int]()
	b ++= arr.filter(ele => ele>0)  
	b ++= arr.filter(ele => ele<=0)
	b
}

def posNeg(arr:Array[Int]) = arr.filter(_>0) ++= arr.filter(_<=0)

5.

(1+2+3)/arr.length

def avg(arr:Array[Double]) = arr.sum/arr.length
-------------------
6.  1,5,7,3,2,4

	4,2,3,  7,  5,1,2


for(i <- arr.size-1 to 0 by -1) yield arr(i)
--------------------------------------------------

1,2,3,3,3,6,2

1,2,3,6

val b = ArrayBuffer[Int]()
def duplicates(arr:Array[Int])={
	for(i <- 0 until arr.length){
		if(!(b exists (x=>x==arr(i))))
			b +=arr(i)			
	}
	b
}
-------------------->
8. drop the first negative number

2,-3,-4,6,7
0,1,2,3,4,5


def drop(arr:Array[Int])={
	var flag = 0
	val b = Array.empty[Int]
	for(i<- 0 until arr.length){
		if((arr(i) < 0) && (flag == 0)){
			println("negative num at"+i)
			b ++= arr.drop(i+1) 
			flag = 1
		}
		else if(flag == 0){
			b :+= arr(i)
			println("output"+b.mkString(","))
		}
	}
	b
}

:+ --> is component of Array
++ --> gives an array.

--------------->
def dropping(arr:Array[Int])={
	val negIndexes = for (i <- 0 until arr.length if (arr(i) < 0)) yield i
	val firstNegIdx = negIndexes(0)
	for(i <- 0 until arr.length if (i!=firstNegIdx)) yield arr(i)
}
----------

var firstNeg = false
Array(2,4,-5,-1,6,0).dropWhile(x => if((x<0) && (firstNeg==false)) {firstNeg=true;true} else false)

condition is true it will drop those records,if it is false then it will keep these records

------
Arrays && array buffer are mutable

go for array we know the size already.size not determined go for array ArrayBuffer

9.

val 

10.
-----------
class implementing a trait is called a concrete class
val bobScore = scores.getOrElse("Bob",0)
--> takes a key and default value for the key with it,returned only if key not found


if it is already present it will update the existing
key has to be unique
use immutable structures as it is good functional programming practice
hashmap checks for uniqueness of the key by using hashing algorithm

string "abc" - hash value 1 + 2 + 3 = 6

lesser element on left side,bigger element will be there binary tree(balanced tree)

val result2 = names.zipWithIndex-->it gives a tuple with value and index for a given array 

---------
1.

val s = Map("ab"->100,"cd"->200,"ef"->300)

for((k,v) <- s) yield (k,0.1*v) --> anyhow doing .map

Map:
s.map(x => (x._1,x._2*0.1))

partial function using pattern matching:
s.map{case(k,v) => (k,v*0.1)}
-------
2.
val in = new java.util.Scanner(new java.io.File("sample.txt"))
val s = scala.collection.mutable.Map[String,Int]()
while(in.hasNext) {val k=in.next;val v=s.getOrElse(k,0)+1; s(k)=v}

we are intializing an empty map accesing each element checking if they exists or else populating zero and updating the map each time
3.
var m = scala.collection.immutable.SortedMap[String,Int]()
while(in.hasNext){val k = in.next;val v=m.getOrelse(k,0)+1; m = m + (k -> v)}
4.

6.
 import java.util.Calendar._
val attrs = scala.collection.mutable.LinkedHashMap("Wednesday"->java.util.Calendar.WEDNESDAY,"Monday"->java.util.Calendar.MONDAY,"Tuesday"->java.util.Calendar.TUESDAY)

7.

for ((s,n) <- t) Console.print(s+"|"+n)

8.

1,2,3,4,5,-2,-3,0  2

4,1,3

9.

def minmax(values:Array[Int],v:Int)={
	var s1 = 0
	var s2 = 0
	var s3 = 0
	for(i<- 0 until values.length){		
		if(values(i)<v){
			s1 = s1 + 1
		}
		else if (values(i)>v){
			s2 = s2 + 1
		}
		else{
			s3 = s3 + 1
		}		
	}
	(s1,s2,s3)
} 

10.uses of zip

def Pattern(arr:Array[String])={
	var first = true
	var n = arr.length
	var i = 0
	while(i<n){
		if (arr(i)>=0) {i+=1}
		else{
			if (first) {first=false;i+=1}
			else{arr.remove(i); n-=1}
		}
	}
	arr
}

//b.Sorted

traversable,iterable
ordered trait
b.padTo(3,"1,2,3")

----
val triangle = new Array[Array[Int]](10) 
for (i <- 0 until triangle.length)
triangle(i) = new Array[Int](i + 1)

variable length Arrays















