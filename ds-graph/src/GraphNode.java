import java.util.ArrayList;

public class GraphNode {
	
	public String name;
	public int index;
	
	public GraphNode(String name, int index) {
		super();
		this.name = name;
		this.index = index;
	}
	
	public ArrayList<GraphNode> neighbors = new ArrayList<>();

}
