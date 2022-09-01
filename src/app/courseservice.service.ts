import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Coursedetails } from './coursedetails/coursedetails';

@Injectable({
  providedIn: 'root'
})
export class CourseserviceService {
  courseList:Coursedetails[]=[];
  baseURL:string="http://localhost:8088"
//baseURL:string=""
  constructor(private httpSer:HttpClient) { }

  public getCourseList()
  {
    return this.httpSer.get<Coursedetails[]>(this.baseURL+"/trainingcourse/all");
    
  }
// any ->Ngo
  public addCourse(n:Coursedetails){
    console.log(n);
    console.log(this.httpSer.post(this.baseURL+"/trainingcourse/add",n));
    return this.httpSer.post(this.baseURL+"/trainingcourse/add",n);
  }

}
