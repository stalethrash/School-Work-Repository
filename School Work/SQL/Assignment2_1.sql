/*
* CIST 308
* Mitch Meyer
* 3/29/16
* Assignment 2.1
*/



// Display the employee number, name, salary, and salary increased by 15% expressed as a whole number.

SELECT EMPNO, ENAME, SAL, ROUND(TO_NUMBER(TO_CHAR(SAL, '9999'))*1.15, 0) "Raised"
FROM EMP;

// Modify the previous query to add a column that will subtract the old salary from the new salary.  Label the column Increase.

SELECT EMPNO, ENAME, SAL, ROUND(TO_NUMBER(TO_CHAR(SAL, '9999'))*1.15, 0) "Raised",
ROUND(TO_NUMBER(TO_CHAR(SAL, '9999'))*1.15, 0) - SAL "Increase"
FROM EMP;

// Display the employee's name, hire date, and salary review date, which is the first Monday after six months of service.  
// Label the column REVIEW.  Format the dates to appear in the format similar to "Sunday, the Seventh of September, 1981.

SELECT ENAME, TO_CHAR(HIREDATE, 'DAY, "the" DDSPTH "of" MONTH, YYYY'), SAL, 
TO_CHAR(NEXT_DAY(ADD_MONTHS(HIREDATE, 6), 'MONDAY'), 'DAY, "the" DDSPTH "of" MONTH, YYYY') "Review Date"
FROM EMP;

// For each employee display the employee name and calculate the number of months between today and the date the employee was hired.  
// Label the column MONTHS_WORKED.  
// Order your results by the number of months employed.  Round the number of months up to the closest whole number.

SELECT ENAME, ROUND(MONTHS_BETWEEN(TO_DATE('03-29-2016'), HIREDATE), 0) "MONTHS_WORKED"
FROM EMP
ORDER BY "MONTHS_WORKED";

/* Write a query that generates output simulate to the following:
 * <employee> earns <salary> monthly but wants <3 times salary>.  Title the column Dream Salaries.
 * Dream Salaries
 * KING earns $5,000.00 monthly but wants $15,000.00.
 * BLAKE earns $2,850.00 monthly but wants $8,550.00.
 * CLARK earns $2,450.00 monthly but wants $7,350.00.
 * JONES earns $2,975.00 monthly but wants $8,925.00.
 * Etc.
*/

SELECT ENAME, TO_CHAR('earns') "earns", TO_CHAR(SAL, '$9,999.99') "SAL", 
TO_CHAR('monthly but wants') "monthly", TO_CHAR(SAL * 3, '$99,999.99') "Dream Salaries"
FROM EMP;

// Write a query to display name and salary for all employees.  Format the salary to be 15 characters long, left-padded with $s.  
// Label the column SALARY.

SELECT ENAME, LPAD(SAL, 15, '$') "Salary"
FROM EMP;

// Write a query that will display the employee's name with the first letter capitalized and all other letters lowercase along 
// with the length of their name, restrict your results to include only employees whose name starts with J, A, or M.  Give each 
// column an appropriate label.

SELECT INITCAP(ENAME) "Name", LENGTH(ENAME) "Name Length"
FROM EMP
WHERE SUBSTR(ENAME, 1, 1) = 'A'
OR SUBSTR(ENAME, 1, 1) = 'J'
OR SUBSTR(ENAME, 1, 1) = 'M';

// Display the name, hire date, and day of the week on which the employee started.  Label the column DAY.  
// Order the results by the day of the week starting with Monday.

SELECT ENAME, HIREDATE, 
     TO_CHAR(HIREDATE, 'DAY') "Day" 
FROM EMP
ORDER BY CASE 
      WHEN TO_CHAR(HIREDATE, 'D') = 1 THEN '8'
      ELSE TO_CHAR(HIREDATE, 'D')
      END;