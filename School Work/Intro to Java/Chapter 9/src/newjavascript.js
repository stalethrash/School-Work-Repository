function calculateGross () {

var wage1 = document.getElementById("employeeWage1");
var hours1 = document.getElementById("employeeHours1");
var gross1 = 0;
       
var wage2 = document.getElementById("employeeWage2");
var hours2 = document.getElementById("employeeHours2");
var gross2 = 0;

var wage3 = document.getElementById("employeeWage3");
var hours3 = document.getElementById("employeeHours3");
var gross3 = 0;

	if (hours1 > "40"){
		var temp1 = hours1;
		var temp2 = temp1 - 40;
		gross1 = ((wage1 * 40) + ((wage1 * 1.5) * temp2));
            }
	else{
		gross1 = (hours1 * wage1);
	}
	
        
        if (hours2 > "40"){
		var temp1 = hours1;
		var temp2 = temp1 - 40;
		gross2 = ((wage2 * 40) + ((wage2 * 1.5) * temp2));
            }
	if (hours2 <= "40"){
		gross2 = (hours2 * wage2);
		}
	else{
		alert("Invaild Input \n Try again.");
	}
        
        if (hours3 > "40"){
		var temp1 = hours1;
		var temp2 = temp1 - 40;
		gross3 = ((wage3 * 40) + ((wage3 * 1.5) * temp2));
            }
	if (hours3 <= "40"){
		gross3 = (hours3 * wage3) + "";
		}
	else{
		alert("Invaild Input \n Try again.");
	}

document.getElementById("grosswage1").value = gross1;
document.getElementById("grosswage2").value = gross2;
document.getElementById("grosswage3").value = gross3;
}


