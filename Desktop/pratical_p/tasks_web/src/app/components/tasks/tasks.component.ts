import { OnInit, Component } from '@angular/core';


import { Task } from '../../models/task';
import { TaskService } from './../../services/task.service';




@Component({
  selector: 'app-tasks',
  templateUrl: './tasks.component.html',
  styleUrls: ['./tasks.component.css']
})
export class TasksComponent implements OnInit {
 
  myTask : Task= {
    label:'',
    completed:false
  }
  tasks:Task[]=[];
  constructor(private taskService :TaskService) { }

  ngOnInit() {
    this.getTasks();
  }
  getTasks(){
    this.taskService.findAll().subscribe(tasks=> this.tasks = tasks);
  }
  
  deleteTask(id){
     this.taskService.delete(id).subscribe(() =>{this.tasks=this.tasks.filter(task =>task.id != id)});
  }
  persistTask(){
    this.taskService.persist(this.myTask).subscribe((task) =>{this.tasks=[task, ...this.tasks]});
  }

}
