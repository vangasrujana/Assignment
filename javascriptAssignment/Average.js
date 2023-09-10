function calculate(x,y,z){
    return x+y+z;
}
function printAverage(calculateFunction ,x,y,z){
var sum=calculateFunction(x,y,z);
console.log(sum);
var average=sum/3;
console.log(`average: ${average}`);
}
var a=17;
var b=18;
var c=7;
printAverage(calculate,a,b,c);