## Project Information
1.	IDE used: Eclipse
2.	Java version: JavaSE - 11
3.	JavaFX version: 17.0.8
4.	Database: SQLite
5.	JUnit test version: JUnit 4
## Instruction to install and run the project

#### STEP 1: Download and unzip the file on your local machine
#### STEP 2: Create a new Java project in Eclipse
#### STEP 3: Import the project into Eclipse

Right click on the created project from Step 2 and click Import
<img width="386" alt="image" src="https://github.com/hitran/analytics-hub/assets/28134426/01df71f0-45ee-4062-b4b2-c4adaba4107f">
<p></p>
Choose File System and choose the unzipped source code file from step 1, and click Finish
<p></p>
<img width="386" alt="image" src="https://github.com/hitran/analytics-hub/assets/28134426/35133767-4057-4970-b2cc-3ce50583f6cd">
<p></p>
<img width="385" alt="image" src="https://github.com/hitran/analytics-hub/assets/28134426/d09123c7-fc48-4db6-9455-d1985efc42b0">
<p></p>
If prompted with this message, click Yes To All
<p></p>
<img width="386" alt="image" src="https://github.com/hitran/analytics-hub/assets/28134426/a034bcce-2b6f-4c34-ba5c-0f14e278e041">
<p></p>
### STEP 4: Set Up Run Configuration :
Right click on the project > Run As > Run Configuration 
<p></p>
<img width="440" alt="image" src="https://github.com/hitran/analytics-hub/assets/28134426/d5ac8753-0eab-459f-80c1-48f11f48d8d8">
<p></p>
- On the Run Configuration window, click on Arguments. Paste this configuration:

--module-path "javafx-sdk-17.0.8/lib" --add-modules=javafx.controls,javafx.fxml,javafx.graphics,javafx.base

Make sure to uncheck box: use the -XStartOnFirstThread argument when launching with SWT
<p></p>
<img width="468" alt="image" src="https://github.com/hitran/analytics-hub/assets/28134426/50db7728-f983-4c7b-8c6f-b1554430bf2d">
<p></p>
#### STEP 5: Run the program
If the program runs successfully, a Login screen will be displayed
<p></p>
<img width="256" alt="image" src="https://github.com/hitran/analytics-hub/assets/28134426/fb3fd980-d91d-458b-a572-567a9c65ad49">





