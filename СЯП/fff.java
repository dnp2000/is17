package fff;


public class fff {

  public static void main(String[] args) {
 
   int w = 5; //размер матрицы
   int v = w - 1; //номер крайнего элемента
 //создание и инициализация матрицы
  int [][] a = new int [w][w];
  System.out.println("Задана матрица размерностью " + w +":");
  
  for (int i=0; i<w; i++){
    for (int j=0; j<w; j++){
      a[i][j] = i+j;
      a[v-j][v-i]=a[i][j];
    }
  }
  
  for (int i=0; i<w; i++){
    for (int j=0; j<w; j++){
      System.out.print(a[i][j]+" ");
    }
    System.out.println();
  }
  
   boolean symmetric = true; //селектор для вывода результата
 //цикл для сравнения элементов
   for (int i=0; i<v; i++){
     for (int j=0; j<v-i; j++){
      int m = v-j;
      int n = v-i;
System.out.println("a["+i+"]["+j+"]="+a[i][j]+" <--> a["+m+"]["+n+"]="+a[m][n]);
      if (a[i][j]!=a[m][n]){
        symmetric = false;
        break;
      }
     }
    if (!symmetric) {
    System.out.println("Матрица не симметрична.");
    break;
   }
  }
  if (symmetric) {
    System.out.println("Матрица симметрична.");
    }
 }
}
