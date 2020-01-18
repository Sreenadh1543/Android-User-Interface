# Android-training
Place holder for practicing android development concepts

## 1) Application LifeCycle

> States of an Activity 

> Transitions between the states in an activity with the user action with the application

![alt text](https://miro.medium.com/max/1189/1*fCkVwtp7gJ5JI8gjIxPeTQ.png)

## 2) Understanding Resources

Concepts to be explored 

> Various Resource directories and their significance. 

> Qualifiers 

> Using Qualifiers for device and operation specific resources like orientation

> Creation of resource directories using Android Studio

> Locale and language specific content delivery on the application

> Using Emulator to test locale specific configuration 

> Layout Editor - Introduction and usage to create resources from the layout .

> Transitions between the states in an activity with the user action with the application.

> Significance of R.java in resource utilisation.


 ## 3) Projects to explore Linear Layout

   **Single Page Application**
    
   An application to create a greeting card for your valentine
    
   Concept to be explored :
    
   * Relative layout view group is used.
    
   * Text view and Image view are aligned relatively to understand their attributes.
    
   * Concept being relative to siblings and relative to the parent is explored.
 

        
   **Toast Counter**
        
   Concepts to be explored:
       
   > View and View Groups
      
   >Linear layout to Create graphical user interface.
      
   >Using Layout editor to create user interface.
      
   >Explore Palette, Component Tree, Design Editor , Tool bar for testing the GUI with resources.
      
   >Exploring the properties section in the design editor and using the tool to adjust properties on views.
      
   > Using blue print to understand view boundaries.
    
 ## 4) Projects to explore Table Layout
     
  **ReviewForm :** 
      
   Concepts to be covered :
      
   >Table Layout to create graphical user Interface.
     
   >Understanding cells to arrange views
      
   >Rows & columns for positioning the views 
      
   >How this layout can be handy for form creation
   
 ## 6) Event Listener && Event Handling
   
   Project to explore the concept of Event source , Event Listener and Event Handler
   
   **TakeAway**
   
   >Event listener can be attached both by xml and java routine
   
   >With java View > onClickEventListener to be implemented to attach event to listener of Button object
   
   >Visibility can also be controlled with click events .
   
 ## 7) Intents
 
  **Explicit Intents :**
   
   The concept of explicit intents is explored as a part of this project.
   
   **Take Away :**
   
   >Intents can be explicit or implicit basing on the source and destination clarity in the project.
   
   >Explicit intents is used to navigate between the activities with in the application as source and destination will be clear
   
   >How ever android stacks activities in an application so if user chooses to go back the activities will be unfolded as like in the order they were inserted
   
   >If developer wants to implement an explicit order in navigating back that can be configured with parent - child relation ship between activities
   
   **Passing the Data :**
     
   >Intents can be used to pass the data as key value bundles
   
   >Intents also support to pass data like url and telephone numbers which will be explicit intents if you have only one compatible apps in your mobile