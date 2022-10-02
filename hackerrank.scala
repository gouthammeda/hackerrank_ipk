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
HashMaps:

notes: ""
magazine:

intialize  2 arrys for storing these strings
flag yes

a(i) == a(j)
next element
					ive got some coconuts coconuts,ive got a lovely bunch of coconuts coconuts
def checkMagazine(note: Array[String],magazine: Array[String]) = {
	var allwordsfound = true
	for(i <- 0 until note.length){
	if(allwordsfound){
		var wordfound = false
		for(j <- 0 until magazine.length){
			if (!wordfound){
				if (note(i) == magazine(j)){
					wordfound = true
				}
				else if(j==magazine.length-1) allwordsfound = false
			}
		}
	}
	}
	allwordsfound
}
1st Itr:
wf = false
awf = true
wf
 = true

2nd It:
i = 1

2 coconuts in note
note is wc map,make magazine map 
traverse thorugh note and pick each ele and search in the magazine map 
-----------
def checkMagazine(note: Array[String],mag: Array[String]) = {
	val notewc = note.groupBy(x=>x).map(x=>(x._1,(x._2).size))
    val magwc = magazine.groupBy(x=>x).map(x=>(x._1,(x._2).size))
    val checksequence = for((noteWord,noteCount) <- notewc) yield {
	    if(magwc.contains(noteWord) && (noteCount <= magwc(noteWord))){
	        "yes"
	    }
	    else "no"    
	    }
	    if (checksequence.forall(x=>(x=="yes"))) println("Yes") else println("No") 
}
------
def checkMagazine(note: Array[String],mag: Array[String]) = {
	val notewc = note.groupBy(x=>x).map(x=>(x._1,(x._2).size))
    val magwc = magazine.groupBy(x=>x).map(x=>(x._1,(x._2).size))
    val checksequence = notewc.map{
	    	case (noteWord,noteCount) => if(magwc.contains(noteWord) && (noteCount <= magwc(noteWord))) "yes" else "no"    
	    }
	if (checksequence.forall(x=>(x=="yes"))) println("Yes") else println("No") 
}

-------
notes -> coconut i love coconut curry with chicken i also love tender coconut
magazine -> coconut is very good for health coconut i love coconut curry with chicken i also love tender coconut coconut is rich in fibres and minerals

magwc
----
coconut -> 5
is -> 2
very -> 1
good -> 1
i -> 1
love -> 1


    +

coconut -> 4 

   ||

coconut -> 4
is -> 2
very -> 1
good -> 1
i -> 1
love -> 1

coconut -> 4
is -> 2
very -> 1
good -> 1
i -> 0
love -> 1


--------
<ctrl-a> - jump to the beginning of line
<ctrl-e> - jump to the end of line
<ctrl-k> - kill rest of the line
<ctrl-d> - delete next char

---------

creating wc for magazine
(got,1),(of,2),(bunch,2)

1.when we have to keep on use a thing(magazine) then we have to store it as a map so that searching will be fast
2.we had to keep count on the values of a map so word count
3.once we found out word,decrement the count of it in map(immutable)

-----------

def checkMagazine(mag:Array[String],note:Array[String])={
val magwc = mag.groupBy(x=>x).map(x=>(x._1,(x._2).size))
val notewc = note.groupBy(x=>x).map(x=>(x._1,(x._2).size))
val stringList = for((noteword,notecount) <- notewc) yield {
		if(magwc.contains(noteword) && notecount <= magwc(noteword)){
			"yes"
		}
		else 
			"no"
	}
	if(stringList.forall(x=>x=="yes")) println("true") else println("false")
}
-----

s1 = hello
s2 = world

h,1
e,1
l,1
o,1

w,1
o,1


yes else no

def twoStrings(s1:String,s2:String):String = {
	val onewc = s1.groupBy(x=>x).map(x=>(x._1,(x._2).length))
	val twowc = s2.groupBy(x=>x).map(x=>(x._1,(x._2).length))
	val stringList = for((oneword,onecount) <- onewc) yield {
		if(twowc.contains(oneword)){
			"YES"
		}
		else "NO"
	}
	if(stringList.exists(x=> x == "YES")) "YES" else "NO"
}

def twoStrings(s1:String,s2:String):String = {
	for(ele <- s1) {
		if(s2.contains(ele)){
			"yes"
		}
		else "no"
	}

}

def signum(x:Int): Int = x match{
	case x if (x>0) => 1
	case x if (x<0) => -1
	case _ => 0
}

