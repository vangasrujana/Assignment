function checkName(...names){
    for (const name of names) {
        if(name.charAt(0).toUpperCase()==='P')
        console.log(` ${name}`);
        else
        console.log("name doesn't start with p")
    }
}
checkName('geetha','arun','priya','anpitha');