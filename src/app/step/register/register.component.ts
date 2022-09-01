import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { UserService } from 'src/app/user.service';
import { User } from './user';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  stepRegForm!:FormGroup;
  user:User=new User();

  userList:User[]=[];
  constructor(private fb:FormBuilder,private userser:UserService, private router: Router) {
    //this.myForm();

   }
  //  myForm(){
  //   this.stepRegForm=this.fb.group({
  //     email: ['',[ Validators.required, Validators.pattern("^[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$")]]
  //   });
  //  }

 // ngoList:Ngo[]=[];
  ngOnInit(): void {

    this.stepRegForm = this.fb.group({            
      r_id: [],                                        
      name: ['', Validators.required],
      designation: ['', Validators.required],
      salary: ['', Validators.required],
      no_of_member: ['', [Validators.required, Validators.min(0)]],
      no_of_children: ['', Validators.required],
      family_income: ['', Validators.required],
      criteria: ['', Validators.required],
      aadhar_no: ['',[Validators.required, Validators.maxLength(12), Validators.minLength(12)]],
      pan_no: ['', Validators.required,Validators.maxLength(10), Validators.minLength(10)],
      email: ['', [Validators.required, Validators.pattern("^[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$")]],
      address: ['', Validators.required] , 
      course: ['', Validators.required] , 
      User_D: ['', Validators.required] ,
      Training_Course:['', Validators.required] ,
      
        });
    this.userser.getUserList().subscribe(data=>this.userList=data);

  }
  onSubmit(){
    this.user=this.stepRegForm.value;
    this.userser.addUser(this.stepRegForm.value).subscribe((data:any) => {
      alert("Registered Successfully!");
      console.log(this.stepRegForm.value)
   });

    this.router.navigate(['step']);
    // alert("Registered Successfully!");
    
  }

}