def twoStrings(s1:String,s2:String):String = {
	s1.toCharArray.exists(x => s2.contains(x)) match{
		case true => "YES"
		case _ => "NO"	
	}
}

case (noteWord,noteCount) => if(k == true) "yes" else "no"    
--------------------
abc cba

(ab,ba)

aabc cba

for(i <- 0 until s1.legnth)

	

-----------------
find the anagram pairs of the string

abba
1.find out the substrings that can be made--combinations
2.find out if they are anagrams or not-- 
3.perform the wc to test if they are ana or not

def sherlockAndAnagrams(s: String) = {
	val comb = for(i <- 1 until s.length+1) yield {
		s.combinations(i).toList
	}
	comb
}

abba

(0,3),(1,2) - 2 anagrams which are of 1 lettter legnth
ab,ba 1 anagram which is of 2 letter length
abb,bba -anagrame which is of 3 length

a,b,b,a -> (a,b) (b,b) (a,a) -> anacheck(a,b) anacheck(b,b) anacheck(b,a) anacheck(a,a)
ab,bb,ba -> ac(ab,bb) ac(bb,ba) ac(ba,ab)
abb,bba -> ac(abb,bba)

abba

1 to 4

def sherlockAndAnagrams(s: String) = {
	val sumAnagrams = for(j <- 1 until s.length) yield {
		val anagramPairs = for (i <- 0 until s.length-j+1) yield {
			s.substring(i,i+j)
		}
		findingCombinations(anagramPairs).map(x=>anacheck(x._1,x._2)).count(x=>x)
	}
	sumAnagrams.sum
}  
sherlockAndAnagrams(ana)
            aab.       aba
def anacheck(s1:String,s2:String) = {
	val onewc = s1.groupBy(x=>x).map(x=>(x._1,(x._2).length))
	val twowc = s2.groupBy(x=>x).map(x=>(x._1,(x._2).length))
	onewc.equals(twowc)
}
List["a","b","b","a"]
List[("a","b"),("a","b"),("a","a"),("b","b"),("b","a"),("b","a")]
List((a,b), (a,b), (a,a), (b,b), (b,a), (b,a))
def findingCombinations(input: List[String]): List[(String,String)] = {
	var l = List.empty[(String,String)]
	for(i <- 0 until input.length-1){
		for(j<- i+1 until input.length)
		l = l ++ List((input(i),input(j)))
	}
	l
}
---
0,1
0,2
0,3

1,2
1,3

2,3
----
0,1
0,2
0,3

i = 1,j=1
1,l(1)
----------
a,2
b,1

a,2
b,1

j = 1,i = 0,1,2,3.   i = 0,1,2,3

s(0,1) s(1,2) s(2,3) s(3,4) 

j = 2,i = 0,1,2,3. i = 1,2,3

s(0,2) s(1,3) s(2,4) s(3,5) 

j = 3,i=0,1,2,3 i = 2,3

s(0,3) s(1,4) s(2,5) s(3,6)


i = j-1
j = i + 1

we add/sub variables if the logic is dynamic (corelation between i &j)
we add/sub contains if it applies to entire loop(straight)

Vector(
	List(Vector(a, a), Vector(a, b), Vector(b, b)),
	List(Vector(ab, bb), Vector(ab, ba), Vector(bb, ba)),
	List(Vector(abb, bba))
	)


x= Vector(a, a)
anacheck(x(0),x(1))


Vector(List(true, false, true), List(false, true, false), List(true))


anonymous function which has int as the input parameter and boolean as return type

-----------------
an = a r(n-1)

num of trip of with ind

arr = [1,4,16,64]

[1,4,16]



r = 4,n=index+1
a(0)=1
a(1)= 1.(4)^2-1=4;n=2
a(2)=1.(4)^3-1=16;n=3
a(3)=1.(4)^4-1=64
a(n) = a(0).(r)^

arr,r 

1.start forming out the indeces for the given array

for

1,1*4,1*4
1,1.(4)^2-1,1.(4)^3-1,1.(4)^4-1

a(i).(r)^(i+1)

def countTriples(arr:Array[Long],r:Long)={
	val b = ArrayBuffer[Int]() 
	val k = r.toDouble
	for(i <- 0 until arr.length){
		if (arr(i) == ){
			println("inside for"+i)
			b += i
		}
	}
	b
}

countTriples(Array(1,2,2,4),2)
------------
1;1*(2^0)=1




----
b() = 1,4,16,64,256
a



arr(i)*(r^((i+1)-1)))


arr(i)*pow(k,)


1. generate all combinations of 3

