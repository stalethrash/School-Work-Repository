/* Mitch Meyer
 * Assignment 3.2
 * Bellevue University
 * 11/10/2015
*/

function calculateGross() {

var wage[] = new Array (parseInt(document.form1.wage1.value), parseInt(document.form1.wage2.value),
	parseInt(document.form1.wage3.value));

var hours[] = new Array (parseInt(document.form1.hours1.value), parseInt(document.form1.hours2.value),
	parseInt(document.form1.hours3.value));
var gross[] = new Array (0 , 0 , 0);

document.form1.gross1.value = gross[0] + "";
document.form1.gross2.value = gross[1] + "";
document.form1.gross3.value = gross[2] + "";

for (var x = 0; x < 3; x++){

	if (hours[x] > 40){
		var temp1 = hours[x];
		var temp2 = temp1 - 40;
		gross[x] = ((wage[x] * 40) + ((wage[x] * 1.5) * temp2));
            }
	else {
		gross[x] = (hours[x] * wage1);
		}

	}


}
