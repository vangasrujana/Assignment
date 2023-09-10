function empDetails(empname,city,salary){
    var msg='employee details';
    var details= function(amount){
        console.log(msg);
        console.log(`Name= ${empname}`);
        console.log(`city= ${city}`);
        console.log(`salary= ${salary}`);
        var bonus=amount+salary;
        console.log(`bonus= ${bonus}`);
    };
    details(10000);
}
empDetails('ashrita','Hyderabad',40000);