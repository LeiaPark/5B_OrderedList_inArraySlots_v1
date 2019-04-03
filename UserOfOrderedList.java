/**
  test OrderedList
 */

public class UserOfOrderedList {
    public static OrderedList_inArraySlots orderedList =
      new OrderedList_inArraySlots();

    public static void main(String[] commandLine) {
        System.out.println( orderedList);
        System.out.println( System.lineSeparator());

        addOne( "populate an empty list"
               , 0
               ,"[0,]"
               );

        addOne( "add an element that belongs at the front"
               , -11
               ,"[-11,-0,]"
               );

        addOne( "add an element that belongs at the back"
               , 5
               ,"[-11,-0,5,]"
               );

        addOne( "add an element that belongs somewhere in the middle"
               , 2
               ,"[-11,0,2,5,]"
               );

        addOne( "add an element that is the same as another element"
               , 0
               ,"[-11,0,0,2,5,]"
               );
        
        System.out.println( "Size: " + orderedList.size() + " = " + orderedList + System.lineSeparator());

        // test accessor
        System.out.println( "sample elements from list:");
        for( int elemIndex = 1; elemIndex < orderedList.size(); elemIndex *= 2 ) {
            System.out.println( "element " + elemIndex + ": "
                              + orderedList.get( elemIndex)
                              );
        }
        
        // test removing an element
        System.out.println("removing value " + orderedList.remove( 3)
                          + ", leaving " + orderedList.size() + " elements:");
        System.out.println( orderedList);
        
    }

    
    /**
      run one test
     */
    private static void addOne( String description
                              , int value
                              , String expect
                              ) {
        System.out.println( description);
        orderedList.add( value);

        // check 
        System.out.println( 
            "result:   "
          + orderedList
          + " ...expecting "
          + expect
          + System.lineSeparator());
     }

}    
