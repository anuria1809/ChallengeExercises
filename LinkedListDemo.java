package self.practise;

public class LinkedListDemo {
	public static void main(String[] args) {

		// create new linked list
		LinkedList ll = new LinkedList();

		// insert 5 data to the list
		for (int i = 0; i < 5; i++) {
			DataItems data = new DataItems(i, "Data_" + i);
//			ll.insertNode(data);
			ll.insertNodeAtEnd(data);
		}

		// display the inserted data
		System.out.println("5 inserted datas are : \n");
		ll.displayList();

		// testing deleting node at the beginning
		System.out.println("\nlist after deleting first node data : \n");
		ll.deleteNode();
		ll.displayList();

		// testing deleting node at the index
		System.out.println("\nlist after deleting second index data : \n");
		ll.deleteNodeAtIndex(2);
		ll.displayList();

		// testing inserting node at the index
		System.out.println("\nlist after inserting second index data : \n");
		DataItems data = new DataItems(11, "Data_11");
		ll.insertNodeAtIndex(2, data);
		ll.displayList();

		// testing searching node with key
		System.out.println("\nSearching list for key 11 : \n");
		ll.searchKey(11);

		// size of list
		System.out.println("\nsize of list : " + ll.size());

		// testing reversing linked list
		System.out.println("\nlist after reversing linked list : \n");
		ll.reverseLinkedList();
		ll.displayList();
	}

}

class DataItems {

	private int key;
	private String value;

	public DataItems(int _key, String _value) {
		this.key = _key;
		this.value = _value;
	}

	public int getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}

	public String toString() {
		return "(" + getKey() + "," + getValue() + ")";
	}
}

class Node {
	// immutable class representing head node of linked list

	private DataItems dataItems;
	private Node nextNode;

	public void setNextNode(Node _nextNode) {
		this.nextNode = _nextNode;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public DataItems getDataItems() {
		return dataItems;
	}

	public void setDataItems(DataItems _dataItems) {
		this.dataItems = _dataItems;
	}
}

class HeadNode {
	// immutable class representing head node of linked list

	Node nextNode;

	public void setNextNode(Node _nextNode) {
		nextNode = _nextNode;
	}

	public Node getNextNode() {
		return nextNode;
	}
}

class LinkedList {

	HeadNode head;

	public LinkedList() {
		head = new HeadNode();
	}

	// insert node at the beginning of the list
	public void insertNode(DataItems _data) {
		Node newNode = new Node();
		newNode.setDataItems(_data);
		Node nextNode = head.getNextNode();
		head.setNextNode(newNode);
		newNode.setNextNode(nextNode);
	}

	// insert node at the end of the list
	public void insertNodeAtEnd(DataItems _data) {
		Node newNode = new Node();
		newNode.setDataItems(_data);
		int sizeOfList = size();
		if (sizeOfList == 0) {
			System.out.println("executes only once");
			insertNode(_data);
		} else {
			Node lastNode = nodeAtIndex(sizeOfList - 1);
			lastNode.setNextNode(newNode);
		}
	}

	// delete node at the beginning of the list
	public void deleteNode() {
		Node toBeDeletedNode = head.getNextNode();
		if (toBeDeletedNode != null) {
			Node nextNode = toBeDeletedNode.getNextNode();
			head.setNextNode(nextNode);
			toBeDeletedNode.setNextNode(null);
		} else {
			System.out.println("No nodes to be deleted");
		}

	}

	// display all nodes data
	public void displayList() {
		Node nodes = head.getNextNode();
		int i = 0;
		while (nodes != null) {
			DataItems data = nodes.getDataItems();
			System.out.println("Node " + i + " : " + data.toString());
			nodes = nodes.getNextNode();
			i++;
		}
	}

	// reverse order of linked list
	public void reverseLinkedList() {
		int sizeOfList = size();
		Node lastNode = nodeAtIndex(sizeOfList - 1);
		Node snode, tnode;
		for (int i = sizeOfList - 2; i >= 0; i--) {
			snode = nodeAtIndex(i);
			tnode = snode.getNextNode();
			tnode.setNextNode(snode);
		}
		nodeAtIndex(0).setNextNode(null);
		head.setNextNode(lastNode);
	}

	// search list by key
	public void searchKey(int _key) {
		int i = 0;
		DataItems data = dataAtNodeIndex(i);
		while (data != null) {
			if (data.getKey() == _key) {
				System.out.println("Node at index : " + i + " has data item : " + data.toString());
			}
			i++;
			data = dataAtNodeIndex(i);
		}
	}

	// insert a node at index
	public void insertNodeAtIndex(int _index, DataItems _data) {
		Node newNode = new Node();
		newNode.setDataItems(_data);
		if (_index == 0) {
			insertNode(_data);
		} else {
			Node prevNode = nodeAtIndex(_index - 1);
			if (prevNode != null) {
				Node nextNode = prevNode.getNextNode();
				newNode.setNextNode(nextNode);
				prevNode.setNextNode(newNode);
			}
		}
	}

	// delete a node at index
	public void deleteNodeAtIndex(int _index) {
		if (_index == 0) {
			deleteNode();
		} else {
			Node prevNode = nodeAtIndex(_index - 1);
			if (prevNode != null) {
				Node targetNode = prevNode.getNextNode();
				Node nextNode = targetNode.getNextNode();
				targetNode.setNextNode(null);
				prevNode.setNextNode(nextNode);
			}
		}
	}

	// return data item at particular node
	public DataItems dataAtNodeIndex(int _index) {
		Node nodes = nodeAtIndex(_index);
		if (nodes != null) {
			return nodes.getDataItems();
		} else {
			return null;
		}
	}

	// return node at particular index
	private Node nodeAtIndex(int _index) {
		if (_index < 0) {
			return null;
		} else {
			Node nodes = head.getNextNode();
			int i = 0;
			while (i < _index && nodes != null) {
				nodes = nodes.getNextNode();
				i++;
			}
			return nodes;
		}
	}

	// return the size of linked list
	public int size() {
		int count = 0;
		Node nodes = nodeAtIndex(count);
		while (nodes != null) {
			nodes = nodeAtIndex(++count);
		}
		return count;
	}
}
