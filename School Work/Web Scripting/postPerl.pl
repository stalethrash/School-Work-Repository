#!/usr/bin/perl

use CGI ':standard';

print header;

print start_html ("Receive Form Post");

$hiddenInput = param("hiddenInput");
$radioButton = param("radioButton");

$radio1 = 0;
$radio2 = 0;
$radio3 = 0;
$radio4 = 0;
$total = 0;

if ( $radioButton = "Radio_1" ){
	$radio1++;}
elseif ( $radioButton = "Radio_2" ){
	$radio2++;}
elseif ( $radioButton = "Radio_3" ){
	$radio3++;}
else { $radio4++:}

$total++;

print "Will Nebraska beat Iowa on black Friday?\n\n";
print "Yes, the Huskers are gonna shut out the Hawkeyes!\t" + $radio1;
print "Yes, the Huskers will squeak out a victory over Iowa.\t" + $radio2;
print "No, the Huskers will narrowly lose at home to the Hawkeyes.\t" + $radio3;
print "No, the Huskers get crushed at home by the playoff bound Hawkeyes!\t" + $radio4;
print "\n\nTotal votes \t" + $total;

}


print end_html;
