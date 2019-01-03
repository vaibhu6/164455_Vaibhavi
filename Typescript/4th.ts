import {todo} from './todointerface';
class tasks implements todo{
    names: string[] = new Array();
    
addTask(task:string)
{
    this.names.push(task);
console.log("=========== NEW TASK ===========\n"+
"Task  '"+task+" 'inserted in the list\n" +
"number of otems:"+this.names.length);
return this.names.length;
}

listAllTasks(){
   
        console.log(this.names);
    
}

 deleteTask(task:string){
    var j=0,i;
    for( i in this.names){
       if(i.localeCompare(task)==1){
         j++;  
       }    
       else{
           break;
       }
    }
    this.names.splice(j,1);
    console.log("=========== REMOVED TASK ===========\n"+
    "Task  '"+task+" 'removed from the list\n" +
    "number of otems:"+this.names.length);
return this.names.length;
}
}

var obj=new tasks();
obj.addTask("start working with typescript");
obj.addTask("complete assignment 1");
obj.addTask("complete assignment 2");
obj.listAllTasks();
obj.deleteTask("complete assignment 2");