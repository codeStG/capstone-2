Object Oriented Programming Concept Questions

As you should know by now, there are 4 pillars of Object Oriented Programming.

********************
1. Encapsulation occurs when an object's state is kept private inside of a class and other objects cannot directly
 access it. The only way to access the private fields inside of an object that practices encapsulation is to use
  getters and setters or use the methods/functions provided by the object to manage its state.
    - Ex. Typically, you do not want to allow the user the ability to directly manipulate a price from within the
     program. To achieve this, use <b>encapsulation</b> to set the price field to private and create a getter that
      provides the price when called with no setter for manipulation. Only allow manipulation of the price through
       methods, which should be synonymous with points in the program where the price must be changed due to
        additional charges or credits. 
        
        
        
        
********************
2. Inheritance is used to maintain common logic between classes, but add some unique logic to a child class.The child
 class then has access to everything that the parent does, with the ability to add additional functionality within
  the child class to suit special needs.
    - Ex. Your program may require a parent class called "Animal" which has methods on it that all animals have, like
     move(), eat() and sleep(). However, you may run into an issue down the line where you need a specific animal
      like a dog or a cat. While a dog IS an animal and a cat IS an animal, they both have unique qualities
      /capabilities that make them different from one another. Because of this, we use <b>inheritance</b> to make the
       Dog and Cat classes <ins>extensions</ins> of the parent Animal class and add the unique methods and fields to
        the respective extended classes.







********************
3. Abstraction is similar to inheritance in that it provides common functionality to the classes which are derived
 from it, but different in that it is never implemented or used itself. An abstraction is simply an outline for how a
  generalized object SHOULD be. Additional functionality can be achieved once the class has been implemented from
   the abstraction, and the abstraction's methods have been overridden to achieve the specific functionality needed for
    the class. Abstractions allow us to set in stone a common building convention for any classes that are considered
     a subset of the abstraction.
     - Ex. Using the same example from Inheritance, we could instead make the parent Animal class into an
     <b>abstraction</b>/<ins>interface</ins>. After doing so, if we still needed a general animal class to use in our
      program, we could simply <ins>implement</ins> one from the abstract Animal interface. Regardless, the Animal
       interface allows us to implement the subset of animals (i.e. dog, cat, rabbit, bird) and give them the same
        methods available to the interface, which are required (i.e. eat(), sleep(), move()), as well as the ability to
         add unique methods and fields that are specific to that animal.








********************
4. Polymorphism can be seen as "shape-shifting" in a sense. It allows you to make a choice on the fly of which child
 class you want data to be transmitted through by determining what type matches that of the child class. It also
  allows us to group together certain classes based off the interface they share. This makes it easy for the correct
   method to be called based on the type of the parameter passed in.
   - Ex. Let's say that there is a Shape <ins>interface</ins> with the methods calcArea() and calcPerimeter(). There
    are 3 classes that <ins>implement</ins> the Shape interface, Triangle, Rectangle and Circle, each with their own
     implementation of the calcArea() and calcPerimeter() methods. <b>Polymorphism</b> in this sense allows you to
      treat each class as a Shape, not necessarily a specific Triangle, Rectangle or Circle. Polymorphism is used to
       determine on the fly which shape's method needs to be called by analyzing the type of Shape that is being used
        and calling its respective method. 
        



Please write 1-3 paragraphs explaining these 4 concepts further.  Please provide a sufficient enough explanation
 about these pillars, as well as some examples to illustrate the practical use cases of these principles.



