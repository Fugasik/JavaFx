# JavaFx
Swap screens in a javafx-application using Controller class
I created this one while I was getting into Java and trying 
to solve how to swap screens in JavaFX application using controller class,
so I don’t have to mess with FXML. 
I wanted scenes to remember content between the switches, but I couldn’t really find something that would be easy and fitted me nicely.
While reading stack overflow I found different ways of making something similar so this one is some sort of mix of different sources.
The main idea is to insert scene into another controller,
so that the controller doesn't need to instantiate a fresh scene over and
over again but can use already existing instance (with its state).
Will use this one in my future projects as some sort of base to start from.
