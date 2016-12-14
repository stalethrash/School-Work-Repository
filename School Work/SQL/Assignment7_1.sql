/*
* CIST 308
* Mitch Meyer
* 5/2/2016
* Assignment 7.1
*/

// Describe the structure of the MY_EMPLOYEE table to identify the column names

DESCRIBE MY_EMPLOYEE;

// Add the following row of data to the MY_EMPLOYEE table without listing the columns in the INSERT clause: 
// LAST_NAME  FISRT_NAME  USERID  SALARY
// Patel  Ralph  rpatel  795

INSERT INTO MY_EMPLOYEE
VALUES (1, 'Patel', 'Ralph', 'rpatel', 795);

// Add the following row of data to the MY_EMPLOYEE table listing the columns in the INSERT clause:
// LAST_NAME  FISRT_NAME  USERID  SALARY
// Dancs  Betty  bdancs  860

INSERT INTO MY_EMPLOYEE (ID, LAST_NAME, FIRST_NAME, USERID, SALARY)
VALUES (2, 'Dancs', 'Betty', 'bdancs', 860);

// Confirm your additions to the table.

SELECT *
FROM MY_EMPLOYEE;

// Create a SQL statement that prompts the user for the employee's id, first name, last name, and salary.  
// Concatenate the first letter of the first name and the first seven characters of the last name to produce the userid.

UPDATE MY_EMPLOYEE
SET USERID = (SUBSTR('FIRST_NAME',1,1) || SUBSTR('LAST_NAME',1,7))
WHERE :ID = &ID
AND :FIRST_NAME = '&FIRST_NAME'
AND :LAST_NAME = '&LAST_NAME'
AND :SALARY = &SALARY;

// Add the following rows of data to the MY_EMPLOYEE table:
// LAST_NAME  FISRT_NAME  USERID  SALARY
// Biri  Ben  bbiri  1100
// Newman Chad  cnewman 750


INSERT INTO MY_EMPLOYEE (ID, LAST_NAME, FIRST_NAME, USERID, SALARY)
VALUES (3, 'Biri', 'Ben', 'bbiri', 1100);


INSERT INTO MY_EMPLOYEE (ID, LAST_NAME, FIRST_NAME, USERID, SALARY)
VALUES (4, 'Newman', 'Chad', 'cnewman', 750);

// Confirm your additions to the table.

SELECT *
FROM MY_EMPLOYEE;

// Make the data additions permanent.

COMMIT;

// Change the name of employee 3 (Biri) to Drexler.

UPDATE MY_EMPLOYEE
SET LAST_NAME = 'Drexler'
WHERE LAST_NAME = 'Biri';

// Change the salary to 1000 for all employees with a salary less than 900.

UPDATE MY_EMPLOYEE
SET SALARY = 1000
WHERE SALARY < 900;

// Verify your changes to the table.

SELECT *
FROM MY_EMPLOYEE;

// Delete Betty Dancs from the MY_EMPLOYEE table.

DELETE FROM MY_EMPLOYEE
WHERE LAST_NAME = 'Dancs';

// Make all changes permanent.

COMMIT;

// Add the following row of data to the MY_EMPLOYEE table:
// LAST_NAME  FISRT_NAME  USERID  SALARY
// Ropeburn Audry  aropebur 1550

INSERT INTO MY_EMPLOYEE (ID, LAST_NAME, FIRST_NAME, USERID, SALARY)
VALUES (5, 'Ropeburn', 'Audry', 'aropebur', 1550);

// Mark an intermediate point in the process of the transaction.

SAVEPOINT ONE;

// Empty the entire table.

DELETE FROM MY_EMPLOYEE;

// Confirm the table is empty.

SELECT *
FROM MY_EMPLOYEE;

// Discard the DELETE operation.

ROLLBACK TO ONE;

// Make the data addition permanent.

COMMIT;