1,4,16,64
(1,4,16)
(1,4,64)
(1,16,64)
...

2. iterate over these combinations/triplets and call the checkGp method

def checkGp(a:Long, b:Long, c:Long, r: Long) = {
	if ((a*r == b) && (b*r == c)) true
	else false
}

3. if checkGp returns true then you increment the count.

4. return count

--
1,4,16,64
(1,4,16)

---
def countTriplets(arr: Array[Long], r: Long): Long = {
	val CombString = arr.zipWithIndex.combinations(3).toList.map(a => (a(0)._1,a(1)._1,a(2)._1))
	var count = 0
	for(i <- 0 until CombString.length){
		val check = checkGp(CombString(i)._1,CombString(i)._2,CombString(i)._3,r)
		if(check){
			count +=1
			//println(CombString(i))
		}
	}
	count
}
def checkGp(a:Long, b:Long, c:Long, r: Long) = {
	if ((a*r == b) && (b*r == c)) true
	else false
}

Array(1,2,2,4).zipWithIndex.combinations(3).toList.map(a => (a(0)._1,a(1)._1,a(2)._1))


1,2,2,4

1,2,2
1,2,4
1,2,4
2,2,4

list(3)

for (i <- 0 until l.length)

a(0)(0),a(0)(1),(0)(2)
-----------------------------------
min num of char del to make them anagrams
cde,abc 4

cde,dcf 2

1)check if c contains in string 2 if yes anagram,then del remaining
2)first c next check for d yes next e 

def makeAnagram(a: String, b: String):Int = {  
    var deletions = 0
    val firstMap = a.groupBy(x=>x).map(x=>(x._1,x._2.size))
    val secondMap = b.groupBy(x=>x).map(x=>(x._1,x._2.size))
    val allKeys = firstMap.keySet ++ secondMap.keySet
    for(ch <- allKeys) {
        deletions += math.abs(firstMap.getOrElse(ch,0) - secondMap.getOrElse(ch,0))    
    } 
    deletions
}

def makeAnagram(a: String, b: String):Int = {  
    var deletions = 0
    val firstMap = a.groupBy(x=>x).map(x=>(x._1,x._2.size))
    val secondMap = b.groupBy(x=>x).map(x=>(x._1,x._2.size))
    val allKeys = firstMap.keySet ++ secondMap.keySet
    allKeys.map(ch => math.abs(firstMap.getOrElse(ch,0) - secondMap.getOrElse(ch,0))).sum
}


makeAnagram("cde","abc")
counter = 1
counter = 1+1
counter = 3
 4

--------
c,1
d,1
e,1
----

a,1
b,1
c,1

add the difference between both maps
--------
AABAAB

AAAA
4

if(a(1)==a(2))
	counter +=1
a()

--------------------------
s = abc is valid
if lengths not equal  then find the diff of  highest with the min is 1 ,then valid
else not valid



abcc dddd

-------
def isValid(s: String): String = {
	val WordCount = s.groupBy(x=>x).map(x=>(x._1,(x._2).size)) 
	for ((k,v) <- WordCount) {
		for(k,v) 
	}       

}


-------case 1----

abc

a:1, b:1, c:1

1->3

is valid , because only 1 frequency

eaabbccdde

a:2, b:2, c:2, d:2, e:2

2->5.  -- length of this structure is 1, so valid since only 1 frequency

---case2---
abcc
a:1,b:1,c:2

1->2,2->1.  --- length of this structure is 2, we have to check the following

_._1 diff _._1 should b 1.  ----------this wil satisfy
_._2 diff _._2 is 1



aabbcccddd
a:2,b:2,c:3,d:3

2->1,3->2


_._1 diff _._1.  it is 1
_._2 diff _._2 this is not 1 -- so this will fail


val s = "abcc"
val frq = s.groupBy(identity).mapValues(_.size).groupBy(_._2).mapValues(_.size).toList.sorted
if(frq.size == 1 | (frq.size == 2 && frq(1)._1-frq(0)._1 == 1 && frq(1)._2 == 1)) "YES" else "NO"
------------

0.we have to form those pairs first
count
1.each distinct ele 
2.2nd ele equal then palindrome,not equal then no
3.3rd and above find the mid value and compare all charecters to it left and right then it is 
count is output 

a,s,a,s,d
as,sa,as,sd
asa,sas,asd
asas,sasd

//combination of 2s
for(i <- 0 until s.length-1) yield {
	//List(s.charAt(i),s.charAt(i+1))
	var l = List.empty[Char]
    for(j <-i until i+2) l = l :+ (s.charAt(j))
    l
}

