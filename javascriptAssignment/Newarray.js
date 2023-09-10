function showCourses(...courses){
    var temparray=[];
    courses.forEach(course=>{
        if(course.toLowerCase().includes('a')){
            temparray.push(course);
        }

    });
    return temparray;
}
var output=showCourses('java','Spring','html','javascript');
console.log(output);