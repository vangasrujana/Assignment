function empdetails(name,city,salary){
    console.log(`welcome ${name} from ${city}`)
    var bonus=function(Bonus){
        var newSalary=salary+Bonus;
        console.log(`your salary is ${newSalary}`)
    }
    bonus(1000);

}
empdetails('arjun','vizag',30000);