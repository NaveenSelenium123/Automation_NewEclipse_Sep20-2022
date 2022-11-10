package JavaDay10_Exception;

public class Questionset {
	/*DAY10:
------
1.Exception
2.throw and throws
3.User define exception


QUESTIONS(Theory)
-------------------

1.what is Exception?
2.Explain about types of Expection?
3.Difference between checked expection and unchecked expection?
4.What are the differences between exception and error?
5.What is the super class for Exception and Error?
6.Exceptions are defined in which java package
7.What is throw keyword in java?
8.Can we have try block without catch block?
9.Can we write multiple catch blocks under single try block?
10.How to write user defined exception or custom exception in java?
11.What are the different ways to print exception message on console?
12.What are the differences between final finally and finalize in java?
13.Can we write return statement in try and catch blocks?
14.Can we write return statement in finally block?
15.What are the differences between throw and throws?
16.What are the Exception Handling Keywords in Java?
17.Explain Java Exception Hierarchy?
18.How to create custom Exception?

QUESTIONS(Programs)
---------------------------
QUESTION 1:
------------
Description : Find the output for the program:

        public class Test
        {
          public static void main(String[] args)
            {
          try
          {
                System.out.printf("1");
              int sum = 9 / 0;
                System.out.printf("2");
          }
          catch(ArithmeticException e)
          {
                System.out.printf("3");
          }
           catch(Exception e)
          {
                System.out.printf("4");
          }
          finally
          {
             System.out.printf("5");
          }
             }
         }

QUESTION 2:
------------
Description : Find the output for the program:

          public class Test
            {
           private void m1()
               {
           m2();
            System.out.printf("1");
                 }
             private void m2()
                {
            m3();
            System.out.printf("2");
                 }
           private void m3()
               {
           System.out.printf("3");
          try
          {
                int sum = 4/0;
                System.out.printf("4");
                   }
          catch(ArithmeticException e)
          {
               System.out.printf("5");
          }
            
               System.out.printf("7");
                }
            public static void main(String[] args)
             {
                Test obj = new Test();
               obj.m1();
               }
                }

QUESTION 3:
------------
Description : Find the output for the program:


               public class Test
                {
              public static void main(String[] args)
                {
                  try
                {
                 System.out.printf("1");
                  int data = 5 / 0;
                }
               catch(ArithmeticException e)
                {
               System.out.printf("2");
               System.exit(0);
                 }
               finally
                  {
                System.out.printf("3");
                  }
               System.out.printf("4");
                 }
                  }

QUESTION 4:
------------
Description : Find the output for the program:
               public class Test
                 {
               public static void main(String[] args)
                 {
                 try
                 {
                System.out.printf("1");
                  int data = 5 / 0;
                  }
               catch(ArithmeticException e)
                 {
               Throwable obj = new Throwable("Sample");
                try
                 {
                throw obj;
                  } 
                catch (Throwable e1) 
                   {
                System.out.printf("8");
                   }
                   }
              finally
               {
              System.out.printf("3");
               }
            System.out.printf("4");
               }
                }

QUESTION 5:
------------
Description : Find the output for the program:

              import java.io.EOFException;
              import java.io.IOException;
 
               public class Test
               {
              public static void main(String[] args)
              {
              try
              {
              System.out.printf("1");
              int value = 10 / 0;
               throw new IOException();
               }
              catch(EOFException e)
                 {
            System.out.printf("2");
              } 
           catch(ArithmeticException e)
             {
            System.out.printf("3");
               }
           catch(NullPointerException e)
            {
            System.out.printf("4");
            }
           catch(IOException e)
             {
            System.out.printf("5");
            }
               catch(Exception e)
           {
            System.out.printf("6");
              }
              }
              }
        
 

 */
}
