import java.util.*;
class graph{
    @SuppressWarnings("unchecked") public LinkedList<Integer> adj[];
    graph(int v){
        adj=new LinkedList[v];
        for(int i=0;i<v;i++){
            adj[i]=new LinkedList<Integer>();
        }
    }
    void addEdge(int v,int u){
        adj[v].add(u);
    }
    void dfs(int v,boolean visited[]){
        visited[v]=true;
        System.out.print(v+" ");
        Iterator<Integer> it=adj[v].listIterator();
        while(it.hasNext()){
            int n=(int)it.next();
            if(visited[n]!=true)
            dfs(n,visited);
        }
    }
}
public class dfs {
    public static void main(String[] args) {
        graph g=new graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 2);
        boolean visited[]=new boolean[4];
        g.dfs(3,visited);
    }
}

