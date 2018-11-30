package com.stream;

import java.util.*; 
import java.util.stream.*; 

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
  
class Demo 
{ 
  public static void main(String args[]) 
  { 
    
   List<Integer> number = Arrays.asList(2,3,4,5); 
    System.out.println(number);
  
    Stream <Integer> square = number.stream().map(x -> x*x);
    
    square.forEach(System.out::println);
    System.out.println(square); 
   
    List<Integer> square1 = number.stream().map(x -> x*x). 
            collect(Collectors.toList()); 
    System.out.println(square1);
    
    List<String> names = 
                Arrays.asList("Reflection","Collection","Stream"); 
    System.out.println(names);
  
    List<String> result = names.stream().filter(s->s.startsWith("S")). 
                          collect(Collectors.toList()); 
    System.out.println(result); 
  
    List<String> show = 
            names.stream().sorted().collect(Collectors.toList());  
    System.out.println(show);
   
    List<Integer> numbers = Arrays.asList(2,10,5,4); 
    System.out.println(numbers);
    
    Set<Integer> squareSet = 
         numbers.stream().map(x->x*x).collect(Collectors.toSet()); 
    System.out.println(squareSet); 
  
    numbers.stream().map(x->x*x).forEach(y->System.out.println(y)); 
  
    int even = 
       numbers.stream().filter(x->x%2==0).reduce(0,(ans,x)-> ans + x); 
    
    System.out.println(); 
    System.out.println(even);
    
    System.out.println(); 
    
    Stream<Integer> stream = Stream.of(1,10,3,4,8,6,7,8,9).sorted((p1,p2)->p2.compareTo(p1));
    stream.forEach(p -> System.out.println(p));
 
    List<Integer> list = new ArrayList<Integer>();
    
    for(int i = 1; i< 10; i++){
        list.add(i);
    }
    System.out.println(); 
    Stream<Integer> streams = list.stream();
    streams.forEach(p -> System.out.println(p));
  
    Stream.of("A B C").forEach(p -> System.out.println(p));
    
    //Stream<Date> dat = Stream.generate(() -> { return new Date(); });
//    dat.filter(dat.count()-> dat.count<1);
    //dat.forEach(p -> System.out.println(p));
  } 
} 