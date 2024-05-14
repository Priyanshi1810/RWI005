import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream2 {
    public static void main(String[] args) {

      List<Integer> MyList= Arrays.asList(1,2,3,4,58,7,220,8,5,121,85,1,2,220);
      List<Integer>  MyFilteredList= MyList.stream().filter(x->x%2==0).collect(Collectors.toList());
      System.out.println(MyFilteredList); 

//       
        List<Integer> MyMappedList =MyFilteredList.stream().map(x->x/2).collect(Collectors.toList());
        System.out.println(MyMappedList);

        
        List<Integer> REMOVEDUPNUM =MyFilteredList.stream().filter(x->x%2==0).map(x->x/2).distinct().collect(Collectors.toList());
        System.out.println(REMOVEDUPNUM); 
        //sorted number
        List<Integer> SortedNum =MyFilteredList.stream().filter(x->x%2==0).map(x->x/2).distinct().sorted().collect(Collectors.toList());
        System.out.println(SortedNum);

        
        List<Integer> AsceNum =MyFilteredList.stream().filter(x->x%2==0).map(x->x/2).distinct().sorted((a,b) -> (a-b)).collect(Collectors.toList());
        System.out.println( AsceNum );


        //sorted ,you want to make in Descending
        List<Integer> DescNum =MyFilteredList.stream().filter(x->x%2==0).map(x->x/2).distinct().sorted((a,b) -> (b-a)).collect(Collectors.toList());
        System.out.println( DescNum ); //output  [110, 29, 4, 2, 1]


        //print only 2 element after sorting
        List<Integer> LimitNum =MyFilteredList.stream().
                filter(x->x%2==0).
                map(x->x/2).
                distinct().
                sorted((a,b) -> (b-a)).
                limit(2).
                collect(Collectors.toList());
        System.out.println( LimitNum ); 

        
        List<Integer> SkipNum =MyFilteredList.stream().
                filter(x->x%2==0).
                map(x->x/2).
                distinct().
                sorted((a,b) -> (b-a)).
                limit(2).
                skip(1).
                collect(Collectors.toList());
        System.out.println( SkipNum );


        
        List<Integer> PEEKNUM = Stream.iterate(0,x->x+1).
                limit(101).
                skip(1).
                filter(x->x%2==0).
                map(x->x/10).
                distinct().
                sorted().
                peek(x-> System.out.println(x)).
                collect(Collectors.toList());
        System.out.println( PEEKNUM );

       
        Integer integer = Stream.iterate(0,x-> x+1).limit(101).map(x->x/20).distinct().peek(System.out::println).max((a,b)->a-b).get();
        System.out.println(integer);
     

        
        Integer integer1 = Stream.iterate(0,x-> x+1).limit(101).map(x->x/20).distinct().peek(System.out::println).min((a,b)->a-b).get();
        System.out.println(integer1);
       

      
       Long  MyCount = Stream.iterate(0,x-> x+1).limit(101).map(x->x/20).distinct().distinct().count();
       System.out.println(MyCount); 
}
}