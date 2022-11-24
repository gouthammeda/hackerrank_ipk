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
