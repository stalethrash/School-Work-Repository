/*
* CIST 308
* Mitch Meyer
* 5/16/16
* Assignment 9.1
*/


// Create a view called EMP_VU based on the employee number, employee name, and department number from the EMP table.  
// Change the heading for the employee name to EMPLOYEE.

CREATE OR REPLACE VIEW EMP_VU("Employee Number", "EMPLOYEE", "Department Number")
AS SELECT EMPNO, ENAME, DEPTNO
FROM EMP;

// Display the contents of the EMP_UV view.

SELECT *
FROM EMP_VU;

// Select the view name and text from the data dictionary USER_VIEWS.

SELECT VIEW_NAME, TEXT
FROM USER_VIEWS;

// Using your EMP_UV, enter a query to display all employee names and department numbers.

SELECT EMPLOYEE, "Department Number"
FROM EMP_VU;

// Create a view named DEPT20 that contains the employee number, employee name, and department number for all employees in department 20.  
// Label the view columns EMPLOYEE_ID, EMPLOYEE, and DEPARTMENT_ID.  
// Do not allow an employee to be reassigned to another department through the view.

CREATE VIEW DEPT20(EMPLOYEE_ID, EMPLOYEE, DEPARTMENT_ID)
AS SELECT EMPNO, ENAME, DEPTNO FROM EMP
WHERE DEPTNO = 20
WITH READ ONLY;

// Display the structure and contents of the DEPT20 view

SELECT *
FROM DEPT20;

DESCRIBE DEPT20;

// Attempt to reassign Smith to department 30.

UPDATE DEPT20
SET DEPARTMENT_ID = 30
WHERE EMPLOYEE LIKE '%SMITH%';

// Create a view called SALARY_UV based on the employee name, department name, salary, and salary grade for all employees.  
// Label the column Employee, Department, Salary, and Grade, respectively. 

CREATE VIEW SALARY_UV(Employee, Department, Salary, Grade)
AS SELECT ENAME, DNAME, SAL, JOB
FROM EMP, DEPT
WHERE EMP.DEPTNO = DEPT.DEPTNO;

// Create a sequence to be used with the primary key column of the DEPARTMENT table.  The sequence should start at 80 and 
// have a maximum value of 260.  Have your sequence increment by ten numbers. Name the sequence DEPT_ID_SEQ.

CREATE SEQUENCE DEPT_ID_SEQ 
INCREMENT BY 10
START WITH 80
MAXVALUE 260
NOCYCLE
NOCACHE;

// Write a script to display the following information about your sequences: sequence name, maximum value, 
// increment size, and the last number.

SELECT sequence_name, max_value,
increment_by, last_number
FROM user_sequences;

// Write an interactive script to insert a row into the DEPARTMENT table.  Be sure to use the sequence that you created for 
// the ID column.  Create a customized prompt to enter the department name. 

INSERT INTO department(ID, NAME)
VALUES (DEPT_ID_SEQ.NEXTVAL,
:NAME);

// Create a non-unique index on the foreign key column (deptno) in the EMPLOYEE table.

CREATE INDEX DEPTNO_INDEX 
ON EMPLOYEE(DEPT_ID);

//Display the indexes and uniqueness that exist in the data dictionary for the EMPLOYEE tab

SELECT INDEX_NAME, UNIQUENESS
FROM USER_INDEXES
WHERE TABLE_NAME = 'EMPLOYEE';


