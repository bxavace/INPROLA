# Finals Project: ResponTric: Responsible Electric Consumption 
User Manual
Application named ResponTric (Responsible Electricity) that simply calculates electricity consumed and carbon emitted per household appliance.
Introduction
### A.	What is Respontric Mini-App?
Respontric Mini-app is a simple application that helps users experiment with the energy (in kilowatt-hours) that his/her household consumes per day. Moreover, it also helps the user know how much carbon (in pounds) that his/her energy consumption emits per appliance. In simple words, it is an application that audits the user’s energy consumption with an additional feature of carbon emission — all in the appliances and their respective wattage rating.

### B.	What SDG does Respontric address?
Respontric was made to address sustainable development goals #7, affordable and clean energy, and #12, responsible consumption. As clearly shown by the application’s mechanics, the end goal of the application is to inform the user how much energy they are using, how excessive it is to the point that it becomes dangerous as excessive energy spending also affects carbon emission. In the end, the user will be more conscious when it comes to which appliance is better to buy and use (the energy-efficient ones) in the future and how to use that appliance efficiently, saving money and lessening carbon emitted.

### Programming Structure

Overall code (methods tucked in). The program Respontric Mini-App has 1 class named ‘Main’ for formality, and 8 methods to be called on the main method, to make the program look shorter, modularized, and easier to read.

#### Main Method. 
The main method contains the variables, main program loop, appliance-listing loop, and most method calls. The main while loop will contain the second (inner) loop that prompts the user to list the appliance, its corresponding wattage rating, and the amount of time spent in using the appliance (e.g., Microwave – 1450W – 20 minutes/day).
The rest of the main loop has the total variables and array (ArrayList) to display the total consumption, total cost, and total carbon emitted from all the appliances listed by the user. 
 
#### getApplianceName. 
This method will return the appliance passed by the user from the JOptionPane as a String type, to be parsed as double on the main method.

#### getWattRating. 
This method will return the appliance’s watt rating pass by the user from JOptionPane as a String type, to be parsed as double on the main method.

#### getTimeConsumption. 
This method will return the time in minutes the user uses the appliance per day, passed as a String and parsed as a double on the main method.

#### start. 
This method will display the first windowpane with a greeting and welcome message to begin the application.

#### displayOutput. 
This method will display the output on the inner loop, where the user inputs one appliance and its respective length of use and watt rating.

#### displayFinalOutput. 
This method will display the total appliances listed, the total cost generated by the appliances, the total energy generated, and the total carbon emitted. According to eia FAQ (2020), an estimated 0.85 pounds of carbon dioxide is emitted per kWh consumed by an appliance.

#### innerLoopPrompt. 
This method will prompt the user whether to add more appliances or to stop listing appliances altogether, returning Boolean values to be stored in the variable that the inner loop checks.

#### mainLoopPrompt. 
Similar to the inner loop prompt, only that it is prompted at the end of the program, asking if the user wants to repeat the program or end it.
Step-by-step Process
