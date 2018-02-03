import java.util.*;

public class Graph2 {
	private int V;
	private LinkedList<Integer> adj[];
	
	Graph2(int V){
		this.V=V;
		adj = new LinkedList[V];
		for(int i=0;i<V;i++){
			adj[i]=new LinkedList<>();
		}
	}
	
	void addEdge(int src, int dest){
		adj[src].add(dest);
	}
	
	void BFS(int s){
		boolean visited[] = new boolean[V];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		visited[s]=true;
		queue.add(s);
		while(!queue.isEmpty()){
			s=queue.poll();
			System.out.print(s+ " " );
			Iterator<Integer> i = adj[s].listIterator();
			while(i.hasNext()){
				int n =i.next();
				if(!visited[n]){
					visited[n]=true;
					queue.add(n);
				}
			}
		}
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int T=in.nextInt();
		
		for(int i=0;i<T;i++){
			int N=in.nextInt();
			Graph2 G= new Graph2(N);
			System.out.print("Enter no. of Edges : ");
			int E =in.nextInt();
			for(int j=0;j<E;j++){
				int src=in.nextInt();
				int dest=in.nextInt();
				G.addEdge(src, dest);
			}
			G.BFS(2);
		}
		in.close();
	}
}
