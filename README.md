
# Employee Management System

This is a web-based application using Spring boot and Mysql database.

The application should be able to support following features:

    1. User can add the Employee details using a form.
    2. User should fill the following details: full name, address, email, phone no, salary.
    3. User can see the list of all the employee along with their details.
    4. User can delete the record of an employee.
    5. User can edit the details of an employee.




## Start the Application:

You can run this application on Spring Tool Suite or Eclipse.

To run this application on Spring Tool Suite perform following steps:
    
    1. Import application in Spring Tool Suite.
    2. You need to create a database in Mysql Workbench or Mysql Command Line Client.
    3. You can find the database name in file application.properties(src -> main -> resources)
    4. You need to set your database username and password in place of YOUR_USERNAME AND YOUR_PASSWORD
    4. Right-click on application.
    5. Hover on Run As and then click on Spring Boot App. 

Open http://localhost:7071 with your browser to see the result.


## Screenshots

![](https://github.com/user-attachments/assets/5f12fa18-5a3d-432d-b34c-549ac96f926d)

You can enter the employee details in this form to save details of a new employee.

![](https://github.com/user-attachments/assets/135f5831-25eb-40d6-8b9b-1883cd9f6575)

It shows all the details of the employees and provides the facility to edit or delete an employee's details.

The employee details are also added in the database in the "employee" table.

![](https://github.com/user-attachments/assets/20b92c9b-b151-4147-af15-0733aa08b240)












## Database Configurations

To access the "employee" database, execute following command:

    use employee;

To see all the records in the table, execute following command:

    select * from emp_system;