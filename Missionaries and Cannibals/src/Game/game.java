//James Georgiades-Callado 
// Breadth-First Search = Tree Search

package Game;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;

public class game {

	static public int[] enviromentArray = {3, 3, 1, 0, 0, 0};
	public int[] finalState;
	public int[] goalState = {0, 0, 0, 3, 3, 1};
	public ArrayDeque<Node<int[]>> stateQueue = new ArrayDeque<Node<int[]>>();
	public ArrayDeque<Node<int[]>> stateSeen = new ArrayDeque<Node<int[]>>();
	public static States states = new States();
	public static Node<int[]> root = new Node<int[]>(states.state1);
	public static Tree<int[]> tree = new Tree<int[]>(root);
	/*
	 * 
	public static final int[] state1 = {3, 3, 1, 0, 0, 0};
	public static final int[] state2 = {2, 3, 0, 1, 0, 1};
	public static final int[] state3 = {3, 2, 0, 0, 1, 1};
	public static final int[] state4 = {1, 3, 0, 2, 0, 1};
	public static final int[] state5 = {3, 1, 0, 0, 2, 1};
	public static final int[] state6 = {2, 2, 0, 1, 1, 1};
	public static final int[] state7 = {3, 2, 1, 0, 1, 0};
	public static final int[] state71 = {3, 2, 1, 0, 1, 0};
	public static final int[] state8 = {2, 3, 1, 1, 0, 0};
	public static final int[] state9 = {1, 2, 0, 2, 1, 1};
	public static final int[] state10 = {3, 0, 0, 0, 3, 1};
	public static final int[] state11 = {2, 1, 0, 1, 2, 1};
	public static final int[] state12 = {3, 1, 1, 0, 2,0};
	public static final int[] state13 = {2, 1, 0, 1, 2, 1};
	public static final int[] state14 = {1, 1, 0, 2, 2, 1};
	public static final int[] state15 = {2, 0, 0, 1, 3, 1};
	public static final int[] state16 = {2, 1, 1, 1, 2, 0};
	public static final int[] state17 = {1, 2, 1, 2, 1, 0};
	public static final int[] state18 = {1, 3, 1, 2, 0, 0};
	public static final int[] state19 = {2, 2, 1, 1, 1, 0};
	public static final int[] state20 = {1, 2, 0, 2, 1, 1};
	public static final int[] state21 = {2, 1, 0, 1, 2, 1};
	public static final int[] state22 = {0, 2, 0 ,3, 1, 1};
	public static final int[] state23 = {2, 0, 1, 1, 3, 0};
	public static final int[] state24 = {1, 2, 1, 2, 1, 0};
	public static final int[] state25 = {0, 3, 1, 3, 0, 0};
	public static final int[] state26 = {1, 3, 1, 2, 0, 0};
	public static final int[] state27 = {0, 1, 0, 3, 2, 1};
	public static final int[] state28 = {1, 1, 1, 2, 2, 0};
	public static final int[] state29 = {0, 2, 1, 3, 1, 0};
	public static final int[] state30 = {2, 1, 1, 1, 2, 0};
	public static final int[] state31 = {1, 2, 1, 3, 1, 0};
	public static final int[] state32 = {1, 0, 0, 2, 3, 1};
	public static final int[] state33 = {0, 0, 0, 3, 3, 1};
	 */
	
