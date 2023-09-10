function showDetails(fname,lname){
    var msg='have a good day';
     function message(){
        console.log(msg);
        console.log(` ${fname.toUpperCase()} ${lname.toUpperCase()}`)
    };
    message();
}
showDetails('SriPriya','Mathan');