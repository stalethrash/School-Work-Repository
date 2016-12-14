 /*
 * CIST 308
 * Your Name
 * Date
 * Assignment
*/


// Create the DEPARTMENT tables based on the following:
// Column Name   ID      Name
// Data Type     Number Varchar2
// Length        7      25

CREATE TABLE DEPARTMENT (ID NUMBER(7), Name VARCHAR2(25));

// Populate the DEPARTMENT table with data from the DEPT table.  Include only columns that you need.

INSERT INTO DEPARTMENT (ID, Name)
SELECT DEPTNO, DNAME 
FROM DEPT;

// Create the EMPLOYEE table based on the following table chart:
// Column Name    ID      LAST_NAME     FIRST_NAME     DEPT_ID
// Data Type      Number  Varchar2      Varchar2       Number
// Length         7       25            25             7

CREATE TABLE EMPLOYEE(ID NUMBER(7), LAST_NAME VARCHAR2(25), FIRST_NAME VARCHAR2(25), DEPT_ID NUMBER(7));

// Modify the EMPLOYEE table to allow for longer employee last names.  Confirm your modification.

ALTER TABLE EMPLOYEE
MODIFY (LAST_NAME VARCHAR2(35));

// Confirm that both the DEPARTMENT and EMPLOYEE tables are stored in the data dictionary. (Hint: USER_TABLES)

SELECT table_name
FROM user_tables;

// Create the EMPLOYEE2 table based on the structure of the EMP table.  Include only the EMPO, ENAME, DEPTNO columns.  
// Name the columns in your new table ID, LAST_NAME, and DEPT_ID, respectively. 

CREATE TABLE EMPLOYEE2 (ID, LAST_NAME, DEPT_ID)
AS (SELECT EMPNO, ENAME, DEPTNO FROM EMP);

// Drop the EMPLOYEE table.

DROP TABLE EMPLOYEE;

// Rename the EMPLOYEE2 table to EMPLOYEE.

RENAME EMPLOYEE2 TO EMPLOYEE;

// Add a comment to the DEPARTMENT and EMPLOYEE table definitions describing the tables.  
// Confirm your additions in the data dictionary.

COMMENT ON TABLE EMPLOYEE
IS 'This table was created for class';

COMMENT ON TABLE DEPARTMENT
IS 'This table was created for class, derived from DEPT';

// Drop the LAST_NAME column from the EMPLOYEE table.  Confirm your modification by checking the description of the table.

ALTER TABLE EMPLOYEE
DROP COLUMN LAST_NAME;

DESCRIBE EMPLOYEE;

// Create the EMPLOYEE2 table based on the structure of the EMP table.  Include only the EMPNO, ENAME, DEPT_ID columns.  
// Name the columns in your new table ID, LAST_NAME, and DEPT_ID, respectively.  Mark the DEPT_ID column in the EMPLOYEE2 table as UNUSED.  
// Confirm your modification by checking the description of the table.

CREATE TABLE EMPLOYEE2 (ID, LAST_NAME, DEPT_ID)
AS (SELECT EMPNO, ENAME, DEPTNO FROM EMP);

ALTER TABLE EMPLOYEE2
SET UNUSED(DEPT_ID);

DESCRIBE EMPLOYEE2;

// Drop all the UNUSED columns from the EMPLOYEE2 table.  Confirm your modifications by checking the description of the table.

ALTER TABLE EMPLOYEE2
DROP UNUSED COLUMNS;

DESCRIBE EMPLOYEE2;




// Add a table-level PRIMARY KEY constraint to the EMPLOYEE table using the ID column.  The constraint should be named at creation.


DROP TABLE EMPLOYEE;

CREATE TABLE EMPLOYEE (ID, LAST_NAME, DEPT_ID,
CONSTRAINT EMPLOYEE_ID_PK PRIMARY KEY (ID))
AS (SELECT EMPNO, ENAME, DEPTNO FROM EMP);


// Create a PRIMARY KEY constraint on the DEPARTMENT table using the ID column.  The constraint should be named at creation.

DROP TABLE DEPARTMENT;

CREATE TABLE DEPARTMENT (ID, Name, 
CONSTRAINT DEPARTMENT_ID_PK PRIMARY KEY(ID))
AS (SELECT DEPTNO, DNAME 
FROM DEPT);

// Add a foreign key reference on the EMPLOYEE table that will ensure that the employee is not assigned to a nonexistent department.

ALTER TABLE EMPLOYEE
ADD CONSTRAINT EMPLOYEE_DEPT_ID_FK FOREIGN KEY(DEPT_ID)
REFERENCES DEPARTMENT (ID);

// Confirm that the constraints were added by querying USER_CONSTRAINTS.  
// Note the types and names of the constraints and include them in your statement comments.

SELECT *
FROM USER_CONSTRAINTS
WHERE TABLE_NAME = 'EMPLOYEE'
OR TABLE_NAME = 'DEPARTMENT';

/* There are 3 user created constraints and 3 database created constraints. Named as follows

SYS_C007469		C	DEPARTMENT
DEPARTMENT_ID_PK	P	DEPARTMENT
SYS_C007466		C	EMPLOYEE
SYS_C007467		C	EMPLOYEE
EMPLOYEE_ID_PK		P	EMPLOYEE
EMPLOYEE_DEPT_ID_FK	R	EMPLOYEE

*/

// Display the object names and types from the USER_OBJECTS data dictionary view for EMPLOYEE and DEPARTMENT tables.  
// You will want to format the columns for readability.  Provide comments that include the new tables and indexes created.

SELECT OBJECT_NAME, OBJECT_TYPE
FROM USER_OBJECTS
WHERE OBJECT_NAME = 'EMPLOYEE'
OR OBJECT_NAME = 'DEPARTMENT';

/*

OBJECT_NAME	OBJECT_TYPE
DEPARTMENT	TABLE
EMPLOYEE	TABLE

*/

// Modify the EMPLOYEE table by adding a SALARY column of NUMBER data type, precision 7.

ALTER TABLE EMPLOYEE
ADD (SALARY NUMBER(7));










