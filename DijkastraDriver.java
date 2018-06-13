
import java.util.Scanner;
public  class DijkastraDriver {
	
		public void Dij(int graph[][],int src,int n) {
		
			//int n=5;
			int inf=99;
			int distance[]; 
			int v=0;
			//int[][] graph=new int[n][n];
			//int[] sptSet=new int[n];
			int[] visited=new int[n];
			Scanner sc=new Scanner(System.in);
		/*	
			for(int i=0;i<n;i++)
			{	sptSet[i]=0;
				visited[i]=0;
				for(int j=0;j<n;j++)
				{
					graph[i][j]=sc.nextInt();
					if(graph[i][j]<=0)
						graph[i][j]=inf;
				}
			}
			
			
			*/
			
			
			//for(int l=0;l<n;l++){
			//	int src=l;
				distance=graph[src];
				for(int i=0;i<n;i++)
					visited[i]=0;
				visited[src]=1;
				distance[src]=0;
				for(int i=0;i<n;i++){
					inf=999;
					for(int j=0;j<n;j++){
						if(inf>distance[j] && visited[j]!=1){
							inf=distance[j];
							v=j;
						}
					}
					visited[v]=1;
					for(int j=0;j<n;j++){
						if((inf+graph[j][v] < distance[j]) && visited[j]!=1)
							distance[j]=inf+graph[j][v];
							//sptSet[j]=v;
					}
				}
				for(int i=0;i<n;i++)
				System.out.print(distance[i]+"///");
				System.out.println("");
				sc.close();			
}		
			
	
}
