function Employee(name,city){
    this.name=name;
    this.city=city;
}
var employee1=new Employee("hitesh",'hyderabad');
var employee2=new Employee("priya",'hyderabad');
function Manager(name,city,salary){
    Employee.call(this,name,city);
    this.salary=salary;
}
Manager.prototype=Object.create(Employee.prototype);
Manager.prototype.constructor=Manager;
var manager=new Manager("nithya","kerla","60000");
console.log(employee1);
console.log(employee2);
console.log(manager);