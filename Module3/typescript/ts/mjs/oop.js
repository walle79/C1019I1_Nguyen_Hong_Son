class Task {
    constructor(id, name, status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }
    showTaskInfo() {
        console.log(`${this.id} - ${this.name} - ${this.status}`);
    }
}
let taskObj1 = new Task(1, "Work", "Doing");
taskObj1.showTaskInfo();
console.log(taskObj1);
// class 2
var TaskState;
(function (TaskState) {
    TaskState[TaskState["created"] = 100] = "created";
    TaskState[TaskState["active"] = 101] = "active";
    TaskState[TaskState["inactive"] = 102] = "inactive";
    TaskState[TaskState["process"] = 103] = "process";
    TaskState[TaskState["finish"] = 104] = "finish";
})(TaskState || (TaskState = {}));
class TaskService {
    constructor(tasks) {
        TaskService.tasks = tasks;
    }
    getItems() {
        return TaskService.tasks;
    }
    static showItemsInfo() {
        for (let task of TaskService.tasks) {
            console.log(`${TaskService.username} - ${task.name}`);
        }
    }
}
TaskService.username = "Son";
let tasks;
let taskServiceObj = new TaskService([
    { id: 1, name: "Nothing" },
    { id: 2, name: "Studying", status: TaskState.finish }
]);
console.log(TaskService.showItemsInfo());
console.log(taskServiceObj.getItems());
