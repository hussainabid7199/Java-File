// Write a program to print the following pattern.        
//      1
//     1 1
//    1 2 1
//   1 3 3 1
//  1 4 6 4 1



// public class Pascaltraingle {
//     public static void main(String args[]) {
//         try {
//             int n = 5;
//             for(int i = 1; i<=n; i++){
//                 for(int j = n; j>=i; j--){
//                     System.out.print(" ");
//                 }
//                 for(int j = 1; j<=i; j++){
//                     System.out.print(j);
//                 }System.out.println();
//             }
//         } catch (Exception e) {
//             // TODO: handle exception
//         }
//     }
// }


public class Pascaltraingle
{
   public static void main(Stringlearn[] args)
   {
      int row=5, i, j, space, num;
      for(i=0; i<row; i++)
      {
         for(space=row; space>i; space--)
         {
           System.out.print("_");
         }
         num=1;
         for(j=0; j<=i; j++)
         {
            System.out.print(num+ "_");
            num = num*(i-j)/(j+1);
         }
         System.out.print("\n");
      }
   }
}