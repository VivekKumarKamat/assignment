package Reverse;

 class Reverse1 
{
  public static void main(String[] args) 
  {
     String str = "VIVEKKUMARKAMAT";
     char chars[] = str.toCharArray(); 
     for(int i= chars.length-1; i>=0; i--) 
     {
      System.out.print(chars[i]);
     }

   }
}
