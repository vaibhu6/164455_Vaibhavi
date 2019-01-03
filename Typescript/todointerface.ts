export interface todo{
    names:string[];
    addTask(task:string);
    listAllTasks();
    deleteTask(task:string);
    }