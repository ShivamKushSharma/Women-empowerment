import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { SignupService } from '../signup.service';
import { Signup } from './signup';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})

export class SignupComponent implements OnInit {
  signupForm!: FormGroup;
  signup:Signup=new Signup();
  constructor(private fb:FormBuilder,private signupSer:SignupService, private router: Router) { }
  signupList:Signup[]=[];
  ngOnInit(): void {

    this.signupForm = this.fb.group({            
      // id: ['', Validators.required],  
      name: ['', Validators.required],                                
      username: ['', Validators.required],
      password: ['', Validators.required] ,
    //  name: ['', Validators.required],
    mobileNo: ['', Validators.required]  ,
   dob: ['', Validators.required]                                
        });
    // this.signupSer.getSignupList().subscribe(data=>this.signupList=data);
  }
  onSubmit(){
     alert( JSON.stringify(this.signupForm.value)); 
   this.signup=this.signupForm.value;
     this.signupSer.addSignup(this.signup).subscribe(data => {
      

        alert("Registered Successfully!");
        console.log(this.signupForm.value)
        this.signupForm.reset();
      });
    }
  }
