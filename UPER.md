<h1>The Problem Solving Framework : 'UPER'</h1>

* U = "Understand"
* P = "Plan"
* E = "Execute"
* R = "Reflect" / "Refactor"

<h2>1. Understanding the Problem</h2>

<p>The task at hand is to create a terminal based game written in Java that implements the Object-Oriented programming
 and design patterns we have learned thus far. </p>
<p>My game must be functional and playable by the user, contain instructions that are built-in and available as a
 separate file, and use the four pillars of OOP: encapsulation, inheritance, abstraction, and polymorphism. Each
  "game object" must be modelled using a Java class and the game must implement at least 1 interface, 1 abstract
   class, 1 lambda expression, and 1 stream. Lastly, my game must have at least one package and be structured
    logically, and have some type of error handling for bad user input.</p>
    
<h2>
    2. Planning the Solution
</h2>

<p>One key point I had to clarify before fully understanding where to begin
     was my project structure. After cloning the repository, I learned that there was no <ins>src</ins> folder in my
      project and when trying to add a new package, I was not given the option. After verifying my work must be sorted
       into packages that are logically structured, I had to figure out how to create a package. I created a folder
        named src, but still was unable to create packages or classes from within it. Finally I figured out that I had
         to set the newly created src folder as the <ins>Sources Root</ins> in order to create new packages and classes
          inside of it. After figuring out how to allow for the proper structuring of my project, I moved on to
           identifying the details of the problem.</p>
<p>The next step I took when planning my solution was to identify which game I would like to work on and why. My
 initial thoughts were minesweeper, flappy bird, and snake. The reason for those choices were because they were each
  games that I found myself playing all the time growing up. After reading through the instructions for this project
   in great detail and reading through the article provided in our instructions, I decided to go down the path of
    creating a text-based game that allows the user to make choices that take them down certain paths dependent upon
     those choice. The reason I decided to go down this path rather than that of my original game ideas is because I
      feel as though the simplistic nature of a text-based game will really allow me to take full control over the
       project and incorporate OOP and OOD patterns more cohesively. I was also able to find extensive amounts of
        information online regarding how to develop a text-based Java game.
       </p>
<p>After determining what type of game I was going to create, I began coming up with a UML diagram to map how I was
 going to code it out and outline the structure in which I would like to set up my project. <li>Here, I ran into some
  problems. I had virtually no idea how I  was going to go about setting up my game, so I decided to do more research
   online and try to grab inspiration from other developer's text-based games I could find. The two primary resources
    I used were Tim Buchalka's <em>Java Programming Masterclass for Software Developers</em> Udemy course and a
     YouTube playlist called <em>Program a Text Adventure Game in Java</em> taught by Huw Collingbourne. These
      resources aided me immensely in my development of a text-based adventure game and primarily left me with the
       tasks of implementing the core requirements into the game.
     </li></p>
<p>After absorbing the resources listed in the bullet point above, I found myself working backwards. I have a
 functional text-based adventure game, but the core requirements were missing. I had no abstract class, no interface
 , no lambda, no stream, and still had to determine how I would organize my codebase to allow for these things. At
  this point, I took an overhead view of my project and tried to outline how I was going to set it up to include the
   core requirements using a UML diagram. 
</p>

<h2>
    3. Executing the Plan
</h2>

<p>There were plenty of things I found myself getting caught up on when coding this adventure game. Many of these
 things popped up while I was trying to implement the core requirements. One reoccurring question I had was, "What
  exactly is the abstract class being used for?" Because of this question, it was difficult for me to understand if
   I was truly using the abstract class properly or if I was simply throwing one in there to meet the requirements. 
   This thought process led me to do more research and I stumbled upon an excellent explanation on Stack Overflow
    (https://bit.ly/abstract456).
    <li>The user <em>Kevin McCormick</em> states that, "Abstract classes improve the situation by preventing a
     developer from instantiating the base class, because a developer has marked it as having missing functionality. 
     It also provides compile-time safety so that you can ensure that any classes that extend your abstract class
      provide the bare minimum functionality to work..."</li></p>
<p>After getting a more clear understanding of abstract classes, I began contemplating the similarities and
 differences between an abstract class and an interface, which I conveniently found resources for within the same
  Stack Overflow post listed above. The same user links to another post that he believes to answer my question (
</p>

<br>


<h2>
    4. Reflection / Refactor
</h2>

