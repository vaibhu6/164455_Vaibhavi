	import { Component, OnInit } from "@angular/core";  
import { template } from '@angular/core/src/render3';
	  
	//decorator  
	@Component({  

	    selector: 'my-App',  
      templateUrl: 'app.component.html' ,
      styleUrls : ['app.component.css']
	})  

	export class AppComponent implements OnInit{   
    number1:number=0;  
    number2:number=0;  
    ans:number=0;  
     constructor() { } 
          ngOnInit() {  
          }  
       add(){  
         this.ans=this.number1+this.number2;  
            }  
       sub(){  
         this.ans=this.number1-this.number2;  
            } 
       mul(){  
         this.ans=this.number1*this.number2;  
            } 
       div(){  
        this.ans=this.number1/this.number2;  
             } 
   

            	    showdiv = false;  
	    togglevisibilty(): void {  
	        this.showdiv = !this.showdiv;  
	    }  
      
      cricketers=[{
        name: 'Saurav Ganguly',
        BattingStyle: 'Left Handed batsman',  
        ODI: "21",  
        Test: "17"  
      }, {  
        name: 'Sachin Tendulkar',  
        BattingStyle: 'Right Handed batsman',  
        ODI: "49",  
        Test: "51"  
        	    }, {  
        name: 'Rahul Dravid',  
        BattingStyle: 'Right Handed batsman',  
        ODI: "12",  
        Test: "34"  
        	    }, {  
        name: 'Sehwag',  
        BattingStyle: 'Right Handed batsman',  
        ODI: "15",  
        Test: "15"  
        	    }, {  
        name: 'Kohali',  
        BattingStyle: 'Right Handed batsman',  
        ODI: "34",  
        Test: "20"  
        	    }, {  
        name: 'Rohit sharma',  
        BattingStyle: 'Right Handed batsman',  
        ODI: "21",  
        Test: "17"  
        	    },
        ]

        PlayerSelection= '';
        checkChangedValue(changedValue){
          this.PlayerSelection=changedValue;
        }
        
        isBold: boolean = true;  
        fontSize: number = 30;  
        isItalic: boolean = true;  
        
        ApplyStyles() {  
            let styles = {  
                'font-weight': this.isBold ? 'bold' : 'normal',  
                'font-style': this.isItalic ? 'italic' : 'normal',  
                'font-size.px': this.fontSize  
            };  
        
            return styles;  
        }  

        
 }
 	  
 