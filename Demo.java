public class Demo {

    public static void main(String[] args) {
      int n = 5;
      if (args.length != 0) {
        n = Integer.parseInt(args[0]);
      }
      printLoop(n);
      System.out.println();
      //System.out.print(arrDeepToString(create2DArray(6,2,3)));
      //System.out.println();
      //System.out.print(arrDeepToString(create2DArrayRandomized(6,4,4)));
      //System.out.println();
    }

    public static void printLoop(int n) {
      int x = 0;
      for(int i = 1; i <= n; i++) {
        for(int j = 0; j < (n - x); j++) {
           System.out.print(i);
        }
        System.out.println();
        x = x + 1;
      }
    }

    public static String arrToString(int[] arr){
      String result = "{";
      int i = 0;
      if (arr.length == 0) {
        return (result + "}");
      }
      if (arr.length == 1) {
        return (result + Integer.toString(arr[0]) + "}");
      }
      else {
        while (i < arr.length - 1) {
          result = result + Integer.toString(arr[i]) + ", ";
          i = i + 1;
        }
        result = result + Integer.toString(arr[i]) + "}";
      }
      return result;
    }

    public static String arrDeepToString(int[][] arr) {
      int[][]a = arr;
      int i = 0;
      String result = "{";
      while (i < a.length) {
        result = result + "{";
        int x = 0;
        if (a[i].length == 0){
          result = result + "}, ";
          i = i + 1;
        }
        else {
          while (x < a[i].length - 1) {
            result = result + Integer.toString(a[i][x]) + ", ";
            x = x + 1;
          }
          result = result + Integer.toString(a[i][x]) + "}, ";
          i = i + 1;
      }
    }
      return (result.substring(0,result.length()-2) + "}");
    }

    public static int[][] create2DArray(int rows, int cols, int maxValue) {
      int[][] arr = new int[rows][cols];
      int i = 0;
      int x = 0;
      while (i < rows) {
        x = 0;
        while (x < cols) {
          arr[i][x] = (int)(Math.random() * ((maxValue + 1)));
          x = x + 1;
        }
        i = i + 1;
      }
      return arr;
    }

    public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue) {
      int[][] arr = new int[rows][];
      int i = 0;
      int x = 0;
      int column = 0;
      while (i < rows) {
        x = 0;
        column = (int)(Math.random() * ((cols + 1)));
        arr[i] = new int[column];
        while (x < column) {
          arr[i][x] = (int)(Math.random() * ((maxValue + 1)));
          x = x + 1;
        }
        i = i + 1;
      }
      return arr;
    }
  }
