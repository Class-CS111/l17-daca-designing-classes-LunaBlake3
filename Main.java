/********************************************
*	DACArecipient Tester
*********************************************
*	PROGRAM DESCRIPTION:
*	This program is to test methods of the DACArecipient class.
*********************************************/
class Main 
{
  public static void main(String[] args) 
	{
   DACArecipient person1;
   DACArecipient person2;
   
   person1 = new DACArecipient();
   person2 = new DACArecipient();

   person1.setAll("Blake", "Luna", "12-3-456", "USA", 
   2456923, 2458401, 2461045, 'M');
   person2.setAll("Blake", "Luna-Beltran", "12-3-456", "USA", 
   2456923, 2458401, 2461045, 'M');


   System.out.println(person1);
   System.out.println(person2);
   System.out.println(person1.equals(person2));
   System.out.println(person1.printCard());
  }
}