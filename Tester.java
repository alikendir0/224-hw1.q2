public class Tester {
  public static void main(String[] args) {

    // provide the inputs in the order: N, M, M times->(U,V), X, Y
    int arr[][] = { { 4, 4, 1, 2, 2, 3, 3, 4, 4, 1, 1, 4 }, // regular loop check
        { 3, 3, 1, 2, 2, 3, 3, 1, 1, 3 }, // odd number of vertices
        { 2, 1, 1, 2, 1, 2 }, // only two vertices
        { 3, 3, 1, 2, 2, 3, 3, 1, 1, 1 }, // starting node should be included (X=Y)
        { 8, 8, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 1, 1, 8 },// starting node should be included (X=Y)
    };

    for (int k = 0; k < arr.length; k++) {
      int index = 0;
      int N = arr[k][index++];
      int M = arr[k][index++];
      Graph g = new Graph(N);
      int X = arr[k][arr[k].length - 2];
      int Y = arr[k][arr[k].length - 1];

      for (int i = 0; i < M; i++) {
        int U = arr[k][index++];
        int V = arr[k][index++];
        g.addEdge(U, V);
      }

      BreadthFirstPaths s = new BreadthFirstPaths(g, X - 1, Y - 1);

      System.out.print("TEST CASE " + (k + 1) + ":");
      s.print();

    }
  }
}
