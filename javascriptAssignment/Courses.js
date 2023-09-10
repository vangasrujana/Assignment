function showCourses(...courses){
    
    courses.forEach(element => {
        if(element.toLowerCase().includes('a')){
        console.log(element);
        }
    });
    
}
showCourses('java','html','javascript','spring')