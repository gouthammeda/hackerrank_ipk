notes: ""
magazine:

intialize  2 arrays for storing these strings
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