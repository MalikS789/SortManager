# SortManager

A Sort Manager application created in Maven, to handle all JUnit dependencies automatically.

The application features 3 different types of sorting algorithms: BubbleSort, MergeSort and Binary Tree.

The application includes:
- JUnit tests for all functionalities

- Checked Exception Handling, throwing custom Exceptions when necessary. The custom exceptions caught include if an empty array is provided to be sorted.

- When Exception occur, LOG4J is used to create a log of said error with the stacktrace printed.

- Abstraction is used, for example the printer class is used to abstract the need to print to the screen
  with layer of abstraction.

- Factory design pattern: each sorting algorithm can be created with a class to the SortFactory class,
  reducing the need for the calling method to understand how the algorithm works.

- Enums are used instead of a String parameter for the SortFactory to restrict the options that can be used
  aswell as make error checking for invalid string options redundent.

- A nested class is used for the Node class as it is only utalised in the Binary Tree implimentation so this reduces
  name pollution. 
  
  The ideologies of SOLID were considered and as such the application is very easy to maintain and expand upon. Interestingly, the performance tests show that for small array sizes it is actually faster to use a bubble sort, this is most likely due to the overhead nature of the mergesort and binary tree implementations (as they use recusion). However for large array sizes, it was apparant the binary tree was the fastest algorithm, followed by the merge sort in close second and the bubble sort was considerable slower.
