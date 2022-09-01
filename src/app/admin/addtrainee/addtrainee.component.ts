import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { User } from 'src/app/step/register/user';
import { UserService } from 'src/app/user.service';

@Component({
  selector: 'app-addtrainee',
  templateUrl: './addtrainee.component.html',
  styleUrls: ['./addtrainee.component.css']
})
export class AddtraineeComponent implements OnInit {
  user:User=new User();
  userList:User[]=[];
  addtraineeForm!:FormGroup;

  constructor(private fb:FormBuilder,private userSer:UserService, private router:Router) { }

  ngOnInit(): void {
    this.addtraineeForm = this.fb.group({            
    r_id: [],                                        
     name: ['', Validators.required],
     designation: ['', Validators.required],
     salary: ['', Validators.required],
     no_of_member: ['', Validators.required],
     no_of_children: ['', Validators.required],
     family_income: ['', Validators.required],
     criteria: ['', Validators.required],
     aadhar_no: ['', Validators.required],
     pan_no: ['', Validators.required],
     email: ['', Validators.required],
     address: ['', Validators.required] ,
     course:['', Validators.required],
     User_D: ['', Validators.required] ,
     Training_Course:['', Validators.required] ,                               
       });
   this.userSer.getUserList().subscribe(data=>this.userList=data);
  }
  onSubmit(){
   
   this.user=this.addtraineeForm.value;

   alert(this.addtraineeForm.value);
    this.userSer.addUser(this.user).subscribe(data => {
      

        alert("Registered Successfully!");
        console.log(this.addtraineeForm.value)
      });

     this.router.navigate(['admin']);
    
  }
}
