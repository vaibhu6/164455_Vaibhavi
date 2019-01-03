"use strict";
exports.__esModule = true;
var tasks = /** @class */ (function () {
    function tasks() {
        this.names = new Array();
    }
    tasks.prototype.addTask = function (task) {
        this.names.push(task);
        console.log("=========== NEW TASK ===========\n" +
            "Task  '" + task + " 'inserted in the list\n" +
            "number of otems:" + this.names.length);
        return this.names.length;
    };
    tasks.prototype.listAllTasks = function () {
        console.log(this.names);
    };
    tasks.prototype.deleteTask = function (task) {
        var j = 0, i;
        for (i in this.names) {
            if (i.localeCompare(task) == 1) {
                j++;
            }
            else {
                break;
            }
        }
        this.names.splice(j, 1);
        console.log("=========== REMOVED TASK ===========\n" +
            "Task  '" + task + " 'removed from the list\n" +
            "number of otems:" + this.names.length);
        return this.names.length;
    };
    return tasks;
}());
var obj = new tasks();
obj.addTask("start working with typescript");
obj.addTask("complete assignment 1");
obj.addTask("complete assignment 2");
obj.listAllTasks();
obj.deleteTask("complete assignment 2");
