# Facade Design Pattern

Imagine you have a big, complicated toy robot with lots of buttons and switches. You want the robot to do something simple, like dance. But, instead of figuring out and pressing all the tiny buttons and switches by yourself, you have a magic dancing button on the robot's belly.

This magic dancing button is like a Facade! It hides all the complex stuff inside the robot and makes it super easy for you to make the robot dance with just one button. So, a Facade in real life is like a helpful friend button that simplifies things for you and hides the complicated stuff behind the scenes.



## Why Facade Design Pattern?

1. Facade simplifies the interaction with a complex system by providing a unified, higher-level interface.
2. Facade encapsulates the interactions with subsystems. 
3. With a facade, clients are shielded from changes in the subsystems. If the internal implementation changes, only the facade needs to be updated, reducing the impact on the client code.
4. Facade allows for more straightforward testing, as clients interact with a simplified interface.

## Implementation

Let's imagine you have a computer and you want to play your favorite game. Now, playing the game involves many steps like turning on the computer, starting the game software, adjusting the settings, and finally, playing the game.

