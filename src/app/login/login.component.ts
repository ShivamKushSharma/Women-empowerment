import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { SignupService } from '../signup.service';
import { Signup } from '../signup/signup';
import { Login } from './login';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginForm!: FormGroup;
  baseURL:string="http://localhost:8088";
  loginCheck:Login=new Login();
  constructor(private formBuilder:FormBuilder,private signupSer:SignupService ,private router:Router,private http:HttpClient) { }

  ngOnInit(): void {
this.loginForm = this.formBuilder.group({
  username:[''],
  password:['']
})

  }
//  verifyUser()
//  {
  
// //   window.localStorage.setItem('userDetails', JSON.stringify({token: this.login, name: 'userDetails'}));
        
// //   this.signupservice.verifyMe(this.login)
// //       .subscribe(data => {                

// //           if (data.responseType == "VERIFIED") {
// //               window.location.href='/user-dashboard';
// //           }
// //           else {
// //               this.router.navigate(['/step/login']);
// //               this.response = "Please enter valid username and password";
// //           }
// //       }
// //   )
// //  }

// this.http.get<any>(this.baseURL).subscribe(res=>{
//   const user = res.find((a:any)=>{
//     return a.username===this.loginForm.value.username && a.password===this.loginForm.value.password 
  
//   });
//   if(user){alert("Logged in Successfully!") ;
//   this.loginForm.reset();
//   this.router.navigate(['/home'])

// }else{
//   alert("Please Enter valid Username and Password");
// }
// },err=>{ alert("Something Went Wrong")}   )

// }
onSubmit(){
  alert( JSON.stringify(this.loginForm.value)); 
this.loginCheck=this.loginForm.value;
  this.signupSer.verifyMe(this.loginCheck).subscribe(data => {
   
    if(data != null || data != undefined){
      alert("Login Successful..!" + JSON.stringify(data));
     
     console.log(this.loginForm.value);
    alert("Logged in Successfully!");
    this.loginForm.reset();
    this.router.navigate(['/home'])

    }else{
      alert("Please Enter valid Username and Password");
    }
     
    //  const user = data.find((a:any)=>{
    //   return a.username===this.loginForm.value.username && a.password===this.loginForm.value.password 
    
    // });
    
   });
}
}
