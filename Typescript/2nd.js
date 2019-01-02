var Circle = /** @class */ (function () {
    function Circle(color, radius) {
        this.radius = radius;
        this.color = color;
    }
    Circle.prototype.area = function () {
        return 3.14 * (this.radius) * (this.radius);
    };
    Circle.prototype.toString = function () {
        return "Color : " + this.color + " Area :" + this.area();
    };
    return Circle;
}());
var Rectangle = /** @class */ (function () {
    function Rectangle(color, length, breadth) {
        this.color = color;
        this.length = length;
        this.breadth = breadth;
    }
    Rectangle.prototype.area = function () {
        return (this.length) * (this.breadth);
    };
    Rectangle.prototype.toString = function () {
        return "Color : " + this.color + " Area :" + this.area();
    };
    return Rectangle;
}());
var circle = new Circle("Red", 10);
console.log(circle.area());
console.log(circle.toString());
var rectangle = new Rectangle("Blue", 10, 10);
console.log(rectangle.area());
console.log(rectangle.toString());
