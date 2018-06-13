
import java.util.Scanner;
public class DijkastraMain {
	
	public static void main(String args[]) {
		int n=5;							//for five node only.
		int inf=99;
		//int distance[]; 
		//int v=0;
		int[][] graph=new int[n][n];
		//int[] sptSet=new int[n];
		int[] visited=new int[n];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<n;i++) {
			//sptSet[i]=0;
			visited[i]=0;
			for(int j=0;j<n;j++) {
				graph[i][j]=sc.nextInt();
				if(graph[i][j]<=0)
					graph[i][j]=inf;
			}
		}
		DijkastraDriver Di=new DijkastraDriver();
		for(int src=0;src<n;src++){
		Di.Dij(graph,src,n);
		}
		
sc.close();   }
}