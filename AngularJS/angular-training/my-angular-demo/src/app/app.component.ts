import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Hello World of TypeScript!';
  firstName = "Vaibhavi";
  lastName = "Sawant";
  	  location : Address = {
    	    "street" : "1007 Mountain Drive",
    	    "city" : "Gotham"
      };
    
}
  	class Address {
  	  street : string;
  	  city : string;
  }
  
