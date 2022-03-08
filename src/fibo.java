public class fibo {
    static int seri(int n){
        if (n==1 || n==2){
            return 1;
        }
        return seri(n-1)+seri(n-2);
    }

   public  static  void  main(String[]args){
System.out.println(seri(8));

   }
}