//combination of 3s
for(i <- 0 until s.length-2) yield {
	//List(s.charAt(i),s.charAt(i+1),s.charAt(i+2))
	var l = List.empty[Char]
	for(j <- i until i+3) l = l:+ (s.charAt(j))
	l	
}

//combination of 4s
for(i <- 0 until s.length-3) yield {
	//List(s.charAt(i),s.charAt(i+1),s.charAt(i+2),s.charAt(i+3))
	var l = List.empty[Char]
	for(j <- i until i+4) l = l:+ (s.charAt(j))
	l	
}

for(k <- 1 to s.length) yield {
	for(i <- 0 until s.length-(k-1)) yield {
		var l = List.empty[Char]
		for(j <- i until i+k) l = l:+ (s.charAt(j))
	l		
	}
}

def substrCount(n: Int, s: String): Long = {
	val combinations = for(k <- 1 to s.length) yield {
		s.sliding(k).toList
	}
	combinations.flattten.count(combination => isspecialPalidrome(combination))
}

def isspecialPalindrome(inp:String): Boolean = {
	val mid = inp.length/2
	val left = inp.take(mid)
	val right = inp.takeRight(mid) 
	(left.distinct.length == 1) && (left == right)
}


go through each ele in the list of vector

if one ele the count +=1
else if two ele 


inp = baba
mid = 2
left = inp.take(2) = ba
right = inp.takeRight(2) = ba

(left.ditinct.length == 1) || (left == right)


aa|aa
bb|bb



inp = a
mid= 0
left = inp.take(0) = ""
right = inp.take(0) = ""
(left.ditinct.length == 1) || (left == right)

---------------
two strings of equal length,longest string such that child of both
HARRY,SALLY
AY-->2

pick common ele of both vectors and find the longest ele


def commonchild(s1:String,s2:String) = {
	val c1 = for(ele <- 1 to s1.length) yield {
			s1.sliding(ele).toList
	}
	val c2 = for(ele <- 1 to s2.length) yield {
			s2.sliding(ele).toList
	}
	c1.flatten.intersect(c2.flatten)
}
---

abc.

val s = "harry"

for (i <- 0 until s.length) yield {
	s(i)
}


-------
HARRY

h,a,r,r,y
0,1,2,3,4
ha,hr,hr,hy,ar,ar,ay,rr,ry
01,02,03,04,12,13,14,23,34
har,har,hay,arr,ary,rry
012,013,014,123,124,234
HARRY

val s = "harry" --> 5 1,2,3,4

for (i <- 0 until s.length) yield {
	for(j <- i+1 until s.length) yield {
		 s(i).toString + s(j).toString	
	}	
}

combinations = combinations ++


1st Itr:
i = 0,j = 1

2nd Itr:
i = 1,j = 2
s(1)(2) = 
s(1)(3)
s(1)(4)

3rd Itr:
i = 2,j = 3
s(2)s(3)
s(2)s(4)

----
for (i <- 0 until s.length) yield {
		println("inside i "+i+j+k)
	for(j <- i+1 until s.length-1) yield {
			println("inside j "+i+j+k)
		for(k <- j+1 until s.length) yield {
			println(i,j,k)
			s(i).toString + s(j).toString + s(k).toString
		}	
	}
}

harry
01234
har,har,hay,hrr,hry,arr,ary,ary,rry
012,013,014,023,024,123,124,234
i = 0,j = 1,k = 2
j = 1,2,3
k = 2,3,4

s(0)(1)(2)
s(0)(1)(3)
014
023
024

i = 1,2,3,4
j = 2,3
k = 3,4

123
124

i = 2,34
j = 3
k = 4

234
33
---------
6,5,4,3,2,1

1,2,3,4,5,6
swap = 0
6,4,1 (0)
4,6,1 (1)
4,1,6 (2)
1,4,6 (3)

def swapArr(arr:Array[Int]) = {	
	var counter = 0
	for (i <- 0 until arr.length) {	
		for(j <- 0 until arr.length-1) {
			if(arr(j)>arr(j+1)){
				var temp = arr(j+1)
				arr(j+1) = arr(j)
				arr(j) = temp
				counter += 1				
			}
		}	
	}
	println("Array is sorted in "+counter+"swaps")
	println("First Element "+arr(0))
	println("Last Element "+arr(arr.length-1))	
}
---
Recursion:
def prodcode(x:String):Int={
	 if (x.isEmpty) 1 
	 else (x.head.toInt) * prodcode(x.tail)
}
----
if (arr.length)
-------
6,5

