import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { Login } from "./login/login";
import { Signup } from "./signup/signup";

@Injectable({
    providedIn: 'root'
  })
  export class SignupService {

   signupList:Signup[]=[];
   login:Login[]=[];
//  baseURL:string="http://localhost:3000/signup"
baseURL:string="http://localhost:8088"
  constructor(private httpSer:HttpClient) { }

  // public getSignupList()
  // {
  //   return this.httpSer.get<Signup[]>('http://localhost:3000/signup');
    
  // }
// any ->Ngo
  public addSignup(n:Signup){
    console.log(n);
    console.log(this.httpSer.post(this.baseURL+'/user/add',n));
    return this.httpSer.post(this.baseURL+'/user/add',n);
  }

  verifyMe(login: Login) {
    console.log("login..test..");
    let url = this.baseURL+'/userlogin/verifyUser';
    alert("login...test");
    // return this.httpSer.post<Response>(url, login);
    return this.httpSer.post(url, login);
  
  }
  public find(){
    return this.httpSer.get<Signup[]>(this.baseURL+'/userlogin/verifyuser')
  }

  // logout(): void {
  //   localStorage.setItem('isLoggedIn', "false");
  //    localStorage.removeItem('token');
  //  }

  }