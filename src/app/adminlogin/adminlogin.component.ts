import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { Login } from '../login/login';
import { SignupService } from '../signup.service';

@Component({
  selector: 'app-adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent implements OnInit {

  adminloginForm!: FormGroup;
  loginCheck:Login=new Login();
  constructor(private formBuilder:FormBuilder,private signupSer:SignupService ,private router:Router,private http:HttpClient) { }

  ngOnInit(): void {
this.adminloginForm = this.formBuilder.group({
  username:[''],
  password:['']
})

  }
 onSubmit()
 {
  
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

// this.http.get<any>("http://localhost:4200").subscribe(res=>{
//   const user = res.find((a:any)=>{
//     return "admin"===this.adminloginForm.value.username && "admin"===this.adminloginForm.value.password 
  
//   });
  if(this.adminloginForm.value.username==="admin" && this.adminloginForm.value.password ==="admin"){
    alert("Logged in Successfully!") ;
  this.adminloginForm.reset();
  this.router.navigate(['/admin'])
  }else{
    alert("Please Enter valid Username and Password");
  }
  

  // if(user){alert("Logged in Successfully!") ;
  // this.adminloginForm.reset();
  // this.router.navigate(['/admin'])

// }else{
//   alert("Please Enter valid Username and Password");
// }
// },err=>{ alert("Something Went Wrong")}   )

}

// onSubmit(){
//   alert( JSON.stringify(this.adminloginForm.value)); 
// this.loginCheck=this.adminloginForm.value;
//   this.signupSer.verifyMe(this.loginCheck).subscribe(data => {
   
//     if(data != null || data != undefined){
//       alert("Login Successful..!" + JSON.stringify(data));
     
//      console.log(this.adminloginForm.value);
//     alert("Logged in Successfully!");
//     this.adminloginForm.reset();
//     this.router.navigate(['/home'])

//     }else{
//       alert("Please Enter valid Username and Password");
//     }
     
//     //  const user = data.find((a:any)=>{
//     //   return a.username===this.loginForm.value.username && a.password===this.loginForm.value.password 
    
//     // });
    
//    });
// }
}
