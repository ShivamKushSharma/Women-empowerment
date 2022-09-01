import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { CourseserviceService } from '../courseservice.service';
import { Coursedetails } from './coursedetails';

@Component({
  selector: 'app-coursedetails',
  templateUrl: './coursedetails.component.html',
  styleUrls: ['./coursedetails.component.css']
})
export class CoursedetailsComponent implements OnInit {
 coursedetailsForm!: FormGroup;
  // constructor() { }

  // ngOnInit(): void {

   course:Coursedetails=new Coursedetails();
    constructor(private fb:FormBuilder,private courseSer:CourseserviceService, private router: Router) { }
  
    courseList:Coursedetails[]=[];
    ngOnInit(): void {
  
      this.coursedetailsForm = this.fb.group({            
         t_id: [],                                        
        course_name: ['', Validators.required],
       duration: ['', Validators.required] ,
       start_date: ['', Validators.required] ,
      ngo_id: ['', Validators.required],
      ngo_name: ['', Validators.required],
     location: ['', Validators.required],
                                     
          });
      this.courseSer.getCourseList().subscribe(data=>this.courseList=data);
  
    }
    onSubmit(){
      // alert(this.ngoRegForm.value);
     this.course=this.coursedetailsForm.value;
      this.courseSer.addCourse(this.course).subscribe(data => {
        
  
          alert("Registered Successfully!");
          console.log(this.coursedetailsForm.value)
        });
  
       this.router.navigate(['ngos']);
      
    }
  }

