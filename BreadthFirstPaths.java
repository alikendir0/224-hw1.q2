import java.util.*;

public class BreadthFirstPaths {
  private boolean[] marked;
  private int[] edgeTo;
  private int lastNode;
  private ArrayList<Integer> path;
  private boolean hasCycle = false;

  public BreadthFirstPaths(Graph G, int s, int o) {
    marked = new boolean[G.V()];
    edgeTo = new int[G.V()];

    bfs(G, s, o);
  }

  private void bfs(Graph G, int s, int o) {
    Queue<Integer> queue = new LinkedList<Integer>();
    marked[s] = true;
    queue.add(s);
    while (!queue.isEmpty()) {
      int v = queue.remove();

      for (int w : G.adj(v)) {
        if (!marked[w]) {
          edgeTo[w] = v;
          marked[w] = true;
          queue.add(w);
        } else if (marked[w] && w != edgeTo[v]) {
          path = new ArrayList<>();
          lastNode = w;
          int temp = -1;
          for (int i = lastNode; i > s; i = edgeTo[i]) {
            path.add(i + 1);
            temp = i;
          }
          path.add((edgeTo[temp]) + 1);
          for (int i = v; i > s && !path.contains(i + 1); i = edgeTo[i]) {
            path.add(i + 1);
            if ((edgeTo[temp] == edgeTo[i]) && (path.contains(o + 1) && path.contains(s + 1))) {
              hasCycle = true;
              return;
            }
          }
        }
      }
    }
  }

  public void print() {
    if (hasCycle) {
      Collections.sort(path);
      System.out.println(path);
    } else
      System.out.println("No Cycle Found!");
  }
}
