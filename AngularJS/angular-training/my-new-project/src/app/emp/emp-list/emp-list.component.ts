import { Component, OnInit } from '@angular/core';
import { Employee } from 'src/app/employee';

@Component({
  selector: 'app-emp-list',
  templateUrl: './emp-list.component.html',
  styleUrls: ['./emp-list.component.css']
})
export class EmpListComponent{
  
  pageTitle: String ="Employee Details";
  employees:Employee[] =[
    {
  
  "empId": "E001",
  "name": "Vaibhavi Sawant",
  "email": "vaibhu@gmail.com",
  "phone": "1-770-736-8031 x89562",
  "salary": 50000,
  "appraisalRating": 4

  }]

  constructor() { }

  ngOnInit() {
  }

}
