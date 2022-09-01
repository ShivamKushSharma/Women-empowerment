import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Coursedetails } from 'src/app/coursedetails/coursedetails';
import { CourseserviceService } from 'src/app/courseservice.service';

@Component({
  selector: 'app-trainingsectors',
  templateUrl: './trainingsectors.component.html',
  styleUrls: ['./trainingsectors.component.css']
})
export class TrainingsectorsComponent implements OnInit {

 
  courseList:Coursedetails[]=[];
  constructor(private courseSer:CourseserviceService,private router:Router) { }

  ngOnInit(): void {

    this.courseSer.getCourseList().subscribe(data=>this.courseList=data);
    

}
}
