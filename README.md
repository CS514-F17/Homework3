Homework 3
==========

### Due Friday, September 8, 2017 - 5:00PM

In this homework, you will practice using the following:

- Object-oriented Design
- Complex algorithms

For this homework, you will complete *at least* three classes that maintain information about a single Lyft (or Uber or cab) ride.

Note, the test cases will not compile correctly until you have implemented the appropriate classes.

### `Trip`
 
The `Trip` class maintains the following information about a trip. This information should be stored in your data members.
 
 - The person who took the trip
 - The starting location of the trip
 - The ending location of the trip
 - The starting time of the trip
 - The ending time of the trip

At minimum, the `Trip` class must implement the following methods:

- `getFirstName` - takes no input and returns the first name of the rider.
- `getLastName` - takes no input and returns the last name of the rider.
- `getDistanceTraveled` - takes no input and returns the number of miles traveled or the distance between the starting location and the ending location.
- `getDuration` - takes no input and returns the duration of the trip in minutes.
- `updateCCNumber` - takes as input a new credit card number and updates the rider's credit card information. Returns true if the new card was valid and false otherwise.

`Trip` will also implement two constructors. The first takes as input a `Rider`, two `Location` objects, and two `LocalDateTime` objects. The second takes as input two `String` objects (first and last name), another `String` (credit card number), as well as two `Location` objects and two `LocalDateTime` objects.

You will need to do some research on the classes to represent time in Java: [https://docs.oracle.com/javase/tutorial/datetime/iso/overview.html](https://docs.oracle.com/javase/tutorial/datetime/iso/overview.html)

#### Design - `Rider`

The `Rider` information will be stored in a `Rider` object. The `Rider` contains, at minimum, a first and last name and a credit card number, represented as a `String`. The constructor will take as input all three pieces of data.

It is up to you to define the methods in `Rider`, however you will need to have a way to update the credit card number. When the number is updated, you will verify the new number is valid using the [Luhn Algorithm](https://en.wikipedia.org/wiki/Luhn_algorithm). Also see these resources:

- [http://datagenetics.com/blog/july42013/index.html](http://datagenetics.com/blog/july42013/index.html)
- [http://gizmodo.com/how-credit-card-numbers-work-1493331190](http://gizmodo.com/how-credit-card-numbers-work-1493331190)


#### Design - `Location` 

The `Location` information for the starting and ending points will be stored in a `Location` object. A `Location` is two doubles: a latitude and longitude. The constructor will take as input these two pieces of data.

It is up to you to define the methods in `Location`, however you will need a way to retrieve the distance between two `Location` objects. You may refer to this resource: [http://introcs.cs.princeton.edu/java/44st/Location.java.html](http://introcs.cs.princeton.edu/java/44st/Location.java.html) 

:warning: Note that any other resources used must be cited. You *may* copy code, with citation, from this resource, however code copied from anywhere else may result in a deduction.


### Submission Requirements

1. Use the following link to create your private github repository for this assignment. The repository will be seeded with the skeleton code, test cases, and input files. [Homework 3]()
2. For full credit, make sure to follow all [Style Guidelines](https://github.com/CS514-F17/notes/blob/master/Admin/style.md). Points will be deducted for each violation.

### Grading Rubric

| Points | Criterion | Description |
| ------ | -------- | -------- |  
| 5 | getFirstTests | Passes all test cases provided and all additional test cases. |
| 5 | getLastTests | Passes all test cases provided and all additional test cases. |
| 5 | getDistanceTest | Passes all test cases provided and all additional test cases. |
| 10 | getDuration Tests | Passes all test cases provided and all additional test cases. |
| 10 | updateCCNumber Tests | Passes all test cases provided and all additional test cases. |
| 10 | Design  | Code is well designed and follows all specifications. Note, this will be graded critically for this assignment! |
| 5 | Style | Code follows all style guidelines. |

Partial credit may be awarded for partial functionality and/or partially correct design or style elements.

### Academic Dishonesty

Any work you submit is expected to be your own original work. If you use any web resources in developing your code you are required to cite those resources. The only exception to this rule is code that is posted on the class website. The URL of the resource you used in a comment in your code is fine. If I google even a single line of uncited code and find it on the internet you may get a 0 on the assignment or an F in the class. You may also get a 0 on the assignment or an F in the class if your solution is at all similar to that of any other student.
