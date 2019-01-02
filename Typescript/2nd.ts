interface Shape {
    color:String;
    area:()=>number;
    toString();
}
class Circle implements Shape{

    radius: number;
    color:String;
    constructor (color: String,radius :number) {
        this.radius=radius;
        this.color=color;
    }
    area():number {
        return 3.14 * (this.radius) *(this.radius);
    }

    toString() {
        return "Color : " + this.color + " Area :" + this.area();
    }
}
class Rectangle implements Shape{

    length: number;
    breadth : number;
    color:String;
    constructor (color: String,length:number, breadth :number) {
        this.color=color;
        this.length=length;
        this.breadth=breadth;
    }
    area():number {
        return (this.length)*(this.breadth);
    }

    toString(){
        return "Color : " + this.color + " Area :" + this.area();
    }
}

let circle: Circle = new Circle("Red",10);
console.log(circle.area());
console.log(circle.toString());

let rectangle: Rectangle = new Rectangle("Blue",10,10);
console.log(rectangle.area());
console.log(rectangle.toString());

