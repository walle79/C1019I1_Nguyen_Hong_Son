class Task {
    id : number;
    name : string;
    status : string

    constructor(id: number, name: string, status: string) {
        this.id = id;
        this.name = name;
        this.status = status;
    }
    showTaskInfo(){
        console.log(`${this.id} - ${this.name} - ${this.status}`)
    }
}
let taskObj1 = new Task(1, "Work", "Doing");
taskObj1.showTaskInfo();
console.log(taskObj1);

// class 2
enum TaskState {
    created = 100,
    active,
    inactive,
    process,
    finish
}
interface TaskInterface {
    id: number;
    name: string;
    status?: TaskState;
}
class TaskService {
    static username: string = "Son";
     static tasks: TaskInterface[];
    constructor(tasks: TaskInterface[]) {
        TaskService.tasks = tasks;
    }
    getItems() {
        return TaskService.tasks;
    }
    static showItemsInfo() : void {
        for (let task of TaskService.tasks) {
            console.log(`${TaskService.username} - ${task.name}`);
        }
    }
}
let tasks: TaskInterface[];
let taskServiceObj = new TaskService([
    {id: 1, name: "Nothing"},
    {id: 2, name: "Studying", status: TaskState.finish}
]);
console.log(TaskService.showItemsInfo());
console.log(taskServiceObj.getItems());

