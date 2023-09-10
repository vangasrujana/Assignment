var menuDetails=(username,type)=>{
    var vegFood=['brinjal','panner','mushroom']
    var nonVeg=['chicken','fish','mutton']
    function greet(){
        console.log(`welcome ${username}`)
    }
    greet();
    if(type=='veg'){
        for (const veg in vegFood) {
            console.log(vegFood[veg]+" ")   
        }
    }else if(type=='nonveg'){
        for (const nonveg in nonVeg) {
            console.log(nonVeg[nonveg]+" ")   
        }
    }
    else{
    console.log("enjoy fasting")
    }
    
}
menuDetails('sri','nonveg');
menuDetails('nitesh','veg');
menuDetails('dhanu','other');