temp = 5
j+1 = 6
j = 5

swapArr(Array(6,4,1))

4,6,1--> i
--------------------------

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
---------------------------
in order is left,centre,right
if there is a child then traverse its left subtree 
store values --> 4 conditions

swapping:

2,4,1,3,5

3,5,1,2,4

root ->1
parent d,child d+1



tree of n nodes,t swap operations each being k
print inorder traversal array


a,b indicies of left and right child

1,1
---------
2,4,1,3,5

	1


-----
insert,find,traverse

[[2,3],[-1,-1],[-1,-1]]

class Node(val data: Int) {
  var leftChild: Option[Node] = None
  var rightChild: Option[Node] = None
  def insertLeft(d: Int) =
    leftChild = Some(new Node(d))
  def insertRight(d: Int) =
    rightChild = Some(new Node(d))
  override def toString = data.toString
}

object Tree {
  val root = new Node(1)
  var lineage = root :: Nil
  def insert(l: Int, r: Int) = {
  	var curr = lineage.head
  	if(l != -1 && r != -1){
	  	curr.insertLeft(l)
	  	curr.insertRight(r)
	  	lineage = lineage.drop(1) ::: List(curr.leftChild.get) ::: List(curr.rightChild.get)
  	}
  	else if(l == -1 && r == -1){
  		lineage = lineage.drop(1) 
  	}
  	else if (r == -1){
  		curr.insertLeft(l)
  		lineage = lineage.drop(1) ::: List(curr.leftChild.get) 
  	}
  	else if (l == -1){
  		curr.insertRight(r)
  		lineage = lineage.drop(1) ::: List(curr.rightChild.get)
  	}
  }

 def traversePrint(n: Node = root): Unit = {
    if (n.leftChild.isEmpty && n.rightChild.isEmpty)
      println(n.data)
    else {
      if (n.leftChild.isDefined) traversePrint(n.leftChild.get)
      println(n.data)
      if (n.rightChild.isDefined) traversePrint(n.rightChild.get)
    }
  }


}

def swapNodes(indexes: Array[Array[Int]], queries: Array[Int]) = {
       indexes.foreach(i => Tree.insert(i(0),i(1)))
       Tree.traversePrint()
}

swapNodes(Array(Array(2,3),Array(-1,4),Array(-1,5),Array(-1,-1),Array(-1,-1)),Array(1))

------------
List(Node(1))
List(Node(2),Node(3))
List(Node(3),Node(4))
List(Node(4),Node(5))
List(Node(5))
List(empty)
-------------
Array(1,2)

1,2



if current height is equal to 
def swapElementsAtHeight(h: Int, q: List[Node] = root :: Nil, currHeight: Int = 1): Unit = {

	if(currHeight == h){
      q.map{n => 
        val t = n.leftChild
        n.leftChild = n.rightChild
        n.rightChild = t
      }
    }
    else{

    }


}
-----------------------
arr = [1,2,3,4] k = 1

(2,1) (3,2) (4,3) = 


number of ele pairs having 

5 2 
1,5,3,4,2
0,1,2,3,4



def pairs(k: Int,  arr: Array[Int]): Int = {
	var counter = 0
	for(i <- 0 until arr.length -1){
		if((arr(i+1) - arr(i)) == k){
			counter += 1
		}
	}
	counter 
}

pairs(2,Array(1,5,3,4,2))



form all the pairs then subtract

i = 0,j = 0
0,1
0,2
0,3
0,4

i = 1,j = 
1,1
1,2
1,3
1,4
-----------------------------------------------
a=(3,5,7)
b=(3,6)
c=(4,6,9)

p<=q and q>=r

(3,6,4),(3,6,6),(5,6,4),(5,6,6)
p,q,r

num of triplets that can be formed 
3 2 3

for each element in b get elements in a less than b and ele in c less than b


def triplets(a:Array[Int],b:Array[Int],c:Array[Int])={
	for(ele <- b) {
		val k = for (i <- 0 until a.length;j <- 0 until c.length) yield {
				if (a(i) <= ele && ele >= c(j)){
					(a(i),ele,c(j))
				}
			}
		println(k.toList)
	}
}	

triplets(Array(3,5,7),Array(3,6),Array(4,6,9))
triplets(Array(1,3,5),Array(2,3),Array(1,2,3))
---
prepare for interview booklet

-----
a = [3,5,7]
b = [3,6]

RichInt,RichDouble,RichChar

Int,Double,Char

1205229139101674619970324529777


h arry
0,1,2,3,4

hungry
