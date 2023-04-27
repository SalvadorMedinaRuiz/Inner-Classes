public class AnonymousClassDemo
{
    public static void main(String[] args)
    {
    	NumberCarrier anObject = new NumberCarrier( ) { // an inner class, that is anonymous 
                      private int number;
                      public void setNumber(int value)
                      {
                          number = value;
                      }
                      public int getNumber( )
                      {
                         return number;
                      }
                   };
                   
         NumberCarrier anObjectToo = new Carrier1();

           NumberCarrier anotherObject = new NumberCarrier( ) // an inner class, that is anonymous class to the interface NumberCarrier
                  {
                      private int number;
                      public void setNumber(int value)
                      {
                          number = value + 10;
                      }
                      public int getNumber( )
                      {
                          return number;
                      }
                  };
                  
        anObject.setNumber(40);
        anObjectToo.setNumber(41);
        anotherObject.setNumber(42);
        showNumber(anObject);
        showNumber(anObjectToo);
        showNumber(anotherObject);
        System.out.println("End of program.");
    }

    public static void showNumber(NumberCarrier o)
    {
        System.out.println(o.getNumber( ));
    }

}
