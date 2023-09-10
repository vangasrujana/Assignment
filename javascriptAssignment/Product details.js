function Product(name,price,brand){
    this.name=name;
    this.price=price;
    this.brand=brand;
    
    
}
Product.prototype.category="electronics";
 Product.prototype. totalcost=function(quantity){
    console.log(`name: ${this.name}`);
    console.log(`price: ${this.price*quantity}`);
    console.log(`brand: ${this.brand}`);
    
};
const product1=new Product("laptop",40000,"dell");
const product2=new Product("mobile",10000,"vivo");
product1.totalcost(2);
product2.totalcost(1);