interface area    
      {    
          double pi = 3.14;    
          double calc(double x,double y);    
       }    
    
class rect implements area    
   {    
      public double calc(double x,double y)    
        {    
            return(x*y);    
         }    
   }    
    
class cir implements area    
   {    
      public double calc(double x,double y)    
        {    
            return(pi*x*x);    
         }    
   }    
    
class one    
  {    
     public static void main(String arg[])    
       {    
          rect r = new rect();    
          cir c = new cir();    
          area a;    
    
          a = r;    
          System.out.println("\nArea of Rectangle is : " +a.calc(10,20));    
    
          a = c;    
          System.out.println("\nArea of Circle is : " +a.calc(15,15));    
        }    
  }  