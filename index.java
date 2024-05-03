import java.util.Scanner;

public class index {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    String[] arr1 = in.nextLine().split(" ");
    int N = Integer.parseInt(arr1[0]);
    int M = Integer.parseInt(arr1[1]);

    Graph g = new Graph(N);

    for (int i = 0; i < M; i++) {
      System.out.println("Route " + (i + 1) + ":");
      String[] arr2 = in.nextLine().split(" ");
      int U = Integer.parseInt(arr2[0]);
      int V = Integer.parseInt(arr2[1]);
      g.addEdge(U, V);
    }

    String[] arr = in.nextLine().split(" ");
    int X = Integer.parseInt(arr[0]);
    int Y = Integer.parseInt(arr[1]);

    BreadthFirstPaths bfs = new BreadthFirstPaths(g, X - 1, Y - 1);
    bfs.print();

  }
}