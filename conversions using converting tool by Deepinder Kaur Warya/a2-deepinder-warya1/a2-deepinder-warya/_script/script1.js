
// Centimeter To  Inche
function centimeterToInche(i)
 {
   var i = i * 0.39370;
   var x = i.toFixed(2);
   document.getElementById("p1").innerHTML="result= " +x +"in";   
}
// Inche To Centimeter  
function IncheTocentimeter (i) 
{
    i = i/0.39370;
 var x = i.toFixed(2);
 document.getElementById("p2").innerHTML = "result= " + x +"cm";   
}
// Centimeter To Meter
function centimetertometer (i) 
{
    var i = i * 0.01;
    var x = i.toFixed(2);
    document.getElementById("p3").innerHTML="result= " +x+"meter";   
}
 // Meter To Centimeter    
function metertocentimeter(i)
 {
    var i = i /0.01;
    var x = i.toFixed(2);
    document.getElementById("p4").innerHTML="result = " +x+"cm";    
}
// Inches to Meter
function inchtometer(i)
 {
    var i = i* 0.0254;
    var x = i.toFixed(2);
    document.getElementById("p5").innerHTML="result = " +x+"meter";    
}
// Meter to Inches
function metertoinch(i)
 {
    var i = i/0.0254;
    var x = i.toFixed(2);
    document.getElementById("p6").innerHTML="result = " +x+"in";    
}
// Meter to Feet
function metertofeet(i)
 {
    var i = i * 3.28084;
    var x = i.toFixed(2);
    document.getElementById("p7").innerHTML="result = " +x+"ft";    
}
// Feet to Meter
function feettometer(i)
 {
    var i = i/3.28084;
    var x = i.toFixed(2);
    document.getElementById("p8").innerHTML="result = " +x+"meter";    
}
function reload()
{
    window.location.reload();  
}
    