	public static void main(String[] args) {

		root.addChildAt(0, new Node<int[]>(states.state2));
		root.addChildAt(1, new Node<int[]>(states.state3));
		root.addChildAt(2, new Node<int[]>(states.state4));
		Node<int[]> node4 = new Node<int[]>(states.state5);
		root.addChildAt(3, node4);
		Node<int[]> node5 = new Node<int[]>(states.state6);
		root.addChildAt(4, node5);
		tree.setRoot(node4);
		Node<int[]> node7 = new Node<int[]>(states.state7);
		node4.addChildAt(0, node7);
		tree.setRoot(node5);
		node5.addChildAt(0, new Node<int[]>(states.state8));
		tree.setRoot(node7);
		node7.addChildAt(0, new Node<int[]>(states.state9));
		Node<int[]> node10 = new Node<int[]>(states.state10);
		node7.addChildAt(1, node10);
		node7.addChildAt(2, new Node<int[]>(states.state11));
		tree.setRoot(node10);
		Node<int[]> node12 = new Node<int[]>(states.state12);
		node10.addChild(node12);
		tree.setRoot(node12);
		node12.addChildAt(0, new Node<int[]>(states.state13));
		Node<int[]> node14 = new Node<int[]>(states.state14);
		node12.addChildAt(1, node14);
		node12.addChildAt(2, new Node<int[]>(states.state15));
		tree.setRoot(node14);
		node14.addChildAt(0, new Node<int[]>(states.state16));
		node14.addChildAt(1, new Node<int[]>(states.state17));
		node14.addChildAt(2, new Node<int[]>(states.state18));
		Node<int[]> node19 = new Node<int[]>(states.state19);
		node14.addChildAt(3, node19);
		tree.setRoot(node19);
		node19.addChildAt(0, new Node<int[]>(states.state20));
		node19.addChildAt(1, new Node<int[]>(states.state21));
		Node<int[]> node22 = new Node<int[]>(states.state22);
		node19.addChildAt(0, node22);
		node19.addChildAt(0, new Node<int[]>(states.state23));
		tree.setRoot(node22);
		node22.addChildAt(0, new Node<int[]>(states.state24));
		Node<int[]> node25 = new Node<int[]>(states.state25);
		node22.addChildAt(1, node25);
		node22.addChildAt(2, new Node<int[]>(states.state26));
		tree.setRoot(node25);
		Node<int[]> node27 = new Node<int[]>(states.state27);
		node25.addChild(node27);
		tree.setRoot(node27);
		Node<int[]> node28 = new Node<int[]>(states.state28);
		node27.addChildAt(0, node28);
		Node<int[]> node29 = new Node<int[]>(states.state29);
		node27.addChildAt(1, node29);
		node27.addChildAt(2, new Node<int[]>(states.state30));
		node27.addChildAt(3, new Node<int[]>(states.state31));
		tree.setRoot(node28);
		node28.addChildAt(0,  new Node<int[]>(states.state32));
		node28.addChildAt(1,  new Node<int[]>(states.state33));
		tree.setRoot(root);
		System.out.println("Welcome");
		System.out.println("{MissionariesRight, CannibalsRight, BoatLeft, MissionariesRight, CannibalsRight, BoatRight}");
		game play = new game();
		play.treeSearch();
	}
	

	
	public boolean eatMissionaries(int [] nodeArray){
		if(nodeArray[2]  == 1 ){
		if(nodeArray[0] != 0 && nodeArray[0] < nodeArray[1]){
			System.out.println("Your Missionaries are food");
			return true;
		} else {
			if(nodeArray[3] != 0 && nodeArray[3] < nodeArray[4]){
			System.out.println("Your Missionaries are food");
		}
		}
		} else if(nodeArray[5] == 1){
			if(nodeArray[3] != 0 && nodeArray[3] < nodeArray[4]){
				System.out.println("Your Missionaries are food");
				return true;
			} else  {
				if(nodeArray[0] != 0 && nodeArray[0] < nodeArray[1]){
					System.out.println("Your Missionaries are food");
					return true;
			}
		}
		}
		return false;
	}
	
	//Breadth-First Search
	public Node<int[]> treeSearch(){
		int i = 0;
		Node<int[]> rootTree = tree.getRoot();
		stateQueue.add(rootTree);
		System.out.println(Arrays.toString(rootTree.getData()));

		while(!stateQueue.isEmpty()){
			System.out.println("Count" + i);
			Node<int[]> node = stateQueue.remove();
			int[] array = node.getData();
			System.out.println(Arrays.toString(array));
			int resCheckState = checkState(node);
			if(resCheckState == 2){
				System.out.println("Goal State Found");
				System.out.println(Arrays.toString(node.getData()));
				System.out.println("The path we took was:");
				while(!stateSeen.isEmpty()) {
				Node<int[]> printNode = stateSeen.remove();
				int[] arrayPrint = printNode.getData();
				System.out.println(Arrays.toString(arrayPrint));
				}
				return node;
			} else if(resCheckState == 0){
				expandFrontier(node);
			}
			i++;
		}
		
		
		return null;
	}
	
	public void expandFrontier(Node<int[]> node){
		tree.setRoot(node);
		List<Node<int[]>> nodesToAdd = node.getChildren();
		System.out.println("The Node Expands to: ");
		for(int i = 0; i < nodesToAdd.size(); i++){
			int[] nodeTrial = nodesToAdd.get(i).getData();
			System.out.println(Arrays.toString(nodeTrial));
			stateQueue.add(nodesToAdd.get(i));
		}
	}
	
	public int checkBoatPosition(int[] node){
		if(node[2] == 1){
			return 2;
	}
		return 5;
	}
	
	public int[] moveBoat(int[] stateArray){
		if(stateArray[2] == 1){
			stateArray[2] = 0;
			stateArray[5] = 1;
		} else{
			stateArray[5] = 0;
			stateArray[2] = 1;
		}
		return stateArray;
	}
	

	
	public int checkState(Node<int[]> node){
		//int[] testState = stateQueue.remove();
		int[] nodeArray = node.getData();
		if(nodeArray[0] >= nodeArray[1] || nodeArray[3] >= nodeArray[4]){
			stateSeen.add(node);
			if(checkForGoalState(nodeArray)){
				finalState = nodeArray;
				return 2;
			}else if (eatMissionaries(nodeArray)){
				stateSeen.removeLast();
				return 1;
			}
	} 
		
		return 0;
	}
	
	public boolean checkForGoalState(int[] stateArray){
		if(Arrays.equals(stateArray, goalState)){
			return true;
		} else {
			return false;
		}
	}

}
